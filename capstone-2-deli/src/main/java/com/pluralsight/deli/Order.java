package com.pluralsight.deli;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private List<Sandwich> sandwiches;
    private double totalPrice;

    public Order() {
        this.sandwiches = new ArrayList<>();
        this.totalPrice = 0.0;
    }

    public void addSandwich(Sandwich sandwich) {
        sandwiches.add(sandwich);
        totalPrice += sandwich.getPrice();
    }

    public List<Sandwich> getSandwiches() {
        return sandwiches;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    class Sandwich {
        private String name;
        private double price;

        public Sandwich(String name, double price) {
            this.name = name;
            this.price = price;
        }

        public String getName() {
            return name;
        }

        public double getPrice() {
            return price;
        }
    }
}
