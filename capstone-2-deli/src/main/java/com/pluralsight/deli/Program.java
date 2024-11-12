package com.pluralsight.deli;

import java.util.Scanner;

public class Program {
    public static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {

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

            case "X":
                System.out.println("See ya later!");

                return;

            default:
                System.out.println("Sorry invalid input. Please enter on of the given options ");


        }

    }
}
