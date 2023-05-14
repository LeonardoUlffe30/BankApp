
package com.clases;

import java.util.Locale;

public class Retiro {
    private double dineroRetirado;
    private String moneda;
    
    public void Retirar(double dineroRetirado, String moneda, Cuenta cuenta) {
        moneda.toUpperCase();
        if(moneda.equalsIgnoreCase("SOLES")) {
            cuenta.dineroRetiradoSoles(dineroRetirado);
            System.out.println("Ahora tu saldo es: " + cuenta.getDineroCuentaSoles());
        }
        if(moneda.equalsIgnoreCase("DOLARES")) {
            cuenta.dineroRetiradoDolares(dineroRetirado);
            System.out.println("Ahora tu saldo es: " + cuenta.getDineroCuentaDolares());
        }
    }
}
