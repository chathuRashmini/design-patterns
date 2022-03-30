package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter bank name: ");
        String bankName = bufferedReader.readLine();

        System.out.println("Enter loan type: ");
        String loanName = bufferedReader.readLine();

        AbstractFactory bankFactory = FactoryCreator.getFactory("Bank");
        Bank b = bankFactory.getBank(bankName);

        System.out.println("Enter interest rate for " + b.getBankName() + ": ");
        double rate = Double.parseDouble(bufferedReader.readLine());

        System.out.println("Enter the loan amount: ");
        double loanAmount = Double.parseDouble(bufferedReader.readLine());

        System.out.println("Number of years to pay entire loan amount: ");
        int years = Integer.parseInt(bufferedReader.readLine());

        AbstractFactory loanFactory = FactoryCreator.getFactory("Loan");
        Loan loan = loanFactory.getLoan(loanName);
        loan.getInterestRate(rate);
        loan.calculateLoanPayment(loanAmount, years);
    }
}
