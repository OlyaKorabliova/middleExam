package com.company;

/**
 * Created by Olia on 28.11.2016.
 */
public enum CardType {
    WEEKDAYS, WEEKENDS, SEASON, NO_TYPE;

    public String toString() {
        switch (this) {
            case WEEKDAYS:
                return "Card is valid for weekdays only";
            case WEEKENDS:
                return "Card is valid for weekends only";
            case SEASON:
                return "Card is valid for season only";
            default:
                return "No type";
        }
    }
}
