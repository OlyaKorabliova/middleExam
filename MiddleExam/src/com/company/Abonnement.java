package com.company;

/**
 * Created by Olia on 01.12.2016.
 */
public class Abonnement {
    protected String id;
    protected boolean validness;
    protected SkiPass skiPass;

    public Abonnement(String id, SkiPass skiPass) {
        this.validness = true;
        this.id = id;
        this.skiPass = skiPass;
    }

    public String getId() {
        return id;
    }

    public Days getDays() {
        return skiPass.days;
    }

    public Lifts getLifts() {
        return skiPass.lifts;
    }

    public SkiPass getSkiPass() {
        return skiPass;
    }

    public String toString() {
        return "id: " + id + "; " + skiPass.toString();
    }

}
