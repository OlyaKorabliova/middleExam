package com.company;

/**
 * Created by Olia on 01.12.2016.
 */
public class SkiPassSeason extends SkiPass {
    protected SkiPassSeason() {
        this.days = Days.SEASON;
        this.lifts = Lifts.NO_LIMITATIONS;
    }

    public String toString() {
        return "Days: " + Integer.toString(days.amountOfDays) + "; Lifts: no limitations";
    }
}
