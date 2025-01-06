package gui;

import com.opencsv.bean.StatefulBeanToCsv;
import com.opencsv.bean.StatefulBeanToCsvBuilder;
import com.opencsv.exceptions.CsvDataTypeMismatchException;
import com.opencsv.exceptions.CsvRequiredFieldEmptyException;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.ScrollPaneConstants;
import javax.swing.table.DefaultTableModel;

public class HistoryPanel extends javax.swing.JPanel {

    public HistoryPanel() {
        initComponents();
        setup();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        historyTabPane = new javax.swing.JTabbedPane();
        orderHistoryPanel = new javax.swing.JPanel();
        searchOrderPanel = new javax.swing.JPanel();
        orderIDToSearchLabel = new javax.swing.JLabel();
        searchOrderIDTextField = new javax.swing.JTextField();
        cashierPhoneNumLable1 = new javax.swing.JLabel();
        fromLabel1 = new javax.swing.JLabel();
        fromDayTextField = new javax.swing.JTextField();
        fromMonthTextField = new javax.swing.JTextField();
        separatorLabel7 = new javax.swing.JLabel();
        separatorLabel8 = new javax.swing.JLabel();
        searchCashierComboBox = new javax.swing.JComboBox<>();
        toLabel2 = new javax.swing.JLabel();
        toDayTextField = new javax.swing.JTextField();
        separatorLabel9 = new javax.swing.JLabel();
        toMonthTextField = new javax.swing.JTextField();
        separatorLabel10 = new javax.swing.JLabel();
        fromYearTextField = new javax.swing.JTextField();
        searchOrderBtn = new javax.swing.JButton();
        toYearTextField = new javax.swing.JTextField();
        refreshBtn = new javax.swing.JButton();
        orderListPanel = new javax.swing.JPanel();
        amountOfOrderLabel = new javax.swing.JLabel();
        totalProceedsLabel = new javax.swing.JLabel();
        totalOrderQuantityLabel = new javax.swing.JLabel();
        totalNetRevenueLabel = new javax.swing.JLabel();
        overViewJScrollPane = new javax.swing.JScrollPane();
        overViewTable = new javax.swing.JTable();
        orderDetailPanel = new javax.swing.JPanel();
        orderDetailJScrollPane = new javax.swing.JScrollPane();
        orderDetailTable = new javax.swing.JTable();
        reprintBtn = new javax.swing.JButton();
        totalPayment = new javax.swing.JLabel();
        totalPaymentLabel = new javax.swing.JLabel();
        statisticGoodsPanel = new javax.swing.JPanel();
        totalLabel = new javax.swing.JLabel();
        totalReportProcessLabel = new javax.swing.JLabel();
        goodsReportScrollPane = new javax.swing.JScrollPane();
        goodsReportTable = new javax.swing.JTable();
        printStaticalGoodsToExcelBtn = new javax.swing.JButton();
        importHistoryPanel = new javax.swing.JPanel();
        searchShipmentPanel = new javax.swing.JPanel();
        fromLabel = new javax.swing.JLabel();
        fromImportDayTextField = new javax.swing.JTextField();
        toImportMonthTextField = new javax.swing.JTextField();
        separatorLabel11 = new javax.swing.JLabel();
        fromImportMonthTextField = new javax.swing.JTextField();
        fromImportYearTextField = new javax.swing.JTextField();
        toImportYearTextField = new javax.swing.JTextField();
        separatorLabel12 = new javax.swing.JLabel();
        separatorLabel13 = new javax.swing.JLabel();
        orderDateLabel = new javax.swing.JLabel();
        toLabel = new javax.swing.JLabel();
        toImportDayTextField = new javax.swing.JTextField();
        separatorLabel14 = new javax.swing.JLabel();
        manufactureLabel = new javax.swing.JLabel();
        manufactureComboBox = new javax.swing.JComboBox<>();
        goodsNameLabel = new javax.swing.JLabel();
        searchImportHistoryBtn = new javax.swing.JButton();
        goodsNameTextField = new javax.swing.JTextField();
        refreshImportTableLabel = new javax.swing.JButton();
        displayShipmentPanel = new javax.swing.JPanel();
        importDetailJScrollPane = new javax.swing.JScrollPane();
        importDetailTable = new javax.swing.JTable();
        printImportReportBtn = new javax.swing.JButton();
        staticShipmentsPanel = new javax.swing.JPanel();
        numberOfImportLabel = new javax.swing.JLabel();
        totalOfImportLabel = new javax.swing.JLabel();
        displayNumberOfImportLabel = new javax.swing.JLabel();
        displayTotalOfImportLabel = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(1400, 800));
        setPreferredSize(new java.awt.Dimension(1400, 800));

        historyTabPane.setBackground(new java.awt.Color(255, 255, 255));

        orderHistoryPanel.setBackground(new java.awt.Color(255, 255, 255));
        orderHistoryPanel.setMinimumSize(new java.awt.Dimension(960, 0));
        orderHistoryPanel.setPreferredSize(new java.awt.Dimension(978, 554));

        searchOrderPanel.setBackground(new java.awt.Color(255, 255, 255));
        searchOrderPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Tìm Kiếm", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14))); // NOI18N
        searchOrderPanel.setMaximumSize(new java.awt.Dimension(32767, 214));
        searchOrderPanel.setMinimumSize(new java.awt.Dimension(315, 214));
        searchOrderPanel.setPreferredSize(new java.awt.Dimension(315, 214));

        orderIDToSearchLabel.setText("Mã HĐ: ");

        searchOrderIDTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        searchOrderIDTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                searchOrderIDTextFieldKeyPressed(evt);
            }
        });

        cashierPhoneNumLable1.setText("Thu Ngân:");

        fromLabel1.setText("Từ:");

        fromDayTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        fromDayTextField.setText("00");
        fromDayTextField.setMaximumSize(new java.awt.Dimension(64, 26));
        fromDayTextField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                fromDayTextFieldMouseExited(evt);
            }
        });
        fromDayTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                fromDayTextFieldKeyPressed(evt);
            }
        });

        fromMonthTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        fromMonthTextField.setText("00");
        fromMonthTextField.setMaximumSize(new java.awt.Dimension(64, 26));
        fromMonthTextField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                fromMonthTextFieldMouseExited(evt);
            }
        });
        fromMonthTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                fromMonthTextFieldKeyPressed(evt);
            }
        });

        separatorLabel7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        separatorLabel7.setText("/");

        separatorLabel8.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        separatorLabel8.setText("/");

        searchCashierComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tất cả" }));

        toLabel2.setText("Đến:");

        toDayTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        toDayTextField.setText("00");
        toDayTextField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                toDayTextFieldMouseExited(evt);
            }
        });
        toDayTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                toDayTextFieldKeyPressed(evt);
            }
        });

        separatorLabel9.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        separatorLabel9.setText(" /");

        toMonthTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        toMonthTextField.setText("00");
        toMonthTextField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                toMonthTextFieldMouseExited(evt);
            }
        });
        toMonthTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                toMonthTextFieldKeyPressed(evt);
            }
        });

        separatorLabel10.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        separatorLabel10.setText(" /");

        fromYearTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        fromYearTextField.setText("2023");
        fromYearTextField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                fromYearTextFieldMouseExited(evt);
            }
        });
        fromYearTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                fromYearTextFieldKeyPressed(evt);
            }
        });

        searchOrderBtn.setBackground(new java.awt.Color(0, 255, 0));
        searchOrderBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        searchOrderBtn.setText("Tìm Kiếm");
        searchOrderBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchOrderBtnActionPerformed(evt);
            }
        });

        toYearTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        toYearTextField.setText("2023");
        toYearTextField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                toYearTextFieldMouseExited(evt);
            }
        });
        toYearTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                toYearTextFieldKeyPressed(evt);
            }
        });

        refreshBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImageIcon/reload (3).png"))); // NOI18N
        refreshBtn.setBorder(null);
        refreshBtn.setContentAreaFilled(false);
        refreshBtn.setFocusable(false);
        refreshBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout searchOrderPanelLayout = new javax.swing.GroupLayout(searchOrderPanel);
        searchOrderPanel.setLayout(searchOrderPanelLayout);
        searchOrderPanelLayout.setHorizontalGroup(
            searchOrderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(searchOrderPanelLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(searchOrderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(orderIDToSearchLabel)
                    .addComponent(cashierPhoneNumLable1))
                .addGap(26, 26, 26)
                .addGroup(searchOrderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(searchCashierComboBox, 0, 245, Short.MAX_VALUE)
                    .addComponent(searchOrderIDTextField))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 130, Short.MAX_VALUE)
                .addGroup(searchOrderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(searchOrderPanelLayout.createSequentialGroup()
                        .addComponent(toLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(toDayTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(separatorLabel9)
                        .addGap(9, 9, 9)
                        .addComponent(toMonthTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(separatorLabel10))
                    .addGroup(searchOrderPanelLayout.createSequentialGroup()
                        .addComponent(fromLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(fromDayTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(separatorLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 8, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fromMonthTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(separatorLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 8, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(searchOrderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(fromYearTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(toYearTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14))
            .addGroup(searchOrderPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(searchOrderBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(refreshBtn)
                .addGap(18, 18, 18))
        );
        searchOrderPanelLayout.setVerticalGroup(
            searchOrderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(searchOrderPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(searchOrderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(searchOrderPanelLayout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(orderIDToSearchLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cashierPhoneNumLable1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(searchOrderPanelLayout.createSequentialGroup()
                        .addGroup(searchOrderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(fromLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(searchOrderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(separatorLabel7)
                                .addComponent(searchOrderIDTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(fromYearTextField, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(fromMonthTextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(fromDayTextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(separatorLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(searchOrderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(separatorLabel10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(searchOrderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(toLabel2)
                                .addComponent(toDayTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(separatorLabel9)
                                .addComponent(toMonthTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(toYearTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(searchCashierComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(42, 42, 42)
                .addGroup(searchOrderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(searchOrderBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(refreshBtn, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(15, 15, 15))
        );

        orderListPanel.setBackground(new java.awt.Color(255, 255, 255));
        orderListPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Danh sách hóa đơn", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14))); // NOI18N

        amountOfOrderLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        amountOfOrderLabel.setText("Số HĐ:");

        totalProceedsLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        totalProceedsLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        totalProceedsLabel.setText("Lợi nhuận ròng:");

        totalOrderQuantityLabel.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        totalOrderQuantityLabel.setForeground(new java.awt.Color(255, 0, 0));
        totalOrderQuantityLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        totalOrderQuantityLabel.setText(" ");
        totalOrderQuantityLabel.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        totalNetRevenueLabel.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        totalNetRevenueLabel.setForeground(new java.awt.Color(255, 0, 0));
        totalNetRevenueLabel.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        totalNetRevenueLabel.setText(" ");

        overViewJScrollPane.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);

        overViewTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã HĐ", "Ngày lập HĐ", "Tổng tiền"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        overViewTable.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        overViewTable.setShowGrid(true);
        overViewTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                overViewTableMouseClicked(evt);
            }
        });
        overViewJScrollPane.setViewportView(overViewTable);

        javax.swing.GroupLayout orderListPanelLayout = new javax.swing.GroupLayout(orderListPanel);
        orderListPanel.setLayout(orderListPanelLayout);
        orderListPanelLayout.setHorizontalGroup(
            orderListPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(orderListPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(amountOfOrderLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(totalOrderQuantityLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(totalProceedsLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(totalNetRevenueLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(orderListPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(orderListPanelLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(overViewJScrollPane)
                    .addContainerGap()))
        );
        orderListPanelLayout.setVerticalGroup(
            orderListPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, orderListPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(orderListPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(totalProceedsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(totalOrderQuantityLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(amountOfOrderLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(totalNetRevenueLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
            .addGroup(orderListPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(orderListPanelLayout.createSequentialGroup()
                    .addComponent(overViewJScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 445, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 51, Short.MAX_VALUE)))
        );

        orderDetailPanel.setBackground(new java.awt.Color(255, 255, 255));
        orderDetailPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Chi tiết hóa đơn", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14))); // NOI18N

        orderDetailJScrollPane.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);

        orderDetailTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã SP", "Tên SP", "ĐVT", "Đơn giá", "Tổng SL", "Mã lô", "SL hàng", "Tiền hàng"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        orderDetailTable.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        orderDetailTable.setShowGrid(true);
        orderDetailJScrollPane.setViewportView(orderDetailTable);

        reprintBtn.setBackground(new java.awt.Color(153, 255, 255));
        reprintBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImageIcon/icons8-print-30.png"))); // NOI18N
        reprintBtn.setText("IN LẠI HĐ");
        reprintBtn.setFocusable(false);
        reprintBtn.setMaximumSize(new java.awt.Dimension(120, 34));
        reprintBtn.setMinimumSize(new java.awt.Dimension(120, 34));
        reprintBtn.setPreferredSize(new java.awt.Dimension(120, 34));
        reprintBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reprintBtnActionPerformed(evt);
            }
        });

        totalPayment.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        totalPayment.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        totalPayment.setText("Tổng thanh toán:");

        totalPaymentLabel.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        totalPaymentLabel.setForeground(new java.awt.Color(255, 0, 0));
        totalPaymentLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        totalPaymentLabel.setText("0.0");
        totalPaymentLabel.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        javax.swing.GroupLayout orderDetailPanelLayout = new javax.swing.GroupLayout(orderDetailPanel);
        orderDetailPanel.setLayout(orderDetailPanelLayout);
        orderDetailPanelLayout.setHorizontalGroup(
            orderDetailPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(orderDetailPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(orderDetailPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(orderDetailJScrollPane)
                    .addGroup(orderDetailPanelLayout.createSequentialGroup()
                        .addComponent(reprintBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(totalPayment, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(totalPaymentLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        orderDetailPanelLayout.setVerticalGroup(
            orderDetailPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(orderDetailPanelLayout.createSequentialGroup()
                .addComponent(orderDetailJScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 442, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(orderDetailPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(totalPaymentLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(orderDetailPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(reprintBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(totalPayment, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        statisticGoodsPanel.setBackground(new java.awt.Color(255, 255, 255));
        statisticGoodsPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Báo cáo theo mặt hàng", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14))); // NOI18N
        statisticGoodsPanel.setMaximumSize(new java.awt.Dimension(32767, 214));
        statisticGoodsPanel.setMinimumSize(new java.awt.Dimension(661, 214));
        statisticGoodsPanel.setPreferredSize(new java.awt.Dimension(661, 214));

        totalLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        totalLabel.setText("Tổng doanh thu(Gross):");

        totalReportProcessLabel.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        totalReportProcessLabel.setForeground(new java.awt.Color(255, 0, 0));
        totalReportProcessLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        totalReportProcessLabel.setText("0.0 ");
        totalReportProcessLabel.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        goodsReportScrollPane.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);

        goodsReportTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã SP", "Tên SP", "Nhà sx", "SL", "Doanh Thu", "Tỉ lệ"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        goodsReportTable.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        goodsReportTable.setShowGrid(true);
        goodsReportScrollPane.setViewportView(goodsReportTable);

        printStaticalGoodsToExcelBtn.setBackground(new java.awt.Color(153, 255, 255));
        printStaticalGoodsToExcelBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImageIcon/icons8-excel-30.png"))); // NOI18N
        printStaticalGoodsToExcelBtn.setText("XUẤT FILE EXCEL");
        printStaticalGoodsToExcelBtn.setFocusable(false);
        printStaticalGoodsToExcelBtn.setMaximumSize(new java.awt.Dimension(153, 34));
        printStaticalGoodsToExcelBtn.setMinimumSize(new java.awt.Dimension(153, 34));
        printStaticalGoodsToExcelBtn.setPreferredSize(new java.awt.Dimension(153, 34));
        printStaticalGoodsToExcelBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printStaticalGoodsToExcelBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout statisticGoodsPanelLayout = new javax.swing.GroupLayout(statisticGoodsPanel);
        statisticGoodsPanel.setLayout(statisticGoodsPanelLayout);
        statisticGoodsPanelLayout.setHorizontalGroup(
            statisticGoodsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(statisticGoodsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(printStaticalGoodsToExcelBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(totalLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(totalReportProcessLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(statisticGoodsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(statisticGoodsPanelLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(goodsReportScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 623, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(22, Short.MAX_VALUE)))
        );
        statisticGoodsPanelLayout.setVerticalGroup(
            statisticGoodsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(statisticGoodsPanelLayout.createSequentialGroup()
                .addGap(172, 172, 172)
                .addGroup(statisticGoodsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(printStaticalGoodsToExcelBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(totalLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(totalReportProcessLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
            .addGroup(statisticGoodsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(statisticGoodsPanelLayout.createSequentialGroup()
                    .addComponent(goodsReportScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 46, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout orderHistoryPanelLayout = new javax.swing.GroupLayout(orderHistoryPanel);
        orderHistoryPanel.setLayout(orderHistoryPanelLayout);
        orderHistoryPanelLayout.setHorizontalGroup(
            orderHistoryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(orderHistoryPanelLayout.createSequentialGroup()
                .addGroup(orderHistoryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(orderListPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(searchOrderPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 748, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(orderHistoryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(statisticGoodsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 640, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(orderDetailPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        orderHistoryPanelLayout.setVerticalGroup(
            orderHistoryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(orderHistoryPanelLayout.createSequentialGroup()
                .addGroup(orderHistoryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(statisticGoodsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 239, Short.MAX_VALUE)
                    .addComponent(searchOrderPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 239, Short.MAX_VALUE))
                .addGap(0, 0, 0)
                .addGroup(orderHistoryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(orderListPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(orderDetailPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        historyTabPane.addTab("Lịch sử bán hàng", orderHistoryPanel);

        importHistoryPanel.setBackground(new java.awt.Color(255, 255, 255));
        importHistoryPanel.setMinimumSize(new java.awt.Dimension(982, 558));
        importHistoryPanel.setPreferredSize(new java.awt.Dimension(982, 558));

        searchShipmentPanel.setBackground(new java.awt.Color(255, 255, 255));
        searchShipmentPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Tìm kiếm", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14))); // NOI18N

        fromLabel.setText("Từ:");

        fromImportDayTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        fromImportDayTextField.setText("00");
        fromImportDayTextField.setMaximumSize(new java.awt.Dimension(64, 26));
        fromImportDayTextField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                fromImportDayTextFieldMouseExited(evt);
            }
        });
        fromImportDayTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                fromImportDayTextFieldKeyPressed(evt);
            }
        });

        toImportMonthTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        toImportMonthTextField.setText("00");
        toImportMonthTextField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                toImportMonthTextFieldMouseExited(evt);
            }
        });
        toImportMonthTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                toImportMonthTextFieldKeyPressed(evt);
            }
        });

        separatorLabel11.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        separatorLabel11.setText("/");

        fromImportMonthTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        fromImportMonthTextField.setText("00");
        fromImportMonthTextField.setMaximumSize(new java.awt.Dimension(64, 26));
        fromImportMonthTextField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                fromImportMonthTextFieldMouseExited(evt);
            }
        });
        fromImportMonthTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                fromImportMonthTextFieldKeyPressed(evt);
            }
        });

        fromImportYearTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        fromImportYearTextField.setText("2023");
        fromImportYearTextField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                fromImportYearTextFieldMouseExited(evt);
            }
        });
        fromImportYearTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                fromImportYearTextFieldKeyPressed(evt);
            }
        });

        toImportYearTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        toImportYearTextField.setText("2023");
        toImportYearTextField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                toImportYearTextFieldMouseExited(evt);
            }
        });
        toImportYearTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                toImportYearTextFieldKeyPressed(evt);
            }
        });

        separatorLabel12.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        separatorLabel12.setText("/");

        separatorLabel13.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        separatorLabel13.setText("/");

        orderDateLabel.setText("Ngày nhập:");

        toLabel.setText("Đến:");

        toImportDayTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        toImportDayTextField.setText("00");
        toImportDayTextField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                toImportDayTextFieldMouseExited(evt);
            }
        });
        toImportDayTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                toImportDayTextFieldKeyPressed(evt);
            }
        });

        separatorLabel14.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        separatorLabel14.setText("/");

        manufactureLabel.setText("Nhà sản xuất:");

        manufactureComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tất cả" }));
        manufactureComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manufactureComboBoxActionPerformed(evt);
            }
        });

        goodsNameLabel.setText("Tên mặt hàng:");

        searchImportHistoryBtn.setBackground(new java.awt.Color(0, 255, 0));
        searchImportHistoryBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        searchImportHistoryBtn.setText("Tìm Kiếm");
        searchImportHistoryBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchImportHistoryBtnActionPerformed(evt);
            }
        });

        goodsNameTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                goodsNameTextFieldKeyReleased(evt);
            }
        });

        refreshImportTableLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImageIcon/reload (3).png"))); // NOI18N
        refreshImportTableLabel.setBorder(null);
        refreshImportTableLabel.setContentAreaFilled(false);
        refreshImportTableLabel.setFocusable(false);
        refreshImportTableLabel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshImportTableLabelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout searchShipmentPanelLayout = new javax.swing.GroupLayout(searchShipmentPanel);
        searchShipmentPanel.setLayout(searchShipmentPanelLayout);
        searchShipmentPanelLayout.setHorizontalGroup(
            searchShipmentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(searchShipmentPanelLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(searchShipmentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(searchShipmentPanelLayout.createSequentialGroup()
                        .addComponent(manufactureLabel)
                        .addGap(36, 36, 36)
                        .addComponent(manufactureComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(searchShipmentPanelLayout.createSequentialGroup()
                        .addComponent(orderDateLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(fromLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fromImportDayTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(separatorLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 8, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fromImportMonthTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(separatorLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 8, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fromImportYearTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(65, 65, 65)
                .addGroup(searchShipmentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(searchShipmentPanelLayout.createSequentialGroup()
                        .addComponent(toLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(toImportDayTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(separatorLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 8, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(toImportMonthTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(separatorLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 8, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(toImportYearTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 111, Short.MAX_VALUE)
                        .addComponent(searchImportHistoryBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(refreshImportTableLabel))
                    .addGroup(searchShipmentPanelLayout.createSequentialGroup()
                        .addComponent(goodsNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(goodsNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        searchShipmentPanelLayout.setVerticalGroup(
            searchShipmentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(searchShipmentPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(searchShipmentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(refreshImportTableLabel)
                    .addGroup(searchShipmentPanelLayout.createSequentialGroup()
                        .addGroup(searchShipmentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(manufactureLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(goodsNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(searchShipmentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(goodsNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(manufactureComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(searchShipmentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(searchShipmentPanelLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(searchShipmentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(fromImportYearTextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(fromImportMonthTextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(searchShipmentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(orderDateLabel)
                                        .addComponent(fromLabel)
                                        .addComponent(fromImportDayTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(separatorLabel12)
                                        .addComponent(separatorLabel13))))
                            .addComponent(searchImportHistoryBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(searchShipmentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(toImportYearTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(separatorLabel11)
                                .addComponent(toImportMonthTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(separatorLabel14)
                                .addComponent(toImportDayTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(toLabel)))))
                .addContainerGap())
        );

        displayShipmentPanel.setBackground(new java.awt.Color(255, 255, 255));
        displayShipmentPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Báo cáo chi tiết", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14))); // NOI18N

        importDetailTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã SP", "Tên SP", "Nhà sản xuất", "Ngày nhập", "ĐVT", "Mã lô", "Giá nhập", "SL", "Tiền hàng"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        importDetailTable.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        importDetailTable.setShowGrid(true);
        importDetailJScrollPane.setViewportView(importDetailTable);

        printImportReportBtn.setBackground(new java.awt.Color(153, 255, 255));
        printImportReportBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImageIcon/icons8-excel-30.png"))); // NOI18N
        printImportReportBtn.setText("XUẤT FILE EXCEL");
        printImportReportBtn.setFocusable(false);
        printImportReportBtn.setMaximumSize(new java.awt.Dimension(153, 34));
        printImportReportBtn.setMinimumSize(new java.awt.Dimension(153, 34));
        printImportReportBtn.setPreferredSize(new java.awt.Dimension(153, 34));
        printImportReportBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printImportReportBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout displayShipmentPanelLayout = new javax.swing.GroupLayout(displayShipmentPanel);
        displayShipmentPanel.setLayout(displayShipmentPanelLayout);
        displayShipmentPanelLayout.setHorizontalGroup(
            displayShipmentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(importDetailJScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 1390, Short.MAX_VALUE)
            .addGroup(displayShipmentPanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(printImportReportBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        displayShipmentPanelLayout.setVerticalGroup(
            displayShipmentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(displayShipmentPanelLayout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addComponent(importDetailJScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 525, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(printImportReportBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12))
        );

        staticShipmentsPanel.setBackground(new java.awt.Color(255, 255, 255));
        staticShipmentsPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Báo cáo chung", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14))); // NOI18N

        numberOfImportLabel.setText("Số lần nhập hàng:");

        totalOfImportLabel.setText("Tổng tiền hàng:");

        displayNumberOfImportLabel.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        displayNumberOfImportLabel.setForeground(new java.awt.Color(255, 0, 0));
        displayNumberOfImportLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        displayNumberOfImportLabel.setText("0");

        displayTotalOfImportLabel.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        displayTotalOfImportLabel.setForeground(new java.awt.Color(255, 0, 0));
        displayTotalOfImportLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        displayTotalOfImportLabel.setText("0");

        javax.swing.GroupLayout staticShipmentsPanelLayout = new javax.swing.GroupLayout(staticShipmentsPanel);
        staticShipmentsPanel.setLayout(staticShipmentsPanelLayout);
        staticShipmentsPanelLayout.setHorizontalGroup(
            staticShipmentsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(staticShipmentsPanelLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(staticShipmentsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(totalOfImportLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(numberOfImportLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(staticShipmentsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(displayNumberOfImportLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(displayTotalOfImportLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        staticShipmentsPanelLayout.setVerticalGroup(
            staticShipmentsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(staticShipmentsPanelLayout.createSequentialGroup()
                .addGroup(staticShipmentsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(staticShipmentsPanelLayout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(displayNumberOfImportLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(staticShipmentsPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(numberOfImportLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(staticShipmentsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(totalOfImportLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(displayTotalOfImportLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10))
        );

        javax.swing.GroupLayout importHistoryPanelLayout = new javax.swing.GroupLayout(importHistoryPanel);
        importHistoryPanel.setLayout(importHistoryPanelLayout);
        importHistoryPanelLayout.setHorizontalGroup(
            importHistoryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(importHistoryPanelLayout.createSequentialGroup()
                .addGroup(importHistoryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(importHistoryPanelLayout.createSequentialGroup()
                        .addComponent(searchShipmentPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(staticShipmentsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(displayShipmentPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, 0))
        );
        importHistoryPanelLayout.setVerticalGroup(
            importHistoryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(importHistoryPanelLayout.createSequentialGroup()
                .addGroup(importHistoryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(staticShipmentsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(importHistoryPanelLayout.createSequentialGroup()
                        .addComponent(searchShipmentPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(displayShipmentPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        historyTabPane.addTab("Lịch sử nhập hàng", importHistoryPanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(historyTabPane))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(historyTabPane, javax.swing.GroupLayout.DEFAULT_SIZE, 800, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void fromYearTextFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fromYearTextFieldKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            String text = fromYearTextField.getText();
            if (!ctions.checkIfANumberSequenceForGUI(text)) {
                fromYearTextField.setText(LocalDate.now().getYear() + "");
            } else {
                toDayTextField.requestFocus();
            }
        }
    }//GEN-LAST:event_fromYearTextFieldKeyPressed

    private void fromYearTextFieldMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fromYearTextFieldMouseExited
        String text = fromYearTextField.getText();
        if (!ctions.checkIfANumberSequenceForGUI(text)) {
            fromYearTextField.setText(LocalDate.now().getYear() + "");
        }
    }//GEN-LAST:event_fromYearTextFieldMouseExited

    private void toMonthTextFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_toMonthTextFieldKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            String text = toMonthTextField.getText();
            if (!ctions.checkIfANumberSequenceForGUI(text)) {
                toMonthTextField.setText("00");
            } else {
                toYearTextField.requestFocus();
            }
        }
    }//GEN-LAST:event_toMonthTextFieldKeyPressed

    private void toMonthTextFieldMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_toMonthTextFieldMouseExited
        String text = toMonthTextField.getText();
        if (!ctions.checkIfANumberSequenceForGUI(text)) {
            toMonthTextField.setText("00");
        }
    }//GEN-LAST:event_toMonthTextFieldMouseExited

    private void toDayTextFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_toDayTextFieldKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            String text = toDayTextField.getText();
            if (!ctions.checkIfANumberSequenceForGUI(text)) {
                toDayTextField.setText("00");
            } else {
                toMonthTextField.requestFocus();
            }
        }
    }//GEN-LAST:event_toDayTextFieldKeyPressed

    private void toDayTextFieldMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_toDayTextFieldMouseExited
        String text = toDayTextField.getText();
        if (!ctions.checkIfANumberSequenceForGUI(text)) {
            toDayTextField.setText("00");
        }
    }//GEN-LAST:event_toDayTextFieldMouseExited

    private void fromMonthTextFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fromMonthTextFieldKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            String text = fromMonthTextField.getText();
            if (!ctions.checkIfANumberSequenceForGUI(text)) {
                fromMonthTextField.setText("00");
            } else {
                fromYearTextField.requestFocus();
            }
        }
    }//GEN-LAST:event_fromMonthTextFieldKeyPressed

    private void fromMonthTextFieldMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fromMonthTextFieldMouseExited
        String text = fromMonthTextField.getText();
        if (!ctions.checkIfANumberSequenceForGUI(text)) {
            fromMonthTextField.setText("00");
        }
    }//GEN-LAST:event_fromMonthTextFieldMouseExited

    private void fromDayTextFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fromDayTextFieldKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            String text = fromDayTextField.getText();
            if (!ctions.checkIfANumberSequenceForGUI(text)) {
                fromDayTextField.setText("00");
            } else {
                fromMonthTextField.requestFocus();
            }
        }
    }//GEN-LAST:event_fromDayTextFieldKeyPressed

    private void fromDayTextFieldMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fromDayTextFieldMouseExited
        String text = fromDayTextField.getText();
        if (!ctions.checkIfANumberSequenceForGUI(text)) {
            fromDayTextField.setText("00");
        }
    }//GEN-LAST:event_fromDayTextFieldMouseExited

    private void reprintBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reprintBtnActionPerformed
        int selectedRow = overViewTable.getSelectedRow();
        if (selectedRow != -1) {
            String orderID = (String) overViewModel.getValueAt(selectedRow, 0);
            Order order = historyCtr.containOrder(orderID, store.getHistory());
            orderCtr.getOrderView().printBillToFile(order, store);
            JOptionPane.showMessageDialog(this,
                    "HĐ: " + order.getID() + " in lại thành công!",
                    "Thông báo",
                    JOptionPane.INFORMATION_MESSAGE);
        } else {
            showWarningJOptionPane(NOTHING_CHOOSEN_WARNING);
        }
    }//GEN-LAST:event_reprintBtnActionPerformed

    private void fromImportDayTextFieldMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fromImportDayTextFieldMouseExited
        String text = fromImportDayTextField.getText();
        if (!ctions.checkIfANumberSequenceForGUI(text)) {
            fromImportDayTextField.setText("00");
        }
    }//GEN-LAST:event_fromImportDayTextFieldMouseExited

    private void fromImportDayTextFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fromImportDayTextFieldKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            String text = fromImportDayTextField.getText();
            if (!ctions.checkIfANumberSequenceForGUI(text)) {
                fromImportDayTextField.setText("00");
            } else {
                fromImportMonthTextField.requestFocus();
            }
        }
    }//GEN-LAST:event_fromImportDayTextFieldKeyPressed

    private void toImportMonthTextFieldMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_toImportMonthTextFieldMouseExited
        String text = toImportMonthTextField.getText();
        if (!ctions.checkIfANumberSequenceForGUI(text)) {
            toImportMonthTextField.setText("00");
        }
    }//GEN-LAST:event_toImportMonthTextFieldMouseExited

    private void toImportMonthTextFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_toImportMonthTextFieldKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            String text = toImportMonthTextField.getText();
            if (!ctions.checkIfANumberSequenceForGUI(text)) {
                toImportMonthTextField.setText("00");
            } else {
                toImportYearTextField.requestFocus();
            }
        }
    }//GEN-LAST:event_toImportMonthTextFieldKeyPressed

    private void fromImportMonthTextFieldMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fromImportMonthTextFieldMouseExited
        String text = fromImportMonthTextField.getText();
        if (!ctions.checkIfANumberSequenceForGUI(text)) {
            fromImportMonthTextField.setText("00");
        }
    }//GEN-LAST:event_fromImportMonthTextFieldMouseExited

    private void fromImportMonthTextFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fromImportMonthTextFieldKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            String text = fromImportMonthTextField.getText();
            if (!ctions.checkIfANumberSequenceForGUI(text)) {
                fromImportMonthTextField.setText("00");
            } else {
                fromImportYearTextField.requestFocus();
            }
        }
    }//GEN-LAST:event_fromImportMonthTextFieldKeyPressed

    private void fromImportYearTextFieldMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fromImportYearTextFieldMouseExited
        String text = fromImportYearTextField.getText();
        if (!ctions.checkIfANumberSequenceForGUI(text)) {
            fromImportYearTextField.setText(LocalDate.now().getYear() + "");
        }
    }//GEN-LAST:event_fromImportYearTextFieldMouseExited

    private void fromImportYearTextFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fromImportYearTextFieldKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            String text = fromImportYearTextField.getText();
            if (!ctions.checkIfANumberSequenceForGUI(text)) {
                fromImportYearTextField.setText(LocalDate.now().getYear() + "");
            } else {
                toImportDayTextField.requestFocus();
            }
        }
    }//GEN-LAST:event_fromImportYearTextFieldKeyPressed

    private void toImportYearTextFieldMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_toImportYearTextFieldMouseExited
        String text = toImportYearTextField.getText();
        if (!ctions.checkIfANumberSequenceForGUI(text)) {
            toImportYearTextField.setText(LocalDate.now().getYear() + "");
        }
    }//GEN-LAST:event_toImportYearTextFieldMouseExited

    private void toImportYearTextFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_toImportYearTextFieldKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            String text = toImportYearTextField.getText();
            if (!ctions.checkIfANumberSequenceForGUI(text)) {
                toImportYearTextField.setText(LocalDate.now().getYear() + "");
            }
        }
    }//GEN-LAST:event_toImportYearTextFieldKeyPressed

    private void toImportDayTextFieldMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_toImportDayTextFieldMouseExited
        String text = toImportDayTextField.getText();
        if (!ctions.checkIfANumberSequenceForGUI(text)) {
            toImportDayTextField.setText("00");
        }
    }//GEN-LAST:event_toImportDayTextFieldMouseExited

    private void toImportDayTextFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_toImportDayTextFieldKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            String text = toImportDayTextField.getText();
            if (!ctions.checkIfANumberSequenceForGUI(text)) {
                toImportDayTextField.setText("00");
            } else {
                toImportMonthTextField.requestFocus();
            }
        }
    }//GEN-LAST:event_toImportDayTextFieldKeyPressed

    private void toYearTextFieldMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_toYearTextFieldMouseExited
        String text = toYearTextField.getText();
        if (!ctions.checkIfANumberSequenceForGUI(text)) {
            toYearTextField.setText(LocalDate.now().getYear() + "");
        }
    }//GEN-LAST:event_toYearTextFieldMouseExited

    private void toYearTextFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_toYearTextFieldKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            String text = toYearTextField.getText();
            if (!ctions.checkIfANumberSequenceForGUI(text)) {
                toYearTextField.setText(LocalDate.now().getYear() + "");
            }
        }
    }//GEN-LAST:event_toYearTextFieldKeyPressed

    private void printImportReportBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printImportReportBtnActionPerformed
        try ( PrintWriter pw = new PrintWriter(Files.newBufferedWriter(Path.of(IMPORT_GOODS_LIST_FILE),
                StandardOpenOption.CREATE,
                StandardOpenOption.WRITE,
                StandardOpenOption.TRUNCATE_EXISTING), true)) {
            pw.println("Ma SP,Ten SP,Nha SX,Ngay nhap,DVT,Ma lo,Gia nhap,SL,Tien hang");
            for (Goods goods : filterImportGoodsList) {
                pw.println(goods.toImportGoodsString());
            }
            JOptionPane.showMessageDialog(this,
                    "Xuất File excel thành công!",
                    "Thông báo",
                    JOptionPane.INFORMATION_MESSAGE);
        } catch (IOException ex) {
            showWarningJOptionPane(CANNOT_PRINT_TO_EXCEL);
        }
    }//GEN-LAST:event_printImportReportBtnActionPerformed

    private void printStaticalGoodsToExcelBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printStaticalGoodsToExcelBtnActionPerformed
        try ( PrintWriter pw = new PrintWriter(Files.newBufferedWriter(Path.of(REPORT_GOODS_LIST_FILE),
                StandardOpenOption.CREATE,
                StandardOpenOption.WRITE,
                StandardOpenOption.TRUNCATE_EXISTING), true)) {
            StatefulBeanToCsv<StaticalGoods> writer = new StatefulBeanToCsvBuilder<StaticalGoods>(pw).build();
            pw.println("Ma SP,Ten SP,Nha SX,SL,Doanh Thu,Ti Le");
            writer.write(staticalGoodsList.getList());
            JOptionPane.showMessageDialog(this,
                    "Xuất File excel thành công!",
                    "Thông báo",
                    JOptionPane.INFORMATION_MESSAGE);
        } catch (IOException | CsvDataTypeMismatchException | CsvRequiredFieldEmptyException ex) {
            showWarningJOptionPane(CANNOT_PRINT_TO_EXCEL);
        }
    }//GEN-LAST:event_printStaticalGoodsToExcelBtnActionPerformed

    private void searchOrderBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchOrderBtnActionPerformed
        String orderID = searchOrderIDTextField.getText();
        if (!orderID.isBlank()) {
            Order searchingOrder = historyCtr.containOrder(orderID, store.getHistory());
            clearTableModel(goodsReportModel);
            clearTableModel(overViewModel);
            clearTableModel(orderDetailModel);
            fromDayTextField.setText("00");
            fromMonthTextField.setText("00");
            fromYearTextField.setText(LocalDate.now().getYear() + "");
            toDayTextField.setText("00");
            toMonthTextField.setText("00");
            toYearTextField.setText(LocalDate.now().getYear() + "");
            searchCashierComboBox.setSelectedIndex(0);
            if (searchingOrder != null) {
                searchCashierComboBox.setSelectedIndex(store.getEmployeeList()
                        .getList()
                        .indexOf(searchingOrder.getCashier()) + 1);
                insertOrderToOverViewTable(searchingOrder);
            }
            return;
        }
        filterOrderList = historyCtr.toOrderList(store.getHistory());
        String fromDateStr = fromDayTextField.getText() + "/" + fromMonthTextField.getText() + "/" + fromYearTextField.getText();
        String toDateStr = toDayTextField.getText() + "/" + toMonthTextField.getText() + "/" + toYearTextField.getText();
        int selectedCashierIndex = searchCashierComboBox.getSelectedIndex();

        if (selectedCashierIndex != 0) {
            Employee cashier = store.getEmployeeList().getList().get(selectedCashierIndex - 1);
            filterOrderList = filterOrderList.stream()
                    .filter(order -> order
                    .getCashier()
                    .getCCCD()
                    .equals(cashier.getCCCD()))
                    .toList();
        }
        if (!fromDateStr.equals(defaultDateSet) && !toDateStr.equals(defaultDateSet)) {
            boolean check = ctions.checkIfDateIsBeforeAnotherDate(fromDateStr, toDateStr);
            if (check) {
                LocalDate fromDate = LocalDate.parse(fromDateStr, DateTimeFormatter.ofPattern(Date_Parttern));
                LocalDate toDate = LocalDate.parse(toDateStr, DateTimeFormatter.ofPattern(Date_Parttern));
                filterOrderList = filterOrderList
                        .stream()
                        .filter(order
                                -> order.getOrderDateTime().toLocalDate().isEqual(fromDate)
                        || order.getOrderDateTime().toLocalDate().isEqual(toDate)
                        || (order.getOrderDateTime().toLocalDate().isAfter(fromDate)
                        && order.getOrderDateTime().toLocalDate().isBefore(toDate)))
                        .toList();
            } else {
                showWarningJOptionPane(INVALID_FILTER_DATE);
                return;
            }
        }
        BigDecimal grossRevenue = historyCtr.getTotalGrossRevenue(filterOrderList);
        clearTableModel(orderDetailModel);
        insertOrderHistoryToOverViewTable(filterOrderList);
        staticalGoodsList = historyCtr.makeStaticalGoodsList(filterOrderList, grossRevenue);
        insertStaticalGoodsListToGoodsReportTable(staticalGoodsList);
        totalReportProcessLabel.setText(String.format("%.1f", grossRevenue));
    }//GEN-LAST:event_searchOrderBtnActionPerformed

    private void refreshBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshBtnActionPerformed
        refreshOrderHistoryPanel();
    }//GEN-LAST:event_refreshBtnActionPerformed

    private void overViewTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_overViewTableMouseClicked
        int selectedRow = overViewTable.getSelectedRow();
        if (selectedRow != -1) {
            String orderID = (String) overViewModel.getValueAt(selectedRow, 0);
            Order order = historyCtr.containOrder(orderID, store.getHistory());
            insertOrderToOrderDetailTable(order);
            totalPaymentLabel.setText(String.format("%.1f", orderCtr.getTotal(order, store)));
        }
    }//GEN-LAST:event_overViewTableMouseClicked

    private void searchOrderIDTextFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchOrderIDTextFieldKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            String orderID = searchOrderIDTextField.getText();
            Order searchingOrder = historyCtr.containOrder(orderID, store.getHistory());
            clearTableModel(goodsReportModel);
            clearTableModel(overViewModel);
            clearTableModel(orderDetailModel);
            fromDayTextField.setText("00");
            fromMonthTextField.setText("00");
            fromYearTextField.setText(LocalDate.now().getYear() + "");
            toDayTextField.setText("00");
            toMonthTextField.setText("00");
            toYearTextField.setText(LocalDate.now().getYear() + "");
            searchCashierComboBox.setSelectedIndex(0);
            if (searchingOrder != null) {
                searchCashierComboBox.setSelectedIndex(store.getEmployeeList()
                        .getList()
                        .indexOf(searchingOrder.getCashier()) + 1);
                insertOrderToOverViewTable(searchingOrder);
            }
        }
    }//GEN-LAST:event_searchOrderIDTextFieldKeyPressed

    private void refreshImportTableLabelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshImportTableLabelActionPerformed
        refreshImportHistoryPanel();
    }//GEN-LAST:event_refreshImportTableLabelActionPerformed

    private void searchImportHistoryBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchImportHistoryBtnActionPerformed
        filterImportGoodsList = store.getHistory().getImportGoodsList();
        String goodsName = goodsNameTextField.getText();
        String manufacture = manufactureComboBox.getSelectedItem().toString();
        String fromDateStr = fromImportDayTextField.getText() + "/" + fromImportMonthTextField.getText() + "/" + fromImportYearTextField.getText();
        String toDateStr = toImportDayTextField.getText() + "/" + toImportMonthTextField.getText() + "/" + toImportYearTextField.getText();
        
        if(!goodsName.isBlank()){
            filterImportGoodsList = filterImportGoodsList
                    .stream()
                    .filter(goods->goods
                            .getGoodsName()
                            .toLowerCase()
                            .contains(goodsName.toLowerCase()))
                    .toList();
        }
        if(!manufacture.equals("null")){
            filterImportGoodsList = filterImportGoodsList
                    .stream()
                    .filter(goods->goods.getManufacture().equals(manufacture))
                    .toList();
        }
        if (!fromDateStr.equals(defaultDateSet) && !toDateStr.equals(defaultDateSet)) {
            boolean check = ctions.checkIfDateIsBeforeAnotherDate(fromDateStr, toDateStr);
            if (check) {
                LocalDate fromDate = LocalDate.parse(fromDateStr, DateTimeFormatter.ofPattern(Date_Parttern));
                LocalDate toDate = LocalDate.parse(toDateStr, DateTimeFormatter.ofPattern(Date_Parttern));
                filterImportGoodsList = filterImportGoodsList
                        .stream()
                        .filter(goods
                                -> goods.getShipments().get(0).getImportedDate().isEqual(fromDate)
                        || goods.getShipments().get(0).getImportedDate().isEqual(toDate)
                        || (goods.getShipments().get(0).getImportedDate().isAfter(fromDate)
                        && goods.getShipments().get(0).getImportedDate().isBefore(toDate)))
                        .toList();
            } else {
                showWarningJOptionPane(INVALID_FILTER_DATE);
                return;
            }
        }
        insertImportedGoodsToImportDetailTable(filterImportGoodsList);
        displayNumberOfImportLabel.setText(importDetailTable.getRowCount() + "");
        displayTotalOfImportLabel.setText(String.format("%.1f",
                historyCtr.getTotalAmountOfImportGoods(filterImportGoodsList)));
    }//GEN-LAST:event_searchImportHistoryBtnActionPerformed

    private void goodsNameTextFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_goodsNameTextFieldKeyReleased
        String key = goodsNameTextField.getText();
        GoodsList<Goods> goodsList = new GoodsList<>();
        Object searchedObject = orderCtr.searchGoods(key, new GoodsList<>(filterImportGoodsList));
        if (searchedObject == null) {
            clearTableModel(importDetailModel);
            return;
        } else if (searchedObject instanceof Goods goods) {
            goodsList.getList().add(goods);
        } else if (searchedObject instanceof GoodsList) {
            goodsList = (GoodsList<Goods>) searchedObject;
        }
        insertImportedGoodsToImportDetailTable(goodsList.getList());
    }//GEN-LAST:event_goodsNameTextFieldKeyReleased

    private void manufactureComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manufactureComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_manufactureComboBoxActionPerformed

    private void passValueToSearchCashierComboBox() {
        searchCashierComboBox.removeAllItems();
        searchCashierComboBox.addItem("Tất cả");
        store.getEmployeeList().getList().stream().forEach(e -> searchCashierComboBox.addItem(e.toString()));
    }

    private void passValueToManufactureComboBox() {
        manufactureComboBox.removeAllItems();
        manufactureComboBox.addItem("Tất cả");
        List<String> manufactureList = goodsListCtr
                .getManufactureList(store.getHistory().getImportGoodsList());
        manufactureList.stream().forEach(manufacture -> manufactureComboBox.addItem(manufacture));
    }

    private void clearTableModel(DefaultTableModel tableModel) {
        int count = tableModel.getRowCount();
        for (int i = 0; i < count; i++) {
            tableModel.removeRow(0);
        }
    }

    private void insertOrderToOrderDetailTable(Order order) {
        clearTableModel(orderDetailModel);
        for (Goods goods : order.getList()) {
            int size = goods.getShipments().size();
            for (int i = 0; i < size; i++) {
                if (i == 0) {
                    insertNewGoodsToOrderDetailTable(goods, goods.getShipments().get(i));
                } else {
                    insertExistedGoodsToOrderDetailTable(goods, goods.getShipments().get(i));
                }
            }
        }
    }

    private void insertNewGoodsToOrderDetailTable(Goods goods, Shipment shipment) {
        orderDetailModel.addRow(new Object[]{
            goods.getID(),
            goods.getGoodsName(),
            goods.getUnit(),
            String.format("%.1f", goods.getListPrice()),
            goods.getTotalQuantity(),
            shipment.getID(),
            shipment.getQuantity(),
            String.format("%.1f", shipment.getQuantity().multiply(goods.getListPrice()))
        });
    }

    private void insertExistedGoodsToOrderDetailTable(Goods goods, Shipment shipment) {
        orderDetailModel.addRow(new Object[]{
            "",
            "",
            "",
            "",
            "",
            shipment.getID(),
            shipment.getQuantity(),
            String.format("%.1f", shipment.getQuantity().multiply(goods.getListPrice()))
        });
    }

    private void insertOrderHistoryToOverViewTable(List<Order> orderHistory) {
        clearTableModel(overViewModel);
        for (Order order : orderHistory) {
            insertOrderToOverViewTable(order);
        }
    }

    private void insertOrderToOverViewTable(Order order) {
        overViewModel.addRow(new Object[]{
            order.getID(),
            order.getOrderDateTime().format(DateTimeFormatter
            .ofPattern(DATE_TIME_PATTERN)),
            String.format("%.1f", orderCtr.getTotal(order, store))
        });
    }

    private void insertStaticalGoodsListToGoodsReportTable(GoodsList<StaticalGoods> staticalGoodsList) {
        clearTableModel(goodsReportModel);
        for (StaticalGoods staticalGoods : staticalGoodsList.getList()) {
            goodsReportModel.addRow(new Object[]{
                staticalGoods.getID(),
                staticalGoods.getGoodsName(),
                staticalGoods.getManufacture(),
                staticalGoods.getTotalQuantity(),
                String.format("%.1f", staticalGoods.getRevenue()),
                staticalGoods.getRatio()
            });
        }
    }

    private void insertImportedGoodsToImportDetailTable(List<Goods> goodsList) {
        clearTableModel(importDetailModel);
        int size = goodsList.size();
        for (int i = size - 1; i >= 0; i--) {
            Goods importedGoods = goodsList.get(i);
            Shipment importedShipment = importedGoods.getShipments().get(0);
            BigDecimal importPrice = importedShipment.getImportPrice();
            BigDecimal quantity = importedShipment.getQuantity();
            importDetailModel.addRow(new Object[]{
                importedGoods.getID(),
                importedGoods.getGoodsName(),
                importedGoods.getManufacture(),
                importedShipment.getImportedDate().format(DateTimeFormatter.ofPattern(Date_Parttern)),
                importedGoods.getUnit(),
                importedShipment.getID(),
                String.format("%.1f", importPrice),
                quantity,
                String.format("%.1f", quantity.multiply(importPrice))
            });
        }
    }

    private void showWarningJOptionPane(String message) {
        JOptionPane.showMessageDialog(this, message,
                "Lỗi", JOptionPane.WARNING_MESSAGE);
    }

    private void computeSizeOfEachColumnInTable() {
        // duyet tu dau den cuoi mang de tim MAX_SIZE cua giatri input tung thuoc tinh
        for (Shift shift : store.getHistory().getShiftHistory()) {
            for (Order order : shift.getOrderHisPerShift()) {
                if (order.getID().length() + extraLength > orderIDMaxSize) {
                    orderIDMaxSize = order.getID().length() + extraLength;
                }
                if (order.getOrderDateTime().format(DateTimeFormatter
                        .ofPattern(DATE_TIME_PATTERN)).length() + extraLength > orderDateTimeMaxSize) {
                    orderDateTimeMaxSize = order.getOrderDateTime().format(DateTimeFormatter
                            .ofPattern(DATE_TIME_PATTERN)).length() + extraLength;
                }
                if (String.format(".1f", orderCtr.getTotal(order, store)).length() + extraLength
                        > orderTotalMaxSize) {
                    orderTotalMaxSize = String.format(".1f", orderCtr.getTotal(order, store)).length() + extraLength;
                }
                for (Goods goods : order.getList()) {
                    if (goods.getID().length() + extraLength > goodsIDMaxSize) {
                        goodsIDMaxSize = goods.getID().length() + extraLength;
                    }
                    if (goods.getGoodsName().length() + extraLength > goodsNameMaxSize) {
                        goodsNameMaxSize = goods.getGoodsName().length() + extraLength;
                    }
                    if (goods.getUnit().length() + extraLength > unitMaxSize) {
                        unitMaxSize = goods.getUnit().length() + extraLength;
                    }
                    if (String.format(".1f", goods.getListPrice()).length() + extraLength > listPriceMaxSize) {
                        listPriceMaxSize = String.format(".1f", goods.getListPrice()).length() + extraLength;
                    }
                    if (String.format(".1f", goods.getTotalQuantity()).length() + extraLength > totalQuanMaxSize) {
                        totalQuanMaxSize = String.format(".1f", goods.getTotalQuantity()).length() + extraLength;
                    }
                    if (goods.getManufacture().length() + extraLength > manufactureMaxSize) {
                        manufactureMaxSize = goods.getManufacture().length() + extraLength;
                    }
                    for (Shipment shipment : goods.getShipments()) {
                        if (shipment.getID().length() + extraLength > shipmentIDMaxSize) {
                            shipmentIDMaxSize = shipment.getID().length() + extraLength;
                        }
                        if (String.format(".1f", shipment.getImportPrice()).length() + extraLength > importPriceMaxSize) {
                            importPriceMaxSize = String.format(".1f", shipment.getImportPrice()).length() + extraLength;
                        }
                        if (String.format(".1f", shipment.getQuantity()).length() + extraLength > quanMaxSize) {
                            quanMaxSize = String.format(".1f", shipment.getQuantity()).length() + extraLength;
                        }
                    }
                }
            }
        }
        overViewTable.getColumnModel().getColumn(0).setMinWidth(orderIDMaxSize);
        overViewTable.getColumnModel().getColumn(1).setMinWidth(orderDateTimeMaxSize);
        overViewTable.getColumnModel().getColumn(2).setMinWidth(orderTotalMaxSize);
        orderDetailTable.getColumnModel().getColumn(0).setMinWidth(goodsIDMaxSize);
        orderDetailTable.getColumnModel().getColumn(1).setMinWidth(goodsNameMaxSize);
        orderDetailTable.getColumnModel().getColumn(2).setMinWidth(unitMaxSize);
        orderDetailTable.getColumnModel().getColumn(3).setMinWidth(listPriceMaxSize);
        orderDetailTable.getColumnModel().getColumn(4).setMinWidth(totalQuanMaxSize);
        orderDetailTable.getColumnModel().getColumn(5).setMinWidth(shipmentIDMaxSize);
        orderDetailTable.getColumnModel().getColumn(6).setMinWidth(quanMaxSize);
        orderDetailTable.getColumnModel().getColumn(7).setMinWidth(extraLength);

        goodsReportTable.getColumnModel().getColumn(0).setMinWidth(goodsIDMaxSize);
        goodsReportTable.getColumnModel().getColumn(1).setMinWidth(goodsNameMaxSize);
        goodsReportTable.getColumnModel().getColumn(2).setMinWidth(unitMaxSize);
        goodsReportTable.getColumnModel().getColumn(3).setMinWidth(totalQuanMaxSize);
        goodsReportTable.getColumnModel().getColumn(4).setMinWidth(shipmentIDMaxSize);
        goodsReportTable.getColumnModel().getColumn(5).setMinWidth(quanMaxSize);
    }

    private void setDefaultValueToAllComponentInOrderHistoryPanel() {
        searchOrderIDTextField.setText("");
        searchCashierComboBox.setSelectedIndex(0);
        fromDayTextField.setText("00");
        fromMonthTextField.setText("00");
        fromYearTextField.setText(LocalDate.now().getYear() + "");
        toDayTextField.setText("00");
        toMonthTextField.setText("00");
        toYearTextField.setText(LocalDate.now().getYear() + "");
        //
        clearTableModel(goodsReportModel);
        totalReportProcessLabel.setText("0.0");
        staticalGoodsList = null;
        //
        clearTableModel(orderDetailModel);
        totalPaymentLabel.setText("0.0");
    }

    public void passData(Store store) {
        this.store = store;
    }

    private void refreshOrderHistoryPanel() {
        computeSizeOfEachColumnInTable();
        passValueToSearchCashierComboBox();
        List<Order> orderHistory = historyCtr.toOrderList(store.getHistory());
        insertOrderHistoryToOverViewTable(orderHistory);
        totalOrderQuantityLabel.setText(overViewTable.getRowCount() + "");
        totalNetRevenueLabel.setText(String.format("%.1f",
                historyCtr.getTotalNetRevenue(orderHistory, store)));
        setDefaultValueToAllComponentInOrderHistoryPanel();
    }

    private void refreshImportHistoryPanel() {
        passValueToManufactureComboBox();
        insertImportedGoodsToImportDetailTable(store.getHistory().getImportGoodsList());
        filterImportGoodsList = store.getHistory().getImportGoodsList();
        displayNumberOfImportLabel.setText(importDetailTable.getRowCount() + "");
        displayTotalOfImportLabel.setText(String.format("%.1f",
                historyCtr.getTotalAmountOfImportGoods(store.getHistory().getImportGoodsList())));
    }

    public void refresh() {
        refreshOrderHistoryPanel();
        refreshImportHistoryPanel();
    }

    private void setup() {
        // Table 
        overViewModel = (DefaultTableModel) overViewTable.getModel();
        overViewJScrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        overViewJScrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED);
        orderDetailModel = (DefaultTableModel) orderDetailTable.getModel();
        orderDetailJScrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        orderDetailJScrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED);
        goodsReportModel = (DefaultTableModel) goodsReportTable.getModel();
        goodsReportScrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        goodsReportScrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED);
        importDetailModel = (DefaultTableModel) importDetailTable.getModel();
    }

    private DefaultTableModel overViewModel;
    private DefaultTableModel goodsReportModel;
    private DefaultTableModel orderDetailModel;
    private DefaultTableModel importDetailModel;
    
    private final String NOTHING_CHOOSEN_WARNING = "Bạn chưa chọn hoá đơn nào!";
    private final String INVALID_FILTER_DATE = "Ngày lọc không hợp lệ!";
    private final String CANNOT_PRINT_TO_EXCEL = "Không thể thực hiện xuất danh sách!";
    private final String DATE_TIME_PATTERN = "HH:mm:ss dd/MM/yyyy";
    private final String defaultDateSet = "00/00/" + LocalDate.now().getYear();
    private final String Date_Parttern = "d/M/y";
    private final String HOME = System.getProperty("user.dir");
    private final String SEPARATOR = File.separator;
    private final String REPORT_GOODS_LIST_FILE = HOME + SEPARATOR + "output" + SEPARATOR + "staticalGoodsList.csv";
    private final String IMPORT_GOODS_LIST_FILE = HOME + SEPARATOR + "output" + SEPARATOR + "importGoodsList.csv";
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel amountOfOrderLabel;
    private javax.swing.JLabel cashierPhoneNumLable1;
    private javax.swing.JLabel displayNumberOfImportLabel;
    private javax.swing.JPanel displayShipmentPanel;
    private javax.swing.JLabel displayTotalOfImportLabel;
    private javax.swing.JTextField fromDayTextField;
    private javax.swing.JTextField fromImportDayTextField;
    private javax.swing.JTextField fromImportMonthTextField;
    private javax.swing.JTextField fromImportYearTextField;
    private javax.swing.JLabel fromLabel;
    private javax.swing.JLabel fromLabel1;
    private javax.swing.JTextField fromMonthTextField;
    private javax.swing.JTextField fromYearTextField;
    private javax.swing.JLabel goodsNameLabel;
    private javax.swing.JTextField goodsNameTextField;
    private javax.swing.JScrollPane goodsReportScrollPane;
    private javax.swing.JTable goodsReportTable;
    private javax.swing.JTabbedPane historyTabPane;
    private javax.swing.JScrollPane importDetailJScrollPane;
    private javax.swing.JTable importDetailTable;
    private javax.swing.JPanel importHistoryPanel;
    private javax.swing.JComboBox<String> manufactureComboBox;
    private javax.swing.JLabel manufactureLabel;
    private javax.swing.JLabel numberOfImportLabel;
    private javax.swing.JLabel orderDateLabel;
    private javax.swing.JScrollPane orderDetailJScrollPane;
    private javax.swing.JPanel orderDetailPanel;
    private javax.swing.JTable orderDetailTable;
    private javax.swing.JPanel orderHistoryPanel;
    private javax.swing.JLabel orderIDToSearchLabel;
    private javax.swing.JPanel orderListPanel;
    private javax.swing.JScrollPane overViewJScrollPane;
    private javax.swing.JTable overViewTable;
    private javax.swing.JButton printImportReportBtn;
    private javax.swing.JButton printStaticalGoodsToExcelBtn;
    private javax.swing.JButton refreshBtn;
    private javax.swing.JButton refreshImportTableLabel;
    private javax.swing.JButton reprintBtn;
    private javax.swing.JComboBox<String> searchCashierComboBox;
    private javax.swing.JButton searchImportHistoryBtn;
    private javax.swing.JButton searchOrderBtn;
    private javax.swing.JTextField searchOrderIDTextField;
    private javax.swing.JPanel searchOrderPanel;
    private javax.swing.JPanel searchShipmentPanel;
    private javax.swing.JLabel separatorLabel10;
    private javax.swing.JLabel separatorLabel11;
    private javax.swing.JLabel separatorLabel12;
    private javax.swing.JLabel separatorLabel13;
    private javax.swing.JLabel separatorLabel14;
    private javax.swing.JLabel separatorLabel7;
    private javax.swing.JLabel separatorLabel8;
    private javax.swing.JLabel separatorLabel9;
    private javax.swing.JPanel staticShipmentsPanel;
    private javax.swing.JPanel statisticGoodsPanel;
    private javax.swing.JTextField toDayTextField;
    private javax.swing.JTextField toImportDayTextField;
    private javax.swing.JTextField toImportMonthTextField;
    private javax.swing.JTextField toImportYearTextField;
    private javax.swing.JLabel toLabel;
    private javax.swing.JLabel toLabel2;
    private javax.swing.JTextField toMonthTextField;
    private javax.swing.JTextField toYearTextField;
    private javax.swing.JLabel totalLabel;
    private javax.swing.JLabel totalNetRevenueLabel;
    private javax.swing.JLabel totalOfImportLabel;
    private javax.swing.JLabel totalOrderQuantityLabel;
    private javax.swing.JLabel totalPayment;
    private javax.swing.JLabel totalPaymentLabel;
    private javax.swing.JLabel totalProceedsLabel;
    private javax.swing.JLabel totalReportProcessLabel;
    // End of variables declaration//GEN-END:variables
}
