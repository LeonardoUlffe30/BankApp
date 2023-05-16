
package com.clases;

import java.util.ArrayList;
import java.util.List;

public class clsCard {

    private String cardNumber;
    private String cvv;
    private String expirationDate;
    private String currency;
    private String password;
    private float balance;
    private List<clsMovements> lstMovements;


    public clsCard(String cardNumber, String cvv, String expirationDate, String password, String currency) {
        this.cardNumber = cardNumber;
        this.cvv = cvv;
        this.expirationDate = expirationDate;
        this.password = password;
        this.currency = currency;
        this.balance = 0;
        lstMovements = new ArrayList<clsMovements>();
    }
    
    public void movements(Object object) {
        if(object instanceof clsDeposit) {
            clsDeposit deposit = (clsDeposit)object;
            lstMovements.add(new clsMovements(deposit.getDate(),deposit.getAmount(),"Deposit"));
        }
        if(object instanceof clsWithdraw) {
            clsWithdraw withdraw = (clsWithdraw)object;
            lstMovements.add(new clsMovements(withdraw.getDate(),withdraw.getAmount(),"Withdraw"));
        }
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getCvv() {
        return cvv;
    }

    public void setCvv(String cvv) {
        this.cvv = cvv;
    }

    public String getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
    }
    
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        if(balance < 0)
            this.balance -= balance;
        else
            this.balance +=balance;
    }
    

}
