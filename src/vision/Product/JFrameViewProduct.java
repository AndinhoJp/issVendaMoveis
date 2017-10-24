/*
 * Created by JFormDesigner on Tue Oct 24 10:20:41 BRST 2017
 */

package vision.Product;

import entities.ProductEntity;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle;
import javax.swing.border.*;

/**
 * @author GregÃ³rio MagalhÃ£es
 */
public class JFrameViewProduct extends JFrame {
    public JFrameViewProduct(ProductEntity product) {
        initComponents();
        setFields(product);
        this.setVisible(true);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setTitle("Produto: " + product.getNomeProd() + " || ID: " + product.getProdId());
    }

    private void setFields(ProductEntity product) {

        JTextIDProduto.setText(product.getProdId());
        JTextNomeProduto.setText(product.getNomeProd());
        JTextMarca.setText(product.getMarca());
        JTextAltura.setText(Double.toString(product.getAltura()));
        JTextLargura.setText(Double.toString(product.getLargura()));
        JTextProfundidade.setText(Double.toString(product.getProfundidade()));
        JTextQuantidade.setText(Integer.toString(product.getQuantidadeEstoque()));
        JTextPreçoCompra.setText(Double.toString(product.getPrecoVenda()));
        jTextAreaDescriçãoProduto.setText(product.getDescricao());

    }

    private void JTextMarcaActionPerformed(ActionEvent e) {
        // TODO add your code here
    }

    private void JLabelFotoProdutoMouseClicked(MouseEvent e) {
        // TODO add your code here
    }

