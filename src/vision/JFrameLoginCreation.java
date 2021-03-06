package vision;

import java.awt.*;
import java.awt.event.*;
import controllers.AuthController;
import entities.FunctionaryEntity;

import javax.swing.*;

public class JFrameLoginCreation extends javax.swing.JFrame {

    AuthController confereId = new AuthController();

    public JFrameLoginCreation(FunctionaryEntity funcionario) {
        this.setTitle("Criação do acesso de - " + funcionario.getIdFunc());
        jPasswordFieldSenha.setText("123456");
        jPasswordFieldConfirSenha.setText("123456");
        initComponents();
    }

    private JFrameLoginCreation() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    // Generated using JFormDesigner Evaluation license - GregÃ³rio MagalhÃ£es
    private void initComponents() {
        jLabelNome = new JLabel();
        jTextFieldNome = new JTextField();
        jLabelIdFunc = new JLabel();
        jTextFieldIdFunc = new JTextField();
        jLabelLogin = new JLabel();
        jLabelSenha = new JLabel();
        jLabelSenhaConfir = new JLabel();
        jTextFieldLogin = new JTextField();
        jPasswordFieldSenha = new JPasswordField();
        jPasswordFieldConfirSenha = new JPasswordField();
        jButtonCadastrar = new JButton();
        jButtonCancelar = new JButton();

        //======== this ========
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        Container contentPane = getContentPane();

        //---- jLabelNome ----
        jLabelNome.setText("Nome:");

        //---- jTextFieldNome ----
        jTextFieldNome.setEditable(false);
        jTextFieldNome.addActionListener(e -> jTextFieldNomeActionPerformed(e));

        //---- jLabelIdFunc ----
        jLabelIdFunc.setText("Identifica\u00e7\u00e3o do funcion\u00e1rio:");

        //---- jTextFieldIdFunc ----
        jTextFieldIdFunc.setEditable(false);

        //---- jLabelLogin ----
        jLabelLogin.setText("Login:");

        //---- jLabelSenha ----
        jLabelSenha.setText("Senha:");

        //---- jLabelSenhaConfir ----
        jLabelSenhaConfir.setText("Confirma\u00e7\u00e3o da senha:");

        //---- jTextFieldLogin ----
        jTextFieldLogin.addActionListener(e -> jTextFieldLoginActionPerformed(e));

        //---- jPasswordFieldSenha ----
        jPasswordFieldSenha.setText("jPasswordField1");
        jPasswordFieldSenha.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                jPasswordFieldSenhaFocusGained(e);
            }
            @Override
            public void focusLost(FocusEvent e) {
                jPasswordFieldSenhaFocusLost(e);
            }
        });

        //---- jPasswordFieldConfirSenha ----
        jPasswordFieldConfirSenha.setText("jPasswordField1");
        jPasswordFieldConfirSenha.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                jPasswordFieldConfirSenhaFocusGained(e);
            }
            @Override
            public void focusLost(FocusEvent e) {
                jPasswordFieldConfirSenhaFocusLost(e);
            }
        });

        //---- jButtonCadastrar ----
        jButtonCadastrar.setText("Cadastrar");
        jButtonCadastrar.addActionListener(e -> jButtonCadastrarActionPerformed(e));

        //---- jButtonCancelar ----
        jButtonCancelar.setText("Cancelar");
        jButtonCancelar.addActionListener(e -> jButtonCancelarActionPerformed(e));

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addComponent(jButtonCancelar)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonCadastrar))
                        .addGroup(GroupLayout.Alignment.LEADING, contentPaneLayout.createSequentialGroup()
                            .addComponent(jLabelSenhaConfir)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jPasswordFieldConfirSenha))
                        .addGroup(GroupLayout.Alignment.LEADING, contentPaneLayout.createSequentialGroup()
                            .addComponent(jLabelSenha)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jPasswordFieldSenha))
                        .addGroup(GroupLayout.Alignment.LEADING, contentPaneLayout.createSequentialGroup()
                            .addComponent(jLabelLogin)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jTextFieldLogin))
                        .addGroup(GroupLayout.Alignment.LEADING, contentPaneLayout.createSequentialGroup()
                            .addComponent(jLabelIdFunc)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jTextFieldIdFunc))
                        .addGroup(GroupLayout.Alignment.LEADING, contentPaneLayout.createSequentialGroup()
                            .addComponent(jLabelNome)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jTextFieldNome, GroupLayout.PREFERRED_SIZE, 298, GroupLayout.PREFERRED_SIZE)))
                    .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(GroupLayout.Alignment.TRAILING, contentPaneLayout.createSequentialGroup()
                    .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabelNome)
                        .addComponent(jTextFieldNome, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabelIdFunc)
                        .addComponent(jTextFieldIdFunc, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabelLogin)
                        .addComponent(jTextFieldLogin, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabelSenha)
                        .addComponent(jPasswordFieldSenha, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabelSenhaConfir)
                        .addComponent(jPasswordFieldConfirSenha, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                    .addGap(30, 30, 30)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(jButtonCadastrar)
                        .addComponent(jButtonCancelar))
                    .addContainerGap())
        );
        pack();
        setLocationRelativeTo(getOwner());
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNomeActionPerformed

    private void jTextFieldLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldLoginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldLoginActionPerformed

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        dispose();
    }//GEN-LAST:event_jButtonCancelarActionPerformed

    private void jButtonCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadastrarActionPerformed
        if(jPasswordFieldSenha.getText().equals("") ||
                jPasswordFieldConfirSenha.getText().equals("") ||
                jTextFieldLogin.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Um dos campos obrigatório não está preenchido. Verifique e tente novamente");
        }
        if (!jPasswordFieldSenha.getText().equals(jPasswordFieldConfirSenha.getText())) {
            JOptionPane.showMessageDialog(null, "As senhas digitadas não conferem. Verifique e tente novamente.");
        }
        if(confereId.confereDuplicidade(jTextFieldLogin.getText()) == false){

        }
    }//GEN-LAST:event_jButtonCadastrarActionPerformed

    private void jPasswordFieldSenhaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPasswordFieldSenhaFocusGained
        if(jPasswordFieldSenha.getText().equals("123456")){
            jPasswordFieldSenha.setText("");
        }
    }//GEN-LAST:event_jPasswordFieldSenhaFocusGained

    private void jPasswordFieldConfirSenhaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPasswordFieldConfirSenhaFocusGained
        if(jPasswordFieldConfirSenha.getText().equals("123456")){
            jPasswordFieldConfirSenha.setText("");
        }
    }//GEN-LAST:event_jPasswordFieldConfirSenhaFocusGained

    private void jPasswordFieldSenhaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPasswordFieldSenhaFocusLost
        if(jPasswordFieldSenha.getText().equals("")){
            jPasswordFieldSenha.setText("123456");
        }
    }//GEN-LAST:event_jPasswordFieldSenhaFocusLost

    private void jPasswordFieldConfirSenhaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPasswordFieldConfirSenhaFocusLost
        if(jPasswordFieldConfirSenha.getText().equals("")){
            jPasswordFieldConfirSenha.setText("123456");
        }
    }//GEN-LAST:event_jPasswordFieldConfirSenhaFocusLost

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
            java.util.logging.Logger.getLogger(JFrameLoginCreation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameLoginCreation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameLoginCreation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameLoginCreation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new JFrameLoginCreation().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - GregÃ³rio MagalhÃ£es
    private JLabel jLabelNome;
    private JTextField jTextFieldNome;
    private JLabel jLabelIdFunc;
    private JTextField jTextFieldIdFunc;
    private JLabel jLabelLogin;
    private JLabel jLabelSenha;
    private JLabel jLabelSenhaConfir;
    private JTextField jTextFieldLogin;
    private JPasswordField jPasswordFieldSenha;
    private JPasswordField jPasswordFieldConfirSenha;
    private JButton jButtonCadastrar;
    private JButton jButtonCancelar;
    // End of variables declaration//GEN-END:variables
}