/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import java.nio.file.Path;
import Models.*;
import Ultility.*;
import com.formdev.flatlaf.FlatLightLaf;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.event.WindowEvent;
import java.io.File;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javaswingdev.drawer.Drawer;
import javaswingdev.drawer.DrawerController;
import javaswingdev.drawer.DrawerItem;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author FPTSHOP
 */
public class MainFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainFrame
     */
    public MainFrame() {
        initComponents();
        initVariables();
        initSideBar();
        setUp();
        //
//        MainFrame.storeList = loadData();
//        setUserStore(storeList.get(0));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        toolBarPanel = new javax.swing.JPanel();
        shiftIDLabel = new javax.swing.JLabel();
        dateTimeSeparator = new javax.swing.JSeparator();
        dateLabel = new javax.swing.JLabel();
        timeLabel = new javax.swing.JLabel();
        dateTextField = new javax.swing.JFormattedTextField();
        timeTextField = new javax.swing.JFormattedTextField();
        openSideBarLabel = new javax.swing.JLabel();
        displayPanel = new javax.swing.JPanel();
        purchasePanel1 = new GUI.PurchasePanel();
        repoPanel1 = new GUI.RepoPanel();
        customerCardPanel1 = new GUI.CustomerCardPanel();
        employJPanel1 = new GUI.EmployJPanel();
        settingsPanel1 = new GUI.SettingsPanel();
        historyPanel1 = new GUI.HistoryPanel();
        shiftPanel1 = new GUI.ShiftPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Phần mềm quản lý bán hàng");
        setAutoRequestFocus(false);
        setFocusable(false);
        setMinimumSize(new java.awt.Dimension(1015, 670));
        setResizable(false);

        toolBarPanel.setBackground(new java.awt.Color(255, 255, 255));
        toolBarPanel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        toolBarPanel.setMinimumSize(new java.awt.Dimension(1000, 35));
        toolBarPanel.setOpaque(false);
        toolBarPanel.setPreferredSize(new java.awt.Dimension(1000, 35));

        shiftIDLabel.setFont(new java.awt.Font("MTO Telephone", 1, 16)); // NOI18N

        dateTimeSeparator.setOrientation(javax.swing.SwingConstants.VERTICAL);

        dateLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        dateLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImageIcon/icons8-calender-30.png"))); // NOI18N
        dateLabel.setText("Lịch:");
        dateLabel.setFocusable(false);
        dateLabel.setMinimumSize(new java.awt.Dimension(73, 20));
        dateLabel.setPreferredSize(new java.awt.Dimension(73, 20));

        timeLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        timeLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImageIcon/icons8-history-30.png"))); // NOI18N
        timeLabel.setText("Giờ :");
        timeLabel.setFocusable(false);
        timeLabel.setMinimumSize(new java.awt.Dimension(34, 20));
        timeLabel.setPreferredSize(new java.awt.Dimension(34, 20));

        dateTextField.setEditable(false);
        dateTextField.setBorder(null);
        dateTextField.setFocusable(false);
        dateTextField.setPreferredSize(new java.awt.Dimension(126, 22));

        timeTextField.setEditable(false);
        timeTextField.setBorder(null);
        timeTextField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getTimeInstance())));
        timeTextField.setFocusable(false);
        timeTextField.setPreferredSize(new java.awt.Dimension(126, 22));

        openSideBarLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImageIcon/icons8-menu-40.png"))); // NOI18N
        openSideBarLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                openSideBarLabelMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout toolBarPanelLayout = new javax.swing.GroupLayout(toolBarPanel);
        toolBarPanel.setLayout(toolBarPanelLayout);
        toolBarPanelLayout.setHorizontalGroup(
            toolBarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(toolBarPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(openSideBarLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(shiftIDLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 538, Short.MAX_VALUE)
                .addComponent(dateLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dateTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(dateTimeSeparator, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(timeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(timeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        toolBarPanelLayout.setVerticalGroup(
            toolBarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(toolBarPanelLayout.createSequentialGroup()
                .addGroup(toolBarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(toolBarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(dateTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(dateLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(toolBarPanelLayout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(shiftIDLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(openSideBarLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(toolBarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(dateTimeSeparator, javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, toolBarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(timeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(timeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(7, 7, 7))
        );

        getContentPane().add(toolBarPanel, java.awt.BorderLayout.PAGE_START);

        displayPanel.setFocusable(false);
        displayPanel.setMaximumSize(new java.awt.Dimension(2147483647, 630));
        displayPanel.setMinimumSize(new java.awt.Dimension(1000, 580));
        displayPanel.setOpaque(false);
        displayPanel.setPreferredSize(new java.awt.Dimension(1000, 580));
        displayPanel.setLayout(new java.awt.CardLayout());

        purchasePanel1.setBorder(null);
        displayPanel.add(purchasePanel1, "card4");
        displayPanel.add(repoPanel1, "card7");

        customerCardPanel1.setMinimumSize(new java.awt.Dimension(975, 560));
        displayPanel.add(customerCardPanel1, "card6");
        displayPanel.add(employJPanel1, "card5");
        displayPanel.add(settingsPanel1, "card7");
        displayPanel.add(historyPanel1, "card8");
        displayPanel.add(shiftPanel1, "card8");

        getContentPane().add(displayPanel, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void openSideBarLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_openSideBarLabelMouseClicked
        if (drawerCtr.isShow()) {
            drawerCtr.hide();
        } else {
            drawerCtr.show();
        }
    }//GEN-LAST:event_openSideBarLabelMouseClicked

    /**
     * @param args the command line arguments
     * @throws javax.swing.UnsupportedLookAndFeelException
     */
    public static void main(String args[]) throws UnsupportedLookAndFeelException {
        UIManager.setLookAndFeel(new FlatLightLaf());
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new MainFrame().setVisible(true);
        });
    }

    private void passDataToComponents() {
        // pass data vào purchasePanel
        purchasePanel1.passData(store, shift);
        // pass data vào customerCardPanel
        customerCardPanel1.passData(store);
        // pass data vào employPanel
        employJPanel1.passData(store.getEmployeeList(), shift);
        // pass data vào repoPanel
        repoPanel1.passData(store);
        // pass data vào shiftJPanel
        shiftPanel1.passData(store, shift, this);
        //pass dât vào settingsPanel
        settingsPanel1.passData(store, header, storeList);
        //pass data vào historyPanel
        historyPanel1.passData(store);
        //pass data vao header
        header.setStore(store);
        header.setStoreInfor();
    }

    public void notOpenShiftWarning() {
        int choice = JOptionPane.showConfirmDialog(displayPanel, "Thực hiện mở ca ngay?",
                "Không có ca hiện tại!", JOptionPane.WARNING_MESSAGE);
        if (choice == JOptionPane.OK_OPTION) {
            switchPanel(2);
        }
    }

    private void initSideBar() {
        DrawerItem productDrawerItem = new DrawerItem("Sản phẩm").icon(new ImageIcon(getClass().getResource("/ImageIcon/icons8-product-35.png"))).build();
        productDrawerItem.setFont(new java.awt.Font("Segoe UI", 1, 16));
        productDrawerItem.setHorizontalAlignment(JButton.LEADING);
        productDrawerItem.setFocusable(false);
        DrawerItem purchaseDrawerItem = new DrawerItem("Bán hàng").icon(new ImageIcon(getClass().getResource("/ImageIcon/icons8-add-basket-35.png"))).build();
        purchaseDrawerItem.setFont(new java.awt.Font("Segoe UI", 1, 16));
        purchaseDrawerItem.setHorizontalAlignment(JButton.LEADING);
        purchaseDrawerItem.setFocusable(false);
        DrawerItem manageDrawerItem = new DrawerItem("Ca hiện tại").icon(new ImageIcon(getClass().getResource("/ImageIcon/icons8-static-35.png"))).build();
        manageDrawerItem.setFont(new java.awt.Font("Segoe UI", 1, 16));
        manageDrawerItem.setHorizontalAlignment(JButton.LEADING);
        manageDrawerItem.setFocusable(false);
        DrawerItem employeeDrawerItem = new DrawerItem("Nhân viên").icon(new ImageIcon(getClass().getResource("/ImageIcon/icons8-name-tag-35.png"))).build();
        employeeDrawerItem.setFont(new java.awt.Font("Segoe UI", 1, 16));
        employeeDrawerItem.setHorizontalAlignment(JButton.LEADING);
        employeeDrawerItem.setFocusable(false);
        DrawerItem customerDrawerItem = new DrawerItem("Khách hàng").icon(new ImageIcon(getClass().getResource("/ImageIcon/icons8-customer-35.png"))).build();
        customerDrawerItem.setFont(new java.awt.Font("Segoe UI", 1, 16));
        customerDrawerItem.setHorizontalAlignment(JButton.LEADING);
        customerDrawerItem.setFocusable(false);
        DrawerItem historyDrawerItem = new DrawerItem("Lịch sử").icon(new ImageIcon(getClass().getResource("/ImageIcon/icons8-history-35.png"))).build();
        historyDrawerItem.setFont(new java.awt.Font("Segoe UI", 1, 16));
        historyDrawerItem.setHorizontalAlignment(JButton.LEADING);
        historyDrawerItem.setFocusable(false);
        DrawerItem settingsDrawerItem = new DrawerItem("Cài đặt").icon(new ImageIcon(getClass().getResource("/ImageIcon/icons8-settings-35.png"))).build();
        settingsDrawerItem.setFont(new java.awt.Font("Segoe UI", 1, 16));
        settingsDrawerItem.setHorizontalAlignment(JButton.LEADING);
        settingsDrawerItem.setFocusable(false);
        DrawerItem logoutDrawerItem = new DrawerItem("Đăng xuất").icon(new ImageIcon(getClass().getResource("/ImageIcon/icons8-logout-30.png"))).build();
        logoutDrawerItem.setFocusable(false);
        header = new Header(store);

        drawerCtr = Drawer.newDrawer(this)
                .header(header)
                .separator(2, Color.LIGHT_GRAY)
                .space(10)
                .duration(300)
                .backgroundTransparent(0.3f)
                .drawerWidth(230)
                .addChild(productDrawerItem)
                .addChild(purchaseDrawerItem)
                .addChild(manageDrawerItem)
                .addChild(employeeDrawerItem)
                .addChild(customerDrawerItem)
                .addChild(historyDrawerItem)
                .addChild(settingsDrawerItem)
                .addFooter(logoutDrawerItem)
                .event((int i, DrawerItem di) -> {
                    switchPanel(i);
                })
                .build();
    }

    private void switchPanel(int i) {
        if (!shift.getState().equals(ShiftState.OPENED)) {
            shift = new Shift();
        }
        switch (i) {
            case 0:
                displayPanel.add(repoPanel1, "repo");
                cardLayout.show(displayPanel, "repo");
                drawerCtr.hide();
                repoPanel1.externalRefresh();
                break;
            case 1:
                purchasePanel1.setEnableToAllPanel(shift.getState().equals(ShiftState.OPENED));
                displayPanel.add(purchasePanel1, "purchase");
                cardLayout.show(displayPanel, "purchase");
                drawerCtr.hide();
                if (!shift.getState().equals(ShiftState.OPENED)) {
                    notOpenShiftWarning();
                } else {
                    initNewOrdercheck = true;
                    purchasePanel1.refresh(shift);
                }
                break;
            case 2:
                displayPanel.add(shiftPanel1, "shift");
                cardLayout.show(displayPanel, "shift");
                drawerCtr.hide();
                shiftPanel1.reload(shift);
                break;
            case 3:
                displayPanel.add(employJPanel1, "employee");
                cardLayout.show(displayPanel, "employee");
                drawerCtr.hide();
                employJPanel1.refreshEmployees();
                break;
            case 4:
                displayPanel.add(customerCardPanel1, "customer");
                cardLayout.show(displayPanel, "customer");
                drawerCtr.hide();
                customerCardPanel1.reload();
                break;
            case 5:
                displayPanel.add(historyPanel1, "history");
                cardLayout.show(displayPanel, "history");
                drawerCtr.hide();
                historyPanel1.refresh();
                break;
            case 6:
                displayPanel.add(settingsPanel1, "settings");
                cardLayout.show(displayPanel, "settings");
                drawerCtr.hide();
                break;
            case 7:
                showCloseMessage();
                LogInFrame lgf = new LogInFrame();
                lgf.setVisible(true);
                this.dispose();
        }
    }

    private void realTimeClock() {
        new Thread() {
            @Override
            public void run() {
                try {
                    while (true) {
                        LocalDateTime curDateTime = LocalDateTime.now();
                        timeTextField.setText(curDateTime.format(DateTimeFormatter.ofPattern("HH:mm:ss a")));
                        dateTextField.setText(curDateTime.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
                        Thread.sleep(1000);
                    }
                } catch (InterruptedException ex) {
                    Logger.getLogger(PurchasePanel.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }.start();
    }

    private void saveData() {
        myData.save(Path.of(STORE_DATA_FOLDER + store.getID() + ".json"), store);
        myData.save(Path.of(LIST_STORE_PATH), storeList);
    }

    public void setUserStore(StoreShortedCut storeShortedCut, List<StoreShortedCut> storeList) {
        this.store = (Store) myData.load(Path.of(STORE_DATA_FOLDER + storeShortedCut.getId() + ".json"),
                Store.class, store);
        this.storeList = storeList;
        this.shift = (store.getHistory().getShiftHistory().isEmpty()) ? new Shift()
                : store.getHistory().getShiftHistory().peek();
        passDataToComponents();
    }

    private void showCloseMessage() {
        if (JOptionPane.showConfirmDialog(null,
                "Bạn có muốn lưu trạng thái hiện tại?",
                "Đóng chương trình?",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE) == JOptionPane.YES_OPTION) {
            if (initNewOrdercheck) {
                int value = store.getiDGenerator().getBucket().get(Order.class.getName());
                store.getiDGenerator().getBucket().put(Order.class.getName(), (value == 0) ? 0 : --value);
            }
            saveData();
        }
    }

    private void setUp() {
        this.addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                showCloseMessage();
                System.exit(0);
            }
        });
        setIconImage(new ImageIcon(getClass()
                .getResource("/ImageIcon/icons8-grocery-store-96.png")).getImage());
        this.setLocationRelativeTo(null);
        displayPanel.add(repoPanel1, "repo");
        cardLayout.show(displayPanel, "repo");
    }

    private void initVariables() {
        cardLayout = (CardLayout) displayPanel.getLayout();
        realTimeClock();
        store = new Store();
        storeList = new ArrayList<>();
    }

    private boolean initNewOrdercheck = false;
    private List<StoreShortedCut> storeList;
    private Shift shift;
    private Store store;
    private Header header;
    private CardLayout cardLayout;
    private DrawerController drawerCtr;
    private static final JsonDataFile myData = new JsonDataFile();
    private static final String HOME = System.getProperty("user.dir");
    private static final String SEPARATOR = File.separator;
    private static final String DATA_FOLDER = HOME + SEPARATOR + "data" + SEPARATOR;
    private static final String STORE_DATA_FOLDER = DATA_FOLDER + "storeData" + SEPARATOR;
    private static final String LIST_STORE_PATH = DATA_FOLDER + "storeList.json";
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private GUI.CustomerCardPanel customerCardPanel1;
    private javax.swing.JLabel dateLabel;
    private javax.swing.JFormattedTextField dateTextField;
    private javax.swing.JSeparator dateTimeSeparator;
    private javax.swing.JPanel displayPanel;
    private GUI.EmployJPanel employJPanel1;
    private GUI.HistoryPanel historyPanel1;
    private javax.swing.JLabel openSideBarLabel;
    private GUI.PurchasePanel purchasePanel1;
    private GUI.RepoPanel repoPanel1;
    private GUI.SettingsPanel settingsPanel1;
    private javax.swing.JLabel shiftIDLabel;
    private GUI.ShiftPanel shiftPanel1;
    private javax.swing.JLabel timeLabel;
    private javax.swing.JFormattedTextField timeTextField;
    private javax.swing.JPanel toolBarPanel;
    // End of variables declaration//GEN-END:variables
}
