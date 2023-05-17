
package com.clases;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class clsConnection {
    Connection connection = null;  
    private String url = "jdbc:mysql://localhost/elitebank?serverTimezone=UTC";
    private String user = "root";
    private String password = "";
    private String driver = "com.mysql.cj.jdbc.Driver";
    private PreparedStatement PS; 
    private ResultSet RS;
    private DefaultTableModel table;
    
    public clsConnection() {
    }
    
    public Connection setConnection() {        
        Connection connection = null;
        try {
            Class.forName(driver);
            connection = DriverManager.getConnection(url, user, password);
            System.out.println("Successful connection");
            //JOptionPane.showMessageDialog(null, "Connection sucessfully");
        } catch(ClassNotFoundException | SQLException ex) {
            ex.printStackTrace();
            System.out.println("Error connection");
        }
        return connection;
    }
    
    public void retrieveDataFromDB(List<clsUser> lstUsers) {
        Connection receiver = null;
        String statementSQL = "SELECT dni, name, lastname, users.cardNumber, cards.cvv, cards.expirationDate, "
                + "cards.password, cards.currency, cards.balance FROM users JOIN cards ON users.cardNumber = cards.cardNumber;"; 
        
        try {
            receiver = setConnection();
            PS = receiver.prepareStatement(statementSQL);
            RS = PS.executeQuery();
            while(RS.next()) {
                lstUsers.add(new clsUser(RS.getString(2), RS.getString(3), RS.getString(1),
                RS.getString(4),RS.getString(5),RS.getString(6),RS.getString(7), 
                        RS.getString(8), RS.getFloat(9)));
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Cannot retrieve data from the database");
        }
    }
    
    private DefaultTableModel setTitles() {
        table = new DefaultTableModel();
        table.addColumn("Date");
        table.addColumn("Card Number");
        table.addColumn("Amount");
        table.addColumn("Currency");
        return table;
    }
    
    public DefaultTableModel retrieveUserMovementsFromDB(clsUser userAccount) {
        String statementSQL = "SELECT * FROM Movements WHERE cardNumber=?";
        Connection receiver = null;
        try {
            setTitles();
            receiver = setConnection();
            PS = receiver.prepareStatement(statementSQL);
            PS.setString(1, userAccount.getCard().getCardNumber());
            RS = PS.executeQuery();
            Object[] row = new Object[4];
            while(RS.next()) {
                row[0]=RS.getString(1);
                row[1]=RS.getString(2);
                row[2]=RS.getString(3);
                row[3]=RS.getString(4);
                table.addRow(row);
            } 
        } catch(SQLException ex) {
            ex.printStackTrace();
        }
        return table;
    }
    
    public void addDataRegistrationToDB(clsUser newUser) {
        int result1 = 0;
        int result2 = 0;
        Connection receiver = null;
        try {
            receiver = setConnection();
            
            String statementSQL1 =  "INSERT INTO cards VALUES (?,?,?,?,?,?)";
            String statementSQL2 = "INSERT INTO users VALUES (?,?,?,?)";
            
            PS = receiver.prepareStatement(statementSQL1);
            PS.setString(1, newUser.getCard().getCardNumber());
            PS.setString(2, newUser.getCard().getCvv());
            PS.setString(3, newUser.getCard().getExpirationDate());
            PS.setString(4, newUser.getCard().getPassword());
            PS.setString(5, newUser.getCard().getCurrency());
            PS.setFloat(6, newUser.getCard().getBalance());
            result1 = PS.executeUpdate();
            PS = receiver.prepareStatement(statementSQL2);
            PS.setString(1, newUser.getDni());
            PS.setString(2, newUser.getName());
            PS.setString(3, newUser.getLastName());
            PS.setString(4, newUser.getCard().getCardNumber());
            result2 = PS.executeUpdate();
            receiver.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    
    public void addUserMovementToDB(clsUser user, String type) {
        int result = 0;
        String typeMovement = type;
        Connection receiver = null;
        try {
            receiver = setConnection();
            
            String statementSQL1 =  "INSERT INTO movements VALUES (?,?,?,?)";
            PS = receiver.prepareStatement(statementSQL1);
            
            if(typeMovement.equalsIgnoreCase("Deposit")) {
                PS.setString(1, user.getDeposit().getDate());
                PS.setString(2, user.getCard().getCardNumber());
                PS.setString(3, Float.toString(user.getDeposit().getAmount()));
                PS.setString(4, "Deposit");
            } else {
                PS.setString(1, user.getWithdraw().getDate());
                PS.setString(2, user.getCard().getCardNumber());
                PS.setString(3, Float.toString(user.getWithdraw().getAmount()));
                PS.setString(4, "Withdraw");
            }
            result = PS.executeUpdate();
            receiver.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    
    public void ModifyDataInDB(clsUser newUser) {
        int result = 0;
        Connection receiver = null;
        try {
            receiver = setConnection();
            
            String statementSQL1 =  "UPDATE cards SET balance=? WHERE cardNumber=?";
            
            PS = receiver.prepareStatement(statementSQL1);
            PS.setString(1, Float.toString(newUser.getCard().getBalance()));
            PS.setString(2, newUser.getCard().getCardNumber());
            result = PS.executeUpdate();
            receiver.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Failed registration",null, JOptionPane.ERROR_MESSAGE); 
        }
    }
    
    
}
