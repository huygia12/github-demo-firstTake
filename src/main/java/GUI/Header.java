/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package GUI;

import Models.Store;

/**
 *
 * @author FPTSHOP
 */
public final class Header extends javax.swing.JPanel {

    /**
     * Creates new form Header
     *
     * @param store
     */
    public Header(Store store) {
        initComponents();
        this.store = store;
        setStoreInfor();
    }

    public void setStoreInfor() {
        this.storeNameLabel.setText(store.getName());
        this.storePhoneNumLabel.setText("Liên hệ: " + store.getPhoneNumber());
        this.storeAndressLabel.setText("Địa chỉ: " + store.getAddress());
        this.storeEmailLabel.setText("Email: " + store.getEmail());

    }

    public void setTitle() {
        this.storeNameLabel.setText(store.getName());
        this.storePhoneNumLabel.setText("Liên hệ: " + store.getPhoneNumber());
        this.storeAndressLabel.setText("Địa chỉ: " + store.getAddress());
        this.storeEmailLabel.setText("Email: " + store.getEmail());

    }

    public void setStore(Store store){
        this.store = store;
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        storeNameLabel = new javax.swing.JLabel();
        storePhoneNumLabel = new javax.swing.JLabel();
        storeAndressLabel = new javax.swing.JLabel();
        storeEmailLabel = new javax.swing.JLabel();
        imageAvatar1 = new Models.ImageAvatar();

        storeNameLabel.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        storeNameLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        storeNameLabel.setText(" ");

        storePhoneNumLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        storePhoneNumLabel.setText(" ");

        storeAndressLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        storeAndressLabel.setText(" ");

        storeEmailLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        storeEmailLabel.setText(" ");

        imageAvatar1.setImage(new javax.swing.ImageIcon(getClass().getResource("/ImageIcon/avtdis.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(storeAndressLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(storePhoneNumLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(storeNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(storeEmailLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(imageAvatar1, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(imageAvatar1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(storeNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(storePhoneNumLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(storeAndressLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(storeEmailLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private Store store;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Models.ImageAvatar imageAvatar1;
    private javax.swing.JLabel storeAndressLabel;
    private javax.swing.JLabel storeEmailLabel;
    private javax.swing.JLabel storeNameLabel;
    private javax.swing.JLabel storePhoneNumLabel;
    // End of variables declaration//GEN-END:variables
}
