package com.company;

public class Main {

    public static void main(String[] args) {
	    CreditCard targetInterface = new BankCustomer();
	    targetInterface.getBackDetails();
        System.out.println(targetInterface.getCreditCard());
    }
}
