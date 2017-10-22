/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ControleCliente;

import DAO.Cliente;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author ander
 */
public class JPanelConsultaCliente extends javax.swing.JPanel {

    private Cliente cliente;

    /**
     * Creates new form JPanelConsultaCliente
     */
    public JPanelConsultaCliente() {
        initComponents();
    }

    public void atualizarCadastroCliente() {
        cliente.setBairro(jTextFieldBairro.getText());
        cliente.setCidade(jTextFieldCidade.getText());
        cliente.setEmail(jTextFieldEmail.getText());
        cliente.setComplemento(jTextFieldEndComplemento.getText());
        cliente.setNumero(jTextFieldEndNumero.getText());
        cliente.setEndereco(jTextFieldEndereço.getText());
        cliente.setEstado(jTextFieldEstado.getText());
        cliente.setEstadoCivil(jTextFieldEstadoCivil.getText());
        cliente.setSexo(jTextFieldSexo.getText());
        cliente.setTelFixo(jTextFieldTelRes.getText());
        cliente.setTelMovel(jTextFieldTelCel.getText());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelConsultaCliente = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabelCPFCliente = new javax.swing.JLabel();
        jLabelPrimeiroNome = new javax.swing.JLabel();
        jTextFieldPrimeiroNome = new javax.swing.JTextField();
        jLabelSobrenome = new javax.swing.JLabel();
        jTextFieldSobrenome = new javax.swing.JTextField();
        jTextFieldRG = new javax.swing.JTextField();
        jLabelRG = new javax.swing.JLabel();
        jLabelDataNascimento = new javax.swing.JLabel();
        jLabelEndereço = new javax.swing.JLabel();
        jTextFieldEndereço = new javax.swing.JTextField();
        jLabelEndNumero = new javax.swing.JLabel();
        jTextFieldEndNumero = new javax.swing.JTextField();
        jLabelEndComplemento = new javax.swing.JLabel();
        jTextFieldEndComplemento = new javax.swing.JTextField();
        jLabelCidade = new javax.swing.JLabel();
        jTextFieldCidade = new javax.swing.JTextField();
        jLabelEstado = new javax.swing.JLabel();
        jLabelTelRes = new javax.swing.JLabel();
        jLabelTelCel = new javax.swing.JLabel();
        jLabelEmail = new javax.swing.JLabel();
        jTextFieldEmail = new javax.swing.JTextField();
        jLabelBairro = new javax.swing.JLabel();
        jTextFieldBairro = new javax.swing.JTextField();
        jLabelSexo = new javax.swing.JLabel();
        jLabelNomeMae = new javax.swing.JLabel();
        jTextFieldNomeMae = new javax.swing.JTextField();
        jLabelEstadoCivil = new javax.swing.JLabel();
        jLabelNomePai = new javax.swing.JLabel();
        jTextFieldNomePai = new javax.swing.JTextField();
        jButtonAtualizarCadastro = new javax.swing.JButton();
        jFormattedTextFieldCPFCliente = new javax.swing.JFormattedTextField();
        try{
            javax.swing.text.MaskFormatter cpf= new javax.swing.text.MaskFormatter("###.###.###-##");
            jFormattedTextFieldCPFCliente = new javax.swing.JFormattedTextField(cpf);
        }
        catch (Exception e){
        }
        jButtonPesquisar = new javax.swing.JButton();
        jTextFieldTelRes = new javax.swing.JTextField();
        jTextFieldTelCel = new javax.swing.JTextField();
        jTextFieldDataNascimento = new javax.swing.JTextField();
        jTextFieldSexo = new javax.swing.JTextField();
        jTextFieldEstadoCivil = new javax.swing.JTextField();
        jButtonSalvarEdição = new javax.swing.JButton();
        jTextFieldEstado = new javax.swing.JTextField();

        jLabelConsultaCliente.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabelConsultaCliente.setText("Consulta de cliente");

        jLabelCPFCliente.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelCPFCliente.setText("CPF do cliente:");

        jLabelPrimeiroNome.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelPrimeiroNome.setText("Primeiro nome:");

        jTextFieldPrimeiroNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldPrimeiroNomeActionPerformed(evt);
            }
        });

        jLabelSobrenome.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelSobrenome.setText("Sobrenome:");

        jLabelRG.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelRG.setText("R.G.:");

        jLabelDataNascimento.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelDataNascimento.setText("Data de nascimento:");

        jLabelEndereço.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelEndereço.setText("Endereço:");

        jLabelEndNumero.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelEndNumero.setText("Número:");

        jLabelEndComplemento.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelEndComplemento.setText("Complemento:");

        jLabelCidade.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelCidade.setText("Cidade:");

        jTextFieldCidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCidadeActionPerformed(evt);
            }
        });

        jLabelEstado.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelEstado.setText("Estado:");

        jLabelTelRes.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelTelRes.setText("Telefone residencial: ");

        jLabelTelCel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelTelCel.setText("Telefone celular:");

        jLabelEmail.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelEmail.setText("E-mail:");

        jLabelBairro.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelBairro.setText("Bairro:");

        jLabelSexo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelSexo.setText("Sexo:");

        jLabelNomeMae.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelNomeMae.setText("Nome da mãe:");

        jTextFieldNomeMae.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNomeMaeActionPerformed(evt);
            }
        });

        jLabelEstadoCivil.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelEstadoCivil.setText("Estado civil:");

        jLabelNomePai.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelNomePai.setText("Nome do pai:");

        jButtonAtualizarCadastro.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButtonAtualizarCadastro.setText("Editar Cadastro");
        jButtonAtualizarCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAtualizarCadastroActionPerformed(evt);
            }
        });

        jFormattedTextFieldCPFCliente.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jFormattedTextFieldCPFClienteFocusLost(evt);
            }
        });
        jFormattedTextFieldCPFCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFormattedTextFieldCPFClienteActionPerformed(evt);
            }
        });

        jButtonPesquisar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButtonPesquisar.setText("Pesquisar");
        jButtonPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPesquisarActionPerformed(evt);
            }
        });

        jButtonSalvarEdição.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButtonSalvarEdição.setText("Salvar edição");
        jButtonSalvarEdição.setEnabled(false);
        jButtonSalvarEdição.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvarEdiçãoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButtonSalvarEdição)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonAtualizarCadastro))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelConsultaCliente)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabelCPFCliente)
                                    .addComponent(jLabelEndereço)
                                    .addComponent(jLabelRG)
                                    .addComponent(jLabelTelRes)
                                    .addComponent(jLabelNomeMae)
                                    .addComponent(jLabelCidade)
                                    .addComponent(jLabelPrimeiroNome))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jTextFieldCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(27, 27, 27)
                                        .addComponent(jLabelEstado)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jTextFieldEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(22, 22, 22)
                                        .addComponent(jLabelBairro)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jTextFieldBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jFormattedTextFieldCPFCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jButtonPesquisar))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jTextFieldTelRes, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(jLabelTelCel)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(jLabelNomePai)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(jTextFieldNomePai, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(jTextFieldTelCel, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGap(18, 18, 18)
                                                    .addComponent(jLabelEmail)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                    .addComponent(jTextFieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(jTextFieldRG)
                                                .addComponent(jTextFieldPrimeiroNome, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGap(18, 18, 18)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(jLabelDataNascimento)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                    .addComponent(jTextFieldDataNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGap(25, 25, 25)
                                                    .addComponent(jLabelEstadoCivil)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                    .addComponent(jTextFieldEstadoCivil))
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(jLabelSobrenome)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                    .addComponent(jTextFieldSobrenome, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGap(18, 18, 18)
                                                    .addComponent(jLabelSexo)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                    .addComponent(jTextFieldSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jTextFieldEndereço, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(jLabelEndNumero)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(jTextFieldEndNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(jLabelEndComplemento)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(jTextFieldEndComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(jTextFieldNomeMae, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(0, 8, Short.MAX_VALUE)))
                .addGap(12, 12, 12))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabelConsultaCliente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCPFCliente)
                    .addComponent(jFormattedTextFieldCPFCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonPesquisar))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelPrimeiroNome)
                            .addComponent(jLabelSobrenome)
                            .addComponent(jTextFieldSobrenome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldPrimeiroNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelSexo)
                            .addComponent(jTextFieldSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldRG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelRG)
                            .addComponent(jLabelDataNascimento)
                            .addComponent(jTextFieldDataNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabelEstadoCivil)
                        .addComponent(jTextFieldEstadoCivil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldEndereço, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelEndereço)
                    .addComponent(jLabelEndNumero)
                    .addComponent(jTextFieldEndNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelEndComplemento)
                    .addComponent(jTextFieldEndComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCidade)
                    .addComponent(jTextFieldCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelEstado)
                    .addComponent(jLabelBairro)
                    .addComponent(jTextFieldBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelTelRes)
                    .addComponent(jLabelTelCel)
                    .addComponent(jLabelEmail)
                    .addComponent(jTextFieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldTelRes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldTelCel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNomeMae)
                    .addComponent(jTextFieldNomeMae, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelNomePai)
                    .addComponent(jTextFieldNomePai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 207, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonAtualizarCadastro)
                    .addComponent(jButtonSalvarEdição))
                .addGap(23, 23, 23))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldPrimeiroNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldPrimeiroNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldPrimeiroNomeActionPerformed

    private void jTextFieldCidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCidadeActionPerformed

    private void jTextFieldNomeMaeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNomeMaeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNomeMaeActionPerformed

    private void jButtonAtualizarCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAtualizarCadastroActionPerformed
        jTextFieldBairro.setEnabled(true);
        jTextFieldCidade.setEnabled(true);
        jTextFieldEmail.setEnabled(true);
        jTextFieldEndComplemento.setEnabled(true);
        jTextFieldEndNumero.setEnabled(true);
        jTextFieldEndereço.setEnabled(true);
        jTextFieldEstado.setEnabled(true);
        jTextFieldEstadoCivil.setEnabled(true);
        jTextFieldSexo.setEnabled(true);
        jTextFieldTelCel.setEnabled(true);
        jTextFieldTelRes.setEnabled(true);
        jButtonSalvarEdição.setEnabled(true);
        jButtonAtualizarCadastro.setEnabled(false);
    }//GEN-LAST:event_jButtonAtualizarCadastroActionPerformed

    private void jFormattedTextFieldCPFClienteFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jFormattedTextFieldCPFClienteFocusLost

    }//GEN-LAST:event_jFormattedTextFieldCPFClienteFocusLost

    private void jFormattedTextFieldCPFClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFormattedTextFieldCPFClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFormattedTextFieldCPFClienteActionPerformed

    private void jButtonPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPesquisarActionPerformed
        String cpf = jFormattedTextFieldCPFCliente.getText();
        cpf = cpf.replace(".", "");
        cpf = cpf.replace("-", "");
        Cliente cliente = new ControlaCliente().consultaCliente(cpf);
        if (cpf == null) {
            JOptionPane.showMessageDialog(null, "Cliente não cadastrado");
        } else {
            jTextFieldBairro.setText(cliente.getBairro());
            jTextFieldCidade.setText(cliente.getCidade());
            jTextFieldDataNascimento.setText((cliente.getDataNascimento()).toString());
            jTextFieldEmail.setText(cliente.getEmail());
            jTextFieldEndComplemento.setText(cliente.getComplemento());
            jTextFieldEndNumero.setText(cliente.getNumero());
            jTextFieldEndereço.setText(cliente.getEndereco());
            jTextFieldEstado.setText(cliente.getEstado());
            jTextFieldEstadoCivil.setText(cliente.getEstadoCivil());
            jTextFieldNomeMae.setText(cliente.getNomeMae());
            jTextFieldNomePai.setText(cliente.getNomePai());
            jTextFieldPrimeiroNome.setText(cliente.getNome());
            jTextFieldRG.setText(cliente.getRg());
            jTextFieldSexo.setText(cliente.getSexo());
            jTextFieldSobrenome.setText(cliente.getSobrenome());
            jTextFieldTelCel.setText(cliente.getTelMovel());
            jTextFieldTelRes.setText(cliente.getTelFixo());
        }
    }//GEN-LAST:event_jButtonPesquisarActionPerformed

    private void jButtonSalvarEdiçãoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarEdiçãoActionPerformed
        atualizarCadastroCliente();
        boolean persiste = new ControlaCliente().persisteCliente(cliente);
        if (persiste) {
            JOptionPane.showMessageDialog(null, "Cadastro atualizado com sucesso!");
            jButtonSalvarEdição.setEnabled(false);
            jButtonAtualizarCadastro.setEnabled(true);
            jTextFieldBairro.setEnabled(false);
            jTextFieldCidade.setEnabled(false);
            jTextFieldEmail.setEnabled(false);
            jTextFieldEndComplemento.setEnabled(false);
            jTextFieldEndNumero.setEnabled(false);
            jTextFieldEndereço.setEnabled(false);
            jTextFieldEstado.setEnabled(false);
            jTextFieldEstadoCivil.setEnabled(false);
            jTextFieldSexo.setEnabled(false);
            jTextFieldTelCel.setEnabled(false);
            jTextFieldTelRes.setEnabled(false);
            jButtonSalvarEdição.setEnabled(false);
        } else {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar cadastro!");
        }


    }//GEN-LAST:event_jButtonSalvarEdiçãoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAtualizarCadastro;
    private javax.swing.JButton jButtonPesquisar;
    private javax.swing.JButton jButtonSalvarEdição;
    private javax.swing.JFormattedTextField jFormattedTextFieldCPFCliente;
    private javax.swing.JLabel jLabelBairro;
    private javax.swing.JLabel jLabelCPFCliente;
    private javax.swing.JLabel jLabelCidade;
    private javax.swing.JLabel jLabelConsultaCliente;
    private javax.swing.JLabel jLabelDataNascimento;
    private javax.swing.JLabel jLabelEmail;
    private javax.swing.JLabel jLabelEndComplemento;
    private javax.swing.JLabel jLabelEndNumero;
    private javax.swing.JLabel jLabelEndereço;
    private javax.swing.JLabel jLabelEstado;
    private javax.swing.JLabel jLabelEstadoCivil;
    private javax.swing.JLabel jLabelNomeMae;
    private javax.swing.JLabel jLabelNomePai;
    private javax.swing.JLabel jLabelPrimeiroNome;
    private javax.swing.JLabel jLabelRG;
    private javax.swing.JLabel jLabelSexo;
    private javax.swing.JLabel jLabelSobrenome;
    private javax.swing.JLabel jLabelTelCel;
    private javax.swing.JLabel jLabelTelRes;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextFieldBairro;
    private javax.swing.JTextField jTextFieldCidade;
    private javax.swing.JTextField jTextFieldDataNascimento;
    private javax.swing.JTextField jTextFieldEmail;
    private javax.swing.JTextField jTextFieldEndComplemento;
    private javax.swing.JTextField jTextFieldEndNumero;
    private javax.swing.JTextField jTextFieldEndereço;
    private javax.swing.JTextField jTextFieldEstado;
    private javax.swing.JTextField jTextFieldEstadoCivil;
    private javax.swing.JTextField jTextFieldNomeMae;
    private javax.swing.JTextField jTextFieldNomePai;
    private javax.swing.JTextField jTextFieldPrimeiroNome;
    private javax.swing.JTextField jTextFieldRG;
    private javax.swing.JTextField jTextFieldSexo;
    private javax.swing.JTextField jTextFieldSobrenome;
    private javax.swing.JTextField jTextFieldTelCel;
    private javax.swing.JTextField jTextFieldTelRes;
    // End of variables declaration//GEN-END:variables
}
