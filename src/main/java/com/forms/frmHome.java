
package com.forms;

import com.clases.clsUser;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class frmHome extends javax.swing.JFrame {
    private clsUser userAccount;
    private ImageIcon image;
    private Icon icon;
    
    public frmHome() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.paintImage(this.lblImage, "src/main/java/com/icons/Bank.jpg");
    }
    
    public void setUserAccount(clsUser user) {
        userAccount = user;
        lblUserName.setText(userAccount.getName()+"!");
        if(userAccount.getCard().getCurrency().equalsIgnoreCase("Soles"))
            lblCurrency.setText("S/");
        else
            lblCurrency.setText("$");
        lblBalance.setText(Float.toString(userAccount.getCard().getBalance()));
        int lastFourNumbers = userAccount.getCard().getCardNumber().length() - 4;
        lblCardNumber.setText("***" + userAccount.getCard().getCardNumber().substring(lastFourNumbers));
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menuBar1 = new java.awt.MenuBar();
        menu1 = new java.awt.Menu();
        menu2 = new java.awt.Menu();
        menuBar2 = new java.awt.MenuBar();
        menu3 = new java.awt.Menu();
        menu4 = new java.awt.Menu();
        jPopupMenu1 = new javax.swing.JPopupMenu();
        jPopupMenu2 = new javax.swing.JPopupMenu();
        jPopupMenu3 = new javax.swing.JPopupMenu();
        jPopupMenu4 = new javax.swing.JPopupMenu();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblUserName = new javax.swing.JLabel();
        btnLogOut = new javax.swing.JButton();
        btnDeposit = new javax.swing.JButton();
        btnWithdraw = new javax.swing.JButton();
        btnMovements = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        lblCardNumber = new javax.swing.JLabel();
        lblCurrency = new javax.swing.JLabel();
        lblBalance = new javax.swing.JLabel();
        lblImage = new javax.swing.JLabel();

        menu1.setLabel("File");
        menuBar1.add(menu1);

        menu2.setLabel("Edit");
        menuBar1.add(menu2);

        menu3.setLabel("File");
        menuBar2.add(menu3);

        menu4.setLabel("Edit");
        menuBar2.add(menu4);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Cascadia Code", 1, 24)); // NOI18N
        jLabel4.setForeground(java.awt.Color.green);
        jLabel4.setText("ELITE BANK");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 14, -1, -1));

        jLabel2.setFont(new java.awt.Font("Cascadia Code", 0, 14)); // NOI18N
        jLabel2.setForeground(java.awt.Color.green);
        jLabel2.setText("What would you like to do?");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 229, -1, -1));

        jLabel3.setFont(new java.awt.Font("Cascadia Code", 0, 18)); // NOI18N
        jLabel3.setForeground(java.awt.Color.green);
        jLabel3.setText("Welcome, ");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 64, -1, -1));

        lblUserName.setFont(new java.awt.Font("Cascadia Code", 0, 18)); // NOI18N
        lblUserName.setForeground(java.awt.Color.green);
        lblUserName.setText("name");
        getContentPane().add(lblUserName, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 60, -1, 30));

        btnLogOut.setText("LogOut");
        btnLogOut.setBorderPainted(false);
        btnLogOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogOutActionPerformed(evt);
            }
        });
        getContentPane().add(btnLogOut, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 10, 80, 30));

        btnDeposit.setText("Deposit");
        btnDeposit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDepositActionPerformed(evt);
            }
        });
        getContentPane().add(btnDeposit, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 260, 103, 30));

        btnWithdraw.setText("Withdraw");
        btnWithdraw.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnWithdrawActionPerformed(evt);
            }
        });
        getContentPane().add(btnWithdraw, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 260, 103, 30));

        btnMovements.setText("Movements");
        btnMovements.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMovementsActionPerformed(evt);
            }
        });
        getContentPane().add(btnMovements, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 110, 130, 30));

        jPanel1.setBackground(new java.awt.Color(14, 7, 57));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(41, 43, 45)), "Saving Account", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Cascadia Code", 0, 14), java.awt.Color.green)); // NOI18N

        lblCardNumber.setFont(new java.awt.Font("Cascadia Code", 0, 12)); // NOI18N
        lblCardNumber.setForeground(java.awt.Color.green);
        lblCardNumber.setText("cardNumber");

        lblCurrency.setFont(new java.awt.Font("Cascadia Code", 0, 18)); // NOI18N
        lblCurrency.setForeground(java.awt.Color.green);
        lblCurrency.setText("S/");

        lblBalance.setFont(new java.awt.Font("Cascadia Code", 0, 16)); // NOI18N
        lblBalance.setForeground(java.awt.Color.green);
        lblBalance.setText("Balance");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblCardNumber)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblCurrency)
                        .addGap(2, 2, 2)
                        .addComponent(lblBalance)))
                .addContainerGap(78, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblCurrency)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(lblBalance)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(lblCardNumber)
                .addContainerGap())
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 106, 190, -1));
        getContentPane().add(lblImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 590, 320));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLogOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogOutActionPerformed
        this.setVisible(false);
        frmLogIn login = new frmLogIn();
        login.setVisible(true);
    }//GEN-LAST:event_btnLogOutActionPerformed

    private void btnMovementsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMovementsActionPerformed
        frmMovements movements = new frmMovements();
        movements.userAccount(userAccount);
        this.setVisible(false);
        movements.setVisible(true);
        
    }//GEN-LAST:event_btnMovementsActionPerformed

    private void btnDepositActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDepositActionPerformed
        frmDeposit deposit = new frmDeposit();
        this.setVisible(false);
        deposit.userAccount(userAccount);
        deposit.setVisible(true);
    }//GEN-LAST:event_btnDepositActionPerformed

    private void btnWithdrawActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnWithdrawActionPerformed
        frmWithdraw withdraw = new frmWithdraw();
        this.setVisible(false);
        withdraw.userAccount(userAccount);
        withdraw.setVisible(true);
    }//GEN-LAST:event_btnWithdrawActionPerformed

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
            java.util.logging.Logger.getLogger(frmHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmHome().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDeposit;
    private javax.swing.JButton btnLogOut;
    private javax.swing.JButton btnMovements;
    private javax.swing.JButton btnWithdraw;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JPopupMenu jPopupMenu2;
    private javax.swing.JPopupMenu jPopupMenu3;
    private javax.swing.JPopupMenu jPopupMenu4;
    private javax.swing.JLabel lblBalance;
    private javax.swing.JLabel lblCardNumber;
    private javax.swing.JLabel lblCurrency;
    private javax.swing.JLabel lblImage;
    private javax.swing.JLabel lblUserName;
    private java.awt.Menu menu1;
    private java.awt.Menu menu2;
    private java.awt.Menu menu3;
    private java.awt.Menu menu4;
    private java.awt.MenuBar menuBar1;
    private java.awt.MenuBar menuBar2;
    // End of variables declaration//GEN-END:variables
}
