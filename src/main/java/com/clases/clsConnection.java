
package com.clases;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class clsConnection {
    Connection connection = null;  
    private String url = "jdbc:mysql://localhost/elitebank?serverTimezone=UTC";
    private String user = "root";
    private String password = "";
    private String driver = "com.mysql.cj.jdbc.Driver";
    private PreparedStatement PS; 
    private ResultSet RS;
    
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
            //JOptionPane.showMessageDialog(null, "Error, connection failed: " + ex.toString());
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
            Object[] fila = new Object[10];
            while(RS.next()) {
                lstUsers.add(new clsUser(RS.getString(2), RS.getString(3), RS.getString(1),
                RS.getString(4),RS.getString(5),RS.getString(6),RS.getString(7), 
                        RS.getString(8), RS.getFloat(9)));
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Cannot retrieve data from the database");
        }
    }
    
    public void addDataToDB(clsUser newUser) {
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
            PS.setFloat(5, newUser.getCard().getBalance());
            result1 = PS.executeUpdate();
            PS = receiver.prepareStatement(statementSQL2);
            PS.setString(1, newUser.getDni());
            PS.setString(2, newUser.getName());
            PS.setString(3, newUser.getLastName());
            PS.setString(4, newUser.getCard().getCardNumber());
            result2 = PS.executeUpdate();
            if(result1 > 0 && result2 > 0)
                JOptionPane.showMessageDialog(null, "Succesful registration!");
            receiver.close();
            PS = receiver.prepareStatement(statementSQL2);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
}
