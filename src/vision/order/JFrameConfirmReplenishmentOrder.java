/*
 * Created by JFormDesigner on Wed Oct 25 17:38:03 BRST 2017
 */

package vision.order;

import controllers.ReplenishmentController;
import entities.ReplenishmentEntity;
import entities.ReplenishmentItemEntity;

import java.awt.*;
import java.awt.event.*;
import java.util.List;
import javax.swing.*;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle;
import javax.swing.table.*;

/**
 * @author GregÃ³rio MagalhÃ£es
 */
public class JFrameConfirmReplenishmentOrder extends JFrame {

    ReplenishmentController replenishmentController = new ReplenishmentController();
    List<ReplenishmentItemEntity> items;

    public JFrameConfirmReplenishmentOrder(ReplenishmentEntity replenishmentEntity) {
        initComponents();
        items = replenishmentController.listOrderItems();
        System.out.println(items);
    }

    private void jButton1ActionPerformed(ActionEvent e) {
        // TODO add your code here
    }

    private void jButton2ActionPerformed(ActionEvent e) {
        // TODO add your code here
    }

    private void jButton3ActionPerformed(ActionEvent e) {
        // TODO add your code here
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - GregÃ³rio MagalhÃ£es
        jScrollPane1 = new JScrollPane();
        productsTable = new JTable();
        quantityField = new JTextField();
        modifyButton = new JButton();
        applyButton = new JButton();
        cancelButton = new JButton();
        quantityLabel = new JLabel();

        //======== this ========
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        Container contentPane = getContentPane();

        //======== jScrollPane1 ========
        {

            //---- productsTable ----
            productsTable.setModel(new DefaultTableModel());
            jScrollPane1.setViewportView(productsTable);
        }

        //---- modifyButton ----
        modifyButton.setText("Modificar");
        modifyButton.addActionListener(e -> jButton1ActionPerformed(e));

        //---- applyButton ----
        applyButton.setText("Aplicar Altera\u00e7\u00f5es");
        applyButton.addActionListener(e -> jButton2ActionPerformed(e));

        //---- cancelButton ----
        cancelButton.setText("Cancelar");
        cancelButton.addActionListener(e -> jButton3ActionPerformed(e));

        //---- quantityLabel ----
        quantityLabel.setText("Quantidade:");

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(GroupLayout.Alignment.TRAILING, contentPaneLayout.createSequentialGroup()
                    .addContainerGap(9, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addComponent(modifyButton)
                        .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                            .addComponent(quantityField, GroupLayout.PREFERRED_SIZE, 137, GroupLayout.PREFERRED_SIZE)
                            .addComponent(cancelButton)
                            .addComponent(applyButton))
                        .addComponent(quantityLabel))
                    .addGap(27, 27, 27))
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGap(24, 24, 24)
                    .addComponent(quantityLabel)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(quantityField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(modifyButton)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 156, Short.MAX_VALUE)
                    .addComponent(applyButton)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(cancelButton)
                    .addGap(19, 19, 19))
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane1, GroupLayout.DEFAULT_SIZE, 341, Short.MAX_VALUE)
                    .addContainerGap())
        );
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - GregÃ³rio MagalhÃ£es
    private JScrollPane jScrollPane1;
    private JTable productsTable;
    private JTextField quantityField;
    private JButton modifyButton;
    private JButton applyButton;
    private JButton cancelButton;
    private JLabel quantityLabel;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
