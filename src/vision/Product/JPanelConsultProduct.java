/*
 * Created by JFormDesigner on Tue Oct 24 10:30:02 BRST 2017
 */

package vision.Product;

import controllers.ProductController;
import entities.ProductEntity;

import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.*;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle;
import javax.swing.table.*;

/**
 * @author GregÃ³rio MagalhÃ£es
 */
public class JPanelConsultProduct extends JPanel {
    public JPanelConsultProduct() {
        initComponents();
    }

    private ProductController productController = new ProductController();

    private void jButtonDetalhesActionPerformed(ActionEvent e) {
        // TODO add your code here
    }

    private void jTextFieldCampoPesquisaKeyPressed(KeyEvent e) {
        // TODO add your code here
    }

    private void jButtonPesquisarActionPerformed(ActionEvent e) {
        if (jTextFieldCampoPesquisa.getText().equals("Nome do Produto")) {
            JOptionPane.showMessageDialog(null, "Digite um nome para realizar a pesquisa.");
        } else {
            List<ProductEntity> productList = productController.listAll();
            DefaultTableModel model = (DefaultTableModel) jTableProdutos.getModel();
            model.setNumRows(0);
            for (ProductEntity p : productList) {
                if (p.getNomeProd().contains(jTextFieldCampoPesquisa.getText())) {
                    model.addRow(new Object[]{p.getProdId(), p.getNomeProd(), p.getDescricao(), p.getPrecoVenda(), p.getQuantidadeEstoque()});
                }
            }
        }
    }

    private void jButtonEditarProdutoActionPerformed(ActionEvent e) {
        // TODO add your code here
    }

    private void jButtonAdicionarAoCarrinhoActionPerformed(ActionEvent e) {
        // TODO add your code here
    }

    private void jTextFieldQuantidadeDesejadaAddActionPerformed(ActionEvent e) {
        // TODO add your code here
    }

    private void jButtonCalcularTotalActionPerformed(ActionEvent e) {
        // TODO add your code here
    }

    private void jButtonCancelarAddActionPerformed(ActionEvent e) {
        // TODO add your code here
    }

    private void jButtonAdicionarProdutosAddActionPerformed(ActionEvent e) {
        // TODO add your code here
    }

