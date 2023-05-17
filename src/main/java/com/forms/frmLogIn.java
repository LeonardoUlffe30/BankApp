
package com.forms;

import com.clases.clsConnection;
import com.clases.clsUser;
import java.awt.Color;
import java.awt.Image;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;


public class frmLogIn extends javax.swing.JFrame {
    private ImageIcon image;
    private Icon icon;
    
    public frmLogIn() {
        initComponents();
        this.setLocationRelativeTo(this);
        this.paintImage(this.lblImage, "src/main/java/com/icons/Bank.jpg");
        retrieveDataFromDB();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnSignIn = new javax.swing.JButton();
        btnSignUp = new javax.swing.JButton();
        txtCardNumber = new javax.swing.JFormattedTextField();
        txtDni = new javax.swing.JTextField();
        txtPassword = new javax.swing.JPasswordField();
        lblImage = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Cascadia Code", 1, 24)); // NOI18N
        jLabel4.setForeground(java.awt.Color.green);
        jLabel4.setText("ELITE BANK");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 30, -1, -1));

        jLabel1.setFont(new java.awt.Font("Cascadia Code", 0, 14)); // NOI18N
        jLabel1.setForeground(java.awt.Color.green);
        jLabel1.setText("Card Number:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, -1));

        jLabel2.setFont(new java.awt.Font("Cascadia Code", 0, 14)); // NOI18N
        jLabel2.setForeground(java.awt.Color.green);
        jLabel2.setText("DNI:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 120, -1, -1));

        jLabel3.setFont(new java.awt.Font("Cascadia Code", 0, 14)); // NOI18N
        jLabel3.setForeground(java.awt.Color.green);
        jLabel3.setText("Password:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, -1, -1));

        btnSignIn.setText("Sign In");
        btnSignIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSignInActionPerformed(evt);
            }
        });
        getContentPane().add(btnSignIn, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 99, 33));

        btnSignUp.setText("Sign Up");
        btnSignUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSignUpActionPerformed(evt);
            }
        });
        getContentPane().add(btnSignUp, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 260, 99, 33));

        try {
            txtCardNumber.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####-####-####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtCardNumber.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(txtCardNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 80, 140, 26));
        getContentPane().add(txtDni, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 120, 124, 26));

        txtPassword.setMinimumSize(new java.awt.Dimension(15, 24));
        txtPassword.setName(""); // NOI18N
        txtPassword.setPreferredSize(new java.awt.Dimension(15, 24));
        getContentPane().add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 160, 124, 26));

        lblImage.setInheritsPopupMenu(false);
        lblImage.setOpaque(true);
        getContentPane().add(lblImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 620, 330));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private clsConnection connection = new clsConnection();
    private List<clsUser> lstUsers = new ArrayList<clsUser>();
    private clsUser user;
    
    private void retrieveDataFromDB() {
        connection.retrieveDataFromDB(lstUsers);
    }
    
    private boolean getAuthentication() {
        for(clsUser iteratorUser: lstUsers) {
            if(txtDni.getText().equalsIgnoreCase(iteratorUser.getDni())) {
                if(txtCardNumber.getText().equalsIgnoreCase(iteratorUser.getCard().getCardNumber())) {
                    if(String.valueOf(txtPassword.getPassword()).equals(iteratorUser.getCard().getPassword())) {
                        user = iteratorUser;
                        return true;
                    }
                }       
            }
        }
        return false;
    }
    
    private void btnSignInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSignInActionPerformed
        btnSignIn.setBackground(Color.red);
        if(getAuthentication()) {
            frmHome home = new frmHome();
            home.setUserAccount(user);
            this.setVisible(false);
            home.setVisible(true);
        } else
            JOptionPane.showMessageDialog(null, "Incorrect Log In", "Error", JOptionPane.ERROR_MESSAGE);
    }//GEN-LAST:event_btnSignInActionPerformed

    private void btnSignUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSignUpActionPerformed
        frmRegistration register = new frmRegistration();
        this.setVisible(false);
        register.setVisible(true);
    }//GEN-LAST:event_btnSignUpActionPerformed

    private void paintImage(JLabel lbl, String location) {
        this.image = new ImageIcon(location);
        this.icon = new ImageIcon(
                this.image.getImage().getScaledInstance(
                        lbl.getWidth(), lbl.getHeight(), Image.SCALE_DEFAULT));
        lbl.setIcon(this.icon);
        this.repaint();
    }

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
            java.util.logging.Logger.getLogger(frmLogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmLogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmLogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmLogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmLogIn().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSignIn;
    private javax.swing.JButton btnSignUp;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel lblImage;
    private javax.swing.JFormattedTextField txtCardNumber;
    private javax.swing.JTextField txtDni;
    private javax.swing.JPasswordField txtPassword;
    // End of variables declaration//GEN-END:variables
}
