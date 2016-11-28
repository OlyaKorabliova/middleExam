package com.company;

/**
 * Created by Olia on 28.11.2016.
 */
public enum Validity {
    DAY, $2_DAYS, $5_DAYS, $10_LIFTS, $20_LIFTS, $50_LIFTS, $100_LIFTS, NO_VALIDITY;
    int numOfLifts = 0;

    public String toString() {
        switch (this) {
            case DAY:
                return "Card is valid for 1 day only";
            case $2_DAYS:
                return "Card is valid for 2 days only";
            case $5_DAYS:
                return "Card is valid for 5 days only";
            case $10_LIFTS:
                numOfLifts = 10;
                return "Card is valid for 10 lifts only";
            case $20_LIFTS:
                numOfLifts = 20;
                return "Card is valid for 20 lifts only";
            case $50_LIFTS:
                numOfLifts = 50;
                return "Card is valid for 50 lifts only";
            case $100_LIFTS:
                numOfLifts = 100;
                return "Card is valid for 100 lifts only";
            default:
                return "Card is not valid!";
        }
    }

}
