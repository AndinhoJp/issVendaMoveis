/*
 * Created by JFormDesigner on Wed Oct 25 09:59:36 BRST 2017
 */

package vision.product;

import controllers.ProductController;
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
public class JFrameProductDetails extends JFrame {

    private boolean editable = false;
    private ProductController productController = new ProductController();

    public JFrameProductDetails(ProductEntity productEntity) {
        initComponents();
        setFields(productEntity);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setTitle(productEntity.getId() + " - " + productEntity.getName());
    }

    private void setFields(ProductEntity product) {
        idField.setText(product.getId());
        nameField.setText(product.getName());
        brandField.setText(product.getBrand());
        heightField.setText(Double.toString(product.getHeight()));
        widthField.setText(Double.toString(product.getWidth()));
        depthField.setText(Double.toString(product.getDepth()));
        stockField.setText(Integer.toString(product.getStock()));
        costPriceField.setText(Double.toString(product.getSalePrice()));
        salePriceField.setText(Double.toString(product.getCostPrice()));
        descriptionField.setText(product.getDescription());
    }

    private void stateFields() {
        idField.setEditable(editable);
        nameField.setEditable(editable);
        brandField.setEditable(editable);
        heightField.setEditable(editable);
        widthField.setEditable(editable);
        depthField.setEditable(editable);
        stockField.setEditable(editable);
        costPriceField.setEditable(editable);
        salePriceField.setEditable(editable);
        descriptionField.setEditable(editable);
    }

