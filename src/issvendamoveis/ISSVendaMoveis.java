/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package issvendamoveis;

import Autenticacao.JFrameTelaLogin;
import ControleCliente.JPanelCadastroCliente;
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
        JPanelCadastroCliente jPanelCadastroCliente = new JPanelCadastroCliente();
        jPanelCadastroCliente.setVisible(true);
        Session s = HibernateUtil.getSessionFactory().getCurrentSession();
    }
}
