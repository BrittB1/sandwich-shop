package com.pluralsight.deli;

import java.util.List;

public class Sandwich {
    private String breadType;
    private List<Topping> toppings;


    // Constructor
    public Sandwich(String breadType, List<Topping> toppings) {
        this.breadType = breadType;

    }


    public String getType() {
        return breadType;
    }


    public double getTotalPrice() {
        return 5; //this is a fake value
    }

    @Override
    public String toString() {
        return breadType + " ($" + getTotalPrice() + ")";
    }

    public void startOrder(){
        System.out.println("Welcome to OK Sub Shop, where our motto is close enough. What can I get you? ");
    }
}



