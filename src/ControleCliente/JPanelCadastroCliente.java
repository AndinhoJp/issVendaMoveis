/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ControleCliente;

import Entity.Cliente;
import static java.awt.Color.black;
import static java.awt.Color.red;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

/**
 *
 * @author ander
 */
public class JPanelCadastroCliente extends javax.swing.JPanel {

    /**
     * Creates new form JPanelCriaçãoUsuario
     */
    public JPanelCadastroCliente() {
        initComponents();
        jComboBoxEstado.setModel(getEstado());

    }

    public ComboBoxModel getEstado() {
        DefaultComboBoxModel model = new DefaultComboBoxModel();
        model.addElement("Acre");
        model.addElement("Alagoas");
        model.addElement("Amapá");
        model.addElement("Amazonas");
        model.addElement("Bahia");
        model.addElement("Ceará");
        model.addElement("Distrito Federal");
        model.addElement("Espírito Santo");
        model.addElement("Goiás");
        model.addElement("Maranhão");
        model.addElement("Mato Grosso");
        model.addElement("Mato Grosso do Sul");
        model.addElement("Minas Gerais");
        model.addElement("Pará");
        model.addElement("Paraíba");
        model.addElement("Paraná");
        model.addElement("Pernambuco");
        model.addElement("Piauí");
        model.addElement("Rio de Janeiro");
        model.addElement("Rio Grande do Norte");
        model.addElement("Rio Grande do Sul");
        model.addElement("Rondônia");
        model.addElement("Roraima");
        model.addElement("Santa Catarina");
        model.addElement("São Paulo");
        model.addElement("Sergipe");
        model.addElement("Tocantins");
        return model;
    }

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
        if ((cpf == null) || (cpf.length() != 11)) {
            return false;
        }
        Integer digito1 = calcularDigito(cpf.substring(0, 9), pesoCPF);
        Integer digito2 = calcularDigito(cpf.substring(0, 9) + digito1, pesoCPF);
        return cpf.equals(cpf.substring(0, 9) + digito1.toString() + digito2.toString());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        jLabelCriacaoCliente = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabelCPFCliente = new javax.swing.JLabel();
        jLabelPrimeiroNome = new javax.swing.JLabel();
        jTextFieldPrimeiroNome = new javax.swing.JTextField();
        jLabelSobrenome = new javax.swing.JLabel();
        jTextFieldSobrenome = new javax.swing.JTextField();
        jTextFieldRG = new javax.swing.JTextField();
        jLabelRG = new javax.swing.JLabel();
        jLabelDataNascimento = new javax.swing.JLabel();
        jDateChooserDataNascimento = new com.toedter.calendar.JDateChooser();
        jLabelEndereço = new javax.swing.JLabel();
        jTextFieldEndereço = new javax.swing.JTextField();
        jLabelEndNumero = new javax.swing.JLabel();
        jTextFieldEndNumero = new javax.swing.JTextField();
        jLabelEndComplemento = new javax.swing.JLabel();
        jTextFieldEndComplemento = new javax.swing.JTextField();
        jLabelCidade = new javax.swing.JLabel();
        jComboBoxEstado = new javax.swing.JComboBox<>();
        jTextFieldCidade = new javax.swing.JTextField();
        jLabelEstado = new javax.swing.JLabel();
        jLabelTelRes = new javax.swing.JLabel();
        jLabelTelCel = new javax.swing.JLabel();
        jLabelEmail = new javax.swing.JLabel();
        jTextFieldEmail = new javax.swing.JTextField();
        jLabelBairro = new javax.swing.JLabel();
        jTextFieldBairro = new javax.swing.JTextField();
        jLabelSexo = new javax.swing.JLabel();
        jComboBoxSexo = new javax.swing.JComboBox<>();
        jLabelNomeMae = new javax.swing.JLabel();
        jTextFieldNomeMae = new javax.swing.JTextField();
        jLabelEstadoCivil = new javax.swing.JLabel();
        jComboBoxEstadoCivil = new javax.swing.JComboBox<>();
        jLabelNomePai = new javax.swing.JLabel();
        jTextFieldNomePai = new javax.swing.JTextField();
        jButtonCadastrar = new javax.swing.JButton();
        jFormattedTextFieldTelRes = new javax.swing.JFormattedTextField();
        try{
            javax.swing.text.MaskFormatter telefone= new javax.swing.text.MaskFormatter("(##)####-####");
            jFormattedTextFieldTelRes = new javax.swing.JFormattedTextField(telefone);
        }
        catch (Exception e){
        }
        jFormattedTextFieldTelCel = new javax.swing.JFormattedTextField();
        try{
            javax.swing.text.MaskFormatter telefone= new javax.swing.text.MaskFormatter("(##)####-####");
            jFormattedTextFieldTelCel = new javax.swing.JFormattedTextField(telefone);
        }
        catch (Exception e){
        }
        jFormattedTextFieldCPFCliente = new javax.swing.JFormattedTextField();
        try{
            javax.swing.text.MaskFormatter cpf= new javax.swing.text.MaskFormatter("###.###.###-##");
            jFormattedTextFieldCPFCliente = new javax.swing.JFormattedTextField(cpf);
        }
        catch (Exception e){
        }

