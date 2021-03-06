package com.company;

public class FactoryCreator {

    public static AbstractFactory getFactory(String choice) {

        if (choice.equalsIgnoreCase("Bank")) {
            return new BankFactory();
        } else if (choice.equalsIgnoreCase("Loan")) {
            return new LoanFactory();
        } else {
            System.out.println("Sorry, Your category choice does not exist.");
        }

        return null;
    }
}
