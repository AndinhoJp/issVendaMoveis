/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ControlaProduto;

import Entity.Produto;
import Hibernate.HibernateUtil;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import org.hibernate.Session;

/**
 *
 * @author ander
 */
public class ControlaProduto {

    public ArrayList<Produto> getListaProdutos() {
        Session s = HibernateUtil.getSessionFactory().getCurrentSession();
        s.beginTransaction();
        ArrayList<Produto> listaProdutos = (ArrayList<Produto>) s.createQuery("From Produto").list();
        s.getTransaction().commit();
        Collections.sort(listaProdutos, new Comparator<Produto>() {
            public int compare(Produto o1, Produto o2) {
                return o1.getNomeProd().compareTo(o2.getNomeProd());
            }
        });
        return listaProdutos;
    }

    public void atualizaProduto(Produto produto) {
        Session s = HibernateUtil.getSessionFactory().getCurrentSession();
        s.beginTransaction();
        s.saveOrUpdate(produto);
        s.getTransaction().commit();
    }

    public Produto getProduto(String idProd) {
        ArrayList<Produto> listaProd = getListaProdutos();
        for (Produto p : listaProd) {
            if (p.getProdId().equals(idProd)) {
                return p;
            }
        }

        return null;
    }
}
