/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Autenticacao;

import Entity.Acesso;
import Entity.Funcionario;
import Hibernate.HibernateUtil;
import java.util.ArrayList;
import org.hibernate.Session;

/**
 *
 * @author ander
 */
public class ControleAcesso {

    public Acesso criarAcesso(String login, Funcionario funcionario, String senha) {
        Session s = HibernateUtil.getSessionFactory().getCurrentSession();
        s.beginTransaction();
        Acesso acesso = new Acesso(login, funcionario, senha);
        s.save(acesso);
        s.getTransaction().commit();
        return acesso;
    }

    public boolean persisteAcesso(String senha, Acesso acesso) {
        acesso.setSenha(senha);
        Session s = HibernateUtil.getSessionFactory().getCurrentSession();
        s.beginTransaction();
        try {
            s.saveOrUpdate(acesso);
            s.getTransaction().commit();
            return true;
        } catch (Exception e) {
            s.getTransaction().commit();
            return false;
        }
    }

    public ArrayList<Acesso> getAcessos(String login) {
        ArrayList<Acesso> acessos = new ArrayList();
        Session c = HibernateUtil.getSessionFactory().getCurrentSession();
        c.beginTransaction();
        ArrayList<Acesso> listaAcessos = (ArrayList<Acesso>) c.createQuery("From Acesso").list();

        for (Acesso pv : listaAcessos) {
            if (pv.getLogin().equals(login)) {
                acessos.add(pv);
            }
        }
        c.getTransaction().commit();

        return acessos;
    }

}
