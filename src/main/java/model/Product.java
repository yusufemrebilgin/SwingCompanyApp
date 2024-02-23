package model;

public class Product {
    
    private int productCode;
    private String productName;
    private String manufacturer;
    private int quantityInStock;
    private float buyPrice;

    public Product(String productName, String manufacturer, int quantityInStock, float buyPrice) {
        this(0, productName, manufacturer, quantityInStock, buyPrice);
    }
    
    public Product(int productCode, String productName, String manufacturer, int quantityInStock, float buyPrice) {
        this.productCode = productCode;
        this.productName = productName;
        this.manufacturer = manufacturer;
        this.quantityInStock = quantityInStock;
        this.buyPrice = buyPrice;
    }

    public int getProductCode() {
        return productCode;
    }

    public void setProductCode(int productCode) {
        this.productCode = productCode;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getQuantityInStock() {
        return quantityInStock;
    }

    public void setQuantityInStock(int quantityInStock) {
        this.quantityInStock = quantityInStock;
    }

    public float getBuyPrice() {
        return buyPrice;
    }

    public void setBuyPrice(float buyPrice) {
        this.buyPrice = buyPrice;
    }
    
}