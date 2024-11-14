package com.pluralsight.deli;

import java.util.Arrays;
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
            // create switch case and call add sandwich method
            String selection = input.nextLine().trim().toUpperCase();

            switch (selection) {

                case "A":
// todo: create a sandwich and add it too the order
                    RegularBread type = askUserForBreadType();
                    SandwichSize size = askUserForSize();
                    RegularToppings toppings = askUserForToppings();
                    Sandwich s = new Sandwich(size, type, toppings);

                    //getting topping and cheese from user and meat


                    // order.addItemToOrder();

                    break;

                case "D":
                    Beverages flavors = askUserForDrinkFlavor();
                    SodaSize cup = askUserForDrinkSize();

                    Drink drink = new Drink(cup, flavors);

                    break;

                case "C":

                    //ask user for chip flavor
                    ChipChoice bag = askUserForChipChoice();
                    //order.addItemToOrder(bag);
                    break;

                case "O":
                    // todo: create checkout method that totals order + creates receipt
                    if (order.getPrice() == 0) {
                        System.out.println("\uD83D\uDE31 No order to checkout with! Please place an order and try again");
                    } else {
                        // Calculate total and generate receipt
                        double total = order.getPrice();
                        System.out.println("\n=== Receipt ===");
                        System.out.println("Order Total: $" + String.format("%.2f", total));
                    }
                    break;

                case "X":
                    // exits back to main menu
                    return;

                default:
            }
        }
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
        for (SodaSize cup : cups) ;
        {
            System.out.printf("%d. %s\n", i++, Arrays.toString(cups));
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
