/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package issvendamoveis;

import Autenticação.JFrameTelaLogin;
import Hibernate.HibernateUtil;
import org.hibernate.Session;

/**
 *
 * @author ander
 */
public class ISSVendaMoveis {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JFrameTelaLogin jFrameTelaLogin = new JFrameTelaLogin();
        Session s = HibernateUtil.getSessionFactory().getCurrentSession();
    }
}
