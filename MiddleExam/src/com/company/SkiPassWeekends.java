package com.company;

/**
 * Created by Olia on 01.12.2016.
 */
public class SkiPassWeekends extends SkiPass {
    protected SkiPassWeekends(Days days) {
        assert (days.amountOfDays == 2 || days.amountOfDays == 1);
        this.days = days;
    }
    protected SkiPassWeekends(Lifts lifts) {
        assert (lifts.amountOfLifts == 20 || lifts.amountOfLifts == 10 || lifts.amountOfLifts == 50 || lifts.amountOfLifts == 100);
        this.lifts = lifts;
    }

    public String toString() {
        if (lifts != null) {
            return "Lifts: " + Integer.toString(lifts.amountOfLifts);
        }
        else {
            return "Days: " + Integer.toString(days.amountOfDays);
        }
    }
}
