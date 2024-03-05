package com.training.demo;

import com.training.demo.model.Product;
public class Main {
    // Main.java -> Create object of Product Class where Product (id,pid,productName,unitPrice)
    public static void main(String[] args) {
        // Product product1 = new Product("P001", "Laptop", 50000);
        // Product product2 = new Product(2, "P002", "Mobile", 20000);
        // Product product3 = new Product("P003", "Tablet", 15000);
        // Product product4 = new Product("P004", "Desktop", 40000);
        // Product product5 = new Product(5, "P005", "Printer", 10000);

        // // display using toString and for loop
        // Product[] products = {product1, product2, product3, product4, product5};
        // for (Product product : products) {
        //     System.out.println(product);
        // }

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter no. of Products to be created: ");
        int noOfProducts = scanner.nextInt();
        Product[] products = new Product[noOfProducts];

        for( int i = 0; i < noOfProducts; i++) {
            System.out.println("Enter Product Id: ");
            String pid = scanner.next();
            System.out.println("Enter Product Name: ");
            String productName = scanner.next();
            System.out.println("Enter Unit Price: ");
            double unitPrice = scanner.nextDouble();
            products[i] = new Product(pid, productName, unitPrice);
        }

        System.out.println("Products created are: ");
        for (Product product : products) {
            System.out.println(product);
        }

        // update product details input product id
        boolean iterate = true;
        while (iterate) {
            System.out.println("Enter Product Id to be updated: ");
            String pid = scanner.next();
            for (Product product : products) {
                if (product.getPid().equals(pid)) {
                    System.out.println("Enter new Product Name: ");
                    String productName = scanner.next();
                    System.out.println("Enter new Unit Price: ");
                    double unitPrice = scanner.nextDouble();
                    product.setProductName(productName);
                    product.setUnitPrice(unitPrice);
                    System.out.println("Product updated successfully: ");
                    System.out.println(product);
                    iterate = false;
                    break;
                }
            }
            if (iterate) {
                System.out.println("Product Id not found. Please enter valid Product Id.");
            }
        }

        // display product details input product id
        iterate = true;
        while (iterate) {
            System.out.println("Enter Product Id to display details: ");
            String pid = scanner.next();
            for (Product product : products) {
                if (product.getPid().equals(pid)) {
                    System.out.println("Product details: ");
                    System.out.println(product);
                    iterate = false;
                    break;
                }
            }
            if (iterate) {
                System.out.println("Product Id not found. Please enter valid Product Id.");
            }
        }
        scanner.close();

    }
}
