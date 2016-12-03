package com.company;

/**
 * Created by Olia on 02.12.2016.
 */
public class AddLiftsDecorator extends Decorator {

    protected Abonnement abonnement;

    public AddLiftsDecorator(IDecorator decorator) {
        super(decorator);
    }

    @Override
    public void modify(int lifts) {
        abonnement.getLifts().amountOfLifts += lifts;
    }
}
