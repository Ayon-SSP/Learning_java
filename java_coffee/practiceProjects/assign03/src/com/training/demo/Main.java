package com.training.demo;

import com.training.demo.model.Product;
public class Main {
    // Main.java -> Create object of Product Class where Product (id,pid,productName,unitPrice)
    public static void main(String[] args) {
        Product product1 = new Product("P001", "Laptop", 50000);
        Product product2 = new Product(2, "P002", "Mobile", 20000);
        Product product3 = new Product("P003", "Tablet", 15000);
        Product product4 = new Product("P004", "Desktop", 40000);
        Product product5 = new Product(5, "P005", "Printer", 10000);

        // display using toString and for loop
        Product[] products = {product1, product2, product3, product4, product5};
        for (Product product : products) {
            System.out.println(product);
        }
    }
}
