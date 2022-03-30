package com.company;

public class LoanFactory extends AbstractFactory{

    @Override
    public Bank getBank(String bank) {
        return null;
    }

    @Override
    public Loan getLoan(String loan) {

        if (loan == null) {
            return null;
        }

        if (loan.equalsIgnoreCase("HOME")) {
            return new HomeLoan();
        } else if (loan.equalsIgnoreCase("Business")) {
            return new BussinessLoan();
        } else if (loan.equalsIgnoreCase("Education")) {
            return new EducationLoan();
        } else {
            System.out.println("Please enter an existing loan scheme");
        }

        return null;
    }
}
