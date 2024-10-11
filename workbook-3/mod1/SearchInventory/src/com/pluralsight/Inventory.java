package com.pluralsight;

public class Inventory {
    String productId;
    String product;
    double price;


    public Inventory(String productId, String product, double price) {
        this.productId = productId;
        this.product = product;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }
}