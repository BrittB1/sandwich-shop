package com.pluralsight.deli;


import java.io.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ReceiptPrinter {
    public void printReceipt(Order order, String filePath) {
        String dateTime = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath, true))) {
            writer.write("=================================\n");
            writer.write("           OK Sandwiches          \n");
            writer.write("=================================\n");
            writer.write("Date/Time: " + dateTime + "\n\n");

            writer.write("Items:\n");
            writer.write("---------------------------------\n");

            for (OrderItem item : order.items) {
                if (item instanceof Sandwich sandwich) {
                    writer.write(String.format("SANDWICH:%n"));
                    writer.write(String.format("  Size: %s%n", sandwich.getSize()));
                    writer.write(String.format("  Bread: %s%n", sandwich.getBread()));
                    writer.write(String.format("  Cheese: %s%n", sandwich.getCheese()));
                    writer.write(String.format("  Toppings: %s%n", sandwich.getToppings()));
                    writer.write(String.format("  Price: $%.2f%n", sandwich.getPrice()));
                } else if (item instanceof Drink drink) {
                    writer.write(String.format("DRINK:%n"));
                    writer.write(String.format("  Flavor: %s%n", drink.getFlavor()));
                    writer.write(String.format("  Size: %s%n", drink.getSize()));
                    writer.write(String.format("  Price: $%.2f%n", drink.getPrice()));
                } else if (item instanceof Chips chips) {
                    writer.write(String.format("CHIPS:%n"));
                    writer.write(String.format("  Flavor: %s%n", chips.getFlavor()));
                    writer.write(String.format("  Price: $%.2f%n", chips.getPrice()));
                }
                writer.write("---------------------------------\n");
            }

            writer.write(String.format("Total: $%.2f%n", order.getPrice()));
            writer.write("=================================\n\n");


            writer.flush();
            System.out.println("Receipt saved to: " + filePath);

        } catch (IOException e) {
            System.out.println("Error saving receipt: " + e.getMessage());
        }
    }
}