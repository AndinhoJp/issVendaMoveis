/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ControleVenda;

import Autenticacao.JFrameTelaLoginDesconto;
import ControlaProduto.ControlaProduto;
import ControleCliente.ControlaCliente;
import ControleVenda.Controladoras.ControlaProdVenda;
import ControleVenda.Controladoras.ControlaVenda;
import Entity.Cliente;
import Entity.Funcionario;
import Entity.ProdVenda;
import Entity.Produto;
import java.awt.CardLayout;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import org.hibernate.Hibernate;
import sun.management.snmp.util.JvmContextFactory;

/**
 *
 * @author ander
 */
public class jPanelFinalizarVenda extends javax.swing.JPanel {

    /**
     * Creates new form jPanelFinalizarVenda
     */
    CardLayout card;
    Funcionario funcionario;
    Cliente cliente;
    DefaultTableModel tableModel;
    ArrayList<ProdVenda> prodsVenda;
    ArrayList<Produto> listaProds = new ArrayList();
    String idVenda;
    float valorTotal = 0;
    int numParcelas = 0;

    public jPanelFinalizarVenda(Funcionario f, String idVendaAberta) {
        initComponents();
        jComboBoxFormaPagamento.setModel(getFormaPagamento());
        jComboBoxParcelas.setModel(getParcelas());

        idVenda = idVendaAberta;
        funcionario = f;
        tableModel = (DefaultTableModel) jTableProdCarrinho.getModel();

        tableModel.setNumRows(0);

        prodsVenda = new ControlaProdVenda().getProdsVenda(idVendaAberta);
        ControlaProduto controlaProduto = new ControlaProduto();
        Produto produto;

        for (ProdVenda pv : prodsVenda) {
            Hibernate.initialize(pv.getProduto().getProdId());
            produto = controlaProduto.getProduto(pv.getProduto().getProdId());
            listaProds.add(produto);
            tableModel.addRow(new Object[]{produto.getProdId(), produto.getNomeProd(), pv.getValorUnitario(), pv.getQuantidade(), "" + (pv.getQuantidade() * pv.getValorUnitario()), false});
            valorTotal += pv.getQuantidade() * pv.getValorUnitario();
        }
        if (!prodsVenda.isEmpty()) {
            jTextFieldTotal.setText(Float.toString(valorTotal));
        }
    }

    public jPanelFinalizarVenda() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public ComboBoxModel getFormaPagamento() {
        DefaultComboBoxModel model = new DefaultComboBoxModel();
        model.addElement("Cartão de crédito");
        model.addElement("Dinheiro");
        model.addElement("Boleto");
        return model;
    }

    public ComboBoxModel getParcelas() {
        DefaultComboBoxModel model = new DefaultComboBoxModel();
        model.addElement("1");
        model.addElement("2");
        model.addElement("3");
        model.addElement("4");
        model.addElement("5");
        model.addElement("6");
        model.addElement("7");
        model.addElement("8");
        model.addElement("9");
        model.addElement("10");
        return model;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelFinalizarVenda = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabelCPFCliente = new javax.swing.JLabel();
        jFormattedTextFieldCPFCliente = new javax.swing.JFormattedTextField();
        try{    javax.swing.text.MaskFormatter cpf= new javax.swing.text.MaskFormatter("###.###.###-##");    jFormattedTextFieldCPFCliente = new javax.swing.JFormattedTextField(cpf); }    catch (Exception e){ }
        jButtonPesquisar = new javax.swing.JButton();
        jLabelNome = new javax.swing.JLabel();
        jTextFieldNome = new javax.swing.JTextField();
        jLabelSobrenome = new javax.swing.JLabel();
        jTextFieldSobrenome = new javax.swing.JTextField();
        jLabelEndereco = new javax.swing.JLabel();
        jTextFieldEndereco = new javax.swing.JTextField();
        jLabelEndNumero = new javax.swing.JLabel();
        jTextFieldEndNumero = new javax.swing.JTextField();
        jLabelEndComplemento = new javax.swing.JLabel();
        jTextFieldEndComplemento = new javax.swing.JTextField();
        jTextFieldBairro = new javax.swing.JTextField();
        jTextFieldEstado = new javax.swing.JTextField();
        jLabelBairro = new javax.swing.JLabel();
        jLabelEstado = new javax.swing.JLabel();
        jTextFieldCidade = new javax.swing.JTextField();
        jLabelCidade = new javax.swing.JLabel();
        jLabelTelRes = new javax.swing.JLabel();
        jTextFieldTelRes = new javax.swing.JTextField();
        jLabelTelCel = new javax.swing.JLabel();
        jTextFieldTelCel = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableProdCarrinho = new javax.swing.JTable();
        jLabelProdCarrinho = new javax.swing.JLabel();
        jLabelPagamento = new javax.swing.JLabel();
        jPanelFormaPagament = new javax.swing.JPanel();
        jButtonFinalizarVenda = new javax.swing.JButton();
        jComboBoxFormaPagamento = new javax.swing.JComboBox<>();
        jTextFieldTotal = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jComboBoxParcelas = new javax.swing.JComboBox<>();
        jLabelParcelas = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(1000, 600));