    private void editButtonActionPerformed(ActionEvent e) {
        if (!editable) {
            editButton.setText("Salvar");
            editable = !editable;
            stateFields();
        } else {
            String emptyMessage = productController.setProductValues(
                    idField.getText(),
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
                JOptionPane.showMessageDialog(null, "O campo " + emptyMessage + " não pode ficar vazio.");
            } else {
                String invalidMessage = productController.checkValid();
                if (invalidMessage != null)
                    JOptionPane.showMessageDialog(null, "O campo " + invalidMessage + " deve ser positivo.");
                else {
                    String persistMessage = productController.update();
                    JOptionPane.showMessageDialog(null, persistMessage);
                    editable = !editable;
                    stateFields();
                }
            }
            editButton.setText("Editar");
        }

    }
    private void closeButtonActionPerformed(ActionEvent e) {
        dispose();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - GregÃ³rio MagalhÃ£es
        jScrollPane1 = new JScrollPane();
        descriptionField = new JTextArea();
        descriptionLabel = new JLabel();
        photoField = new JLabel();
        closeButton = new JButton();
        nextPhotoButton = new JButton();
        prevPhotoButton = new JButton();
        editButton = new JButton();
        panel1 = new JPanel();
        nameLabel = new JLabel();
        nameField = new JTextField();
        stockLabel = new JLabel();
        stockField = new JTextField();
        labelBrand = new JLabel();
        brandField = new JTextField();
        costPriceLabel = new JLabel();
        costPriceField = new JTextField();
        salePriceLabel = new JLabel();
        salePriceField = new JTextField();
        idLabel = new JLabel();
        idField = new JTextField();
        dimensionsPanel = new JPanel();
        widthLabel = new JLabel();
        widthField = new JTextField();
        heightLabel = new JLabel();
        heightField = new JTextField();
        depthField = new JTextField();
        depthLabel = new JLabel();

        //======== this ========
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        Container contentPane = getContentPane();

        //======== jScrollPane1 ========
        {

            //---- descriptionField ----
            descriptionField.setEditable(false);
            descriptionField.setColumns(20);
            descriptionField.setRows(5);
            jScrollPane1.setViewportView(descriptionField);
        }

        //---- descriptionLabel ----
        descriptionLabel.setFont(new Font("Times New Roman", Font.BOLD, 14));
        descriptionLabel.setText("Descri\u00e7\u00e3o do Produto:");

        //---- photoField ----
        photoField.setHorizontalAlignment(SwingConstants.CENTER);
        photoField.setText("Inserir Foto");
        photoField.setBorder(new TitledBorder("Imagem X-1/X"));

        //---- closeButton ----
        closeButton.setText("Fechar");
        closeButton.addActionListener(e -> closeButtonActionPerformed(e));

        //---- nextPhotoButton ----
        nextPhotoButton.setText("Pr\u00f3ximo");

        //---- prevPhotoButton ----
        prevPhotoButton.setText("Anterior");

        //---- editButton ----
        editButton.setText("Editar");
        editButton.addActionListener(e -> editButtonActionPerformed(e));

        //======== panel1 ========
        {
            panel1.setBorder(new TitledBorder("Informa\u00e7\u00f5es"));

            // JFormDesigner evaluation mark
            panel1.setBorder(new javax.swing.border.CompoundBorder(
                new javax.swing.border.TitledBorder(new javax.swing.border.EmptyBorder(0, 0, 0, 0),
                    "JFormDesigner Evaluation", javax.swing.border.TitledBorder.CENTER,
                    javax.swing.border.TitledBorder.BOTTOM, new java.awt.Font("Dialog", java.awt.Font.BOLD, 12),
                    java.awt.Color.red), panel1.getBorder())); panel1.addPropertyChangeListener(new java.beans.PropertyChangeListener(){public void propertyChange(java.beans.PropertyChangeEvent e){if("border".equals(e.getPropertyName()))throw new RuntimeException();}});


            //---- nameLabel ----
            nameLabel.setFont(new Font("Times New Roman", Font.BOLD, 14));
            nameLabel.setText("Nome do Produto:");
            nameLabel.setLabelFor(nameField);

            //---- nameField ----
            nameField.setEditable(false);

            //---- stockLabel ----
            stockLabel.setFont(new Font("Times New Roman", Font.BOLD, 14));
            stockLabel.setText("Quantidade:");
            stockLabel.setLabelFor(stockField);

            //---- stockField ----
            stockField.setEditable(false);

            //---- labelBrand ----
            labelBrand.setFont(new Font("Times New Roman", Font.BOLD, 14));
            labelBrand.setText("Marca:");
            labelBrand.setLabelFor(brandField);

            //---- brandField ----
            brandField.setEditable(false);

            //---- costPriceLabel ----
            costPriceLabel.setFont(new Font("Times New Roman", Font.BOLD, 14));
            costPriceLabel.setText("Pre\u00e7o de custo:");
            costPriceLabel.setLabelFor(costPriceField);

            //---- costPriceField ----
            costPriceField.setEditable(false);

            //---- salePriceLabel ----
            salePriceLabel.setFont(new Font("Times New Roman", Font.BOLD, 14));
            salePriceLabel.setText("Pre\u00e7o de venda:");
            salePriceLabel.setLabelFor(salePriceField);

            //---- salePriceField ----
            salePriceField.setEditable(false);

            //---- idLabel ----
            idLabel.setFont(new Font("Times New Roman", Font.BOLD, 14));
            idLabel.setText("ID do Produto:");
            idLabel.setLabelFor(idField);

            //---- idField ----
            idField.setEditable(false);

            //======== dimensionsPanel ========
            {
                dimensionsPanel.setBorder(new TitledBorder("Dimens\u00f5es"));

                //---- widthLabel ----
                widthLabel.setFont(new Font("Times New Roman", Font.BOLD, 14));
                widthLabel.setText("Largura:");
                widthLabel.setLabelFor(widthField);

                //---- widthField ----
                widthField.setEditable(false);

                //---- heightLabel ----
                heightLabel.setFont(new Font("Times New Roman", Font.BOLD, 14));
                heightLabel.setText("Altura:");
                heightLabel.setLabelFor(heightField);

                //---- heightField ----
                heightField.setEditable(false);

                //---- depthField ----
                depthField.setEditable(false);

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

            GroupLayout panel1Layout = new GroupLayout(panel1);
            panel1.setLayout(panel1Layout);
            panel1Layout.setHorizontalGroup(
                panel1Layout.createParallelGroup()
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
                            .addComponent(dimensionsPanel, GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(GroupLayout.Alignment.LEADING, panel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(costPriceLabel)
                                    .addComponent(idLabel)
                                    .addComponent(nameLabel))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(panel1Layout.createParallelGroup()
                                    .addComponent(nameField, GroupLayout.PREFERRED_SIZE, 534, GroupLayout.PREFERRED_SIZE)
                                    .addGroup(panel1Layout.createSequentialGroup()
                                        .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(costPriceField)
                                            .addGroup(GroupLayout.Alignment.LEADING, panel1Layout.createSequentialGroup()
                                                .addComponent(idField, GroupLayout.PREFERRED_SIZE, 115, GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(stockLabel)))
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(panel1Layout.createParallelGroup()
                                            .addGroup(panel1Layout.createSequentialGroup()
                                                .addComponent(stockField, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(labelBrand)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(brandField))
                                            .addGroup(panel1Layout.createSequentialGroup()
                                                .addComponent(salePriceLabel)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(salePriceField)))))))
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
                            .addComponent(labelBrand)
                            .addComponent(brandField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addComponent(stockField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addComponent(stockLabel)
                            .addComponent(idLabel)
                            .addComponent(idField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(costPriceLabel)
                            .addComponent(costPriceField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addComponent(salePriceLabel)
                            .addComponent(salePriceField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                        .addComponent(dimensionsPanel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
            );
        }

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGap(22, 22, 22)
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addComponent(descriptionLabel)
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addGroup(contentPaneLayout.createParallelGroup()
                                .addGroup(contentPaneLayout.createSequentialGroup()
                                    .addGap(36, 36, 36)
                                    .addComponent(prevPhotoButton)
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(nextPhotoButton))
                                .addComponent(photoField, GroupLayout.PREFERRED_SIZE, 235, GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(panel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                        .addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 917, GroupLayout.PREFERRED_SIZE)
                        .addGroup(GroupLayout.Alignment.TRAILING, contentPaneLayout.createSequentialGroup()
                            .addComponent(editButton)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(closeButton)))
                    .addContainerGap(19, Short.MAX_VALUE))
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addContainerGap(17, Short.MAX_VALUE)
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addComponent(photoField, GroupLayout.PREFERRED_SIZE, 176, GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 1, Short.MAX_VALUE))
                        .addComponent(panel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(nextPhotoButton)
                        .addComponent(prevPhotoButton))
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(descriptionLabel)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 186, GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(closeButton, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
                        .addComponent(editButton, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))
                    .addGap(5, 5, 5))
        );
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - GregÃ³rio MagalhÃ£es
    private JScrollPane jScrollPane1;
    private JTextArea descriptionField;
    private JLabel descriptionLabel;
    private JLabel photoField;
    private JButton closeButton;
    private JButton nextPhotoButton;
    private JButton prevPhotoButton;
    private JButton editButton;
    private JPanel panel1;
    private JLabel nameLabel;
    private JTextField nameField;
    private JLabel stockLabel;
    private JTextField stockField;
    private JLabel labelBrand;
    private JTextField brandField;
    private JLabel costPriceLabel;
    private JTextField costPriceField;
    private JLabel salePriceLabel;
    private JTextField salePriceField;
    private JLabel idLabel;
    private JTextField idField;
    private JPanel dimensionsPanel;
    private JLabel widthLabel;
    private JTextField widthField;
    private JLabel heightLabel;
    private JTextField heightField;
    private JTextField depthField;
    private JLabel depthLabel;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
