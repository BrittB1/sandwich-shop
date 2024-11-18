package com.pluralsight.deli;

import fixins.Cheeses;
import fixins.RegularBread;
import fixins.RegularToppings;
import fixins.SandwichSize;

import java.util.ArrayList;

public class Sandwich extends OrderItem {
    private final SandwichSize size;
    private String breadType;
    private ArrayList<String> toppings;
    private ArrayList<String> meats;
    private ArrayList<String> cheeses;
    private boolean toasted;

    public Sandwich(SandwichSize size, RegularBread type, RegularToppings toppings, Cheeses slice) {
        this.size = size;
        this.breadType = type.toString();
        this.toppings = new ArrayList<>();
        this.meats = new ArrayList<>();
        this.cheeses = new ArrayList<>();
        this.toasted = false;
    }

    @Override
    public double getPrice() {
        double total = 0;


        switch (size) {
            case SMALL:
                total += 5.50;
                break;
            case MEDIUM:
                total += 7.00;
                break;
            case LARGE:
                total += 8.50;
                break;
            default:
                throw new IllegalStateException("Sorry! We don't have that size,please try again");
        }

        if (!meats.isEmpty()) {
            total += 1.00;

            if (meats.size() > 1) {
                total += (meats.size() - 1) * 0.50;
            }
        }

        if (!cheeses.isEmpty()) {
            total += 1.00;

            if (cheeses.size() > 1) {
                total += (cheeses.size() - 1) * 0.75;
            }
        }
        return total;
    }
}