/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Chi Cute
 */
public class LogInFrame extends javax.swing.JFrame {

    private Pattern pattern;
    private Matcher matcher;
    private String EMAIL_REGEX = "^[A-Za-z0-9]+[A-Za-z0-9]*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)$";
    List<String> emailList = new ArrayList<>();
    List<String> passwordList = new ArrayList<>();

    private boolean checkValidEmail(String regex) {
        pattern = Pattern.compile(EMAIL_REGEX);
        matcher = pattern.matcher(regex);
        return matcher.matches();
    }

    /**
     * Creates new form LogInFrame
     */
    public LogInFrame() {
        initComponents();

        setProperties();
    }

    private void setProperties() {
        passwordWarning.setVisible(false);
        illegalSignUpEmailWarning.setVisible(false);
        blankSignUpPasswordWarning.setVisible(false);
        illegalLogInEmailWarning.setVisible(false);
        logInPassword.setText("");
        signUpPassword.setText("");
        retypePassword.setText("");
        logInEmail.setText("");
        signUpEmail.setText("");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        LogInPanel = new javax.swing.JPanel();
        logInEmail = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        rememberPasswordCheckBox = new javax.swing.JCheckBox();
        forgotPasswordButton = new javax.swing.JButton();
        logInPassword = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        logInButton = new javax.swing.JButton();
        illegalLogInEmailWarning = new javax.swing.JLabel();
        SignUpPanel = new javax.swing.JPanel();
        signUpEmail = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        signUpPassword = new javax.swing.JPasswordField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        signUpButton = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        retypePassword = new javax.swing.JPasswordField();
        passwordWarning = new javax.swing.JLabel();
        illegalSignUpEmailWarning = new javax.swing.JLabel();
        blankSignUpPasswordWarning = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Quản lí bán hàng");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setLocation(new java.awt.Point(500, 150));
        setResizable(false);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jTabbedPane1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTabbedPane1MouseClicked(evt);
            }
        });

        LogInPanel.setBackground(new java.awt.Color(255, 255, 255));
        LogInPanel.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        LogInPanel.setMaximumSize(new java.awt.Dimension(400, 450));

        logInEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logInEmailActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Đăng nhập tài khoản ");

        rememberPasswordCheckBox.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        rememberPasswordCheckBox.setForeground(new java.awt.Color(102, 102, 102));
        rememberPasswordCheckBox.setText("Nhớ mật khẩu");
        rememberPasswordCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rememberPasswordCheckBoxActionPerformed(evt);
            }
        });

        forgotPasswordButton.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        forgotPasswordButton.setForeground(new java.awt.Color(0, 102, 255));
        forgotPasswordButton.setText("Quên mật khẩu?");
        forgotPasswordButton.setBorder(null);
        forgotPasswordButton.setContentAreaFilled(false);
        forgotPasswordButton.setFocusable(false);
        forgotPasswordButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                forgotPasswordButtonActionPerformed(evt);
            }
        });

        jLabel2.setText("Email");

        jLabel3.setText("Mật khẩu");

        logInButton.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        logInButton.setText("Đăng nhập");
        logInButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logInButtonActionPerformed(evt);
            }
        });

        illegalLogInEmailWarning.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        illegalLogInEmailWarning.setForeground(new java.awt.Color(255, 0, 51));
        illegalLogInEmailWarning.setText("Email không hợp lệ");

        javax.swing.GroupLayout LogInPanelLayout = new javax.swing.GroupLayout(LogInPanel);
        LogInPanel.setLayout(LogInPanelLayout);
        LogInPanelLayout.setHorizontalGroup(
            LogInPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LogInPanelLayout.createSequentialGroup()
                .addGap(171, 171, 171)
                .addComponent(logInButton, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LogInPanelLayout.createSequentialGroup()
                .addGroup(LogInPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(LogInPanelLayout.createSequentialGroup()
                        .addGap(52, 83, Short.MAX_VALUE)
                        .addGroup(LogInPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(LogInPanelLayout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(logInEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(LogInPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, LogInPanelLayout.createSequentialGroup()
                                    .addComponent(rememberPasswordCheckBox)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(forgotPasswordButton))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, LogInPanelLayout.createSequentialGroup()
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(logInPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(LogInPanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(LogInPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(illegalLogInEmailWarning))))
                .addGap(114, 114, 114))
        );
        LogInPanelLayout.setVerticalGroup(
            LogInPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LogInPanelLayout.createSequentialGroup()
                .addContainerGap(66, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(43, 43, 43)
                .addGroup(LogInPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(logInEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2)
                .addComponent(illegalLogInEmailWarning)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(LogInPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(logInPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(LogInPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(forgotPasswordButton)
                    .addComponent(rememberPasswordCheckBox))
                .addGap(74, 74, 74)
                .addComponent(logInButton, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(147, 147, 147))
        );

        jTabbedPane1.addTab("Đăng nhập", LogInPanel);

        SignUpPanel.setBackground(new java.awt.Color(255, 255, 255));
        SignUpPanel.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        SignUpPanel.setMaximumSize(new java.awt.Dimension(400, 450));

        signUpEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signUpEmailActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel5.setText("Đăng kí tài khoản");

        jLabel6.setText("Email");

        jLabel7.setText("Mật khẩu");

        signUpButton.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        signUpButton.setText("Đăng kí");
        signUpButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signUpButtonActionPerformed(evt);
            }
        });

        jLabel8.setText("Nhập lại mật khẩu");

        retypePassword.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                retypePasswordInputMethodTextChanged(evt);
            }
        });
        retypePassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                retypePasswordActionPerformed(evt);
            }
        });

        passwordWarning.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        passwordWarning.setForeground(new java.awt.Color(255, 0, 51));
        passwordWarning.setText("Mật khẩu không khớp");

        illegalSignUpEmailWarning.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        illegalSignUpEmailWarning.setForeground(new java.awt.Color(255, 0, 51));
        illegalSignUpEmailWarning.setText("Email không hợp lệ");

        blankSignUpPasswordWarning.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        blankSignUpPasswordWarning.setForeground(new java.awt.Color(255, 0, 51));
        blankSignUpPasswordWarning.setText("Mật khẩu phải chứa ít nhất 4 kí tự");

        javax.swing.GroupLayout SignUpPanelLayout = new javax.swing.GroupLayout(SignUpPanel);
        SignUpPanel.setLayout(SignUpPanelLayout);
        SignUpPanelLayout.setHorizontalGroup(
            SignUpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SignUpPanelLayout.createSequentialGroup()
                .addContainerGap(87, Short.MAX_VALUE)
                .addGroup(SignUpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(passwordWarning)
                    .addGroup(SignUpPanelLayout.createSequentialGroup()
                        .addGroup(SignUpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(SignUpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(retypePassword, javax.swing.GroupLayout.DEFAULT_SIZE, 189, Short.MAX_VALUE)
                            .addComponent(signUpPassword, javax.swing.GroupLayout.DEFAULT_SIZE, 189, Short.MAX_VALUE)
                            .addComponent(signUpEmail, javax.swing.GroupLayout.DEFAULT_SIZE, 189, Short.MAX_VALUE)
                            .addComponent(illegalSignUpEmailWarning, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(blankSignUpPasswordWarning, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addContainerGap(87, Short.MAX_VALUE))
            .addGroup(SignUpPanelLayout.createSequentialGroup()
                .addGap(172, 172, 172)
                .addComponent(signUpButton, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(SignUpPanelLayout.createSequentialGroup()
                .addGap(141, 141, 141)
                .addComponent(jLabel5)
                .addContainerGap(141, Short.MAX_VALUE))
        );
        SignUpPanelLayout.setVerticalGroup(
            SignUpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SignUpPanelLayout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(jLabel5)
                .addGap(39, 39, 39)
                .addGroup(SignUpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(signUpEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2)
                .addComponent(illegalSignUpEmailWarning)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(SignUpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(signUpPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2)
                .addComponent(blankSignUpPasswordWarning)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(SignUpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(retypePassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(passwordWarning)
                .addGap(54, 54, 54)
                .addComponent(signUpButton, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(113, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Đăng kí", SignUpPanel);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        getContentPane().add(jPanel2, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void forgotPasswordButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_forgotPasswordButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_forgotPasswordButtonActionPerformed

    private void logInEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logInEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_logInEmailActionPerformed

    private void rememberPasswordCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rememberPasswordCheckBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rememberPasswordCheckBoxActionPerformed

    private void signUpEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signUpEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_signUpEmailActionPerformed

    private void signUpButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signUpButtonActionPerformed
        // TODO add your handling code here:
        if (!emailList.isEmpty()) {
            for (String string : emailList) {
                if (string.equals(signUpEmail.getText())) {
                    JOptionPane.showMessageDialog(LogInFrame.this,
                            "Email đã tồn tại!",
                            "Đăng kí thất bại!",
                            JOptionPane.WARNING_MESSAGE);
                }
            }
            return;
        }
        boolean validEmail, matchPassword, rightpassword;
        if (!checkValidEmail(signUpEmail.getText())) {
            illegalSignUpEmailWarning.setVisible(true);
            signUpEmail.setText("");
            validEmail = false;
        } else {
            validEmail = true;
        }

        if (signUpPassword.getText().length() < 4) {
            blankSignUpPasswordWarning.setVisible(true);
            signUpPassword.setText("");
            rightpassword = false;
        } else {
            rightpassword = true;
        }

        if (!signUpPassword.getText().equals(retypePassword.getText())) {
            passwordWarning.setVisible(true);
            retypePassword.setText("");
            signUpPassword.setText("");
            matchPassword = false;
        } else {
            matchPassword = true;
        }

        if (validEmail && matchPassword && rightpassword) {
            emailList.add(signUpEmail.getText());
            passwordList.add(signUpPassword.getText());
            JOptionPane.showMessageDialog(LogInFrame.this,
                    "Vui lòng trở lại màn hình đăng nhập",
                    "Đăng kí thành công!",
                    JOptionPane.DEFAULT_OPTION);
            setProperties();
        }
    }//GEN-LAST:event_signUpButtonActionPerformed

    private void retypePasswordInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_retypePasswordInputMethodTextChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_retypePasswordInputMethodTextChanged

    private void retypePasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_retypePasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_retypePasswordActionPerformed

    private void checkExistingEmail() {
        if (emailList.isEmpty()) {
            JOptionPane.showMessageDialog(LogInFrame.this,
                    "Email chưa được đăng kí!",
                    "Đăng nhập thất bại!",
                    JOptionPane.WARNING_MESSAGE);
            return;
        } else {
            for (int i = 0; i < emailList.size(); i++) {
                if (emailList.get(i).equals(logInEmail.getText())) {
                    if (!logInPassword.getText().equals(passwordList.get(i))) {
                        JOptionPane.showMessageDialog(LogInFrame.this,
                                "Sai mật khẩu!",
                                "Đăng nhập thất bại!",
                                JOptionPane.WARNING_MESSAGE);
                        return;
                    }
                } else {
                    JOptionPane.showMessageDialog(LogInFrame.this,
                    "Email chưa được đăng kí!",
                    "Đăng nhập thất bại!",
                    JOptionPane.WARNING_MESSAGE);
                    return;
                }
            } 
        }
        setProperties();
    }

    private void logInFailMessage() {
        JOptionPane.showMessageDialog(LogInFrame.this,
                "Sai email hoặc mật khẩu!",
                "Đăng nhập thất bại!",
                JOptionPane.WARNING_MESSAGE);
    }

    private void logInButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logInButtonActionPerformed
        // TODO add your handling code here:

        if (!checkValidEmail(logInEmail.getText())) {
            illegalLogInEmailWarning.setVisible(true);
            logInEmail.setText("");
        } else {
            checkExistingEmail();
        }


    }//GEN-LAST:event_logInButtonActionPerformed

    private void jTabbedPane1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTabbedPane1MouseClicked
        // TODO add your handling code here:
        setProperties();

    }//GEN-LAST:event_jTabbedPane1MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(LogInFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LogInFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LogInFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LogInFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LogInFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel LogInPanel;
    private javax.swing.JPanel SignUpPanel;
    private javax.swing.JLabel blankSignUpPasswordWarning;
    private javax.swing.JButton forgotPasswordButton;
    private javax.swing.JLabel illegalLogInEmailWarning;
    private javax.swing.JLabel illegalSignUpEmailWarning;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JButton logInButton;
    private javax.swing.JTextField logInEmail;
    private javax.swing.JPasswordField logInPassword;
    private javax.swing.JLabel passwordWarning;
    private javax.swing.JCheckBox rememberPasswordCheckBox;
    private javax.swing.JPasswordField retypePassword;
    private javax.swing.JButton signUpButton;
    private javax.swing.JTextField signUpEmail;
    private javax.swing.JPasswordField signUpPassword;
    // End of variables declaration//GEN-END:variables
}
