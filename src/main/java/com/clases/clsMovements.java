
package com.clases;

public class clsMovements {
    private String type;
    private String date;
    private float amount;

    public clsMovements(String date, float amount, String type) {
        this.type = type;
        this.date = date;
        this.amount = amount;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
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