    private void jButtonFecharActionPerformed(ActionEvent e) {
        dispose();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - GregÃ³rio MagalhÃ£es
        jScrollPane1 = new JScrollPane();
        jTextAreaDescriçãoProduto = new JTextArea();
        JLabelDescrição = new JLabel();
        JTextPreçoCompra = new JTextField();
        JLabelPreçoCompra = new JLabel();
        JTextIDProduto = new JTextField();
        JPanelDimensao = new JPanel();
        JLabeLargura = new JLabel();
        JTextLargura = new JTextField();
        JLabeAltura = new JLabel();
        JTextAltura = new JTextField();
        JTextProfundidade = new JTextField();
        JLabeProfundidade = new JLabel();
        JLabelIDProduto = new JLabel();
        JTextMarca = new JTextField();
        JLabelQuantidade = new JLabel();
        JTextQuantidade = new JTextField();
        JLabelMarca = new JLabel();
        JLabelFotoProduto = new JLabel();
        JLabelNomeProduto = new JLabel();
        JTextNomeProduto = new JTextField();
        jButtonFechar = new JButton();
        jButtonProxFoto = new JButton();
        jButtonAntFoto = new JButton();

        //======== this ========
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        Container contentPane = getContentPane();

        //======== jScrollPane1 ========
        {

            //---- jTextAreaDescriçãoProduto ----
            jTextAreaDescriçãoProduto.setEditable(false);
            jTextAreaDescriçãoProduto.setColumns(20);
            jTextAreaDescriçãoProduto.setRows(5);
            jScrollPane1.setViewportView(jTextAreaDescriçãoProduto);
        }

        //---- JLabelDescrição ----
        JLabelDescrição.setFont(new Font("Times New Roman", Font.BOLD, 14));
        JLabelDescrição.setText("Descri\u00e7\u00e3o do Produto:");

        //---- JTextPreçoCompra ----
        JTextPreçoCompra.setEditable(false);

        //---- JLabelPreçoCompra ----
        JLabelPreçoCompra.setFont(new Font("Times New Roman", Font.BOLD, 14));
        JLabelPreçoCompra.setText("Pre\u00e7o:");

        //---- JTextIDProduto ----
        JTextIDProduto.setEditable(false);

        //======== JPanelDimensao ========
        {
            JPanelDimensao.setBorder(new TitledBorder("Dimens\u00e3o do Produto:"));

            // JFormDesigner evaluation mark
            JPanelDimensao.setBorder(new javax.swing.border.CompoundBorder(
                new javax.swing.border.TitledBorder(new javax.swing.border.EmptyBorder(0, 0, 0, 0),
                    "JFormDesigner Evaluation", javax.swing.border.TitledBorder.CENTER,
                    javax.swing.border.TitledBorder.BOTTOM, new java.awt.Font("Dialog", java.awt.Font.BOLD, 12),
                    java.awt.Color.red), JPanelDimensao.getBorder())); JPanelDimensao.addPropertyChangeListener(new java.beans.PropertyChangeListener(){public void propertyChange(java.beans.PropertyChangeEvent e){if("border".equals(e.getPropertyName()))throw new RuntimeException();}});


            //---- JLabeLargura ----
            JLabeLargura.setFont(new Font("Times New Roman", Font.BOLD, 14));
            JLabeLargura.setText("Largura:");

            //---- JTextLargura ----
            JTextLargura.setEditable(false);

            //---- JLabeAltura ----
            JLabeAltura.setFont(new Font("Times New Roman", Font.BOLD, 14));
            JLabeAltura.setText("Altura:");

            //---- JTextAltura ----
            JTextAltura.setEditable(false);

            //---- JTextProfundidade ----
            JTextProfundidade.setEditable(false);

            //---- JLabeProfundidade ----
            JLabeProfundidade.setFont(new Font("Times New Roman", Font.BOLD, 14));
            JLabeProfundidade.setText("Profundidade:");

            GroupLayout JPanelDimensaoLayout = new GroupLayout(JPanelDimensao);
            JPanelDimensao.setLayout(JPanelDimensaoLayout);
            JPanelDimensaoLayout.setHorizontalGroup(
                JPanelDimensaoLayout.createParallelGroup()
                    .addGroup(JPanelDimensaoLayout.createSequentialGroup()
                        .addComponent(JLabeLargura)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JTextLargura, GroupLayout.PREFERRED_SIZE, 102, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(JLabeAltura)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JTextAltura, GroupLayout.PREFERRED_SIZE, 102, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(JLabeProfundidade)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JTextProfundidade, GroupLayout.PREFERRED_SIZE, 102, GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
            );
            JPanelDimensaoLayout.setVerticalGroup(
                JPanelDimensaoLayout.createParallelGroup()
                    .addGroup(JPanelDimensaoLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(JLabeLargura)
                        .addComponent(JTextLargura, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addComponent(JLabeAltura)
                        .addComponent(JTextAltura, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addComponent(JTextProfundidade, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addComponent(JLabeProfundidade))
            );
        }

        //---- JLabelIDProduto ----
        JLabelIDProduto.setFont(new Font("Times New Roman", Font.BOLD, 14));
        JLabelIDProduto.setText("ID do Produto:");

        //---- JTextMarca ----
        JTextMarca.setEditable(false);
        JTextMarca.addActionListener(e -> JTextMarcaActionPerformed(e));

        //---- JLabelQuantidade ----
        JLabelQuantidade.setFont(new Font("Times New Roman", Font.BOLD, 14));
        JLabelQuantidade.setText("Quantidade:");

        //---- JTextQuantidade ----
        JTextQuantidade.setEditable(false);

        //---- JLabelMarca ----
        JLabelMarca.setFont(new Font("Times New Roman", Font.BOLD, 14));
        JLabelMarca.setText("Marca:");

        //---- JLabelFotoProduto ----
        JLabelFotoProduto.setHorizontalAlignment(SwingConstants.CENTER);
        JLabelFotoProduto.setText("Inserir Foto");
        JLabelFotoProduto.setBorder(new TitledBorder("Imagem X-1/X"));
        JLabelFotoProduto.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                JLabelFotoProdutoMouseClicked(e);
            }
        });

        //---- JLabelNomeProduto ----
        JLabelNomeProduto.setFont(new Font("Times New Roman", Font.BOLD, 14));
        JLabelNomeProduto.setText("Nome do Produto:");

        //---- JTextNomeProduto ----
        JTextNomeProduto.setEditable(false);

        //---- jButtonFechar ----
        jButtonFechar.setText("Fechar");
        jButtonFechar.addActionListener(e -> jButtonFecharActionPerformed(e));

        //---- jButtonProxFoto ----
        jButtonProxFoto.setText("Pr\u00f3ximo");

        //---- jButtonAntFoto ----
        jButtonAntFoto.setText("Anterior");

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGap(22, 22, 22)
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addComponent(JLabelDescrição)
                        .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                            .addComponent(jButtonFechar)
                            .addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 960, GroupLayout.PREFERRED_SIZE))
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
                                .addGroup(contentPaneLayout.createSequentialGroup()
                                    .addComponent(jButtonAntFoto)
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButtonProxFoto))
                                .addComponent(JLabelFotoProduto, GroupLayout.PREFERRED_SIZE, 235, GroupLayout.PREFERRED_SIZE))
                            .addGap(6, 6, 6)
                            .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                .addGroup(contentPaneLayout.createSequentialGroup()
                                    .addComponent(JLabelNomeProduto)
                                    .addGap(18, 18, 18)
                                    .addComponent(JTextNomeProduto, GroupLayout.PREFERRED_SIZE, 591, GroupLayout.PREFERRED_SIZE))
                                .addGroup(contentPaneLayout.createSequentialGroup()
                                    .addComponent(JLabelMarca)
                                    .addGap(85, 85, 85)
                                    .addComponent(JTextMarca, GroupLayout.PREFERRED_SIZE, 102, GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(JLabelQuantidade)
                                    .addGap(18, 18, 18)
                                    .addComponent(JTextQuantidade, GroupLayout.PREFERRED_SIZE, 102, GroupLayout.PREFERRED_SIZE))
                                .addGroup(contentPaneLayout.createSequentialGroup()
                                    .addComponent(JLabelIDProduto)
                                    .addGap(18, 18, 18)
                                    .addComponent(JTextIDProduto, GroupLayout.PREFERRED_SIZE, 102, GroupLayout.PREFERRED_SIZE)
                                    .addGap(10, 10, 10)
                                    .addComponent(JLabelPreçoCompra)
                                    .addGap(10, 10, 10)
                                    .addComponent(JTextPreçoCompra, GroupLayout.PREFERRED_SIZE, 102, GroupLayout.PREFERRED_SIZE))
                                .addComponent(JPanelDimensao, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGap(45, 45, 45)
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addGap(12, 12, 12)
                            .addGroup(contentPaneLayout.createParallelGroup()
                                .addGroup(contentPaneLayout.createSequentialGroup()
                                    .addGap(1, 1, 1)
                                    .addComponent(JLabelNomeProduto))
                                .addComponent(JTextNomeProduto, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                            .addGap(11, 11, 11)
                            .addGroup(contentPaneLayout.createParallelGroup()
                                .addComponent(JTextMarca, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addComponent(JTextQuantidade, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addGroup(contentPaneLayout.createSequentialGroup()
                                    .addGap(1, 1, 1)
                                    .addGroup(contentPaneLayout.createParallelGroup()
                                        .addComponent(JLabelMarca)
                                        .addComponent(JLabelQuantidade))))
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(JPanelDimensao, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(contentPaneLayout.createParallelGroup()
                                .addGroup(contentPaneLayout.createSequentialGroup()
                                    .addGap(2, 2, 2)
                                    .addComponent(JLabelIDProduto))
                                .addGroup(contentPaneLayout.createSequentialGroup()
                                    .addGap(1, 1, 1)
                                    .addComponent(JTextIDProduto, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addGroup(contentPaneLayout.createSequentialGroup()
                                    .addGap(1, 1, 1)
                                    .addComponent(JLabelPreçoCompra))
                                .addComponent(JTextPreçoCompra, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
                        .addComponent(JLabelFotoProduto, GroupLayout.PREFERRED_SIZE, 197, GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addComponent(jButtonProxFoto)
                        .addComponent(jButtonAntFoto))
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                    .addComponent(JLabelDescrição)
                    .addGap(6, 6, 6)
                    .addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 123, GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jButtonFechar)
                    .addGap(5, 5, 5))
        );
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - GregÃ³rio MagalhÃ£es
    private JScrollPane jScrollPane1;
    private JTextArea jTextAreaDescriçãoProduto;
    private JLabel JLabelDescrição;
    private JTextField JTextPreçoCompra;
    private JLabel JLabelPreçoCompra;
    private JTextField JTextIDProduto;
    private JPanel JPanelDimensao;
    private JLabel JLabeLargura;
    private JTextField JTextLargura;
    private JLabel JLabeAltura;
    private JTextField JTextAltura;
    private JTextField JTextProfundidade;
    private JLabel JLabeProfundidade;
    private JLabel JLabelIDProduto;
    private JTextField JTextMarca;
    private JLabel JLabelQuantidade;
    private JTextField JTextQuantidade;
    private JLabel JLabelMarca;
    private JLabel JLabelFotoProduto;
    private JLabel JLabelNomeProduto;
    private JTextField JTextNomeProduto;
    private JButton jButtonFechar;
    private JButton jButtonProxFoto;
    private JButton jButtonAntFoto;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
