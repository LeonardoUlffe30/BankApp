
package com.clases;

import java.util.List;

public class clsUser {
    private String name;
    private String lastName;
    private String dni;
    private clsCard card;
    private clsDeposit deposit;
    private clsWithdraw withdraw;

    public clsUser(String name, String lastName, String dni, String cardNumber, String cvv, 
            String expirationDate, String password, String currency, float balance) {
        this.name = name;
        this.lastName = lastName;
        this.dni = dni;
        card = new clsCard(cardNumber, cvv, expirationDate, password, currency, balance);
    }

    public void deposit(float amount) {
        deposit = new clsDeposit(amount);
        card.setBalance(amount);
        card.movements(deposit);
    }
    
    public void withdraw(float amount) {
        withdraw = new clsWithdraw(amount);
        card.setBalance(amount);
        card.movements(withdraw);
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }
    
    public clsCard getCard() {
        return card;
    }
    
    public clsDeposit getDeposit() {
        return deposit;
    }
    
    public clsWithdraw getWithdraw() {
        return withdraw;
    }
    
}
