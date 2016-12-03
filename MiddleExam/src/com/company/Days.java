package com.company;

/**
 * Created by Olia on 01.12.2016.
 */
public enum Days {

    $1DAY(1), $2DAYS(2), $5DAYS(5), SEASON(93);
    protected int amountOfDays;

    Days(int DAYS) {
        amountOfDays = DAYS;
    }

    int getAmountOfDays() {
        return amountOfDays;
    }
}
