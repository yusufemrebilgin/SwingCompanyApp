package model;

import java.sql.Date;

public class Purchase {
    
    private int customerId;
    private float totalAmount;   
    private Date purchaseDate;

    public Purchase(int customerId, float totalAmount, Date purchaseDate) {
        this.customerId = customerId;
        this.totalAmount = totalAmount;
        this.purchaseDate = purchaseDate;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public float getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(float totalAmount) {
        this.totalAmount = totalAmount;
    }

    public Date getPurchaseDate() {
        return purchaseDate;
    }

    public void setPurchaseDate(Date purchaseDate) {
        this.purchaseDate = purchaseDate;
    }
    
}