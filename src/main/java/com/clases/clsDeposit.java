
package com.clases;

//Deposit Class

import java.text.SimpleDateFormat;
import java.util.Date;

public class clsDeposit {
    private float amount;
    private String currency;
    private String date;

    public clsDeposit(float amount) {
        this.amount = amount;
        Date aux = new Date();
        SimpleDateFormat formatDate = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        date = formatDate.format(aux);
    }
    
//    public void Depositar(double dineroDeposito, String moneda, clsCard cuenta) {
//        moneda.toUpperCase();
//        if(moneda.equalsIgnoreCase("SOLES")) {
//            cuenta.dineroDepositadoSoles(dineroDeposito);
//            System.out.println("Ahora tu saldo es: " + cuenta.getDineroCuentaSoles());
//        }
//        if(moneda.equalsIgnoreCase("DOLARES")) {
//            cuenta.dineroDepositadoDolares(dineroDeposito);
//            System.out.println("Ahora tu saldo es: " + cuenta.getDineroCuentaDolares());
//        } 
//    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    public String getDate() {
        return date;
    }

}
