package com.pluralsight.deli;

import java.util.Scanner;

public class Program {
    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {  // Removed the <Order> generic type parameter
        while (true) {
            System.out.println("""
                    
                        =============================
                        🍞 Welcome to OK Sandwiches 🍦
                        =============================
                        Choose an option by letter:
                            N. New Order\s
                            X. Exit \
                    
                    """);
            String selection = input.nextLine().trim().toUpperCase();

            switch (selection) {
                case "N":
                    Order order = new Order();
                    OrderScreen orderScreen = new OrderScreen(order);
                    orderScreen.startOrder(input);
                    break;
                case "X":
                    System.out.println("Goodbye, come again \uD83D\uDE04");
                    return;
                default:
                    System.out.println("Sorry invalid input. Please enter one of the given options ");
            }
        }
    }
}

