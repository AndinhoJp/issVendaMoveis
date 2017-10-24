/*
 * Created by JFormDesigner on Tue Oct 24 10:20:41 BRST 2017
 */

package vision.Product;

import controllers.ProductController;
import entities.ProductEntity;

import java.awt.*;
import java.awt.event.*;
import java.util.Random;
import javax.swing.*;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle;
import javax.swing.border.*;

/**
 * @author GregÃ³rio MagalhÃ£es
 */
public class JPanelRegisterProduct extends JPanel {

    private ProductController productController = new ProductController();
    private String id = String.valueOf(new Random().nextInt(99999999));

    public JPanelRegisterProduct() {
        initComponents();
    }

    private void jButtonSalvarActionPerformed(ActionEvent e) {

        String emptyMessage = productController.setProductValues(
                id,
                jTextFieldNomeProduto.getText(),
                jTextFieldQuantidade.getText(),
                jTextFieldMarcaProduto.getText(),
                JTextAltura4.getText(),
                JTextLargura4.getText(),
                JTextProfundidade4.getText(),
                jTextFieldPrecoCompra.getText(),
                jTextFieldPrecoVenda.getText(),
                jTextAreaDescrição.getText());

        if (emptyMessage != null) {
            JOptionPane.showMessageDialog(null, "O campo" + emptyMessage + "não pode ficar vazio.");
        } else {
            String invalidMessage = productController.checkValid();
            if (invalidMessage != null)
                JOptionPane.showMessageDialog(null, "O campo" + invalidMessage + "deve ser positivo.");
            else {
                String persistMessage = productController.persist();
                JOptionPane.showMessageDialog(null, persistMessage);
                if (!persistMessage.contains("erro")) clearBoxes();
            }
        }
    }

    private void clearBoxes() {
        jTextFieldNomeProduto.setText("");
        jTextFieldQuantidade.setText("");
        jTextAreaDescrição.setText("");
        jTextFieldPrecoCompra.setText("");
        jTextFieldPrecoVenda.setText("");
        JTextLargura4.setText("");
        JTextProfundidade4.setText("");
        JTextAltura4.setText("");
        jTextFieldMarcaProduto.setText("");
        jTextFieldIDProduto.setText((id = String.valueOf(new Random().nextInt(99999999))));
    }

    private void jButtonSelecionarFotoActionPerformed(ActionEvent e) {
        // TODO add your code here
    }

