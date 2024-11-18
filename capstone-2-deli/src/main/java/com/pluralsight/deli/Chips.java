package com.pluralsight.deli;

import fixins.ChipChoice;

public class Chips extends OrderItem {
    private final ChipChoice flavor;

    public Chips(ChipChoice flavor) {
        this.flavor = flavor;
    }

    public ChipChoice getFlavor() {
        return flavor;
    }

    @Override
    public double getPrice() {
        return 1.50;
    }
}
