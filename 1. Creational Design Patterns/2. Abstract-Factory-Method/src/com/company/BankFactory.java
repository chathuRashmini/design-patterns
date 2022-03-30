package com.company;

public class BankFactory extends AbstractFactory{

    @Override
    public Bank getBank(String bank) {

        if (bank == null) {
            return null;
        }

        if (bank.equalsIgnoreCase("HDFC")) {
            return new HDFC();
        } else if (bank.equalsIgnoreCase("ICICI")) {
            return new ICICI();
        } else if (bank.equalsIgnoreCase("SBI")) {
            return new SBI();
        } else {
            System.out.println("Please enter a valid bank name");
        }

        return null;
    }

    @Override
    public Loan getLoan(String loan) {
        return null;
    }
}
