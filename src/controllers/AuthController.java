/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


package controllers;

import entities.AccessEntity;
import entities.FunctionaryEntity;
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
                ArrayList<AccessEntity> listaAcessos = new AuthController().getListaAcessos();
                HibernateUtil.getSessionFactory().getCurrentSession().beginTransaction();
                for (AccessEntity ac : listaAcessos) {
                    if (ac.getLogin().equals(login)) {
                        Integer funcionarioId = ac.getFuncionarioId();
                        nivelAcesso(HibernateUtil.getSessionFactory().getCurrentSession().get(FunctionaryEntity.class, funcionarioId).getNivelAcesso());
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

    public void criarAcesso(String login, FunctionaryEntity funcionario, String senha) {
        Session s = HibernateUtil.getSessionFactory().getCurrentSession();
        s.beginTransaction();
        AccessEntity acesso = new AccessEntity(login, Integer.parseInt(funcionario.getIdFunc()), senha);
        s.save(acesso);
        s.getTransaction().commit();
    }

    public ArrayList<AccessEntity> getListaAcessos() {
        Session ses = HibernateUtil.getSessionFactory().getCurrentSession();
        ses.beginTransaction();
        ArrayList<AccessEntity> listaAcessos = (ArrayList<AccessEntity>) ses.createQuery("From AccessEntity").list();
        Collections.sort(listaAcessos, new Comparator<AccessEntity>() {
            @Override
            public int compare(AccessEntity a1, AccessEntity a2) {
                return HibernateUtil.getSessionFactory().getCurrentSession().get(FunctionaryEntity.class, a1.getFuncionarioId()).getNome()
                        .compareTo(HibernateUtil.getSessionFactory().getCurrentSession().get(FunctionaryEntity.class, a2.getFuncionarioId()).getNome());
            }
        });
        ses.getTransaction().commit();
        return listaAcessos;
    }

    public boolean confereDuplicidade(String login) {
        ArrayList<AccessEntity> listaAcessos = getListaAcessos();
        HibernateUtil.getSessionFactory().getCurrentSession().beginTransaction();
        for (AccessEntity ac : listaAcessos) {
            if (ac.getLogin().equals(login)) {
                HibernateUtil.getSessionFactory().getCurrentSession().getTransaction().commit();
                return false;
            }
        }
        HibernateUtil.getSessionFactory().getCurrentSession().getTransaction().commit();
        return true;
    }

    public boolean verificaLogin(String login) {
        ArrayList<AccessEntity> listaAcessos = getListaAcessos();
        HibernateUtil.getSessionFactory().getCurrentSession().beginTransaction();
        for (AccessEntity ac : listaAcessos) {
            if (ac.getLogin().equals(login)) {
                HibernateUtil.getSessionFactory().getCurrentSession().getTransaction().commit();
                return true;
            }
        }
        HibernateUtil.getSessionFactory().getCurrentSession().getTransaction().commit();
        return false;
    }

    public boolean verificaSenha(String login, String senha) {
        ArrayList<AccessEntity> listaAcessos = getListaAcessos();
        HibernateUtil.getSessionFactory().getCurrentSession().beginTransaction();
        for (AccessEntity a : listaAcessos) {
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
