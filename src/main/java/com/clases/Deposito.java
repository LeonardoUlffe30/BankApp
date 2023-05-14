
package com.clases;

import java.util.Locale;

//Deposit Class
public class Deposito {
    private double dineroDeposito;
    private String moneda;

    public Deposito() { //Default Constructor
    }

    
    public void Depositar(double dineroDeposito, String moneda, Cuenta cuenta) {
        moneda.toUpperCase();
        if(moneda.equalsIgnoreCase("SOLES")) {
            cuenta.dineroDepositadoSoles(dineroDeposito);
            System.out.println("Ahora tu saldo es: " + cuenta.getDineroCuentaSoles());
        }
        if(moneda.equalsIgnoreCase("DOLARES")) {
            cuenta.dineroDepositadoDolares(dineroDeposito);
            System.out.println("Ahora tu saldo es: " + cuenta.getDineroCuentaDolares());
        } 
    }
}