        setBorder(javax.swing.BorderFactory.createEtchedBorder());
        setMaximumSize(new java.awt.Dimension(1000, 600));
        setMinimumSize(new java.awt.Dimension(1000, 600));

        jLabelCriacaoCliente.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabelCriacaoCliente.setText("Cadastro de novo cliente");

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

        jDateChooserDataNascimento.setDateFormatString("yyyy-MM-dd");

        jLabelEndereço.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelEndereço.setText("Endereço:");

        jLabelEndNumero.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelEndNumero.setText("Número:");

        jLabelEndComplemento.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelEndComplemento.setText("Complemento:");

        jLabelCidade.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelCidade.setText("Cidade:");

        jComboBoxEstado.setModel(getEstado());

        org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, this, org.jdesktop.beansbinding.ELProperty.create("${estado.selectedItem}"), jComboBoxEstado, org.jdesktop.beansbinding.BeanProperty.create("selectedItem"));
        bindingGroup.addBinding(binding);

        jComboBoxEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxEstadoActionPerformed(evt);
            }
        });

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

        jComboBoxSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Masculino", "Feminino" }));
        jComboBoxSexo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxSexoActionPerformed(evt);
            }
        });

        jLabelNomeMae.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelNomeMae.setText("Nome da mãe:");

        jTextFieldNomeMae.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNomeMaeActionPerformed(evt);
            }
        });

        jLabelEstadoCivil.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelEstadoCivil.setText("Estado civil:");

        jComboBoxEstadoCivil.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Solteiro(a)", "Casado(a)", "Separado(a)", "Divorciado(a) ", "Viúvo(a)" }));
        jComboBoxEstadoCivil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxEstadoCivilActionPerformed(evt);
            }
        });

        jLabelNomePai.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelNomePai.setText("Nome do pai:");

        jButtonCadastrar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButtonCadastrar.setText("Cadastrar");
        jButtonCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCadastrarActionPerformed(evt);
            }
        });

        jFormattedTextFieldTelRes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFormattedTextFieldTelResActionPerformed(evt);
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(jLabelCPFCliente)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jFormattedTextFieldCPFCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addComponent(jLabelCidade)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextFieldCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabelEstado)
                        .addGap(18, 18, 18)
                        .addComponent(jComboBoxEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22)
                        .addComponent(jLabelBairro)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextFieldBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabelCriacaoCliente))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabelPrimeiroNome)
                                .addGap(8, 8, 8))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabelEndereço)
                                    .addComponent(jLabelRG)
                                    .addComponent(jLabelTelRes)
                                    .addComponent(jLabelNomeMae))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
                            .addComponent(jTextFieldNomeMae, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jFormattedTextFieldTelRes, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabelTelCel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabelNomePai)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextFieldNomePai, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jFormattedTextFieldTelCel, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabelEmail))))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jTextFieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jTextFieldRG, javax.swing.GroupLayout.DEFAULT_SIZE, 283, Short.MAX_VALUE)
                                        .addComponent(jTextFieldPrimeiroNome))
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabelDataNascimento)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(jDateChooserDataNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(jLabelEstadoCivil)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(jComboBoxEstadoCivil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabelSobrenome)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(jTextFieldSobrenome, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(jLabelSexo)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jComboBoxSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addComponent(jButtonCadastrar)))))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelCriacaoCliente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCPFCliente)
                    .addComponent(jFormattedTextFieldCPFCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelPrimeiroNome)
                            .addComponent(jLabelSobrenome)
                            .addComponent(jTextFieldSobrenome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldPrimeiroNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelSexo)
                            .addComponent(jComboBoxSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jTextFieldRG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabelRG)
                                .addComponent(jLabelDataNascimento))
                            .addComponent(jDateChooserDataNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabelEstadoCivil)
                        .addComponent(jComboBoxEstadoCivil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
                    .addComponent(jComboBoxEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelBairro)
                    .addComponent(jTextFieldBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelTelRes)
                    .addComponent(jLabelTelCel)
                    .addComponent(jLabelEmail)
                    .addComponent(jTextFieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jFormattedTextFieldTelRes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jFormattedTextFieldTelCel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNomeMae)
                    .addComponent(jTextFieldNomeMae, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelNomePai)
                    .addComponent(jTextFieldNomePai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 245, Short.MAX_VALUE)
                .addComponent(jButtonCadastrar)
                .addContainerGap())
        );

        bindingGroup.bind();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldPrimeiroNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldPrimeiroNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldPrimeiroNomeActionPerformed

    private void jComboBoxEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxEstadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxEstadoActionPerformed

    private void jTextFieldCidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCidadeActionPerformed

    private void jTextFieldNomeMaeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNomeMaeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNomeMaeActionPerformed

    private void jButtonCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadastrarActionPerformed
        if (jFormattedTextFieldCPFCliente.getText().equals("")
                || jTextFieldPrimeiroNome.getText().equals("")
                || jTextFieldSobrenome.getText().equals("")
                || jTextFieldRG.getText().equals("")
                || jTextFieldEndereço.getText().equals("")
                || jTextFieldEndNumero.getText().equals("")
                || jTextFieldCidade.getText().equals("")
                || jTextFieldBairro.getText().equals("")
                || jFormattedTextFieldTelRes.getText().equals("")
                || jTextFieldNomeMae.getText().equals("")
                || jTextFieldNomePai.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Um dos campos obrigatório está em branco!");
            campoObrigatorio();
        } else {
            jLabelPrimeiroNome.setForeground(black);
            jLabelSobrenome.setForeground(black);
            jLabelRG.setForeground(black);
            jLabelEndereço.setForeground(black);
            jLabelEndNumero.setForeground(black);
            jLabelCidade.setForeground(black);
            jLabelBairro.setForeground(black);
            jLabelTelRes.setForeground(black);
            jLabelNomeMae.setForeground(black);
            jLabelNomePai.setForeground(black);
            String cpf = jFormattedTextFieldCPFCliente.getText();
            cpf = cpf.replace(".", "");
            cpf = cpf.replace("-", "");
            try {
                Cliente cliente = new ControlaCliente().cadastraCliente(cpf, jTextFieldPrimeiroNome.getText(), jTextFieldSobrenome.getText(), jFormattedTextFieldCPFCliente.getText(), jTextFieldRG.getText(), jDateChooserDataNascimento.getDate(), jTextFieldEndereço.getText(), jTextFieldEndNumero.getText(), jTextFieldEndComplemento.getText(), jTextFieldCidade.getText(), jComboBoxEstado.getSelectedItem().toString(), jFormattedTextFieldTelCel.getText(), jFormattedTextFieldTelCel.getText(), jTextFieldEmail.getText(), jTextFieldNomeMae.getText(), jTextFieldNomePai.getText(), jComboBoxSexo.getSelectedItem().toString(), jTextFieldBairro.getText(), jComboBoxEstadoCivil.getSelectedItem().toString());
                JOptionPane.showMessageDialog(null, "Cadastro realizado com sucesso!");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Erro ao cadastrar o novo cliente!");
            }
        }
    }//GEN-LAST:event_jButtonCadastrarActionPerformed

    private void jComboBoxEstadoCivilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxEstadoCivilActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxEstadoCivilActionPerformed

    private void jFormattedTextFieldTelResActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFormattedTextFieldTelResActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFormattedTextFieldTelResActionPerformed

    private void jFormattedTextFieldCPFClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFormattedTextFieldCPFClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFormattedTextFieldCPFClienteActionPerformed

    private void jFormattedTextFieldCPFClienteFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jFormattedTextFieldCPFClienteFocusLost
        String cpf = jFormattedTextFieldCPFCliente.getText();
        cpf = cpf.replace(".", "");
        cpf = cpf.replace("-", "");
        if (validadorCPF(cpf) == false) {
            JOptionPane.showMessageDialog(null, "O CPF informado é invalido. Confira os números e tente novamente.");
            bloqueiaCampos();
        } else {
            boolean valCPF = new ControlaCliente().verificaCliente(cpf);
            if (valCPF == true) {
                bloqueiaCampos();
                JOptionPane.showMessageDialog(null, "O CPF informado já está cadastro no sistema!");
            } else {
                jTextFieldBairro.setEditable(true);
                jTextFieldCidade.setEditable(true);
                jTextFieldEmail.setEditable(true);
                jTextFieldEndComplemento.setEditable(true);
                jTextFieldEndNumero.setEditable(true);
                jTextFieldEndereço.setEditable(true);
                jTextFieldNomeMae.setEditable(true);
                jTextFieldNomePai.setEditable(true);
                jTextFieldPrimeiroNome.setEditable(true);
                jTextFieldRG.setEditable(true);
                jTextFieldSobrenome.setEditable(true);
                jFormattedTextFieldTelCel.setEditable(true);
                jFormattedTextFieldTelRes.setEditable(true);
            }
        }
    }//GEN-LAST:event_jFormattedTextFieldCPFClienteFocusLost

    private void jComboBoxSexoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxSexoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxSexoActionPerformed

    public void limpaCampos() {
        jTextFieldBairro.setText("");
        jTextFieldCidade.setText("");
        jTextFieldEmail.setText("");
        jTextFieldEndComplemento.setText("");
        jTextFieldEndNumero.setText("");
        jTextFieldEndereço.setText("");
        jTextFieldNomeMae.setText("");
        jTextFieldNomePai.setText("");
        jTextFieldPrimeiroNome.setText("");
        jTextFieldRG.setText("");
        jTextFieldSobrenome.setText("");
        jFormattedTextFieldTelCel.setText("");
        jFormattedTextFieldTelRes.setText("");
        jFormattedTextFieldCPFCliente.setText("");

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCadastrar;
    private javax.swing.JComboBox<String> jComboBoxEstado;
    private javax.swing.JComboBox<String> jComboBoxEstadoCivil;
    private javax.swing.JComboBox<String> jComboBoxSexo;
    private com.toedter.calendar.JDateChooser jDateChooserDataNascimento;
    private javax.swing.JFormattedTextField jFormattedTextFieldCPFCliente;
    private javax.swing.JFormattedTextField jFormattedTextFieldTelCel;
    private javax.swing.JFormattedTextField jFormattedTextFieldTelRes;
    private javax.swing.JLabel jLabelBairro;
    private javax.swing.JLabel jLabelCPFCliente;
    private javax.swing.JLabel jLabelCidade;
    private javax.swing.JLabel jLabelCriacaoCliente;
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
    private javax.swing.JTextField jTextFieldEmail;
    private javax.swing.JTextField jTextFieldEndComplemento;
    private javax.swing.JTextField jTextFieldEndNumero;
    private javax.swing.JTextField jTextFieldEndereço;
    private javax.swing.JTextField jTextFieldNomeMae;
    private javax.swing.JTextField jTextFieldNomePai;
    private javax.swing.JTextField jTextFieldPrimeiroNome;
    private javax.swing.JTextField jTextFieldRG;
    private javax.swing.JTextField jTextFieldSobrenome;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables

    public void campoObrigatorio() {
        if (jTextFieldPrimeiroNome.getText().equals("")) {
            jLabelPrimeiroNome.setForeground(red);
        } else {
            jLabelPrimeiroNome.setForeground(black);
        }
        if (jTextFieldSobrenome.getText().equals("")) {
            jLabelSobrenome.setForeground(red);
        } else {
            jLabelSobrenome.setForeground(black);
        }
        if (jTextFieldRG.getText().equals("")) {
            jLabelRG.setForeground(red);
        } else {
            jLabelRG.setForeground(black);
        }
        if (jTextFieldEndereço.getText().equals("")) {
            jLabelEndereço.setForeground(red);
        } else {
            jLabelEndereço.setForeground(black);
        }
        if (jTextFieldEndNumero.getText().equals("")) {
            jLabelEndNumero.setForeground(red);
        } else {
            jLabelEndNumero.setForeground(black);
        }
        if (jTextFieldCidade.getText().equals("")) {
            jLabelCidade.setForeground(red);
        } else {
            jLabelCidade.setForeground(black);
        }
        if (jTextFieldBairro.getText().equals("")) {
            jLabelBairro.setForeground(red);
        } else {
            jLabelBairro.setForeground(black);
        }
        if (jFormattedTextFieldTelRes.getText().equals("")) {
            jLabelTelRes.setForeground(red);
        } else {
            jLabelTelRes.setForeground(black);
        }
        if (jTextFieldNomeMae.getText().equals("")) {
            jLabelNomeMae.setForeground(red);
        } else {
            jLabelNomeMae.setForeground(black);
        }
        if (jTextFieldNomePai.getText().equals("")) {
            jLabelNomePai.setForeground(red);
        } else {
            jLabelNomePai.setForeground(black);
        }
    }

    void bloqueiaCampos() {
        jTextFieldBairro.setEditable(false);
        jTextFieldCidade.setEditable(false);
        jTextFieldEmail.setEditable(false);
        jTextFieldEndComplemento.setEditable(false);
        jTextFieldEndNumero.setEditable(false);
        jTextFieldEndereço.setEditable(false);
        jTextFieldNomeMae.setEditable(false);
        jTextFieldNomePai.setEditable(false);
        jTextFieldPrimeiroNome.setEditable(false);
        jTextFieldRG.setEditable(false);
        jTextFieldSobrenome.setEditable(false);
        jFormattedTextFieldTelCel.setEditable(false);
        jFormattedTextFieldTelRes.setEditable(false);
    }
}
