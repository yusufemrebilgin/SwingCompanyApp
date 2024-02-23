package model;

import java.sql.Date;

public class Order {
    
    private int orderId;
    private Date orderDate;
    private Date estimatedDate;
    private Date shippedDate;
    private String status;
    private int customerId;

    public Order(Date orderDate, Date estimatedDate, Date shippedDate, String status, int customerId) {
        this(0, orderDate, estimatedDate, shippedDate, status, customerId);
    }
    
    public Order(int orderId, Date orderDate, Date estimatedDate, Date shippedDate, String status, int customerId) {
        this.orderId = orderId;
        this.orderDate = orderDate;
        this.estimatedDate = estimatedDate;
        this.shippedDate = shippedDate;
        this.status = status;
        this.customerId = customerId;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public Date getEstimatedDate() {
        return estimatedDate;
    }

    public void setEstimatedDate(Date estimatedDate) {
        this.estimatedDate = estimatedDate;
    }

    public Date getShippedDate() {
        return shippedDate;
    }

    public void setShippedDate(Date shippedDate) {
        this.shippedDate = shippedDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }
    
}