package vision;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle;
import controllers.AuthController;
import org.hibernate.Session;
import utils.HibernateUtil;

import java.awt.event.KeyEvent;

public class JFrameLoginScreen extends javax.swing.JFrame {

    /**
     * Creates new form TelaLogin
     */
    public JFrameLoginScreen() {
        initComponents();
//        Session s = HibernateUtil.getSessionFactory().getCurrentSession();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        jPassword.setText("12345");
        jTextFieldLogin.setText("Login");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    // Generated using JFormDesigner Evaluation license - unknown
    private void initComponents() {
        jTextFieldLogin = new JTextField();
        jLabelLogomarca = new JLabel();
        jButtonAutenticar = new JButton();
        jButtonCancelar = new JButton();
        jPassword = new JPasswordField();

        //======== this ========
        setDefaultCloseOperation(3);
        setTitle("Autentica\u00e7\u00e3o");
        setResizable(false);
        Container contentPane = getContentPane();

        //---- jTextFieldLogin ----
        jTextFieldLogin.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                jTextFieldLoginFocusGained(e);
            }
            @Override
            public void focusLost(FocusEvent e) {
                jTextFieldLoginFocusLost(e);
            }
        });
        jTextFieldLogin.addActionListener(e -> jTextFieldLoginActionPerformed(e));

        //---- jLabelLogomarca ----
        jLabelLogomarca.setIcon(new ImageIcon(getClass().getResource("/assets/redebras-topo.jpg")));

        //---- jButtonAutenticar ----
        jButtonAutenticar.setText("Logar");
        jButtonAutenticar.addActionListener(e -> jButtonAutenticarActionPerformed(e));

        //---- jButtonCancelar ----
        jButtonCancelar.setText("Cancelar");
        jButtonCancelar.addActionListener(e -> jButtonCancelarActionPerformed(e));

        //---- jPassword ----
        jPassword.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                jPasswordFocusGained(e);
            }
            @Override
            public void focusLost(FocusEvent e) {
                jPasswordFocusLost(e);
            }
        });
        jPassword.addActionListener(e -> jPasswordActionPerformed(e));
        jPassword.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                jPasswordKeyPressed(e);
            }
        });

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addComponent(jLabelLogomarca)
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addGap(44, 44, 44)
                            .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
                                .addGroup(contentPaneLayout.createSequentialGroup()
                                    .addComponent(jButtonCancelar)
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButtonAutenticar))
                                .addComponent(jTextFieldLogin, GroupLayout.DEFAULT_SIZE, 226, Short.MAX_VALUE)
                                .addComponent(jPassword))))
                    .addContainerGap())
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(GroupLayout.Alignment.TRAILING, contentPaneLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabelLogomarca)
                    .addGap(18, 18, 18)
                    .addComponent(jTextFieldLogin, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(jPassword, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(jButtonAutenticar)
                        .addComponent(jButtonCancelar))
                    .addContainerGap())
        );
        pack();
        setLocationRelativeTo(getOwner());
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldLoginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldLoginActionPerformed

    private void jButtonAutenticarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAutenticarActionPerformed
        boolean login = new AuthController().verificaAcesso(jTextFieldLogin.getText(), jPassword.getText());
        if (login) {
            dispose();
        }
    }//GEN-LAST:event_jButtonAutenticarActionPerformed

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        this.setVisible(false);
        Runtime.getRuntime().exit(0);
    }//GEN-LAST:event_jButtonCancelarActionPerformed

    private void jTextFieldLoginFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldLoginFocusLost
        if (jTextFieldLogin.getText().equals("")) {
            jTextFieldLogin.setText("Login");
        }
    }//GEN-LAST:event_jTextFieldLoginFocusLost

    private void jTextFieldLoginFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldLoginFocusGained
        if (jTextFieldLogin.getText().equals("Login")) {
            jTextFieldLogin.setText("");
        }
    }//GEN-LAST:event_jTextFieldLoginFocusGained

    private void jPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordActionPerformed

    private void jPasswordFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPasswordFocusGained
        if (jPassword.getText().equals("12345")) {
            jPassword.setText("");
        }
    }//GEN-LAST:event_jPasswordFocusGained

    private void jPasswordFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPasswordFocusLost
        if (jPassword.getText().equals("")) {
            jPassword.setText("12345");
        }
    }//GEN-LAST:event_jPasswordFocusLost

    private void jPasswordKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPasswordKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            boolean login = new AuthController().verificaAcesso(jTextFieldLogin.getText(), jPassword.getText());
            if (login) {
                dispose();
            }
        }
    }//GEN-LAST:event_jPasswordKeyPressed

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
            java.util.logging.Logger.getLogger(JFrameLoginScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameLoginScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameLoginScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameLoginScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new JFrameLoginScreen().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - unknown
    private JTextField jTextFieldLogin;
    private JLabel jLabelLogomarca;
    private JButton jButtonAutenticar;
    private JButton jButtonCancelar;
    private JPasswordField jPassword;
    // End of variables declaration//GEN-END:variables
}