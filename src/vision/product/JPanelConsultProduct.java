/*
 * Created by JFormDesigner on Tue Oct 24 10:30:02 BRST 2017
 */

package vision.product;

import controllers.ProductController;
import entities.ProductEntity;

import java.awt.*;
import java.awt.event.*;
import java.util.List;
import javax.swing.*;
import javax.swing.GroupLayout;
import javax.swing.table.*;

/**
 * @author GregÃ³rio MagalhÃ£es
 */
public class JPanelConsultProduct extends JPanel {
    public JPanelConsultProduct() {
        initComponents();
        initFields();
    }

    private ProductController productController = new ProductController();
    List<ProductEntity> productList = productController.listAllOrdered();

    private void detailsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDetalhesActionPerformed
        int selectedRow = resultsTable.getSelectedRow();
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(null, "Selecione um produto para saber mais detalhes do produto.");
        } else {
            JFrameProductDetails jFrameDetalheProduto = new JFrameProductDetails(productList.get(selectedRow));
            jFrameDetalheProduto.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
            jFrameDetalheProduto.addWindowListener(new WindowAdapter() {
                @Override
                public void windowClosed(WindowEvent e) {
                    JFrame frame = (JFrame) e.getSource();
                    frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
                    productList = productController.listAllOrdered();
                    initFields();
                }
            });
            jFrameDetalheProduto.setVisible(true);
        }
    }

    private void searchButtonActionPerformed(ActionEvent e) {
        if (searchField.getText().equals("Nome do Produto")) {
            JOptionPane.showMessageDialog(null, "Digite um nome para realizar a pesquisa.");
        } else {
            DefaultTableModel model = (DefaultTableModel) resultsTable.getModel();
            model.setNumRows(0);
            for (ProductEntity p : productList) {
                if (p.getName().contains(searchField.getText())) {
                    model.addRow(new Object[]{p.getId(), p.getName(), p.getDescription(), p.getCostPrice(), p.getStock()});
                }
            }
        }
    }

    private void initFields() {
        DefaultTableModel model = (DefaultTableModel) resultsTable.getModel();
        for (ProductEntity product : productList)
            model.addRow(new Object[]{product.getId(), product.getName(), product.getDescription(), product.getCostPrice(), product.getStock()});
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - GregÃ³rio MagalhÃ£es
        nameLabel = new JLabel();
        searchField = new JTextField();
        searchButton = new JButton();
        jScrollPane2 = new JScrollPane();
        resultsTable = new JTable();
        detailsButton = new JButton();

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


        //---- nameLabel ----
        nameLabel.setFont(new Font("Arial", Font.PLAIN, 14));
        nameLabel.setText("Nome do produto:");

        //---- searchField ----
        searchField.setFont(new Font("Arial", Font.PLAIN, 14));

        //---- searchButton ----
        searchButton.setFont(new Font("Arial", Font.PLAIN, 11));
        searchButton.setText("Pesquisar");
        searchButton.addActionListener(e -> searchButtonActionPerformed(e));

        //======== jScrollPane2 ========
        {

            //---- resultsTable ----
            resultsTable.setModel(new DefaultTableModel(
                new Object[][] {
                },
                new String[] {
                    "ID:", "Nome:", "Descri\u00e7\u00e3o:", "Pre\u00e7o:", "Estoque:"
                }
            ) {
                boolean[] columnEditable = new boolean[] {
                    false, false, false, false, false
                };
                @Override
                public boolean isCellEditable(int rowIndex, int columnIndex) {
                    return columnEditable[columnIndex];
                }
            });
            jScrollPane2.setViewportView(resultsTable);
        }

        //---- detailsButton ----
        detailsButton.setFont(new Font("Tahoma", Font.PLAIN, 12));
        detailsButton.setText("Detalhes");
        detailsButton.addActionListener(e -> detailsButtonActionPerformed(e));

        GroupLayout layout = new GroupLayout(this);
        setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup()
                .addGroup(layout.createSequentialGroup()
                    .addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                        .addComponent(detailsButton)
                        .addGroup(layout.createParallelGroup()
                            .addGroup(layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(nameLabel)
                                .addGap(11, 11, 11)
                                .addComponent(searchField, GroupLayout.PREFERRED_SIZE, 440, GroupLayout.PREFERRED_SIZE)
                                .addGap(256, 256, 256)
                                .addComponent(searchButton))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(jScrollPane2, GroupLayout.PREFERRED_SIZE, 900, GroupLayout.PREFERRED_SIZE))))
                    .addGap(20, 20, 20))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup()
                .addGroup(layout.createSequentialGroup()
                    .addGap(3, 3, 3)
                    .addGroup(layout.createParallelGroup()
                        .addGroup(layout.createSequentialGroup()
                            .addGap(6, 6, 6)
                            .addComponent(nameLabel))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(2, 2, 2)
                            .addComponent(searchField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                        .addComponent(searchButton))
                    .addGap(8, 8, 8)
                    .addComponent(jScrollPane2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(detailsButton)
                    .addContainerGap())
        );
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - GregÃ³rio MagalhÃ£es
    private JLabel nameLabel;
    private JTextField searchField;
    private JButton searchButton;
    private JScrollPane jScrollPane2;
    private JTable resultsTable;
    private JButton detailsButton;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
