package com.pluralsight.deli;

import fixins.*;
import java.util.Scanner;

public class OrderScreen {
    private final Order order;
    Scanner userInput = null;

    public OrderScreen(Order order) {
        this.order = order;
    }

    public void startOrder(Scanner input) {
        userInput = input;
        while (true) {
            System.out.println("""
                    
                    =============================
                    🍞 Welcome to OK Sandwiches 🍦
                    =============================
                    Choose an option by letter:
                        A. Add Sandwich
                        D. Add Drink
                        C. Add Chips
                        O. Checkout
                        X. Cancel Order
                    """);
            String selection = input.nextLine().trim().toUpperCase();

            switch (selection) {
                case "A":
                    RegularBread type = askUserForBreadType();
                    SandwichSize size = askUserForSize();
                    RegularToppings toppings = askUserForToppings();
                    Cheeses slice = askUserForCheeseChoice();
                    Sandwich sandwich = new Sandwich(size, type, toppings, slice);
                    order.addItemToOrder(sandwich);
                    System.out.println("🥪 Sandwich added to your order!");
                    break;

                case "D":
                    Beverages flavors = askUserForDrinkFlavor();
                    SodaSize cup = askUserForDrinkSize();
                    Drink drink = new Drink(cup, flavors);
                    order.addItemToOrder(drink);
                    System.out.println("🥤 Drink added to your order!");
                    break;

                case "C":
                    ChipChoice flavor = askUserForChipChoice();
                    Chips chips = new Chips(flavor);
                    order.addItemToOrder(chips);
                    System.out.println("🍪 Chips added to your order!");
                    break;

                case "O":
                    if (order.getPrice() == 0) {
                        System.out.println("\uD83D\uDE31 No order to checkout with! Please place an order and try again");
                    } else {
                        order.displayOrderSummary();
                        return;
                    }
                    break;

                case "X":
                    System.out.println("Order cancelled!");
                    return;

                default:
                    System.out.println("Invalid selection. Please try again.");
                    break;
            }
        }
    }

    private Cheeses askUserForCheeseChoice() {
        System.out.println("\uD83C\uDF4D What kind of cheese would you like? ");
        Cheeses[] slices = Cheeses.values();

        int i = 1;
        for (Cheeses slice : slices) {
            System.out.printf("%d. %s\n", i++, slice);
        }
        String inputString = userInput.nextLine();
        Integer choice = Integer.parseInt(inputString);

        return slices[choice - 1];
    }

    private Beverages askUserForDrinkFlavor() {
        System.out.println("\uD83C\uDF4D What kind of drink would you like? ");
        Beverages[] flavors = Beverages.values();

        int i = 1;
        for (Beverages flavor : flavors) {
            System.out.printf("%d. %s\n", i++, flavor);
        }
        String inputString = userInput.nextLine();
        Integer choice = Integer.parseInt(inputString);

        return flavors[choice - 1];
    }

    private SodaSize askUserForDrinkSize() {
        System.out.println("\uD83D\uDCCF What size would you like for your drink?");
        SodaSize[] cups = SodaSize.values();

        int i = 1;
        for (SodaSize cup : cups) {
            System.out.printf("%d. %s\n", i++, cup);
        }
        String inputString = userInput.nextLine();
        Integer choice = Integer.parseInt(inputString);

        return cups[choice - 1];
    }

    private RegularToppings askUserForToppings() {
        System.out.println("\uD83C\uDF45 What toppings would you like?");
        RegularToppings[] toppings = RegularToppings.values();

        int i = 1;
        for (RegularToppings topping : toppings) {
            System.out.printf("%d. %s\n", i++, topping);
        }
        String inputString = userInput.nextLine();
        Integer choice = Integer.parseInt(inputString);

        return toppings[choice - 1];
    }

    private RegularBread askUserForBreadType() {
        System.out.println("\uD83C\uDF5E What type of bread do you want?");
        RegularBread[] types = RegularBread.values();

        int i = 1;
        for (RegularBread type : types) {
            System.out.printf("%d. %s\n", i++, type);
        }
        String inputString = userInput.nextLine();
        Integer choice = Integer.parseInt(inputString);

        return types[choice - 1];
    }

    private SandwichSize askUserForSize() {
        System.out.println("\uD83D\uDCCF What size do you want?");
        SandwichSize[] sizes = SandwichSize.values();

        int i = 1;
        for (SandwichSize size : sizes) {
            System.out.printf("%d. %s\n", i++, size);
        }
        String inputString = userInput.nextLine();
        Integer choice = Integer.parseInt(inputString);

        return sizes[choice - 1];
    }

    public ChipChoice askUserForChipChoice() {
        System.out.println("✨ What flavor of chips would you like?");
        ChipChoice[] bags = ChipChoice.values();

        int i = 1;
        for (ChipChoice bag : bags) {
            System.out.printf("%d. %s\n", i++, bag);
        }
        String inputString = userInput.nextLine();
        Integer choice = Integer.parseInt(inputString);

        return bags[choice - 1];
    }
}