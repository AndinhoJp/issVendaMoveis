/*
 * Created by JFormDesigner on Wed Oct 25 15:36:26 BRST 2017
 */

package vision.order;

import controllers.ReplenishmentController;
import entities.ReplenishmentEntity;

import java.awt.*;
import java.awt.event.*;
import java.text.ParseException;
import java.util.List;
import javax.swing.*;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle;
import javax.swing.table.*;

/**
 * @author GregÃ³rio MagalhÃ£es
 */
public class JPanelViewReplenishmentOrders extends JPanel {

    private ReplenishmentController replenishmentController = new ReplenishmentController();
    private List<ReplenishmentEntity> orders;

    public JPanelViewReplenishmentOrders() {
        initComponents();
        initFields();
        System.out.println(orders);
    }

    private void initFields() {
        orders = replenishmentController.listAllOrdered();
        DefaultTableModel model = (DefaultTableModel) ordersTable.getModel();
        model.setNumRows(0);
        for (ReplenishmentEntity order : orders) {
            String status = order.getStatus() == 0 ? "Pendente" : (order.getStatus() == 1 ? "Confirmado" : "Cancelado");
            model.addRow(new Object[]{order.getId(), order.getDateCreated(), order.getDateAttended(), status});
            }
        }

    private void confirmOrderButtonActionPerformed(java.awt.event.ActionEvent evt) throws ParseException {//GEN-FIRST:event_jButton1ActionPerformed
        if (ordersTable.getSelectedRow() == -1)
            return;

        ReplenishmentEntity selected = orders.get(ordersTable.getSelectedRow());

        if (replenishmentController.isProcessed(selected) == 0) {
            JOptionPane.showMessageDialog(null, "Pedido confirmado com sucesso.");
            replenishmentController.setReplenishmentValues(selected.getId(), selected.getDateCreated().toString(), selected.getDateAttended().toString(), 1);
            replenishmentController.update();
            initFields();
        } else {
            JOptionPane.showMessageDialog(null, "Erro: Esse pedido já foi efetivado/cancelado. Escolha outro pedido.");
        }
    }

    private void cancelOrderButtonActionPerformed(java.awt.event.ActionEvent evt) throws ParseException {//GEN-FIRST:event_jButton2ActionPerformed
        if (ordersTable.getSelectedRow() == -1)
            return;

        ReplenishmentEntity selected = orders.get(ordersTable.getSelectedRow());

        if (replenishmentController.isProcessed(selected) == 0) {
            JOptionPane.showMessageDialog(null, "Pedido cancelado com sucesso.");
            replenishmentController.setReplenishmentValues(selected.getId(), selected.getDateCreated().toString(), selected.getDateAttended().toString(), 2);
            replenishmentController.update();
            initFields();
        } else {
            JOptionPane.showMessageDialog(null, "Erro: Esse pedido já foi efetivado/cancelado. Escolha outro pedido.");
        }
    }

    private void consultOrderButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        if (ordersTable.getSelectedRow() == -1)
            return;

