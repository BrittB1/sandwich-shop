package com.pluralsight.deli;

import java.util.ArrayList;

public class Order implements Prices {
    ArrayList<OrderItem> items = new ArrayList<>();
    private double total = 0.0;

    public void addItemToOrder(OrderItem item) {
        items.add(item);
        calculateTotal();
    }

    private void calculateTotal() {
        total = 0.0;
        for (OrderItem item : items) {
            total += item.getPrice();
        }
    }

    @Override
    public double getPrice() {
        return total;
    }

    public void displayOrderSummary() {
        System.out.println("\n====================================");
        System.out.println("           🧾 ORDER SUMMARY");
        System.out.println("====================================");

        for (OrderItem item : items) {
            if (item instanceof Sandwich sandwich) {
                System.out.println("\n🥪 SANDWICH");
                System.out.printf("   Size: %s\n", sandwich.getSize());
                System.out.printf("   Bread: %s\n", sandwich.getBread());
                System.out.printf("   Cheese: %s\n", sandwich.getCheese());
                System.out.printf("   Toppings: %s\n", sandwich.getToppings());
            } else if (item instanceof Drink drink) {
                System.out.println("\n🥤 DRINK");
                System.out.printf("   Flavor: %s\n", drink.getFlavor());
                System.out.printf("   Size: %s\n", drink.getSize());
            } else if (item instanceof Chips chips) {
                System.out.println("\n🍪 SIDES");
                System.out.printf("   Chips: %s\n", chips.getFlavor());
            }
        }

        System.out.println("\n====================================");
        System.out.printf("💰 TOTAL: $%.2f\n", getPrice());
        System.out.println("====================================\n");
    }
}