package com.pluralsight.deli;

import java.util.ArrayList;
import java.util.List;

public class Sandwich {
    private String sandwich;  // Sandwich type (e.g., "Turkey", "Veggie")
    private double totalPrice; // Price of the sandwich

    // Constructor
    public Sandwich(String sandwich, double totalPrice) {
        this.sandwich = sandwich;
        this.totalPrice = totalPrice;
    }

    // Getter for sandwich type
    public String getType() {
        return sandwich;
    }

    // Getter for sandwich totalPrice
    public double getTotalPrice() {
        return totalPrice;
    }

    @Override
    public String toString() {
        return sandwich + " ($" + totalPrice + ")";
    }
}

