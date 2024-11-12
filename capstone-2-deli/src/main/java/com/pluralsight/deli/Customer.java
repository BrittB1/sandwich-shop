package com.pluralsight.deli;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    String name;
    int paymentInfo;
    private List<Sandwich> order;

    public Customer(String name) {
        this.name = name;
        this.order = new ArrayList<>(); // Initialize an empty order list
    }

    // Getter for the customer's name
    public String getName() {
        return name;
    }

    // Method to add a sandwich to the order
    public void placeOrder(Sandwich sandwich) {
        order.add();  {
        System.out.println(name + " ordered a " + sandwich.getType());
    }

    // Method to view the current order
    public void viewOrder(Order) {
        System.out.println(name + "'s Order:");
        if (order.isEmpty()) {
            System.out.println("No sandwiches ordered yet.");
        } else {
            for (Sandwich sandwich : order) {
                System.out.println(sandwich);
            }
        }
    }

    // Method to get the total price of the order
    public double getTotalPrice() {
        double total = 0;
        for (Sandwich sandwich : order) {
            total += sandwich.getPrice();
        }
        return total;
    }
}



