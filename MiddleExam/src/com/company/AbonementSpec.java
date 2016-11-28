package com.company;

import javafx.scene.shape.VLineTo;

/**
 * Created by Olia on 28.11.2016.
 */
public class AbonementSpec extends Spec {

    protected String id;
    protected int numOfLifts;
    protected boolean validness;

    protected AbonementSpec(String id, CardType cardType, Validity validity) {
        super(validity, cardType);
        this.id = id;
        this.validity = validity;
        this.cardType = cardType;
        if (validity == Validity.$10_LIFTS) {
            this.numOfLifts = 10;
        }
        else if (validity == Validity.$20_LIFTS) {
            this.numOfLifts = 20;
        }

        else if (validity == Validity.$50_LIFTS) {
            this.numOfLifts = 50;
        }

        else if (validity == Validity.$100_LIFTS) {
            this.numOfLifts = 100;
        }

        else {
            this.numOfLifts = 0;
        }

        this.validness = true;
    }

    public String getId() {
        return id;
    }

    public CardType getCardType() {
        return cardType;
    }

    public Validity getValidity() {
        return validity;
    }

    public int getNumOfLifts() {
        return numOfLifts;
    }

    public boolean isValidness() {
        return validness;
    }

    public void setValidness(boolean validness) {
        this.validness = validness;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setValidity(Validity validity) {
        this.validity = validity;
    }

    public void setCardType(CardType cardType) {
        this.cardType = cardType;
    }

    public void setNumOfLifts(int numOfLifts) {
        this.numOfLifts = numOfLifts;
    }

    public String toString() {
        return this.getCardType().toString() + ": " + this.getValidity().toString();
    }

}
