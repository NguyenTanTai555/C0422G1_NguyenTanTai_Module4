package com.codegym.model;

public class Product {
    private int productId;
    private String name;
    private double price;
    private String describe;
    private String producer;

    public Product() {
    }

    public Product(int productId, String name, double price, String describe, String producer) {
        this.productId = productId;
        this.name = name;
        this.price = price;
        this.describe = describe;
        this.producer = producer;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }
}
