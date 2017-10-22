/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ControleCliente;

import DAO.Cliente;
import Hibernate.HibernateUtil;
import java.sql.Date;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Set;
import org.hibernate.Session;

/**
 *
 * @author ander
 */
public class ControlaCliente {
    
        public boolean verificaCliente(String cli_ID) {
        ArrayList<Cliente> listaAcessos = getListaCliente();
        HibernateUtil.getSessionFactory().getCurrentSession().beginTransaction();
        for (Cliente ac : listaAcessos) {
            if (ac.getCliId().equals(cli_ID)) {
                HibernateUtil.getSessionFactory().getCurrentSession().getTransaction().commit();
                return true;
            }
        }
        HibernateUtil.getSessionFactory().getCurrentSession().getTransaction().commit();
        return false;
    }
        
 public Cliente consultaCliente(String cli_ID){
     ArrayList<Cliente> listaAcessos = getListaCliente();
     HibernateUtil.getSessionFactory().getCurrentSession().beginTransaction();
     for (Cliente ac : listaAcessos) {
            if (ac.getCliId().equals(cli_ID)) {
                HibernateUtil.getSessionFactory().getCurrentSession().getTransaction().commit();
                return ac;
            }
        }
        HibernateUtil.getSessionFactory().getCurrentSession().getTransaction().commit();
        return null;
 }
        
public Cliente cadastraCliente(String cliId, String nome, String sobrenome, String cpf, String rg, java.util.Date dataNascimento, String endereco, String numero, String complemento, String cidade, String estado, String telFixo, String telMovel, String email, String nomeMae, String nomePai, String sexo, String bairro, String estadoCivil){
    Session s = HibernateUtil.getSessionFactory().getCurrentSession();
        s.beginTransaction();
        Cliente cliente = new Cliente (cliId, nome, sobrenome, cpf, rg, dataNascimento, endereco, numero, complemento, cidade, estado, telFixo, telMovel, email, nomeMae, nomePai,sexo, bairro,estadoCivil);
        s.save(cliente);
        s.getTransaction().commit();
        return cliente;
}
    
public boolean persisteCliente(Cliente cliente){
    Session s = HibernateUtil.getSessionFactory().getCurrentSession();
        s.beginTransaction();
        try {
            s.saveOrUpdate(cliente);
            s.getTransaction().commit();
            return true;
        } catch (Exception e) {
            s.getTransaction().commit();
            return false;
        }
}

        public ArrayList<Cliente> getListaCliente() {
        Session ses = HibernateUtil.getSessionFactory().getCurrentSession();
        ses.beginTransaction();
        ArrayList<Cliente> listaClientes = (ArrayList<Cliente>) ses.createQuery("From Cliente").list();
        Collections.sort(listaClientes, new Comparator<Cliente>() {
            @Override
            public int compare(Cliente a1, Cliente a2) {
                return a1.getCliId().compareTo(a2.getCliId());
            }
        });
        ses.getTransaction().commit();
        return listaClientes;
    }
    
}
