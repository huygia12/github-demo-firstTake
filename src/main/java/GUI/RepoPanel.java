package GUI;

import Controllers.GoodsListController;
import Models.Goods;
import Models.GoodsList;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
/**
 *
 * @author s1rja
 */
public class RepoPanel extends javax.swing.JPanel {

    /**
     * Creates new form RepoPanel
     */
    public RepoPanel() {
        initComponents();
        
        defaultSettings();

    }
    
    public void defaultSettings() {
        unitComboBox.setPrototypeDisplayValue("                           ");
        invalidPriceLabel.setVisible(false);
        invalidIDLabel.setVisible(false);
        addButton.setEnabled(false);
        deleteButton.setEnabled(false);
        editButton.setEnabled(false);
        shipmentsButton.setEnabled(false);
        goodTableModel = (DefaultTableModel) jTable1.getModel();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        repoManagementPanel = new javax.swing.JPanel();
        controllerPanel = new javax.swing.JPanel();
        nameLabel = new javax.swing.JLabel();
        nameTextField = new javax.swing.JTextField();
        manuFacturerLabel = new javax.swing.JLabel();
        manufacturerTextField = new javax.swing.JTextField();
        listPriceLabel = new javax.swing.JLabel();
        listPriceTextField = new javax.swing.JTextField();
        addButton = new javax.swing.JButton();
        editButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        shipmentsButton = new javax.swing.JButton();
        IDLabel = new javax.swing.JLabel();
        IDTextField = new javax.swing.JTextField();
        totalQuantityLabel = new javax.swing.JLabel();
        totalQuantityTextField = new javax.swing.JTextField();
        unitComboBox = new javax.swing.JComboBox<>();
        invalidPriceLabel = new javax.swing.JLabel();
        invalidIDLabel = new javax.swing.JLabel();
        tablePanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setBackground(new java.awt.Color(0, 204, 255));
        setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 255), 2), "REPOSITORY", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 3, 24), new java.awt.Color(255, 255, 255))); // NOI18N
        setToolTipText("");
        setPreferredSize(new java.awt.Dimension(970, 560));
        setLayout(new java.awt.BorderLayout());

        repoManagementPanel.setBackground(new java.awt.Color(0, 204, 255));
        repoManagementPanel.setLayout(new java.awt.BorderLayout());

        controllerPanel.setBackground(new java.awt.Color(0, 204, 255));

        nameLabel.setText("Tên sản phẩm:");

        nameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameTextFieldActionPerformed(evt);
            }
        });
        nameTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                nameTextFieldKeyReleased(evt);
            }
        });

        manuFacturerLabel.setText("Nhà sản xuất:");

        manufacturerTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                manufacturerTextFieldKeyReleased(evt);
            }
        });

        listPriceLabel.setText("Giá sản phẩm:");

        listPriceTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                listPriceTextFieldKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                listPriceTextFieldKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                listPriceTextFieldKeyTyped(evt);
            }
        });

        addButton.setText("Thêm hàng");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        editButton.setText("Sửa hàng/đơn vị");

        deleteButton.setText("Xóa hàng/đon vị");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        shipmentsButton.setText("Xem lô hàng");

        IDLabel.setText("Mã sản phẩm:");

        IDTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IDTextFieldActionPerformed(evt);
            }
        });
        IDTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                IDTextFieldKeyReleased(evt);
            }
        });

        totalQuantityLabel.setText("Tổng số lượng:");

        totalQuantityTextField.setEditable(false);
        totalQuantityTextField.setEnabled(false);

        unitComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Thêm đơn vị" }));
        unitComboBox.setSelectedIndex(-1);
        unitComboBox.setLightWeightPopupEnabled(false);
        unitComboBox.setMaximumSize(new java.awt.Dimension(100, 22));
        unitComboBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                unitComboBoxItemStateChanged(evt);
            }
        });
        unitComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                unitComboBoxActionPerformed(evt);
            }
        });

        invalidPriceLabel.setForeground(new java.awt.Color(255, 51, 51));
        invalidPriceLabel.setText("Giá không hợp lệ!");

        invalidIDLabel.setBackground(new java.awt.Color(255, 51, 51));
        invalidIDLabel.setForeground(new java.awt.Color(255, 51, 51));
        invalidIDLabel.setText("Mã hàng không hợp lệ!");

        javax.swing.GroupLayout controllerPanelLayout = new javax.swing.GroupLayout(controllerPanel);
        controllerPanel.setLayout(controllerPanelLayout);
        controllerPanelLayout.setHorizontalGroup(
            controllerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(controllerPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(controllerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(controllerPanelLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(totalQuantityLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(totalQuantityTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, controllerPanelLayout.createSequentialGroup()
                        .addComponent(IDLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(controllerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(invalidIDLabel)
                            .addComponent(IDTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(controllerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(manuFacturerLabel))
                .addGap(21, 21, 21)
                .addGroup(controllerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(manufacturerTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(controllerPanelLayout.createSequentialGroup()
                        .addComponent(nameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(unitComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(controllerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, controllerPanelLayout.createSequentialGroup()
                        .addComponent(listPriceLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(controllerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(invalidPriceLabel)
                            .addComponent(listPriceTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, controllerPanelLayout.createSequentialGroup()
                        .addGroup(controllerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(editButton, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(addButton, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(controllerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(shipmentsButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(deleteButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(13, 13, 13))
        );
        controllerPanelLayout.setVerticalGroup(
            controllerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(controllerPanelLayout.createSequentialGroup()
                .addGroup(controllerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(listPriceLabel)
                    .addComponent(listPriceTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nameLabel)
                    .addComponent(IDLabel)
                    .addComponent(IDTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(unitComboBox, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(controllerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(invalidPriceLabel)
                    .addComponent(invalidIDLabel))
                .addGroup(controllerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(controllerPanelLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(controllerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(manufacturerTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(manuFacturerLabel)
                            .addComponent(totalQuantityTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(totalQuantityLabel)))
                    .addGroup(controllerPanelLayout.createSequentialGroup()
                        .addGroup(controllerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(addButton)
                            .addComponent(deleteButton))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(controllerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(shipmentsButton)
                            .addComponent(editButton))))
                .addContainerGap())
        );

        repoManagementPanel.add(controllerPanel, java.awt.BorderLayout.PAGE_START);

        tablePanel.setBackground(new java.awt.Color(0, 204, 255));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã SP", "Tên SP", "Đơn vị", "Nhà sản xuất", "Giá sản phẩm", "Tổng số lượng"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setColumnSelectionAllowed(true);
        jTable1.getTableHeader().setReorderingAllowed(false);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);
        jTable1.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setPreferredWidth(5);
            jTable1.getColumnModel().getColumn(0).setHeaderValue("Mã SP");
            jTable1.getColumnModel().getColumn(1).setHeaderValue("Tên SP");
            jTable1.getColumnModel().getColumn(2).setHeaderValue("Đơn vị");
            jTable1.getColumnModel().getColumn(3).setHeaderValue("Nhà sản xuất");
            jTable1.getColumnModel().getColumn(4).setHeaderValue("Giá sản phẩm");
            jTable1.getColumnModel().getColumn(5).setHeaderValue("Tổng số lượng");
        }

        javax.swing.GroupLayout tablePanelLayout = new javax.swing.GroupLayout(tablePanel);
        tablePanel.setLayout(tablePanelLayout);
        tablePanelLayout.setHorizontalGroup(
            tablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tablePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1052, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        tablePanelLayout.setVerticalGroup(
            tablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tablePanelLayout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 405, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        repoManagementPanel.add(tablePanel, java.awt.BorderLayout.CENTER);

        add(repoManagementPanel, java.awt.BorderLayout.PAGE_START);
    }// </editor-fold>//GEN-END:initComponents

    private void nameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameTextFieldActionPerformed

    private void IDTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IDTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IDTextFieldActionPerformed

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        // TODO add your handling code here:
        long dupedGood = goodsList.getGoodsList().stream().filter(x->x.getGoodsName().equalsIgnoreCase(goodName)&&
                                                                      x.getManufacture().equals(goodManufacturer)).count();
        if(dupedGood == 0) {
            goodTableModel.addRow(new Object[] {
                goodID,
                goodName,
                goodUnit,
                goodManufacturer,
                goodListedPrice,
                0
            });
        } else {
            JOptionPane.showMessageDialog(null, "Mặt hàng đã tồn tại!", "Oh no!", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_addButtonActionPerformed
    
    private void unitComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_unitComboBoxActionPerformed
        // TODO add your handling code here:
        if (deleteButton.isEnabled()) {
            return;
        }
        if (unitComboBox.getSelectedItem().toString().equals("Thêm đơn vị")) {
            unitComboBox.setSelectedIndex(-1);
            String unit = JOptionPane.showInputDialog(null, "Vui lòng thêm một đơn vị mới:", "Thêm đơn vị", JOptionPane.QUESTION_MESSAGE);
            if (unit == null) {
                return;
            }
            if (unitsList.isEmpty()) {
                if (unit.isBlank()) {
                    JOptionPane.showMessageDialog(null, "Invalid Unit!", "Oh no!", JOptionPane.WARNING_MESSAGE);
                    return;
                }
                unitsList.add(unit);
                unitComboBox.addItem(unit);
                unitComboBox.setPrototypeDisplayValue("                           ");
            } else {
                long similar = unitsList.stream().filter(x -> x.equalsIgnoreCase(unit)).count();
                if (similar == 0) {
                    unitsList.add(unit);
                    unitComboBox.addItem(unit);
                    unitComboBox.setPrototypeDisplayValue("                           ");
                } else if (similar != 0 && unit.isBlank()) {
                    JOptionPane.showMessageDialog(null, "Invalid Unit!", "Oh no!", JOptionPane.WARNING_MESSAGE);
                }
            }
        } else {
            goodUnit = unitComboBox.getSelectedItem().toString();
            deleteCheck();
            addCheck();
            editCheck();
        }
    }//GEN-LAST:event_unitComboBoxActionPerformed

    private void unitComboBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_unitComboBoxItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_unitComboBoxItemStateChanged

    private void listPriceTextFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_listPriceTextFieldKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_listPriceTextFieldKeyTyped

    private void listPriceTextFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_listPriceTextFieldKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_listPriceTextFieldKeyPressed

    private void listPriceTextFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_listPriceTextFieldKeyReleased
        // TODO add your handling code here:
        try {
            String input = listPriceTextField.getText();
            if (input.length() == 0) {
                invalidPriceLabel.setVisible(false);
                addButton.setEnabled(false);
                return;
            }
            double check = Double.parseDouble(input);
            if (check < 0) {
                invalidPriceLabel.setVisible(true);
                addButton.setEnabled(false);
            } else {
                invalidPriceLabel.setVisible(false);
                goodListedPrice = BigDecimal.valueOf(check);
                addCheck();
            }
        } catch (NumberFormatException nfe) {
            invalidPriceLabel.setVisible(true);
            addButton.setEnabled(false);
        }
    }//GEN-LAST:event_listPriceTextFieldKeyReleased

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jTable1MouseClicked

    private void nameTextFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nameTextFieldKeyReleased
        // TODO add your handling code here:
        goodName = nameTextField.getText();
        addCheck();
    }//GEN-LAST:event_nameTextFieldKeyReleased

    private void manufacturerTextFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_manufacturerTextFieldKeyReleased
        // TODO add your handling code here:
        goodManufacturer = manufacturerTextField.getText();
        addCheck();
    }//GEN-LAST:event_manufacturerTextFieldKeyReleased

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        // TODO add your handling code here:
        if (jTable1.getSelectedRow() != -1) {
            
        } else {
            unitsList = unitsList.stream().filter(x->!x.equalsIgnoreCase(unitComboBox.getSelectedItem().toString())).toList();
            unitComboBox.removeItem(unitComboBox.getSelectedItem());
            unitComboBox.setSelectedIndex(-1);
            deleteButton.setEnabled(false);
        }
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void IDTextFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_IDTextFieldKeyReleased
        // TODO add your handling code here:
        long dupedID = goodsList.getGoodsList().stream().filter(x->x.getID().equalsIgnoreCase(IDTextField.getText())).count();
        if (IDTextField.getText().isEmpty()) {
            invalidIDLabel.setVisible(false);
        }
        if (dupedID == 0) {
            goodID = IDTextField.getText();
            invalidIDLabel.setVisible(false);
        }  else {
            invalidIDLabel.setVisible(true);
        }
        addCheck();
    }//GEN-LAST:event_IDTextFieldKeyReleased

    public void addCheck () {
        if(!goodName.isBlank() && !goodManufacturer.isBlank() && !goodUnit.isBlank() && !listPriceTextField.getText().isBlank() && !goodID.isBlank()) {
            addButton.setEnabled(true);
        } else {
            addButton.setEnabled(false);
        }
    }
    
    public void deleteCheck() {
        if (jTable1.getSelectedRow() != -1 || unitComboBox.getSelectedIndex() != -1) {
            deleteButton.setEnabled(true);
        } else {
            deleteButton.setEnabled(false);
        }
    }
    
    public void editCheck() {
        if (jTable1.getSelectedRow() != -1 || unitComboBox.getSelectedIndex() != -1) {
            editButton.setEnabled(true);
        } else {
            editButton.setEnabled(false);
        }
    }
    
    public void setGoodsList(GoodsList<Goods> goodsList) {
        this.goodsList = goodsList;
    }

    public void setUnitsList(ArrayList<String> unitsList) {
        this.unitsList = unitsList;
    }

    private GoodsList<Goods> goodsList;
    private List<String> unitsList;
    private GoodsListController glc = new GoodsListController();
    
    private String goodName = "";
    private String goodUnit = "";
    private String goodManufacturer = "";
    private String goodID = "";
    private BigDecimal goodListedPrice;
    private DefaultTableModel goodTableModel;
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel IDLabel;
    private javax.swing.JTextField IDTextField;
    private javax.swing.JButton addButton;
    private javax.swing.JPanel controllerPanel;
    private javax.swing.JButton deleteButton;
    private javax.swing.JButton editButton;
    private javax.swing.JLabel invalidIDLabel;
    private javax.swing.JLabel invalidPriceLabel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel listPriceLabel;
    private javax.swing.JTextField listPriceTextField;
    private javax.swing.JLabel manuFacturerLabel;
    private javax.swing.JTextField manufacturerTextField;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JTextField nameTextField;
    private javax.swing.JPanel repoManagementPanel;
    private javax.swing.JButton shipmentsButton;
    private javax.swing.JPanel tablePanel;
    private javax.swing.JLabel totalQuantityLabel;
    private javax.swing.JTextField totalQuantityTextField;
    private javax.swing.JComboBox<String> unitComboBox;
    // End of variables declaration//GEN-END:variables
}
