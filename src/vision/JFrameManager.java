/*
 * Created by JFormDesigner on Tue Oct 24 14:25:12 BRST 2017
 */

package vision;

import entities.FunctionaryEntity;
import vision.Product.JPanelConsultProduct;
import vision.Product.JPanelRegisterProduct;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle;
import javax.swing.border.*;

/**
 * @author GregÃ³rio MagalhÃ£es
 */
public class JFrameManager extends JFrame {

    CardLayout card;

    public JFrameManager(FunctionaryEntity func) {
        initComponents();

        jMenuPrincipal.add(Box.createHorizontalGlue());
        jMenuPrincipal.add(jMenuSair);
        jMenuPrincipal.add(jMenuMinhaConta);

        jButtonCarrinho.setContentAreaFilled(false);
        jButtonCarrinho.setBorderPainted(false);

        JPanel jPanelImagemFundo = new JPanelImagemFundo();
        card = (CardLayout) jPanelFundo.getLayout();
        jPanelFundo.add(jPanelImagemFundo);
        card.show(jPanelFundo, "jPanelImagemFundo");

        this.setLocationRelativeTo(null);
        this.setVisible(true);

    }

    private void jMenuCadastrarFuncionarioActionPerformed(ActionEvent e) {
        // TODO add your code here
    }

    private void jMenuConsultarFuncionarioActionPerformed(ActionEvent e) {
        // TODO add your code here
    }

    private void jMenuCadastrarProdutoActionPerformed(ActionEvent e) {
        JPanel jPanelCadastrarProduto = new JPanelRegisterProduct();
        jPanelFundo.add(jPanelCadastrarProduto);
        card.next(jPanelFundo);
    }

    private void jMenuConsultarProdutoActionPerformed(ActionEvent e) {
        JPanel jPanelConsultarProduto = new JPanelConsultProduct();
        jPanelFundo.add(jPanelConsultarProduto);
        card.next(jPanelFundo);
    }

    private void jMenuItemNovoPedidoActionPerformed(ActionEvent e) {
        // TODO add your code here
    }

    private void jMenuItemPedidosRepActionPerformed(ActionEvent e) {
        // TODO add your code here
    }

    private void jMenuCadastrarClienteActionPerformed(ActionEvent e) {
        // TODO add your code here
    }

    private void jMenuConsultarClienteActionPerformed(ActionEvent e) {
        // TODO add your code here
    }

    private void jMenuConsultarVendaFechadaActionPerformed(ActionEvent e) {
        // TODO add your code here
    }

    private void jMenuConsultarVendaFinalizadaActionPerformed(ActionEvent e) {
        // TODO add your code here
    }

    private void jMenuSairMouseClicked(MouseEvent e) {
        // TODO add your code here
    }

    private void jMenuMinhaContaMouseClicked(MouseEvent e) {
        // TODO add your code here
    }

    private void jMenuMinhaContaActionPerformed(ActionEvent e) {
        // TODO add your code here
    }

