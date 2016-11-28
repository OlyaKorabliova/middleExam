package com.company;

/**
 * Created by Olia on 28.11.2016.
 */

public class Abonement {

    protected AbonementSpec spec;

    public Abonement(AbonementSpec spec) {
        this.spec = spec;
    }

    public void setValidness(boolean validness) {
        spec.validness = validness;
    }

    public String getId() {
        return spec.id;
    }

    public CardType getCardType() {
        return spec.cardType;
    }

    public Validity getValidity() {
        return spec.validity;
    }

    public int getNumOfLifts() {
        return spec.numOfLifts;
    }

    public void setNumOfLifts(int numOfLifts) {
        spec.numOfLifts = numOfLifts;
    }

    public String toString() {
        return spec.getCardType().toString() + ": " + spec.getValidity().toString();
    }


}
