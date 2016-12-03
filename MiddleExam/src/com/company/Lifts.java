package com.company;

/**
 * Created by Olia on 01.12.2016.
 */
public enum Lifts {

    $10LIFTS(10), $20LIFTS(20), $50LIFTS(50), $100LIFTS(100), NO_LIMITATIONS();
    protected int amountOfLifts;

    Lifts(int lifts) {
        amountOfLifts = lifts;
    }
    Lifts() { amountOfLifts = 1000000000; }

    int getAmountOfLifts() {
        return amountOfLifts;
    }

}