    private void jButtonCarrinhoActionPerformed(ActionEvent e) {
        // TODO add your code here
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - GregÃ³rio MagalhÃ£es
        jMenuPrincipal = new JMenuBar();
        jMenuFuncionario = new JMenu();
        jMenuCadastrarFuncionario = new JMenuItem();
        jMenuConsultarFuncionario = new JMenuItem();
        jMenuProduto = new JMenu();
        jMenuCadastrarProduto = new JMenuItem();
        jMenuConsultarProduto = new JMenuItem();
        jMenuPedido = new JMenu();
        jMenuItemNovoPedido = new JMenuItem();
        jMenuItemPedidosRep = new JMenuItem();
        jMenuCliente = new JMenu();
        jMenuCadastrarCliente = new JMenuItem();
        jMenuConsultarCliente = new JMenuItem();
        jMenuVenda = new JMenu();
        jMenuConsultarVendaFechada = new JMenuItem();
        jMenuConsultarVendaFinalizada = new JMenuItem();
        jMenuCaixa = new JMenu();
        jMenuConsultarCaixa = new JMenuItem();
        jMenuSair = new JMenu();
        jMenuMinhaConta = new JMenu();
        jLabelImagemLogo = new JLabel();
        jPanelFundo = new JPanel();
        jButtonCarrinho = new JButton();

        //======== this ========
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gerente - ");
        setResizable(false);
        Container contentPane = getContentPane();

        //======== jMenuPrincipal ========
        {

            //======== jMenuFuncionario ========
            {
                jMenuFuncionario.setText("Funcion\u00e1rio");

                //---- jMenuCadastrarFuncionario ----
                jMenuCadastrarFuncionario.setIcon(new ImageIcon(getClass().getResource("/assets/new20x20.png")));
                jMenuCadastrarFuncionario.setText("Novo");
                jMenuCadastrarFuncionario.addActionListener(e -> jMenuCadastrarFuncionarioActionPerformed(e));
                jMenuFuncionario.add(jMenuCadastrarFuncionario);

                //---- jMenuConsultarFuncionario ----
                jMenuConsultarFuncionario.setIcon(new ImageIcon(getClass().getResource("/assets/search20x20.png")));
                jMenuConsultarFuncionario.setText("Buscar");
                jMenuConsultarFuncionario.addActionListener(e -> jMenuConsultarFuncionarioActionPerformed(e));
                jMenuFuncionario.add(jMenuConsultarFuncionario);
            }
            jMenuPrincipal.add(jMenuFuncionario);

            //======== jMenuProduto ========
            {
                jMenuProduto.setText("Produto");

                //---- jMenuCadastrarProduto ----
                jMenuCadastrarProduto.setIcon(new ImageIcon(getClass().getResource("/assets/simpleNew20x20.png")));
                jMenuCadastrarProduto.setText("Novo");
                jMenuCadastrarProduto.addActionListener(e -> jMenuCadastrarProdutoActionPerformed(e));
                jMenuProduto.add(jMenuCadastrarProduto);

                //---- jMenuConsultarProduto ----
                jMenuConsultarProduto.setIcon(new ImageIcon(getClass().getResource("/assets/search20x20.png")));
                jMenuConsultarProduto.setText("Buscar");
                jMenuConsultarProduto.setToolTipText("");
                jMenuConsultarProduto.addActionListener(e -> jMenuConsultarProdutoActionPerformed(e));
                jMenuProduto.add(jMenuConsultarProduto);
            }
            jMenuPrincipal.add(jMenuProduto);

            //======== jMenuPedido ========
            {
                jMenuPedido.setText("Pedidos");

                //---- jMenuItemNovoPedido ----
                jMenuItemNovoPedido.setIcon(new ImageIcon(getClass().getResource("/assets/simpleNew20x20.png")));
                jMenuItemNovoPedido.setText("Novo");
                jMenuItemNovoPedido.addActionListener(e -> jMenuItemNovoPedidoActionPerformed(e));
                jMenuPedido.add(jMenuItemNovoPedido);

                //---- jMenuItemPedidosRep ----
                jMenuItemPedidosRep.setIcon(new ImageIcon(getClass().getResource("/assets/search20x20.png")));
                jMenuItemPedidosRep.setText("Buscar");
                jMenuItemPedidosRep.addActionListener(e -> jMenuItemPedidosRepActionPerformed(e));
                jMenuPedido.add(jMenuItemPedidosRep);
            }
            jMenuPrincipal.add(jMenuPedido);

            //======== jMenuCliente ========
            {
                jMenuCliente.setText("Cliente");

                //---- jMenuCadastrarCliente ----
                jMenuCadastrarCliente.setIcon(new ImageIcon(getClass().getResource("/assets/new20x20.png")));
                jMenuCadastrarCliente.setText("Novo");
                jMenuCadastrarCliente.addActionListener(e -> jMenuCadastrarClienteActionPerformed(e));
                jMenuCliente.add(jMenuCadastrarCliente);

                //---- jMenuConsultarCliente ----
                jMenuConsultarCliente.setIcon(new ImageIcon(getClass().getResource("/assets/search20x20.png")));
                jMenuConsultarCliente.setText("Buscar");
                jMenuConsultarCliente.setToolTipText("");
                jMenuConsultarCliente.addActionListener(e -> jMenuConsultarClienteActionPerformed(e));
                jMenuCliente.add(jMenuConsultarCliente);
            }
            jMenuPrincipal.add(jMenuCliente);

            //======== jMenuVenda ========
            {
                jMenuVenda.setText("Venda");

                //---- jMenuConsultarVendaFechada ----
                jMenuConsultarVendaFechada.setIcon(new ImageIcon(getClass().getResource("/assets/search20x20.png")));
                jMenuConsultarVendaFechada.setText("Buscar Venda Fechada");
                jMenuConsultarVendaFechada.addActionListener(e -> jMenuConsultarVendaFechadaActionPerformed(e));
                jMenuVenda.add(jMenuConsultarVendaFechada);

                //---- jMenuConsultarVendaFinalizada ----
                jMenuConsultarVendaFinalizada.setIcon(new ImageIcon(getClass().getResource("/assets/search20x20.png")));
                jMenuConsultarVendaFinalizada.setText("Buscar Venda Finalizada");
                jMenuConsultarVendaFinalizada.addActionListener(e -> jMenuConsultarVendaFinalizadaActionPerformed(e));
                jMenuVenda.add(jMenuConsultarVendaFinalizada);
            }
            jMenuPrincipal.add(jMenuVenda);

            //======== jMenuCaixa ========
            {
                jMenuCaixa.setText("Caixa");

                //---- jMenuConsultarCaixa ----
                jMenuConsultarCaixa.setIcon(new ImageIcon(getClass().getResource("/assets/search20x20.png")));
                jMenuConsultarCaixa.setText("Consultar");
                jMenuConsultarCaixa.setToolTipText("");
                jMenuCaixa.add(jMenuConsultarCaixa);
            }
            jMenuPrincipal.add(jMenuCaixa);

            //======== jMenuSair ========
            {
                jMenuSair.setText("Sair");
                jMenuSair.addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                        jMenuSairMouseClicked(e);
                    }
                });
            }
            jMenuPrincipal.add(jMenuSair);

            //======== jMenuMinhaConta ========
            {
                jMenuMinhaConta.setIcon(new ImageIcon(getClass().getResource("/assets/gear20x20.png")));
                jMenuMinhaConta.addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                        jMenuMinhaContaMouseClicked(e);
                    }
                });
                jMenuMinhaConta.addActionListener(e -> jMenuMinhaContaActionPerformed(e));
            }
            jMenuPrincipal.add(jMenuMinhaConta);
        }
        setJMenuBar(jMenuPrincipal);

        //---- jLabelImagemLogo ----
        jLabelImagemLogo.setIcon(new ImageIcon(getClass().getResource("/assets/redebras-topo-menor.jpg")));

        //======== jPanelFundo ========
        {
            jPanelFundo.setBackground(Color.white);
            jPanelFundo.setBorder(LineBorder.createBlackLineBorder());
            jPanelFundo.setMaximumSize(new Dimension(1000, 600));
            jPanelFundo.setMinimumSize(new Dimension(1000, 600));
            jPanelFundo.setName("");
            jPanelFundo.setPreferredSize(new Dimension(1000, 600));

            // JFormDesigner evaluation mark
            jPanelFundo.setBorder(new javax.swing.border.CompoundBorder(
                new javax.swing.border.TitledBorder(new javax.swing.border.EmptyBorder(0, 0, 0, 0),
                    "JFormDesigner Evaluation", javax.swing.border.TitledBorder.CENTER,
                    javax.swing.border.TitledBorder.BOTTOM, new java.awt.Font("Dialog", java.awt.Font.BOLD, 12),
                    java.awt.Color.red), jPanelFundo.getBorder())); jPanelFundo.addPropertyChangeListener(new java.beans.PropertyChangeListener(){public void propertyChange(java.beans.PropertyChangeEvent e){if("border".equals(e.getPropertyName()))throw new RuntimeException();}});

            jPanelFundo.setLayout(new CardLayout());
        }

        //---- jButtonCarrinho ----
        jButtonCarrinho.setIcon(new ImageIcon(getClass().getResource("/assets/shopping-cart-2-icon.png")));
        jButtonCarrinho.addActionListener(e -> jButtonCarrinhoActionPerformed(e));

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addComponent(jLabelImagemLogo)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonCarrinho))
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addComponent(jPanelFundo, GroupLayout.PREFERRED_SIZE, 1000, GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 0, Short.MAX_VALUE)))
                    .addContainerGap())
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addComponent(jLabelImagemLogo)
                        .addComponent(jButtonCarrinho))
                    .addGap(18, 18, 18)
                    .addComponent(jPanelFundo, GroupLayout.DEFAULT_SIZE, 594, Short.MAX_VALUE)
                    .addContainerGap())
        );
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - GregÃ³rio MagalhÃ£es
    private JMenuBar jMenuPrincipal;
    private JMenu jMenuFuncionario;
    private JMenuItem jMenuCadastrarFuncionario;
    private JMenuItem jMenuConsultarFuncionario;
    private JMenu jMenuProduto;
    private JMenuItem jMenuCadastrarProduto;
    private JMenuItem jMenuConsultarProduto;
    private JMenu jMenuPedido;
    private JMenuItem jMenuItemNovoPedido;
    private JMenuItem jMenuItemPedidosRep;
    private JMenu jMenuCliente;
    private JMenuItem jMenuCadastrarCliente;
    private JMenuItem jMenuConsultarCliente;
    private JMenu jMenuVenda;
    private JMenuItem jMenuConsultarVendaFechada;
    private JMenuItem jMenuConsultarVendaFinalizada;
    private JMenu jMenuCaixa;
    private JMenuItem jMenuConsultarCaixa;
    private JMenu jMenuSair;
    private JMenu jMenuMinhaConta;
    private JLabel jLabelImagemLogo;
    private JPanel jPanelFundo;
    private JButton jButtonCarrinho;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
