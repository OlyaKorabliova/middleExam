package com.company;

/**
 * Created by Olia on 01.12.2016.
 */
public class Factory {
    protected SkiPass skiPass;
    public Factory(SkiPass skiPass) {
        this.skiPass = skiPass;
    }

    public Abonnement sellAbonnement(String id, SkiPass skiPass) {
        return new Abonnement(id, skiPass);
    }

    public SkiPass modifyAbonnement(Days days) {
        if (skiPass.getClass() == SkiPassWeekdays.class) {
            skiPass = new SkiPassWeekdays(days);
            return skiPass;
        }
        else if (skiPass.getClass() == SkiPassWeekends.class) {
            skiPass = new SkiPassWeekends(days);
            return skiPass;
        }
        else if (skiPass.getClass() == SkiPassSeason.class) {
            skiPass = new SkiPassSeason();
            return skiPass;
        }
        return null;
    }

    public SkiPass modifyAbonnement(Lifts lifts) {
        if (skiPass.getClass() == SkiPassWeekdays.class) {
            skiPass = new SkiPassWeekdays(lifts);
            return skiPass;
        }
        else if (skiPass.getClass() == SkiPassWeekends.class) {
            skiPass = new SkiPassWeekends(lifts);
            return skiPass;
        }
        else if (skiPass.getClass() == SkiPassSeason.class) {
            skiPass = new SkiPassSeason();
            return skiPass;
        }
        return null;
    }

}