    private void initFields() {
        List<ProductEntity> productList = productController.listAllOrdered();
        DefaultTableModel model = (DefaultTableModel) jTableProdutos.getModel();
        model.setNumRows(0);
        for (ProductEntity p : productList) {
            model.addRow(new Object[]{p.getProdId(), p.getNomeProd(), p.getDescricao(), p.getPrecoVenda(), p.getQuantidadeEstoque()});
        }
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - GregÃ³rio MagalhÃ£es
        jLabelNomeProduto = new JLabel();
        jTextFieldCampoPesquisa = new JTextField();
        jButtonPesquisar = new JButton();
        jScrollPane2 = new JScrollPane();
        jTableProdutos = new JTable();
        jButtonDetalhes = new JButton();
        jButtonAdicionarAoCarrinho = new JButton();
        jButtonEditarProduto = new JButton();
        jInternalFrameAdicionandoAoCarrinho = new JInternalFrame();
        jLabelAdicionarAoCarrinho = new JLabel();
        jLabelNomeProdutoAdd = new JLabel();
        jLabelValorUnitarioAdd = new JLabel();
        jLabelQuantidadeDisponivelAdd = new JLabel();
        jLabelQuantidadeDesejadaAdd = new JLabel();
        jLabelValorTotalProdutoAdd = new JLabel();
        jTextFieldNomeProdutoAdd = new JTextField();
        jTextFieldValorUnitarioAdd = new JTextField();
        jTextFieldQuantidadeDisponivelAdd = new JTextField();
        jTextFieldQuantidadeDesejadaAdd = new JTextField();
        jTextFieldValorTotalProdutoAdd = new JTextField();
        jButtonCalcularTotal = new JButton();
        jButtonCancelarAdd = new JButton();
        jButtonAdicionarProdutosAdd = new JButton();

        //======== this ========
        setMaximumSize(new Dimension(995, 595));
        setMinimumSize(new Dimension(995, 595));
        setPreferredSize(new Dimension(995, 595));

        // JFormDesigner evaluation mark
        setBorder(new javax.swing.border.CompoundBorder(
                new javax.swing.border.TitledBorder(new javax.swing.border.EmptyBorder(0, 0, 0, 0),
                        "JFormDesigner Evaluation", javax.swing.border.TitledBorder.CENTER,
                        javax.swing.border.TitledBorder.BOTTOM, new java.awt.Font("Dialog", java.awt.Font.BOLD, 12),
                        java.awt.Color.red), getBorder()));
        addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent e) {
                if ("border".equals(e.getPropertyName())) throw new RuntimeException();
            }
        });


        //---- jLabelNomeProduto ----
        jLabelNomeProduto.setFont(new Font("Arial", Font.PLAIN, 14));
        jLabelNomeProduto.setText("Nome do produto:");

        //---- jTextFieldCampoPesquisa ----
        jTextFieldCampoPesquisa.setFont(new Font("Arial", Font.PLAIN, 14));
        jTextFieldCampoPesquisa.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                jTextFieldCampoPesquisaKeyPressed(e);
            }
        });

        //---- jButtonPesquisar ----
        jButtonPesquisar.setFont(new Font("Arial", Font.PLAIN, 11));
        jButtonPesquisar.setText("Pesquisar");
        jButtonPesquisar.addActionListener(e -> jButtonPesquisarActionPerformed(e));

        //======== jScrollPane2 ========
        {

            //---- jTableProdutos ----
            jTableProdutos.setModel(new DefaultTableModel(
                    new Object[][]{
                    },
                    new String[]{
                            "ID:", "Nome:", "Descri\u00e7\u00e3o:", "Pre\u00e7o:", "Estoque:"
                    }
            ) {
                boolean[] columnEditable = new boolean[]{
                        false, false, false, false, false
                };

                @Override
                public boolean isCellEditable(int rowIndex, int columnIndex) {
                    return columnEditable[columnIndex];
                }
            });
            jScrollPane2.setViewportView(jTableProdutos);
        }

        //---- jButtonDetalhes ----
        jButtonDetalhes.setFont(new Font("Tahoma", Font.PLAIN, 12));
        jButtonDetalhes.setText("Detalhes");
        jButtonDetalhes.addActionListener(e -> jButtonDetalhesActionPerformed(e));

        //---- jButtonAdicionarAoCarrinho ----
        jButtonAdicionarAoCarrinho.setText("Adicionar ao Carrinho");
        jButtonAdicionarAoCarrinho.addActionListener(e -> jButtonAdicionarAoCarrinhoActionPerformed(e));

        //---- jButtonEditarProduto ----
        jButtonEditarProduto.setFont(new Font("Tahoma", Font.PLAIN, 12));
        jButtonEditarProduto.setText("Editar");
        jButtonEditarProduto.addActionListener(e -> jButtonEditarProdutoActionPerformed(e));

        GroupLayout layout = new GroupLayout(this);
        setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup()
                        .addGroup(layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(jLabelNomeProduto)
                                .addGap(11, 11, 11)
                                .addComponent(jTextFieldCampoPesquisa, GroupLayout.PREFERRED_SIZE, 440, GroupLayout.PREFERRED_SIZE)
                                .addGap(256, 256, 256)
                                .addComponent(jButtonPesquisar))
                        .addGroup(layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(jScrollPane2, GroupLayout.PREFERRED_SIZE, 900, GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                                .addGap(596, 596, 596)
                                .addComponent(jButtonDetalhes)
                                .addGap(11, 11, 11)
                                .addComponent(jButtonAdicionarAoCarrinho)
                                .addGap(20, 20, 20)
                                .addComponent(jButtonEditarProduto))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup()
                        .addGroup(layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addGroup(layout.createParallelGroup()
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(6, 6, 6)
                                                .addComponent(jLabelNomeProduto))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(2, 2, 2)
                                                .addComponent(jTextFieldCampoPesquisa, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                        .addComponent(jButtonPesquisar))
                                .addGap(8, 8, 8)
                                .addComponent(jScrollPane2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addGroup(layout.createParallelGroup()
                                        .addComponent(jButtonAdicionarAoCarrinho)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(1, 1, 1)
                                                .addGroup(layout.createParallelGroup()
                                                        .addComponent(jButtonDetalhes)
                                                        .addComponent(jButtonEditarProduto)))))
        );

        //======== jInternalFrameAdicionandoAoCarrinho ========
        {
            jInternalFrameAdicionandoAoCarrinho.setTitle("Adicionando ao Carrinho");
            jInternalFrameAdicionandoAoCarrinho.setVisible(true);
            Container jInternalFrameAdicionandoAoCarrinhoContentPane = jInternalFrameAdicionandoAoCarrinho.getContentPane();
            jInternalFrameAdicionandoAoCarrinhoContentPane.setLayout(null);

            //---- jLabelAdicionarAoCarrinho ----
            jLabelAdicionarAoCarrinho.setFont(new Font("Tahoma", Font.PLAIN, 18));
            jLabelAdicionarAoCarrinho.setHorizontalAlignment(SwingConstants.CENTER);
            jLabelAdicionarAoCarrinho.setText("Adicionar ao Carrinho");
            jInternalFrameAdicionandoAoCarrinhoContentPane.add(jLabelAdicionarAoCarrinho);
            jLabelAdicionarAoCarrinho.setBounds(153, 25, 209, 31);

            //---- jLabelNomeProdutoAdd ----
            jLabelNomeProdutoAdd.setFont(new Font("Tahoma", Font.PLAIN, 12));
            jLabelNomeProdutoAdd.setText("Nome do Produto");
            jInternalFrameAdicionandoAoCarrinhoContentPane.add(jLabelNomeProdutoAdd);
            jLabelNomeProdutoAdd.setBounds(new Rectangle(new Point(37, 100), jLabelNomeProdutoAdd.getPreferredSize()));

            //---- jLabelValorUnitarioAdd ----
            jLabelValorUnitarioAdd.setFont(new Font("Tahoma", Font.PLAIN, 12));
            jLabelValorUnitarioAdd.setText("Valor Unit\u00e1rio");
            jInternalFrameAdicionandoAoCarrinhoContentPane.add(jLabelValorUnitarioAdd);
            jLabelValorUnitarioAdd.setBounds(59, 176, 80, jLabelValorUnitarioAdd.getPreferredSize().height);

            //---- jLabelQuantidadeDisponivelAdd ----
            jLabelQuantidadeDisponivelAdd.setFont(new Font("Tahoma", Font.PLAIN, 12));
            jLabelQuantidadeDisponivelAdd.setText("Quantidade Dispon\u00edvel");
            jInternalFrameAdicionandoAoCarrinhoContentPane.add(jLabelQuantidadeDisponivelAdd);
            jLabelQuantidadeDisponivelAdd.setBounds(new Rectangle(new Point(15, 138), jLabelQuantidadeDisponivelAdd.getPreferredSize()));

            //---- jLabelQuantidadeDesejadaAdd ----
            jLabelQuantidadeDesejadaAdd.setFont(new Font("Tahoma", Font.PLAIN, 12));
            jLabelQuantidadeDesejadaAdd.setText("Quantidade Desejada");
            jInternalFrameAdicionandoAoCarrinhoContentPane.add(jLabelQuantidadeDesejadaAdd);
            jLabelQuantidadeDesejadaAdd.setBounds(260, 140, 122, jLabelQuantidadeDesejadaAdd.getPreferredSize().height);

            //---- jLabelValorTotalProdutoAdd ----
            jLabelValorTotalProdutoAdd.setFont(new Font("Tahoma", Font.PLAIN, 12));
            jLabelValorTotalProdutoAdd.setText("Valor Total do Produto");
            jInternalFrameAdicionandoAoCarrinhoContentPane.add(jLabelValorTotalProdutoAdd);
            jLabelValorTotalProdutoAdd.setBounds(new Rectangle(new Point(10, 210), jLabelValorTotalProdutoAdd.getPreferredSize()));

            //---- jTextFieldNomeProdutoAdd ----
            jTextFieldNomeProdutoAdd.setEditable(false);
            jInternalFrameAdicionandoAoCarrinhoContentPane.add(jTextFieldNomeProdutoAdd);
            jTextFieldNomeProdutoAdd.setBounds(150, 100, 340, 20);

            //---- jTextFieldValorUnitarioAdd ----
            jTextFieldValorUnitarioAdd.setEditable(false);
            jInternalFrameAdicionandoAoCarrinhoContentPane.add(jTextFieldValorUnitarioAdd);
            jTextFieldValorUnitarioAdd.setBounds(149, 174, 104, jTextFieldValorUnitarioAdd.getPreferredSize().height);

            //---- jTextFieldQuantidadeDisponivelAdd ----
            jTextFieldQuantidadeDisponivelAdd.setEditable(false);
            jInternalFrameAdicionandoAoCarrinhoContentPane.add(jTextFieldQuantidadeDisponivelAdd);
            jTextFieldQuantidadeDisponivelAdd.setBounds(150, 140, 100, jTextFieldQuantidadeDisponivelAdd.getPreferredSize().height);

            //---- jTextFieldQuantidadeDesejadaAdd ----
            jTextFieldQuantidadeDesejadaAdd.addActionListener(e -> jTextFieldQuantidadeDesejadaAddActionPerformed(e));
            jInternalFrameAdicionandoAoCarrinhoContentPane.add(jTextFieldQuantidadeDesejadaAdd);
            jTextFieldQuantidadeDesejadaAdd.setBounds(380, 140, 110, jTextFieldQuantidadeDesejadaAdd.getPreferredSize().height);

            //---- jTextFieldValorTotalProdutoAdd ----
            jTextFieldValorTotalProdutoAdd.setEditable(false);
            jInternalFrameAdicionandoAoCarrinhoContentPane.add(jTextFieldValorTotalProdutoAdd);
            jTextFieldValorTotalProdutoAdd.setBounds(150, 210, 100, jTextFieldValorTotalProdutoAdd.getPreferredSize().height);

            //---- jButtonCalcularTotal ----
            jButtonCalcularTotal.setFont(new Font("Tahoma", Font.PLAIN, 12));
            jButtonCalcularTotal.setText("Calcular Valor Total");
            jButtonCalcularTotal.addActionListener(e -> jButtonCalcularTotalActionPerformed(e));
            jInternalFrameAdicionandoAoCarrinhoContentPane.add(jButtonCalcularTotal);
            jButtonCalcularTotal.setBounds(300, 170, 190, jButtonCalcularTotal.getPreferredSize().height);

            //---- jButtonCancelarAdd ----
            jButtonCancelarAdd.setFont(new Font("Tahoma", Font.PLAIN, 12));
            jButtonCancelarAdd.setText("Cancelar");
            jButtonCancelarAdd.addActionListener(e -> jButtonCancelarAddActionPerformed(e));
            jInternalFrameAdicionandoAoCarrinhoContentPane.add(jButtonCancelarAdd);
            jButtonCancelarAdd.setBounds(new Rectangle(new Point(120, 280), jButtonCancelarAdd.getPreferredSize()));

            //---- jButtonAdicionarProdutosAdd ----
            jButtonAdicionarProdutosAdd.setFont(new Font("Tahoma", Font.PLAIN, 12));
            jButtonAdicionarProdutosAdd.setText("Adicionar Produtos");
            jButtonAdicionarProdutosAdd.addActionListener(e -> jButtonAdicionarProdutosAddActionPerformed(e));
            jInternalFrameAdicionandoAoCarrinhoContentPane.add(jButtonAdicionarProdutosAdd);
            jButtonAdicionarProdutosAdd.setBounds(new Rectangle(new Point(360, 280), jButtonAdicionarProdutosAdd.getPreferredSize()));

            { // compute preferred size
                Dimension preferredSize = new Dimension();
                for (int i = 0; i < jInternalFrameAdicionandoAoCarrinhoContentPane.getComponentCount(); i++) {
                    Rectangle bounds = jInternalFrameAdicionandoAoCarrinhoContentPane.getComponent(i).getBounds();
                    preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                    preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                }
                Insets insets = jInternalFrameAdicionandoAoCarrinhoContentPane.getInsets();
                preferredSize.width += insets.right;
                preferredSize.height += insets.bottom;
                jInternalFrameAdicionandoAoCarrinhoContentPane.setMinimumSize(preferredSize);
                jInternalFrameAdicionandoAoCarrinhoContentPane.setPreferredSize(preferredSize);
            }
        }
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
        initFields();
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - GregÃ³rio MagalhÃ£es
    private JLabel jLabelNomeProduto;
    private JTextField jTextFieldCampoPesquisa;
    private JButton jButtonPesquisar;
    private JScrollPane jScrollPane2;
    private JTable jTableProdutos;
    private JButton jButtonDetalhes;
    private JButton jButtonAdicionarAoCarrinho;
    private JButton jButtonEditarProduto;
    private JInternalFrame jInternalFrameAdicionandoAoCarrinho;
    private JLabel jLabelAdicionarAoCarrinho;
    private JLabel jLabelNomeProdutoAdd;
    private JLabel jLabelValorUnitarioAdd;
    private JLabel jLabelQuantidadeDisponivelAdd;
    private JLabel jLabelQuantidadeDesejadaAdd;
    private JLabel jLabelValorTotalProdutoAdd;
    private JTextField jTextFieldNomeProdutoAdd;
    private JTextField jTextFieldValorUnitarioAdd;
    private JTextField jTextFieldQuantidadeDisponivelAdd;
    private JTextField jTextFieldQuantidadeDesejadaAdd;
    private JTextField jTextFieldValorTotalProdutoAdd;
    private JButton jButtonCalcularTotal;
    private JButton jButtonCancelarAdd;
    private JButton jButtonAdicionarProdutosAdd;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
