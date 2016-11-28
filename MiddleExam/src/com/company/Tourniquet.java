package com.company;

/**
 * Created by Olia on 28.11.2016.
 */
public class Tourniquet {

    protected skiPass abonement;

    private Tourniquet(skiPass abonement) throws Exception {
        this.abonement = abonement;
        check();
    }

    private boolean verificationOfAbonement() {
        if ((abonement.getId() != null || abonement.getId().length() < 10) && abonement.getValidity() != Validity.NO_VALIDITY &&
                abonement.getCardType() != CardType.NO_TYPE && abonement.getNumOfLifts() != 0) {
            return true;
        }
        return false;
    }

    private void check() throws Exception {
        if (verificationOfAbonement()) {
            if (abonement.getCardType() != CardType.SEASON) {
                abonement.setNumOfLifts(abonement.getNumOfLifts() - 1);
                }
            else {

            }


            unblock();
        }
        else {
            block();
            throw new Exception("Entry isn't allowed for you! Ask at the reception!");
        }
    }

    public void unblock() {
        abonement.setValidness(true);

    }

    public void block() {
        abonement.setValidness(false);
    }
}
