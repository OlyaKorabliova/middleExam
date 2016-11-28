package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        AbonementSpec abonementSpec1 = new AbonementSpec("id39670045", CardType.WEEKDAYS, Validity.$2_DAYS);
//        Abonement a1 = new Abonement(abonementSpec1);
        skiPass s = new skiPass(abonementSpec1);


        Customer cus = new Customer(s);


    }
}
