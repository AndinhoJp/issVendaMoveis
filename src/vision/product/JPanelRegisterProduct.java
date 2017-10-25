/*
 * Created by JFormDesigner on Tue Oct 24 10:20:41 BRST 2017
 */

package vision.product;

import controllers.ProductController;

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
        idField.setText(id);
    }

    private void clearBoxes() {
        idField.setText((id = String.valueOf(new Random().nextInt(99999999))));
        nameField.setText("");
        brandField.setText("");
        heightField.setText("");
        widthField.setText("");
        depthField.setText("");
        stockField.setText("");
        costPriceField.setText("");
        salePriceField.setText("");
        descriptionField.setText("");
    }

    private void saveButtonActionPerformed(ActionEvent e) {
        String emptyMessage = productController.setProductValues(
                id,
                nameField.getText(),
                stockField.getText(),
                descriptionField.getText(),
                salePriceField.getText(),
                costPriceField.getText(),
                heightField.getText(),
                widthField.getText(),
                depthField.getText(),
                brandField.getText());

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

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - GregÃ³rio MagalhÃ£es
        descriptionLabel = new JLabel();
        jScrollPane1 = new JScrollPane();
        descriptionField = new JTextArea();
        panel1 = new JPanel();
        nameLabel = new JLabel();
        nameField = new JTextField();
        costPriceLabel = new JLabel();
        costPriceField = new JTextField();
        salePriceLabel = new JLabel();
        salePriceField = new JTextField();
        dimensionsPanel = new JPanel();
        widthLabel = new JLabel();
        widthField = new JTextField();
        heightLabel = new JLabel();
        heightField = new JTextField();
        depthField = new JTextField();
        depthLabel = new JLabel();
        brandField = new JTextField();
        labelBrand = new JLabel();
        stockField = new JTextField();
        stockLabel = new JLabel();
        idField = new JTextField();
        idLabel = new JLabel();
        JLabelFotoProduto = new JLabel();
        jButtonAntFoto = new JButton();
        jButtonProxFoto = new JButton();
        saveButton = new JButton();

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


        //---- descriptionLabel ----
        descriptionLabel.setFont(new Font("Arial", Font.BOLD, 14));
        descriptionLabel.setText("Descri\u00e7\u00e3o do produto:");

        //======== jScrollPane1 ========
        {

            //---- descriptionField ----
            descriptionField.setColumns(20);
            descriptionField.setRows(5);
            jScrollPane1.setViewportView(descriptionField);
        }

        //======== panel1 ========
        {
            panel1.setBorder(new TitledBorder("Informa\u00e7\u00f5es"));

            //---- nameLabel ----
            nameLabel.setFont(new Font("Times New Roman", Font.BOLD, 14));
            nameLabel.setText("Nome do Produto:");
            nameLabel.setLabelFor(nameField);

            //---- costPriceLabel ----
            costPriceLabel.setFont(new Font("Times New Roman", Font.BOLD, 14));
            costPriceLabel.setText("Pre\u00e7o de custo:");
            costPriceLabel.setLabelFor(costPriceField);

            //---- salePriceLabel ----
            salePriceLabel.setFont(new Font("Times New Roman", Font.BOLD, 14));
            salePriceLabel.setText("Pre\u00e7o de venda:");
            salePriceLabel.setLabelFor(salePriceField);

            //======== dimensionsPanel ========
            {
                dimensionsPanel.setBorder(new TitledBorder("Dimens\u00f5es"));

                //---- widthLabel ----
                widthLabel.setFont(new Font("Times New Roman", Font.BOLD, 14));
                widthLabel.setText("Largura:");
                widthLabel.setLabelFor(widthField);

                //---- heightLabel ----
                heightLabel.setFont(new Font("Times New Roman", Font.BOLD, 14));
                heightLabel.setText("Altura:");
                heightLabel.setLabelFor(heightField);

                //---- depthLabel ----
                depthLabel.setFont(new Font("Times New Roman", Font.BOLD, 14));
                depthLabel.setText("Profundidade:");
                depthLabel.setLabelFor(depthField);

                GroupLayout dimensionsPanelLayout = new GroupLayout(dimensionsPanel);
                dimensionsPanel.setLayout(dimensionsPanelLayout);
                dimensionsPanelLayout.setHorizontalGroup(
                    dimensionsPanelLayout.createParallelGroup()
                        .addGroup(dimensionsPanelLayout.createSequentialGroup()
                            .addGap(39, 39, 39)
                            .addComponent(widthLabel)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(widthField, GroupLayout.PREFERRED_SIZE, 102, GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(heightLabel)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(heightField, GroupLayout.PREFERRED_SIZE, 102, GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(depthLabel)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(depthField, GroupLayout.PREFERRED_SIZE, 102, GroupLayout.PREFERRED_SIZE)
                            .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                );
                dimensionsPanelLayout.setVerticalGroup(
                    dimensionsPanelLayout.createParallelGroup()
                        .addGroup(dimensionsPanelLayout.createSequentialGroup()
                            .addGroup(dimensionsPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(widthLabel)
                                .addComponent(widthField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addComponent(heightLabel)
                                .addComponent(heightField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addComponent(depthField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addComponent(depthLabel))
                            .addGap(0, 10, Short.MAX_VALUE))
                );
            }

            //---- labelBrand ----
            labelBrand.setFont(new Font("Times New Roman", Font.BOLD, 14));
            labelBrand.setText("Marca:");
            labelBrand.setLabelFor(brandField);

            //---- stockLabel ----
            stockLabel.setFont(new Font("Times New Roman", Font.BOLD, 14));
            stockLabel.setText("Quantidade:");
            stockLabel.setLabelFor(stockField);

            //---- idLabel ----
            idLabel.setFont(new Font("Times New Roman", Font.BOLD, 14));
            idLabel.setText("ID do Produto:");
            idLabel.setLabelFor(idField);

            GroupLayout panel1Layout = new GroupLayout(panel1);
            panel1.setLayout(panel1Layout);
            panel1Layout.setHorizontalGroup(
                panel1Layout.createParallelGroup()
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                            .addComponent(salePriceField, GroupLayout.PREFERRED_SIZE, 262, GroupLayout.PREFERRED_SIZE)
                            .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                .addComponent(dimensionsPanel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(panel1Layout.createSequentialGroup()
                                    .addContainerGap()
                                    .addGroup(panel1Layout.createParallelGroup()
                                        .addGroup(panel1Layout.createSequentialGroup()
                                            .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                                .addComponent(nameLabel)
                                                .addComponent(costPriceLabel))
                                            .addGroup(panel1Layout.createParallelGroup()
                                                .addGroup(panel1Layout.createSequentialGroup()
                                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(nameField, GroupLayout.PREFERRED_SIZE, 534, GroupLayout.PREFERRED_SIZE))
                                                .addGroup(panel1Layout.createSequentialGroup()
                                                    .addGap(6, 6, 6)
                                                    .addGroup(panel1Layout.createParallelGroup()
                                                        .addGroup(GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                                                            .addComponent(idField, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
                                                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                            .addComponent(stockLabel)
                                                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                            .addComponent(stockField, GroupLayout.PREFERRED_SIZE, 78, GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(panel1Layout.createSequentialGroup()
                                                            .addComponent(costPriceField, GroupLayout.PREFERRED_SIZE, 163, GroupLayout.PREFERRED_SIZE)
                                                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                            .addComponent(salePriceLabel)))
                                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(labelBrand)
                                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(brandField, GroupLayout.PREFERRED_SIZE, 213, GroupLayout.PREFERRED_SIZE))))
                                        .addGroup(GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                                            .addComponent(idLabel)
                                            .addGap(538, 538, 538))))))
                        .addContainerGap(10, Short.MAX_VALUE))
            );
            panel1Layout.setVerticalGroup(
                panel1Layout.createParallelGroup()
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(nameLabel)
                            .addComponent(nameField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(costPriceLabel)
                            .addComponent(costPriceField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addComponent(salePriceLabel)
                            .addComponent(salePriceField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(idLabel)
                            .addComponent(idField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addComponent(stockLabel)
                            .addComponent(stockField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelBrand)
                            .addComponent(brandField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dimensionsPanel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
            );
        }

        //---- JLabelFotoProduto ----
        JLabelFotoProduto.setHorizontalAlignment(SwingConstants.CENTER);
        JLabelFotoProduto.setText("Inserir Foto");
        JLabelFotoProduto.setBorder(new TitledBorder("Imagem X-1/X"));
        JLabelFotoProduto.setMaximumSize(new Dimension(210, 176));
        JLabelFotoProduto.setMinimumSize(new Dimension(210, 176));
        JLabelFotoProduto.setPreferredSize(new Dimension(210, 176));

        //---- jButtonAntFoto ----
        jButtonAntFoto.setText("Anterior");

        //---- jButtonProxFoto ----
        jButtonProxFoto.setText("Pr\u00f3ximo");

        //---- saveButton ----
        saveButton.setText("Salvar");
        saveButton.addActionListener(e -> saveButtonActionPerformed(e));

        GroupLayout layout = new GroupLayout(this);
        setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup()
                .addGroup(layout.createSequentialGroup()
                    .addGroup(layout.createParallelGroup()
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                            .addComponent(saveButton)
                            .addGroup(layout.createParallelGroup()
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(38, 38, 38)
                                    .addComponent(jButtonAntFoto)
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jButtonProxFoto))
                                .addGroup(layout.createSequentialGroup()
                                    .addContainerGap()
                                    .addGroup(layout.createParallelGroup()
                                        .addComponent(descriptionLabel)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(JLabelFotoProduto, GroupLayout.PREFERRED_SIZE, 210, GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(panel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))))))
                        .addGroup(layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 892, GroupLayout.PREFERRED_SIZE)))
                    .addContainerGap(17, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup()
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                        .addComponent(panel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addComponent(JLabelFotoProduto, GroupLayout.PREFERRED_SIZE, 176, GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(jButtonProxFoto)
                        .addComponent(jButtonAntFoto))
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(descriptionLabel)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 201, GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(saveButton)
                    .addContainerGap())
        );
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - GregÃ³rio MagalhÃ£es
    private JLabel descriptionLabel;
    private JScrollPane jScrollPane1;
    private JTextArea descriptionField;
    private JPanel panel1;
    private JLabel nameLabel;
    private JTextField nameField;
    private JLabel costPriceLabel;
    private JTextField costPriceField;
    private JLabel salePriceLabel;
    private JTextField salePriceField;
    private JPanel dimensionsPanel;
    private JLabel widthLabel;
    private JTextField widthField;
    private JLabel heightLabel;
    private JTextField heightField;
    private JTextField depthField;
    private JLabel depthLabel;
    private JTextField brandField;
    private JLabel labelBrand;
    private JTextField stockField;
    private JLabel stockLabel;
    private JTextField idField;
    private JLabel idLabel;
    private JLabel JLabelFotoProduto;
    private JButton jButtonAntFoto;
    private JButton jButtonProxFoto;
    private JButton saveButton;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
