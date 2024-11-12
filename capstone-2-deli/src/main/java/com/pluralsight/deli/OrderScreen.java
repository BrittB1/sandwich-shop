package com.pluralsight.deli;


import java.util.Scanner;

public class OrderScreen {

    private final Order order;

    public OrderScreen(Order order) {
        this.order = order;

    }

    public void startOrder(Scanner input) {

        while(true) {
            System.out.println("""
                    
                        =============================
                        🍞 Welcome to OK Sandwiches 🍦
                        =============================
                        Choose an option by letter:
                            A. Add Sandwich
                            D. Add Drink
                            C. Add Chips
                            T. Checkout
                            X. Cancel Order
                    """);
            // create switch case and call add sandwich method
            String selection = input.nextLine().trim().toUpperCase();

            switch (selection) {

                case "A":
// todo: create a sandwich and add it too the order
                    break;
                case "D":
                    // todo: create a drink and add it to the order
                    break;

                case "C":
                    // todo: create chips and add it to the order
                    break;

                case "T":
                    // todo: create checkout method that totals order + creates receipt
                    break;
                case "X":
                    // exits back to main menu
                    return;

                default:


            }

        }
}
}
