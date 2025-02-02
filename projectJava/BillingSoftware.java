package com.arthy.projectJava;

import java.util.ArrayList;
import java.util.Scanner;

class Product {
    private String name;
    private double price;
    private int quantity;

    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return name + "\t$" + price + "\t" + quantity;
    }
}

public class BillingSoftware {
    private ArrayList<Product> cart = new ArrayList<>();

    public void addToCart(Product product) {
        cart.add(product);
    }

    public void displayCart() {
        System.out.println("Product\tPrice\tQuantity");
        for (Product product : cart) {
            System.out.println(product);
        }
    }

    public double calculateTotal() {
        double total = 0;
        for (Product product : cart) {
            total += product.getPrice() * product.getQuantity();
        }
        return total;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BillingSoftware billingSoftware = new BillingSoftware();

        while (true) {
            System.out.println("1. Add Product to Cart");
            System.out.println("2. Display Cart");
            System.out.println("3. Calculate Total");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter product name: ");
                    String name = scanner.next();
                    System.out.print("Enter product price: ");
                    double price = scanner.nextDouble();
                    System.out.print("Enter product quantity: ");
                    int quantity = scanner.nextInt();
                    Product product = new Product(name, price, quantity);
                    billingSoftware.addToCart(product);
                    break;
                case 2:
                    billingSoftware.displayCart();
                    break;
                case 3:
                    double total = billingSoftware.calculateTotal();
                    System.out.println("Total: $" + total);
                    break;
                case 4:
                    System.out.println("Thank you for using the billing software!");
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
