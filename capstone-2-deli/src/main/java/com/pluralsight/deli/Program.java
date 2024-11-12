package com.pluralsight.deli;

import java.util.Scanner;

// create a sanwich
//Sandwhich s = new Sanwhich();

// find out how much it costs
//double price = s.getPrice();

// print it out
public class Program {
    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

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
                    System.out.println("Sorry invalid input. Please enter on of the given options ");


            }
        }
    }
}