        jLabelFinalizarVenda.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabelFinalizarVenda.setText("Finalizar venda");

        jLabelCPFCliente.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabelCPFCliente.setText("CPF do cliente:");

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

        jButtonPesquisar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jButtonPesquisar.setText("Pesquisar");
        jButtonPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPesquisarActionPerformed(evt);
            }
        });

        jLabelNome.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabelNome.setText("Nome:");

        jTextFieldNome.setEditable(false);

        jLabelSobrenome.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabelSobrenome.setText("Sobrenome");

        jTextFieldSobrenome.setEditable(false);

        jLabelEndereco.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabelEndereco.setText("Endereco:");

        jTextFieldEndereco.setEditable(false);

        jLabelEndNumero.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabelEndNumero.setText("Número:");

        jTextFieldEndNumero.setEditable(false);

        jLabelEndComplemento.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabelEndComplemento.setText("Complemento:");

        jTextFieldEndComplemento.setEditable(false);

        jTextFieldBairro.setEditable(false);

        jTextFieldEstado.setEditable(false);

        jLabelBairro.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabelBairro.setText("Bairro:");

        jLabelEstado.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabelEstado.setText("Estado:");

        jTextFieldCidade.setEditable(false);
        jTextFieldCidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCidadeActionPerformed(evt);
            }
        });

        jLabelCidade.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabelCidade.setText("Cidade:");

        jLabelTelRes.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabelTelRes.setText("Telefone residencial: ");

        jTextFieldTelRes.setEditable(false);

        jLabelTelCel.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabelTelCel.setText("Telefone celular:");

        jTextFieldTelCel.setEditable(false);

        jTableProdCarrinho.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID:", "Nome:", "Valor unitário:", "Quantidade:", "Valor total:", ""
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTableProdCarrinho);

        jLabelProdCarrinho.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabelProdCarrinho.setText("Produtos no carrinho");

        jLabelPagamento.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabelPagamento.setText("Pagamento");

        jPanelFormaPagament.setLayout(new java.awt.CardLayout());

        jButtonFinalizarVenda.setText("Finalizar");
        jButtonFinalizarVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFinalizarVendaActionPerformed(evt);
            }
        });

        jComboBoxFormaPagamento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBoxFormaPagamento.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBoxFormaPagamentoItemStateChanged(evt);
            }
        });
        jComboBoxFormaPagamento.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jComboBoxFormaPagamentoFocusLost(evt);
            }
        });
        jComboBoxFormaPagamento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jComboBoxFormaPagamentoMouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel1.setText("Total:");

        jComboBoxParcelas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabelParcelas.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabelParcelas.setText("Parcelas:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1, javax.swing.GroupLayout.DEFAULT_SIZE, 1000, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelNome)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextFieldNome)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabelSobrenome)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextFieldSobrenome, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabelCPFCliente)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jFormattedTextFieldCPFCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButtonPesquisar))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabelEndereco)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextFieldEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabelEndNumero)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextFieldEndNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabelEndComplemento)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextFieldEndComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabelCidade)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
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
                                .addComponent(jLabelTelRes)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextFieldTelRes, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabelTelCel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextFieldTelCel, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabelProdCarrinho))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanelFormaPagament, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabelFinalizarVenda)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabelPagamento)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jComboBoxFormaPagamento, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(48, 48, 48)
                                        .addComponent(jLabelParcelas)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jComboBoxParcelas, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(jLabel1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jTextFieldTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addContainerGap())))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonFinalizarVenda)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabelFinalizarVenda)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCPFCliente)
                    .addComponent(jFormattedTextFieldCPFCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonPesquisar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNome)
                    .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelSobrenome)
                    .addComponent(jTextFieldSobrenome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelEndereco)
                    .addComponent(jLabelEndNumero)
                    .addComponent(jTextFieldEndNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelEndComplemento)
                    .addComponent(jTextFieldEndComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
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
                    .addComponent(jTextFieldTelRes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldTelCel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelProdCarrinho)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelPagamento)
                            .addComponent(jComboBoxFormaPagamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBoxParcelas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelParcelas)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanelFormaPagament, javax.swing.GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonFinalizarVenda)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jFormattedTextFieldCPFClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFormattedTextFieldCPFClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFormattedTextFieldCPFClienteActionPerformed

    private void jButtonPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPesquisarActionPerformed
        buscar();
    }//GEN-LAST:event_jButtonPesquisarActionPerformed

    private void jFormattedTextFieldCPFClienteFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jFormattedTextFieldCPFClienteFocusLost
        buscar();
    }//GEN-LAST:event_jFormattedTextFieldCPFClienteFocusLost

    private void jTextFieldCidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCidadeActionPerformed

    private void jButtonFinalizarVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFinalizarVendaActionPerformed
        if(cliente == null){
            JOptionPane.showMessageDialog(null, "Informe o CPF do cliente!");
            return;
        }

        int n = JOptionPane.showConfirmDialog(
                null,
                "Essa operacão não pode ser revertida. Deseja continuar?",
                "Confirmar Opcão",
                JOptionPane.YES_NO_OPTION);
        if (n == JOptionPane.YES_OPTION) {
            switch (jComboBoxFormaPagamento.getSelectedIndex()) {
                case 0:
                    new ControlaVenda().novaVendaFechada(new ControlaVenda().getVendaAbertaFuncionario(funcionario), cliente, new Date(), valorTotal, jComboBoxParcelas.getSelectedIndex() + 1, "Cartão");
                    break;
                case 1:
                    new ControlaVenda().novaVendaFechada(new ControlaVenda().getVendaAbertaFuncionario(funcionario), cliente, new Date(), valorTotal, jComboBoxParcelas.getSelectedIndex() + 1, "Boleto");
                    break;
                case 2:
                    new ControlaVenda().novaVendaFechada(new ControlaVenda().getVendaAbertaFuncionario(funcionario), cliente, new Date(), valorTotal, jComboBoxParcelas.getSelectedIndex() + 1, "Dinheiro");
                    break;
            }

            idVenda = funcionario.getIdFunc() + new Date().getTime();
            new ControlaVenda().novaVendaAberta(idVenda, funcionario);
            JOptionPane.showMessageDialog(null, "A venda anterior foi fechada  e uma nova venda foi inicializada!");
            tableModel = (DefaultTableModel) jTableProdCarrinho.getModel();

            tableModel.setNumRows(0);

            prodsVenda = new ControlaProdVenda().getProdsVenda(idVenda);
            ControlaProduto controlaProduto = new ControlaProduto();
            Produto produto;

            for (ProdVenda pv : prodsVenda) {
                Hibernate.initialize(pv.getProduto().getProdId());
                produto = controlaProduto.getProduto(pv.getProduto().getProdId());
                listaProds.add(produto);
                tableModel.addRow(new Object[]{produto.getProdId(), produto.getNomeProd(), pv.getValorUnitario(), pv.getQuantidade(), "" + (pv.getQuantidade() * pv.getValorUnitario()), false});
                valorTotal += pv.getQuantidade() * pv.getValorUnitario();
            }

            if (!prodsVenda.isEmpty()) {
                jTextFieldTotal.setText("Valor Total = R$ " + valorTotal);
            }

        }

    }//GEN-LAST:event_jButtonFinalizarVendaActionPerformed

    private void jComboBoxFormaPagamentoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jComboBoxFormaPagamentoFocusLost

    }//GEN-LAST:event_jComboBoxFormaPagamentoFocusLost

    private void jComboBoxFormaPagamentoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jComboBoxFormaPagamentoMouseClicked
        int opc = jComboBoxFormaPagamento.getSelectedIndex();
        switch (opc) {
            case 0: //CARTAO DE CREDITO
                JPanel jPanelPagamentoCartao = new jPanelPagamentoCartao( jComboBoxParcelas.getSelectedIndex()+ 1, valorTotal);
                jPanelFormaPagament.add(jPanelPagamentoCartao);
                card.next(jPanelFormaPagament);
                break;
            case 1: //DINHEIRO
                JPanel jPanelPagamentoDinheiro = new jPanelPagamentoDinheiro();
                jPanelFormaPagament.add(jPanelPagamentoDinheiro);
                card.next(jPanelFormaPagament);
                break;
            case 2: // BOLETO BANCARIO

                break;
        }

    }//GEN-LAST:event_jComboBoxFormaPagamentoMouseClicked

    private void jComboBoxFormaPagamentoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBoxFormaPagamentoItemStateChanged
