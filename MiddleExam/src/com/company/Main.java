package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here

        Factory factory = new Factory(new SkiPassWeekends(Days.$2DAYS));

        Abonnement ab1 = new Abonnement("00001", new SkiPassWeekends(Lifts.$50LIFTS));
        Abonnement ab2 = factory.sellAbonnement("00002", factory.modifyAbonnement(Days.$5DAYS));
        Abonnement ab3 = factory.sellAbonnement("00003", new SkiPassSeason());

        System.out.println(ab2);
        System.out.println(ab3);
        System.out.println(ab1.getLifts());
        System.out.println(ab2.getDays());
        System.out.println(ab3.getDays());
        new Tourniquet(ab1);
        new Tourniquet(ab2);
        new Tourniquet(ab3);
        new Tourniquet(ab1);
        new Tourniquet(ab1);
        for (int i = 0; i < 5; i++) {
            new Tourniquet(ab2);
        }
        System.out.println(ab2.validness);

    }
}
