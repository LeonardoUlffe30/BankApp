
package com.clases;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import javax.swing.JOptionPane;

public class clsConnection {
    Connection connection = null;  
    private String url = "jdbc:mysql://localhost/elitebank?serverTimezone=UTC";
    private String user = "root";
    private String password = "";
    private String driver = "com.mysql.cj.jdbc.Driver";
    private PreparedStatement GeneralPS;
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
        String statementSQL = "SELECT dni, name, lastname, users.cardNumber, cards.cvv, cards.expirationDate, "
                + "cards.password, cards.currency FROM users JOIN cards ON users.cardNumber = cards.cardNumber;"; 
        Connection receiver;
        
        receiver = setConnection();
        try {
            PS = receiver.prepareStatement(statementSQL);
            RS = PS.executeQuery();
            Object[] fila = new Object[5];
            while(RS.next()) {
                lstUsers.add(new clsUser(RS.getString(2), RS.getString(3), RS.getString(1),
                RS.getString(4),RS.getString(5),RS.getString(6),RS.getString(7), 
                        RS.getString(8)));
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Cannot retrieve data from the database");
        }
    }
    
    public void pushDataToDB() {
        String statementSQL = "INSERT INTO dni, name, lastname, users.cardNumber, cards.cvv, cards.expirationDate, "
                + "cards.password, cards.currency FROM users JOIN cards ON users.cardNumber = cards.cardNumber;"; 
        Connection receiver;
        
        receiver = setConnection();
//        try {
////            PS = receiver.prepareStatement(statementSQL);
////            RS = PS.executeQuery();
////            Object[] fila = new Object[5];
////            while(RS.next()) {
////                lstUsers.add(new clsUser(RS.getString(2), RS.getString(3), RS.getString(1),
////                RS.getString(4),RS.getString(5),RS.getString(6),RS.getString(7), 
////                        RS.getString(8)));
////            }
//        } catch (SQLException ex) {
//            JOptionPane.showMessageDialog(null, "Cannot retrieve data from the database");
//        }
    }
}
