
package com.clases;

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
