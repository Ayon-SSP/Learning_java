package com.training.demo.model;

public class Product {
    // Main.java -> Create object of Product Class where Product (id,pid,productName,unitPrice)
    private int id;
    private String pid;
    private String productName;
    private double unitPrice;
    private static int counter;

    {
        System.out.println("non static init block");
        this.id=++counter;
        System.out.println("New account number:"+this.id+" for "+this.productName);
    }
    static {
        System.out.println("static init block");
        counter=0;
    }

    public Product() {}
    public Product(String pid, String productName, double unitPrice) {
        this.pid = pid;
        this.productName = productName;
        this.unitPrice = unitPrice;
    }
    public Product(int id, String pid, String productName, double unitPrice) {
        this.id = id;
        this.pid = pid;
        this.productName = productName;
        this.unitPrice = unitPrice;
    }
    public int getId() {
        return id;
    }
    public String getPid() {
        return pid;
    }
    public String getProductName() {
        return productName;
    }
    public double getUnitPrice() {
        return unitPrice;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setPid(String pid) {
        this.pid = pid;
    }
    public void setProductName(String productName) {
        this.productName = productName;
    }
    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }
    @Override
    public String toString() {
        return "Product [id=" + id + ", pid=" + pid + ", productName=" + productName + ", unitPrice=" + unitPrice + "]";
    }

}
