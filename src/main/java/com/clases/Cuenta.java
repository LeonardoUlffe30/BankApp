package com.clases;

public class Cuenta {

    private double dineroCuentaSoles;
    private double dineroCuentaDolares;

    public Cuenta() {
        this.dineroCuentaSoles = 0;
        this.dineroCuentaDolares = 0;
    }

    public void MostrarDineroCuentaSoles() {
        System.out.printf("El saldo de tu cuenta es: ",dineroCuentaSoles);
    }
    
    public void MostrarDineroCuentaDolares() {
        System.out.printf("El saldo de tu cuenta es: ",dineroCuentaDolares);
    }
    
    public double getDineroCuentaSoles() {
        return dineroCuentaSoles;
    }

    public void setDineroCuentaSoles(double dineroCuentaSoles) {
        this.dineroCuentaSoles = dineroCuentaSoles;
    }
    
    public double getDineroCuentaDolares() {
        return dineroCuentaDolares;
    }

    public void setDineroCuentaDolares(double dineroCuentaDolares) {
        this.dineroCuentaDolares = dineroCuentaDolares;
    }
    
    public double dineroDepositadoSoles(double dineroDeposito) {
        dineroCuentaSoles = dineroCuentaSoles + dineroDeposito; 
        return dineroCuentaSoles;
    }
    
    public double dineroDepositadoDolares(double dineroDeposito) {
        return dineroCuentaDolares += dineroDeposito;
    }
    
    public double dineroRetiradoSoles(double dineroRetirado) {
        return dineroCuentaSoles -= dineroRetirado;
    }
    
    public double dineroRetiradoDolares(double dineroRetirado) {
        return dineroCuentaDolares -= dineroRetirado;
    }

}
