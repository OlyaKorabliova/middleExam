package com.company;

/**
 * Created by Olia on 02.12.2016.
 */
public class AddDaysDecorator extends Decorator {
    protected Abonnement abonnement;

    public AddDaysDecorator(IDecorator decorator) {
        super(decorator);
    }

    @Override
    public void modify(int days) {
        abonnement.getDays().amountOfDays += days;
    }
}