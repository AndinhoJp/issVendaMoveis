/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Autenticação;

import DAO.Acesso;
import DAO.Funcionario;
import Hibernate.HibernateUtil;
import Telas.JFrameGerente;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import javax.swing.JOptionPane;
import org.hibernate.Session;

/**
 *
 * @author ander
 */
public class ControleLogin {

    public boolean verificaAcesso(String login, String senha) {
        if (verificaLogin(login)) {
            if (verificaSenha(login, senha)) {
                ArrayList<Acesso> listaAcessos = new ControleLogin().getListaAcessos();
                HibernateUtil.getSessionFactory().getCurrentSession().beginTransaction();
                for (Acesso ac : listaAcessos) {
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
    
    public void criarAcesso(String login, Funcionario funcionario, String senha) {
        Session s = HibernateUtil.getSessionFactory().getCurrentSession();
        s.beginTransaction();
        Acesso acesso = new Acesso(login, funcionario, senha);
        s.save(acesso);
        s.getTransaction().commit();
    }

    public ArrayList<Acesso> getListaAcessos() {
        Session ses = HibernateUtil.getSessionFactory().getCurrentSession();
        ses.beginTransaction();
        ArrayList<Acesso> listaAcessos = (ArrayList<Acesso>) ses.createQuery("From Acesso").list();
        Collections.sort(listaAcessos, new Comparator<Acesso>() {
            @Override
            public int compare(Acesso a1, Acesso a2) {
                return a1.getFuncionario().getNome().compareTo(a2.getFuncionario().getNome());
            }
        });
        ses.getTransaction().commit();
        return listaAcessos;
    }

    public boolean confereDuplicidade(String login) {
        ArrayList<Acesso> listaAcessos = getListaAcessos();
        HibernateUtil.getSessionFactory().getCurrentSession().beginTransaction();
        for (Acesso ac : listaAcessos) {
            if (ac.getLogin().equals(login)) {
                HibernateUtil.getSessionFactory().getCurrentSession().getTransaction().commit();
                return false;
            }
        }
        HibernateUtil.getSessionFactory().getCurrentSession().getTransaction().commit();
        return true;
    }

    public boolean verificaLogin(String login) {
        ArrayList<Acesso> listaAcessos = getListaAcessos();
        HibernateUtil.getSessionFactory().getCurrentSession().beginTransaction();
        for (Acesso ac : listaAcessos) {
            if (ac.getLogin().equals(login)) {
                HibernateUtil.getSessionFactory().getCurrentSession().getTransaction().commit();
                return true;
            }
        }
        HibernateUtil.getSessionFactory().getCurrentSession().getTransaction().commit();
        return false;
    }

    public boolean verificaSenha(String login, String senha) {
        ArrayList<Acesso> listaAcessos = getListaAcessos();
        HibernateUtil.getSessionFactory().getCurrentSession().beginTransaction();
        for (Acesso a : listaAcessos) {
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
                new JFrameGerente();
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
