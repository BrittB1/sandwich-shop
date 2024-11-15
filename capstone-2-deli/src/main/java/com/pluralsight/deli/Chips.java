package com.pluralsight.deli;

import fixins.ChipChoice;

public class Chips extends OrderItem {  // Changed extends to implements
    private final ChipChoice flavor;      // Changed String to ChipChoice

    public Chips(ChipChoice flavor) {
        this.flavor = flavor;
    }

    public ChipChoice getFlavor() {       // Changed return type to ChipChoice
        return flavor;
    }

    @Override
    public double getPrice() {
        return 1.50;
    }
}
