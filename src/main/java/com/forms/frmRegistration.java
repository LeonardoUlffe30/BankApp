
package com.forms;

import com.clases.clsConnection;
import com.clases.clsUser;
import java.awt.Color;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class frmRegistration extends javax.swing.JFrame {
    private ImageIcon image;
    private Icon icon;
    
    public frmRegistration() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.paintImage(this.lblImage, "src/main/java/com/icons/Bank.jpg");
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        txtName = new javax.swing.JTextField();
        txtLastName = new javax.swing.JTextField();
        txtDni = new javax.swing.JTextField();
        txtCardNumber = new javax.swing.JFormattedTextField();
        txtCVV = new javax.swing.JFormattedTextField();
        txtDate = new javax.swing.JFormattedTextField();
        jLabel8 = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        jLabel9 = new javax.swing.JLabel();
        cmbCurrency = new javax.swing.JComboBox<>();
        btnRegister = new javax.swing.JButton();
        lblImage = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Cascadia Code", 0, 14)); // NOI18N
        jLabel3.setForeground(java.awt.Color.green);
        jLabel3.setText("DNI:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 120, -1, -1));

        jLabel5.setFont(new java.awt.Font("Cascadia Code", 0, 14)); // NOI18N
        jLabel5.setForeground(java.awt.Color.green);
        jLabel5.setText("Card Number:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, -1, -1));

        jLabel4.setFont(new java.awt.Font("Cascadia Code", 1, 24)); // NOI18N
        jLabel4.setForeground(java.awt.Color.green);
        jLabel4.setText("ELITE BANK");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(157, 13, -1, -1));

        jLabel1.setFont(new java.awt.Font("Cascadia Code", 0, 14)); // NOI18N
        jLabel1.setForeground(java.awt.Color.green);
        jLabel1.setText("Name:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 60, -1, -1));

        jLabel2.setFont(new java.awt.Font("Cascadia Code", 0, 14)); // NOI18N
        jLabel2.setForeground(java.awt.Color.green);
        jLabel2.setText("Last Name:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, -1, -1));

        jLabel6.setFont(new java.awt.Font("Cascadia Code", 0, 14)); // NOI18N
        jLabel6.setForeground(java.awt.Color.green);
        jLabel6.setText("Date:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 190, -1, -1));

        jLabel7.setFont(new java.awt.Font("Cascadia Code", 0, 14)); // NOI18N
        jLabel7.setForeground(java.awt.Color.green);
        jLabel7.setText("CVV:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 190, -1, -1));

        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        getContentPane().add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 300, 90, 30));
        getContentPane().add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 60, 140, -1));
        getContentPane().add(txtLastName, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 90, 140, -1));
        getContentPane().add(txtDni, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 120, 100, -1));

        try {
            txtCardNumber.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####-####-####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtCardNumber.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(txtCardNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 150, 150, 26));

        try {
            txtCVV.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        getContentPane().add(txtCVV, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 180, 61, 30));

        try {
            txtDate.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtDate.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(txtDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 180, 56, 30));

        jLabel8.setFont(new java.awt.Font("Cascadia Code", 0, 14)); // NOI18N
        jLabel8.setForeground(java.awt.Color.green);
        jLabel8.setText("Password:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, -1, -1));

        txtPassword.setToolTipText("");
        txtPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPasswordActionPerformed(evt);
            }
        });
        getContentPane().add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 220, 140, -1));

        jLabel9.setFont(new java.awt.Font("Cascadia Code", 0, 14)); // NOI18N
        jLabel9.setForeground(java.awt.Color.green);
        jLabel9.setText("Currency: ");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, -1, -1));

        cmbCurrency.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Select-", "Soles", "Dollars" }));
        getContentPane().add(cmbCurrency, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 250, 111, -1));

        btnRegister.setText("Register");
        btnRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisterActionPerformed(evt);
            }
        });
        getContentPane().add(btnRegister, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 300, 90, 30));
        getContentPane().add(lblImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(-2, -1, 540, 370));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private  String name;
    private String lastName;
    private String dni;
    private String cardNumber;
    private String expirationDate;
    private String cvv;
    private String password;
    private String currency;
    
    private void btnRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterActionPerformed
        String typeCurrency = "";
        if(txtName.getText().isEmpty() || txtLastName.getText().isEmpty() || txtDni.getText().isEmpty()
                || txtCardNumber.getText().isEmpty() || txtDate.getText().isEmpty() || txtCVV.getText().isEmpty()
                || String.valueOf(txtPassword.getPassword()).isEmpty() || cmbCurrency.getSelectedIndex()==0) {
            JOptionPane.showMessageDialog(null, "Please, fill in the blank spaces");
        }
        else {
            name = txtName.getText();
            lastName = txtLastName.getText();
            dni = txtDni.getText();
            cardNumber = txtCardNumber.getText();
            expirationDate = txtDate.getText();
            cvv = txtCVV.getText();
            password = String.valueOf(txtPassword.getPassword());
            if(cmbCurrency.getSelectedIndex()==1)
                typeCurrency = "Soles";
            if(cmbCurrency.getSelectedIndex()==2)
                typeCurrency = "Dollars";
            
            clsUser newUser = new clsUser(txtName.getText(),txtLastName.getText(), txtDni.getText(),                  
        txtCardNumber.getText(), txtCVV.getText(), txtDate.getText(), txtPassword.getPassword().toString(), typeCurrency,0);
            clsConnection connection = new clsConnection();
            connection.addDataRegistrationToDB(newUser);
        }
        
    }//GEN-LAST:event_btnRegisterActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        this.setVisible(false);
        frmLogIn logIn = new frmLogIn();
        logIn.setVisible(true);

    }//GEN-LAST:event_btnBackActionPerformed

    private void txtPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPasswordActionPerformed
    
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
            java.util.logging.Logger.getLogger(frmRegistration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmRegistration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmRegistration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmRegistration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmRegistration().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnRegister;
    private javax.swing.JComboBox<String> cmbCurrency;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lblImage;
    private javax.swing.JFormattedTextField txtCVV;
    private javax.swing.JFormattedTextField txtCardNumber;
    private javax.swing.JFormattedTextField txtDate;
    private javax.swing.JTextField txtDni;
    private javax.swing.JTextField txtLastName;
    private javax.swing.JTextField txtName;
    private javax.swing.JPasswordField txtPassword;
    // End of variables declaration//GEN-END:variables
}
