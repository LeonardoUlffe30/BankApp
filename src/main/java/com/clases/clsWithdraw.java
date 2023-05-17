
package com.clases;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class clsWithdraw {
    private String date;
    private float amount;
    
    public clsWithdraw(float amount) {
        this.amount = amount;
        Date aux = new Date();
        SimpleDateFormat formatDate = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        date = formatDate.format(aux);
    }
    
    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }
}
