/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


package controllers;

import entities.AcessoEntity;
import entities.FuncionarioEntity;
import org.hibernate.Session;
import utils.HibernateUtil;
import vision.JFrameAdministrador;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author ander
 */
public class AuthController {

    public boolean verificaAcesso(String login, String senha) {
        if (verificaLogin(login)) {
            if (verificaSenha(login, senha)) {
                ArrayList<AcessoEntity> listaAcessos = new AuthController().getListaAcessos();
                HibernateUtil.getSessionFactory().getCurrentSession().beginTransaction();
                for (AcessoEntity ac : listaAcessos) {
                    if (ac.getLogin().equals(login)) {
                        nivelAcesso(ac.getFuncionario().getNivelAcesso());
                    }
                }
                HibernateUtil.getSessionFactory().getCurrentSession().getTransaction().commit();
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Senha incorreta! Verifique a senha digitada e tente novamente.");
                return false;
            }
        } else {
            JOptionPane.showMessageDialog(null, "Login não encontrado! Verifique o login e tente novamente.");
            return false;
        }
    }

    public void criarAcesso(String login, FuncionarioEntity funcionario, String senha) {
        Session s = HibernateUtil.getSessionFactory().getCurrentSession();
        s.beginTransaction();
        AcessoEntity acesso = new AcessoEntity(login, funcionario, senha);
        s.save(acesso);
        s.getTransaction().commit();
    }

    public ArrayList<AcessoEntity> getListaAcessos() {
        Session ses = HibernateUtil.getSessionFactory().getCurrentSession();
        ses.beginTransaction();
        ArrayList<AcessoEntity> listaAcessos = (ArrayList<AcessoEntity>) ses.createQuery("From AcessoEntity").list();
        Collections.sort(listaAcessos, new Comparator<AcessoEntity>() {
            @Override
            public int compare(AcessoEntity a1, AcessoEntity a2) {
                return a1.getFuncionario().getNome().compareTo(a2.getFuncionario().getNome());
            }
        });
        ses.getTransaction().commit();
        return listaAcessos;
    }

    public boolean confereDuplicidade(String login) {
        ArrayList<AcessoEntity> listaAcessos = getListaAcessos();
        HibernateUtil.getSessionFactory().getCurrentSession().beginTransaction();
        for (AcessoEntity ac : listaAcessos) {
            if (ac.getLogin().equals(login)) {
                HibernateUtil.getSessionFactory().getCurrentSession().getTransaction().commit();
                return false;
            }
        }
        HibernateUtil.getSessionFactory().getCurrentSession().getTransaction().commit();
        return true;
    }

    public boolean verificaLogin(String login) {
        ArrayList<AcessoEntity> listaAcessos = getListaAcessos();
        HibernateUtil.getSessionFactory().getCurrentSession().beginTransaction();
        for (AcessoEntity ac : listaAcessos) {
            if (ac.getLogin().equals(login)) {
                HibernateUtil.getSessionFactory().getCurrentSession().getTransaction().commit();
                return true;
            }
        }
        HibernateUtil.getSessionFactory().getCurrentSession().getTransaction().commit();
        return false;
    }

    public boolean verificaSenha(String login, String senha) {
        ArrayList<AcessoEntity> listaAcessos = getListaAcessos();
        HibernateUtil.getSessionFactory().getCurrentSession().beginTransaction();
        for (AcessoEntity a : listaAcessos) {
            if (a.getLogin().equals(login) && a.getSenha().equals(senha)) {
                HibernateUtil.getSessionFactory().getCurrentSession().getTransaction().commit();
                return true;
            }
        }
        HibernateUtil.getSessionFactory().getCurrentSession().getTransaction().commit();
        return false;
    }

    public void nivelAcesso(int nivelAcesso) {
        switch (nivelAcesso) {
            case 0: //Gerente
                new JFrameAdministrador();
                break;
            case 1: //Funcionario
                break;
            case 2: //Almoxarife
                break;
            case 3: //Contador
                break;

        }
    }

}