    private void JLabelFotoProdutoMouseClicked(MouseEvent e) {
        // TODO add your code here
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - GregÃ³rio MagalhÃ£es
        JPanelDimensao = new JPanel();
        JLabeLargura4 = new JLabel();
        JTextLargura4 = new JTextField();
        JLabeAltura4 = new JLabel();
        JTextAltura4 = new JTextField();
        JTextProfundidade4 = new JTextField();
        JLabeProfundidade4 = new JLabel();
        jButtonAvançarFoto = new JButton();
        jLabelDescricao = new JLabel();
        jTextFieldQuantidade = new JTextField();
        jLabelQuantidade = new JLabel();
        jLabelNumeroID = new JLabel();
        jLabelPrecoCompra = new JLabel();
        jLabelMarca = new JLabel();
        jTextFieldPrecoCompra = new JTextField();
        jTextFieldNomeProduto = new JTextField();
        jLabelNome = new JLabel();
        jButtonSelecionarFoto = new JButton();
        jTextFieldMarcaProduto = new JTextField();
        jTextFieldIDProduto = new JTextField();
        jButtonRetrocederFoto = new JButton();
        jScrollPane1 = new JScrollPane();
        jTextAreaDescrição = new JTextArea();
        jLabelPrecoVenda = new JLabel();
        jTextFieldPrecoVenda = new JTextField();
        JLabelFotoProduto = new JLabel();
        jButtonSalvar = new JButton();

        //======== this ========
        setMaximumSize(new Dimension(995, 595));
        setMinimumSize(new Dimension(995, 595));
        setPreferredSize(new Dimension(995, 595));

        // JFormDesigner evaluation mark
        setBorder(new javax.swing.border.CompoundBorder(
            new javax.swing.border.TitledBorder(new javax.swing.border.EmptyBorder(0, 0, 0, 0),
                "JFormDesigner Evaluation", javax.swing.border.TitledBorder.CENTER,
                javax.swing.border.TitledBorder.BOTTOM, new java.awt.Font("Dialog", java.awt.Font.BOLD, 12),
                java.awt.Color.red), getBorder())); addPropertyChangeListener(new java.beans.PropertyChangeListener(){public void propertyChange(java.beans.PropertyChangeEvent e){if("border".equals(e.getPropertyName()))throw new RuntimeException();}});


        //======== JPanelDimensao ========
        {
            JPanelDimensao.setBorder(new TitledBorder("Dimens\u00e3o do Produto:"));

            //---- JLabeLargura4 ----
            JLabeLargura4.setFont(new Font("Times New Roman", Font.BOLD, 14));
            JLabeLargura4.setText("Largura:");

            //---- JLabeAltura4 ----
            JLabeAltura4.setFont(new Font("Times New Roman", Font.BOLD, 14));
            JLabeAltura4.setText("Altura:");

            //---- JLabeProfundidade4 ----
            JLabeProfundidade4.setFont(new Font("Times New Roman", Font.BOLD, 14));
            JLabeProfundidade4.setText("Profundidade:");

            GroupLayout JPanelDimensaoLayout = new GroupLayout(JPanelDimensao);
            JPanelDimensao.setLayout(JPanelDimensaoLayout);
            JPanelDimensaoLayout.setHorizontalGroup(
                JPanelDimensaoLayout.createParallelGroup()
                    .addGroup(JPanelDimensaoLayout.createSequentialGroup()
                        .addComponent(JLabeLargura4)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JTextLargura4, GroupLayout.PREFERRED_SIZE, 102, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(JLabeAltura4)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JTextAltura4, GroupLayout.PREFERRED_SIZE, 102, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(JLabeProfundidade4)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JTextProfundidade4, GroupLayout.PREFERRED_SIZE, 102, GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 17, Short.MAX_VALUE))
            );
            JPanelDimensaoLayout.setVerticalGroup(
                JPanelDimensaoLayout.createParallelGroup()
                    .addGroup(GroupLayout.Alignment.TRAILING, JPanelDimensaoLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(JPanelDimensaoLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(JLabeLargura4)
                            .addComponent(JTextLargura4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addComponent(JLabeAltura4)
                            .addComponent(JTextAltura4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addComponent(JTextProfundidade4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addComponent(JLabeProfundidade4)))
            );
        }

        //---- jButtonAvançarFoto ----
        jButtonAvançarFoto.setFont(new Font("Arial", Font.PLAIN, 11));
        jButtonAvançarFoto.setText("Avan\u00e7ar");

        //---- jLabelDescricao ----
        jLabelDescricao.setFont(new Font("Arial", Font.BOLD, 14));
        jLabelDescricao.setText("Descri\u00e7\u00e3o do produto:");

        //---- jTextFieldQuantidade ----
        jTextFieldQuantidade.setFont(new Font("Arial", Font.PLAIN, 14));

        //---- jLabelQuantidade ----
        jLabelQuantidade.setFont(new Font("Arial", Font.BOLD, 14));
        jLabelQuantidade.setText("Quantidade:");

        //---- jLabelNumeroID ----
        jLabelNumeroID.setFont(new Font("Arial", Font.BOLD, 14));
        jLabelNumeroID.setText("ID:");

        //---- jLabelPrecoCompra ----
        jLabelPrecoCompra.setFont(new Font("Arial", Font.BOLD, 14));
        jLabelPrecoCompra.setText("Pre\u00e7o de compra:");

        //---- jLabelMarca ----
        jLabelMarca.setFont(new Font("Arial", Font.BOLD, 14));
        jLabelMarca.setText("Marca:");
        jLabelMarca.setLabelFor(jTextFieldMarcaProduto);

        //---- jTextFieldPrecoCompra ----
        jTextFieldPrecoCompra.setFont(new Font("Arial", Font.PLAIN, 14));

        //---- jTextFieldNomeProduto ----
        jTextFieldNomeProduto.setFont(new Font("Arial", Font.PLAIN, 14));

        //---- jLabelNome ----
        jLabelNome.setFont(new Font("Arial", Font.BOLD, 14));
        jLabelNome.setText("Nome:");

        //---- jButtonSelecionarFoto ----
        jButtonSelecionarFoto.setText("Selecionar Foto");
        jButtonSelecionarFoto.addActionListener(e -> jButtonSelecionarFotoActionPerformed(e));

        //---- jTextFieldMarcaProduto ----
        jTextFieldMarcaProduto.setFont(new Font("Arial", Font.PLAIN, 14));

        //---- jTextFieldIDProduto ----
        jTextFieldIDProduto.setFont(new Font("Arial", Font.PLAIN, 12));

        //---- jButtonRetrocederFoto ----
        jButtonRetrocederFoto.setText("Retroceder");

        //======== jScrollPane1 ========
        {

            //---- jTextAreaDescrição ----
            jTextAreaDescrição.setColumns(20);
            jTextAreaDescrição.setRows(5);
            jScrollPane1.setViewportView(jTextAreaDescrição);
        }

        //---- jLabelPrecoVenda ----
        jLabelPrecoVenda.setFont(new Font("Arial", Font.BOLD, 14));
        jLabelPrecoVenda.setText("Pre\u00e7o de venda:");
        jLabelPrecoVenda.setLabelFor(jTextFieldPrecoVenda);

        //---- jTextFieldPrecoVenda ----
        jTextFieldPrecoVenda.setFont(new Font("Arial", Font.PLAIN, 14));

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

        //---- jButtonSalvar ----
        jButtonSalvar.setText("Salvar");
        jButtonSalvar.addActionListener(e -> jButtonSalvarActionPerformed(e));

        GroupLayout layout = new GroupLayout(this);
        setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup()
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                        .addComponent(jButtonSalvar)
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 926, GroupLayout.PREFERRED_SIZE)
                            .addGroup(GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(jButtonRetrocederFoto)
                                .addGap(33, 33, 33)
                                .addComponent(jButtonAvançarFoto)
                                .addGap(34, 34, 34)
                                .addComponent(jButtonSelecionarFoto))
                            .addComponent(jLabelDescricao, GroupLayout.Alignment.LEADING)
                            .addGroup(GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(JLabelFotoProduto, GroupLayout.PREFERRED_SIZE, 235, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup()
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabelNumeroID)
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextFieldIDProduto, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabelNome)
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextFieldNomeProduto, GroupLayout.PREFERRED_SIZE, 525, GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup()
                                            .addComponent(jLabelPrecoVenda)
                                            .addComponent(jLabelMarca, GroupLayout.Alignment.TRAILING))
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jTextFieldPrecoVenda)
                                            .addComponent(jTextFieldMarcaProduto, GroupLayout.PREFERRED_SIZE, 147, GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabelPrecoCompra)
                                            .addComponent(jLabelQuantidade))
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jTextFieldQuantidade, GroupLayout.DEFAULT_SIZE, 264, Short.MAX_VALUE)
                                            .addComponent(jTextFieldPrecoCompra, GroupLayout.DEFAULT_SIZE, 264, Short.MAX_VALUE)))
                                    .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(JPanelDimensao, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addGap(62, 62, 62))))))
                    .addContainerGap(22, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup()
                .addGroup(layout.createSequentialGroup()
                    .addGroup(layout.createParallelGroup()
                        .addGroup(layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(JLabelFotoProduto, GroupLayout.PREFERRED_SIZE, 197, GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(23, 23, 23)
                            .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabelNumeroID)
                                .addComponent(jTextFieldIDProduto, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabelNome)
                                .addComponent(jTextFieldNomeProduto, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup()
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabelQuantidade)
                                    .addComponent(jTextFieldQuantidade, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabelMarca)
                                    .addComponent(jTextFieldMarcaProduto, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
                            .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabelPrecoVenda)
                                .addComponent(jLabelPrecoCompra)
                                .addComponent(jTextFieldPrecoVenda, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextFieldPrecoCompra, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18)
                            .addComponent(JPanelDimensao, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(layout.createParallelGroup()
                        .addComponent(jButtonRetrocederFoto)
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonAvançarFoto)
                            .addComponent(jButtonSelecionarFoto)))
                    .addGap(18, 18, 18)
                    .addComponent(jLabelDescricao)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 224, GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jButtonSalvar)
                    .addContainerGap(11, Short.MAX_VALUE))
        );
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - GregÃ³rio MagalhÃ£es
    private JPanel JPanelDimensao;
    private JLabel JLabeLargura4;
    private JTextField JTextLargura4;
    private JLabel JLabeAltura4;
    private JTextField JTextAltura4;
    private JTextField JTextProfundidade4;
    private JLabel JLabeProfundidade4;
    private JButton jButtonAvançarFoto;
    private JLabel jLabelDescricao;
    private JTextField jTextFieldQuantidade;
    private JLabel jLabelQuantidade;
    private JLabel jLabelNumeroID;
    private JLabel jLabelPrecoCompra;
    private JLabel jLabelMarca;
    private JTextField jTextFieldPrecoCompra;
    private JTextField jTextFieldNomeProduto;
    private JLabel jLabelNome;
    private JButton jButtonSelecionarFoto;
    private JTextField jTextFieldMarcaProduto;
    private JTextField jTextFieldIDProduto;
    private JButton jButtonRetrocederFoto;
    private JScrollPane jScrollPane1;
    private JTextArea jTextAreaDescrição;
    private JLabel jLabelPrecoVenda;
    private JTextField jTextFieldPrecoVenda;
    private JLabel JLabelFotoProduto;
    private JButton jButtonSalvar;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
