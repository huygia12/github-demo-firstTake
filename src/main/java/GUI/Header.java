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

    public void setTitle(String name, String phoneNumber, String address,String email) {
        this.store.setName(name);
        this.store.setPhoneNumber(phoneNumber);
        this.store.setAddress(address);
        this.store.setEmail(email);

        this.storeNameLabel.setText(store.getName());
        this.storePhoneNumLabel.setText("Liên hệ: " + store.getPhoneNumber());
        this.storeAndressLabel.setText("Địa chỉ: " + store.getAddress());
        this.storeEmailLabel.setText("Email: " + store.getEmail());

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

        storePhoneNumLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        storePhoneNumLabel.setText(" ");

        storeAndressLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        storeAndressLabel.setText(" ");

        storeEmailLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        storeEmailLabel.setText(" ");

        imageAvatar1.setImage(new javax.swing.ImageIcon(getClass().getResource("/ImageIcon/avtdis.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(storePhoneNumLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE)
                    .addComponent(storeAndressLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE)
                    .addComponent(storeNameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE)
                    .addComponent(imageAvatar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(27, 27, 27))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(storeEmailLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(imageAvatar1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(storeNameLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(storePhoneNumLabel)
                .addGap(3, 3, 3)
                .addComponent(storeAndressLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(storeEmailLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
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