        new JFrameConfirmReplenishmentOrder(orders.get(ordersTable.getSelectedRow())).setVisible(true);
    }

    private void helpButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        JOptionPane.showMessageDialog(null, "Pedido de Reposição de Estoque (PRE)\n\n"
                + "Um PRE é criado por um funcionário quando se percebe a necessidade de\n"
                + "se repor algum produto em estoque. O funcionário solicitante deve ter\n"
                + " o nível de acesso de almoxarife para registrar um pedido. Esse será\n"
                + "confirmado pelo gerente, o usuário responsável por fazer compras para\n"
                + "reposição de estoque.\n"

                + "Para efetivar um PRE cadastrado no sistema, é necessário que o\n"
                + "usuário utual tenha o nível de acesso de gerente, no mínimo.\n"
                + "Uma vez logado no sistema, esse usuário precisa realizar os seguintes\n"
                + " procedimentos:\n\n"

                + "\t1 - Abrir o menu 'Pedidos', localizado na parte superior da tela\n"
                + "principal\n"
                + "\t2 - Escolher o item de submenu 'Buscar'\n"
                + "\t3 - Selecionar um pedido de reposição na tabela. Para efetivar um\n"
                + "pedido, é necessário que seu 'Status' seja 'Não Processado'. Pedidos\n"
                + "cancelados e efetivados não podem ser alterados\n"
                + "\t4 - Acionar o botão 'Efetivar Pedido'\n"
                + "\t5 - Determinar a quantidade de itens comprados para cada um dos\n"
                + "products relacionados no PRE. Isso é feito da seguinte forma:\n"
                + "\t\t5a - Selecione um produto na lista\n"
                + "\t\t5b - Insira a quantidade na caixa de texto à direita\n"
                + "\t\t5c - Acione o botão 'Modificar'\n"
                + "\t\tA quantidade atendida não pode ser maior que a quantidade\n"
                + "solicitada no PRE. Um vez que os valores de quantidade estiverem\n"
                + "todos preenchidos, deve-se acionar o botão 'Aplicar Alterações'\n"
                + "\t6 - Executados os passos acima, o pedido em questão deverá aparecer\n"
                + "como 'Efetivado' na lista de PRE);");
    }


    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - GregÃ³rio MagalhÃ£es
        titleLabel = new JLabel();
        jScrollPane1 = new JScrollPane();
        ordersTable = new JTable();
        confirmOrderButton = new JButton();
        cancelOrderButton = new JButton();
        viewOrderButton = new JButton();
        helpButton = new JButton();

        //======== this ========

        // JFormDesigner evaluation mark
        setBorder(new javax.swing.border.CompoundBorder(
            new javax.swing.border.TitledBorder(new javax.swing.border.EmptyBorder(0, 0, 0, 0),
                "JFormDesigner Evaluation", javax.swing.border.TitledBorder.CENTER,
                javax.swing.border.TitledBorder.BOTTOM, new java.awt.Font("Dialog", java.awt.Font.BOLD, 12),
                java.awt.Color.red), getBorder())); addPropertyChangeListener(new java.beans.PropertyChangeListener(){public void propertyChange(java.beans.PropertyChangeEvent e){if("border".equals(e.getPropertyName()))throw new RuntimeException();}});


        //---- titleLabel ----
        titleLabel.setFont(new Font("Arial", Font.BOLD, 24));
        titleLabel.setText("Lista de Pedidos de Reposi\u00e7\u00e3o de Estoque");

        //======== jScrollPane1 ========
        {

            //---- ordersTable ----
            ordersTable.setModel(new DefaultTableModel(
                new Object[][] {
                },
                new String[] {
                    "ID", "Data Solit.", "Data Atend.", "Status"
                }
            ));
            jScrollPane1.setViewportView(ordersTable);
        }

        //---- confirmOrderButton ----
        confirmOrderButton.setText("Efetivar Pedido");
        confirmOrderButton.addActionListener(e -> {
            try {
                confirmOrderButtonActionPerformed(e);
            } catch (ParseException e1) {
                e1.printStackTrace();
            }
        });

        //---- cancelOrderButton ----
        cancelOrderButton.setText("Cancelar Pedido");
        cancelOrderButton.addActionListener(e -> {
            try {
                cancelOrderButtonActionPerformed(e);
            } catch (ParseException e1) {
                e1.printStackTrace();
            }
        });

        //---- viewOrderButton ----
        viewOrderButton.setText("Consultar Pedido");
        viewOrderButton.addActionListener(e -> consultOrderButtonActionPerformed(e));

        //---- helpButton ----
        helpButton.setText("Ajuda");
        helpButton.addActionListener(e -> helpButtonActionPerformed(e));

        GroupLayout layout = new GroupLayout(this);
        setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup()
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(layout.createParallelGroup()
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(titleLabel, GroupLayout.DEFAULT_SIZE, 845, Short.MAX_VALUE)
                            .addGap(37, 37, 37)
                            .addComponent(helpButton))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 787, GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                            .addGroup(layout.createParallelGroup()
                                .addComponent(confirmOrderButton, GroupLayout.Alignment.TRAILING)
                                .addComponent(viewOrderButton, GroupLayout.Alignment.TRAILING)
                                .addComponent(cancelOrderButton, GroupLayout.Alignment.TRAILING))))
                    .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup()
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(titleLabel)
                        .addComponent(helpButton))
                    .addGap(18, 18, 18)
                    .addGroup(layout.createParallelGroup()
                        .addGroup(layout.createSequentialGroup()
                            .addGap(0, 365, Short.MAX_VALUE)
                            .addComponent(viewOrderButton)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(confirmOrderButton)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(cancelOrderButton)
                            .addGap(18, 18, 18))
                        .addComponent(jScrollPane1, GroupLayout.DEFAULT_SIZE, 497, Short.MAX_VALUE))
                    .addContainerGap())
        );
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - GregÃ³rio MagalhÃ£es
    private JLabel titleLabel;
    private JScrollPane jScrollPane1;
    private JTable ordersTable;
    private JButton confirmOrderButton;
    private JButton cancelOrderButton;
    private JButton viewOrderButton;
    private JButton helpButton;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
