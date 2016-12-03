package com.company;

/**
 * Created by Olia on 01.12.2016.
 */

public class Tourniquet {

    protected Abonnement abonnement;

    protected Tourniquet(Abonnement abonnement) {
        this.abonnement = abonnement;
        check();
    }

    protected boolean verification() {
        if (abonnement.getId() != null && abonnement.getSkiPass() != null) {
            if (abonnement.getDays() != null && abonnement.getDays().getAmountOfDays() > 0) {
                return true;
            } else if (abonnement.getLifts() != null && abonnement.getLifts().getAmountOfLifts() > 0) {
                return true;
            }
        }
        return false;
    }

    protected void block() {
        abonnement.validness = false;
    }

    protected void unblock() {
        abonnement.validness = true;
    }

    protected void check() {
        if (verification()) {
            if (abonnement.getDays() != null) {
                abonnement.getDays().amountOfDays--;
            }
            else if (abonnement.getLifts() != null) {
                abonnement.getLifts().amountOfLifts--;
            }
            System.out.println("VALID!");
            unblock();
        }
        else {
            System.out.println("INVALID!\tYour abonnement is blocked! Ask at the service centre!");
            block();
        }
    }

}
