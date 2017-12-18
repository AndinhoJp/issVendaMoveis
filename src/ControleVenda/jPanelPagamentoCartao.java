/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ControleVenda;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Arrays;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author ander
 */
    

public class jPanelPagamentoCartao extends javax.swing.JPanel {

    /**
     * Creates new form jPanelPagamentoCartao
     */
    
    int numParcelas;
    
    public jPanelPagamentoCartao(int nParcelas, float total) {
        initComponents();

        BigDecimal k = BigDecimal.valueOf(total);
        jTextFieldQuantParcel.setText(Integer.toString(nParcelas));
        jTextFieldValorParcel.setText( Float.toHexString(total/nParcelas));

    }
    
public BigInteger[] parcelar ( BigInteger total , int nParcelas){
BigInteger[] valores = total.divideAndRemainder(total);
// valores[0] é o quociente e valores[1] é o resto
// cria parcelas
BigInteger[] parcelas = new BigInteger[nParcelas];
// preenche array com o mesmo valor da parcela
Arrays.fill(parcelas, valores[0]);
//adiciona o resto na primeira
parcelas[0] = parcelas[0].add(valores[1]);
return parcelas;
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

        jLabelCartao = new javax.swing.JLabel();
        jFormattedTextFieldCartao = new javax.swing.JFormattedTextField();
        try{
            javax.swing.text.MaskFormatter cartao= new javax.swing.text.MaskFormatter("#### #### #### ####");
            jFormattedTextFieldCartao = new javax.swing.JFormattedTextField(cartao);
        }
        catch (Exception e){
        }
        jTextFieldValorParcel = new javax.swing.JTextField();
        jLabelVezes = new javax.swing.JLabel();
        jTextFieldQuantParcel = new javax.swing.JTextField();
        jLabelIgual = new javax.swing.JLabel();
        jTextFieldPrecoFInal = new javax.swing.JTextField();
        jLabelLogoCartao = new javax.swing.JLabel();
        jLabelValidarCartao = new javax.swing.JLabel();

        jLabelCartao.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabelCartao.setText("Número do cartão:");

        jFormattedTextFieldCartao.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jFormattedTextFieldCartaoFocusLost(evt);
            }
        });
        jFormattedTextFieldCartao.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jFormattedTextFieldCartaoKeyReleased(evt);
            }
        });

        jLabelVezes.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabelVezes.setText("X");

        jTextFieldQuantParcel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldQuantParcelActionPerformed(evt);
            }
        });

        jLabelIgual.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabelIgual.setText("=");

        jTextFieldPrecoFInal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldPrecoFInalActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelCartao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jFormattedTextFieldCartao, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelValidarCartao, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                .addComponent(jLabelLogoCartao, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(141, 141, 141)
                .addComponent(jTextFieldValorParcel, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelVezes)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldQuantParcel, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelIgual)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldPrecoFInal, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(108, 108, 108))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabelCartao)
                                .addComponent(jFormattedTextFieldCartao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabelValidarCartao, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabelLogoCartao, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldValorParcel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelVezes)
                            .addComponent(jTextFieldQuantParcel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelIgual)
                            .addComponent(jTextFieldPrecoFInal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(27, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldQuantParcelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldQuantParcelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldQuantParcelActionPerformed

    private void jTextFieldPrecoFInalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldPrecoFInalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldPrecoFInalActionPerformed

    private void jFormattedTextFieldCartaoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jFormattedTextFieldCartaoFocusLost

    }//GEN-LAST:event_jFormattedTextFieldCartaoFocusLost

    private void jFormattedTextFieldCartaoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jFormattedTextFieldCartaoKeyReleased
        ImageIcon imgValidator;
        ImageIcon imgBandeira;

        if (totalDigitosCampo() == 0) {
            jLabelValidarCartao.setVisible(false);
            imgBandeira = new ImageIcon(getClass().getResource("/Imagem/cartaoCredito/ICONE.png"));
            jLabelLogoCartao.setIcon(imgBandeira);
        } else {
            /* Verifico se é o 1º dígito e se começa com 0, 1, 2, 7, 8, ou 9 | Se for, o cartão é INVÁLIDO  */
            if (totalDigitosCampo() == 1 && (evt.getKeyCode() == 48 || evt.getKeyCode() == 49 || evt.getKeyCode() == 50 || evt.getKeyCode() == 55 || evt.getKeyCode() == 56 || evt.getKeyCode() == 57)) {
                imgValidator = new ImageIcon(getClass().getResource("/Imagem/cartaoCredito/VERIFY_NO.png"));
                jLabelValidarCartao.setVisible(true);
                jLabelValidarCartao.setIcon(imgValidator);
            } else {
                /* Verifica se é o primeiro digito e se ele é o 4, caso SIM então é VISA */
                if (totalDigitosCampo() == 1) {
                    if (evt.getKeyCode() == 52) {
                        imgBandeira = new ImageIcon(getClass().getResource("/Imagem/cartaoCredito/VISA.png"));
                        jLabelLogoCartao.setIcon(imgBandeira);
                    } else {
                        jLabelValidarCartao.setVisible(false);
                        imgBandeira = new ImageIcon(getClass().getResource("/Imagem/cartaoCredito/ICONE.png"));
                        jLabelLogoCartao.setIcon(imgBandeira);
                    }
                } else {
                    // Se o usuário tiver digitado 2 números já começo a identificar a bandeira de cartões MASTER / DINERS / Discover / JCB / AMEX
                    if (totalDigitosCampo() == 2) {
                        // Bandeira MASTER CARD
                        if (campo().substring(0, 2).equals("51") || campo().substring(0, 2).equals("52") || campo().substring(0, 2).equals("53") || campo().substring(0, 2).equals("54") || campo().substring(0, 2).equals("55") || campo().substring(0, 2).equals("58")) {
                            imgBandeira = new ImageIcon(getClass().getResource("/Imagem/cartaoCredito/MASTER.png"));
                            jLabelLogoCartao.setIcon(imgBandeira);
                        } else { // Bandeira DINERS CLUB 
                            if (campo().substring(0, 2).equals("30") || campo().substring(0, 2).equals("36") || campo().substring(0, 2).equals("38") || campo().substring(0, 2).equals("39")) {
                                imgBandeira = new ImageIcon(getClass().getResource("/Imagem/cartaoCredito/DINERS.png"));
                                jLabelLogoCartao.setIcon(imgBandeira);
                            } else { // Bandeira DISCOVER 
                                if (campo().substring(0, 2).equals("34") || campo().substring(0, 2).equals("37")) {
                                    imgBandeira = new ImageIcon(getClass().getResource("/Imagem/cartaoCredito/AMEX.png"));
                                    jLabelLogoCartao.setIcon(imgBandeira);
                                }
                            }
                        }
                    } else { // 4 Dígitos
                        if (totalDigitosCampo() == 4 && campo().substring(0, 4).equals("6011")) {
                            imgBandeira = new ImageIcon(this.getClass().getResource("DISCOVER.png"));
                            jLabelLogoCartao.setIcon(imgBandeira);
                        } else { // Se o campo foi totalmente preenchido verifico se ele é válido
                            if (totalDigitosCampo() == 16) {
                                if (validaCartao()) {
                                    imgValidator = new ImageIcon(getClass().getResource("/Imagem/cartaoCredito/VERIFY_YES.png"));
                                } else {
                                    imgValidator = new ImageIcon(getClass().getResource("/Imagem/cartaoCredito/VERIFY_NO.png"));
                                }

                                jLabelValidarCartao.setVisible(true);
                                jLabelValidarCartao.setIcon(imgValidator);
                            }
                        }
                    }
                }
            }
        }


    }//GEN-LAST:event_jFormattedTextFieldCartaoKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFormattedTextField jFormattedTextFieldCartao;
    private javax.swing.JLabel jLabelCartao;
    private javax.swing.JLabel jLabelIgual;
    private javax.swing.JLabel jLabelLogoCartao;
    private javax.swing.JLabel jLabelValidarCartao;
    private javax.swing.JLabel jLabelVezes;
    private javax.swing.JTextField jTextFieldPrecoFInal;
    private javax.swing.JTextField jTextFieldQuantParcel;
    private javax.swing.JTextField jTextFieldValorParcel;
    // End of variables declaration//GEN-END:variables

    public int totalDigitosCampo() { // Removo todos os espaços do campo pra poder tratar
        String aux = jFormattedTextFieldCartao.getText().trim().replace(" ", "").replace(" ", "");
        return aux.length();
    }

    public String campo() {
        return jFormattedTextFieldCartao.getText();
    }

    public boolean validaCartao() {
        // Pego SOMENTE os NÚMEROS desconsiderando os espaços
        String digitosCartao = jFormattedTextFieldCartao.getText().replace(" ", "").replace(" ", "");

        // Começo a aplicar o Algoritmo de Luhn
        int digitoVerificador = Integer.parseInt(digitosCartao.substring(15));
        int aux, digitoVerificacao, soma = 0;

        for (int i = 0; i < 15; i++) {
            aux = Integer.parseInt(digitosCartao.substring(i, i + 1));
            if (i % 2 == 0) {
                aux *= 2;
                if (aux >= 10) {
                    soma += (aux % 10) + 1;
                } else {
                    soma += aux;
                }
            } else {
                soma += aux;
            }
        }

        digitoVerificacao = soma % 10;

        for (int i = 1; i < 10; i++) {
            if ((soma + i) % 10 == 0) {
                digitoVerificacao = i;
                break;
            }
        }

        if (digitoVerificacao == digitoVerificador) {
            return true;
        } else {
            return false;
        }
    }

}
