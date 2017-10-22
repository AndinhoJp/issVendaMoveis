/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Telas;

import Imagem.JPanel.JPanelImagemGerente;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author ander
 */
public class JFrameGerente extends javax.swing.JFrame {

    /**
     * Creates new form JFrameGerente
     */
    
    CardLayout card;
    
    public JFrameGerente() {
        initComponents();
        this.setVisible(true);
        JPanel jPanelImagemGerente = new JPanelImagemGerente();
        card = (CardLayout) jPanelBase.getLayout();
        jPanelBase.add(jPanelImagemGerente);
        card.show(jPanelBase, "jPanelImagemGerente");
        
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelLogo = new javax.swing.JLabel();
        jPanelBase = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuFuncionario = new javax.swing.JMenu();
        jRadioButtonMenuItemFuncionarioCadastrar = new javax.swing.JRadioButtonMenuItem();
        jRadioButtonMenuItemConsultar = new javax.swing.JRadioButtonMenuItem();
        jMenuCliente = new javax.swing.JMenu();
        jRadioButtonMenuItemClienteCadastrar = new javax.swing.JRadioButtonMenuItem();
        jRadioButtonMenuItemClienteConsultar = new javax.swing.JRadioButtonMenuItem();
        jMenuSair = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1020, 715));
        setResizable(false);

        jLabelLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/redebras-topo-menor.jpg"))); // NOI18N
        jLabelLogo.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jPanelBase.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanelBase.setPreferredSize(new java.awt.Dimension(1000, 600));
        jPanelBase.setLayout(new java.awt.CardLayout());

        jMenuBar1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jMenuFuncionario.setText("Funcionários");

        jRadioButtonMenuItemFuncionarioCadastrar.setSelected(true);
        jRadioButtonMenuItemFuncionarioCadastrar.setText("Cadastrar");
        jRadioButtonMenuItemFuncionarioCadastrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/Icones/add_user.png"))); // NOI18N
        jRadioButtonMenuItemFuncionarioCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonMenuItemFuncionarioCadastrarActionPerformed(evt);
            }
        });
        jMenuFuncionario.add(jRadioButtonMenuItemFuncionarioCadastrar);

        jRadioButtonMenuItemConsultar.setSelected(true);
        jRadioButtonMenuItemConsultar.setText("Consultar");
        jRadioButtonMenuItemConsultar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/Icones/find_user.png"))); // NOI18N
        jMenuFuncionario.add(jRadioButtonMenuItemConsultar);

        jMenuBar1.add(jMenuFuncionario);

        jMenuCliente.setText("Clientes");

        jRadioButtonMenuItemClienteCadastrar.setSelected(true);
        jRadioButtonMenuItemClienteCadastrar.setText("Cadastrar");
        jRadioButtonMenuItemClienteCadastrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/Icones/add_user.png"))); // NOI18N
        jMenuCliente.add(jRadioButtonMenuItemClienteCadastrar);

        jRadioButtonMenuItemClienteConsultar.setSelected(true);
        jRadioButtonMenuItemClienteConsultar.setText("Consultar");
        jRadioButtonMenuItemClienteConsultar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/Icones/find_user.png"))); // NOI18N
        jMenuCliente.add(jRadioButtonMenuItemClienteConsultar);

        jMenuBar1.add(jMenuCliente);

        jMenuSair.setText("Sair");
        jMenuSair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuSairMouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenuSair);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelLogo)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jPanelBase, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelLogo)
                .addGap(18, 18, 18)
                .addComponent(jPanelBase, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuSairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuSairMouseClicked
       dispose();
    }//GEN-LAST:event_jMenuSairMouseClicked

    private void jRadioButtonMenuItemFuncionarioCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonMenuItemFuncionarioCadastrarActionPerformed
       /*JPanel jPanelFuncionario = new ...;
       jPanelBase.add(jPanel);
       card.next(jPanelBase);*/
    }//GEN-LAST:event_jRadioButtonMenuItemFuncionarioCadastrarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JFrameGerente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameGerente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameGerente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameGerente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrameGerente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabelLogo;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuCliente;
    private javax.swing.JMenu jMenuFuncionario;
    private javax.swing.JMenu jMenuSair;
    private javax.swing.JPanel jPanelBase;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItemClienteCadastrar;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItemClienteConsultar;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItemConsultar;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItemFuncionarioCadastrar;
    // End of variables declaration//GEN-END:variables
}