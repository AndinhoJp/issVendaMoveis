/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ControleCliente;

import Entity.Cliente;
import Hibernate.HibernateUtil;
import java.sql.Date;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Set;
import javax.swing.JOptionPane;
import org.hibernate.Session;

/**
 *
 * @author ander
 */
public class ControlaCliente {

    private final int[] pesoCPF = {11, 10, 9, 8, 7, 6, 5, 4, 3, 2};

    private static int calcularDigito(String str, int[] peso) {
        int soma = 0;
        for (int indice = str.length() - 1, digito; indice >= 0; indice--) {
            digito = Integer.parseInt(str.substring(indice, indice + 1));
            soma += digito * peso[peso.length - str.length() + indice];
        }
        soma = 11 - soma % 11;
        return soma > 9 ? 0 : soma;
    }

    public boolean validadorCPF(String cpf) {
        System.out.print(cpf);
        if ((cpf == null) || (cpf.length() != 11)) {
            return false;
        }
        Integer digito1 = calcularDigito(cpf.substring(0, 9), pesoCPF);
        Integer digito2 = calcularDigito(cpf.substring(0, 9) + digito1, pesoCPF);
        return cpf.equals(cpf.substring(0, 9) + digito1.toString() + digito2.toString());
    }

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

    public Cliente consultaCliente(String cli_ID) {
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

    public Cliente cadastraCliente(String cliId, String nome, String sobrenome, String cpf, String rg, java.util.Date dataNascimento, String endereco, String numero, String complemento, String cidade, String estado, String telFixo, String telMovel, String email, String nomeMae, String nomePai, String sexo, String bairro, String estadoCivil) {
        Session s = HibernateUtil.getSessionFactory().getCurrentSession();
        s.beginTransaction();
        if (validadorCPF(cliId)) {
            Cliente cliente = new Cliente(cliId, nome, sobrenome, cpf, rg, dataNascimento, endereco, numero, complemento, cidade, estado, telFixo, telMovel, email, nomeMae, nomePai, sexo, bairro, estadoCivil);
            s.save(cliente);
            s.getTransaction().commit();
            return cliente;
        } else {
            JOptionPane.showMessageDialog(null, "CPF informado é inválido!");
            return null;
        }
    }

    public boolean persisteCliente(Cliente cliente, String endereço, String numero, String complemento, String cidade, String estado, String bairro, String TelFixo, String telMovel, String email) {
        cliente.setEndereco(endereço);
        cliente.setNumero(numero);
        cliente.setComplemento(complemento);
        cliente.setCidade(cidade);
        cliente.setEstado(estado);
        cliente.setBairro(bairro);
        cliente.setTelFixo(TelFixo);
        cliente.setTelMovel(telMovel);
        cliente.setEmail(email);
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

    public Cliente getCliente(String id){
        
        Cliente cliente = null;
        ArrayList<Cliente> listaClientes = getListaCliente();
        
        for(Cliente c : listaClientes){
            if(c.getCliId().equals(id)){
                cliente = c;
                break;
            }
        }
        
        return cliente;
    }
}