//        int opc = jComboBoxFormaPagamento.getSelectedIndex();
//        switch (opc) {
//            case 1:
//                JPanel jPanelPagamentoCartao = new jPanelPagamentoCartao();
//                jPanelFormaPagament.add(jPanelPagamentoCartao);
//                card.next(jPanelFormaPagament);
//                break;
//        }
    }//GEN-LAST:event_jComboBoxFormaPagamentoItemStateChanged
    void buscar() {
        String cpf = jFormattedTextFieldCPFCliente.getText();
        cpf = cpf.replace(".", "");
        cpf = cpf.replace("-", "");
        cliente = new ControlaCliente().consultaCliente(cpf);
        if (cpf == null) {
            JOptionPane.showMessageDialog(null, "Cliente não cadastrado");
        } else {
            jTextFieldNome.setText(cliente.getNome());
            jTextFieldSobrenome.setText(cliente.getSobrenome());
            jTextFieldCidade.setText(cliente.getCidade());
            jTextFieldEstado.setText(cliente.getEstado());
            jTextFieldBairro.setText(cliente.getBairro());
            jTextFieldEndereco.setText(cliente.getEndereco());
            jTextFieldEndNumero.setText(cliente.getNumero());
            jTextFieldEndComplemento.setText(cliente.getComplemento());
            jTextFieldTelRes.setText(cliente.getTelFixo());
            jTextFieldTelCel.setText(cliente.getTelMovel());
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonFinalizarVenda;
    private javax.swing.JButton jButtonPesquisar;
    private javax.swing.JComboBox<String> jComboBoxFormaPagamento;
    private javax.swing.JComboBox<String> jComboBoxParcelas;
    private javax.swing.JFormattedTextField jFormattedTextFieldCPFCliente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelBairro;
    private javax.swing.JLabel jLabelCPFCliente;
    private javax.swing.JLabel jLabelCidade;
    private javax.swing.JLabel jLabelEndComplemento;
    private javax.swing.JLabel jLabelEndNumero;
    private javax.swing.JLabel jLabelEndereco;
    private javax.swing.JLabel jLabelEstado;
    private javax.swing.JLabel jLabelFinalizarVenda;
    private javax.swing.JLabel jLabelNome;
    private javax.swing.JLabel jLabelPagamento;
    private javax.swing.JLabel jLabelParcelas;
    private javax.swing.JLabel jLabelProdCarrinho;
    private javax.swing.JLabel jLabelSobrenome;
    private javax.swing.JLabel jLabelTelCel;
    private javax.swing.JLabel jLabelTelRes;
    private javax.swing.JPanel jPanelFormaPagament;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTableProdCarrinho;
    private javax.swing.JTextField jTextFieldBairro;
    private javax.swing.JTextField jTextFieldCidade;
    private javax.swing.JTextField jTextFieldEndComplemento;
    private javax.swing.JTextField jTextFieldEndNumero;
    private javax.swing.JTextField jTextFieldEndereco;
    private javax.swing.JTextField jTextFieldEstado;
    private javax.swing.JTextField jTextFieldNome;
    private javax.swing.JTextField jTextFieldSobrenome;
    private javax.swing.JTextField jTextFieldTelCel;
    private javax.swing.JTextField jTextFieldTelRes;
    private javax.swing.JTextField jTextFieldTotal;
    // End of variables declaration//GEN-END:variables
}
