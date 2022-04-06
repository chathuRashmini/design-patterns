package com.company;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BankCustomer extends BankDetails implements CreditCard{

    @Override
    public void getBackDetails() {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            System.out.println("Account holder's name: ");
            String customerName = br.readLine();

            System.out.println("Account number: ");
            long accountNo = Long.parseLong(br.readLine());

            System.out.println("Bank name: ");
            String bankName = br.readLine();

            setBankName(bankName);
            setAccHolderName(customerName);
            setAccNumber(accountNo);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public String getCreditCard() {
        long accountNo = getAccNumber();
        String accountHolder = getAccHolderName();
        String bankName = getBankName();

        return ("The Account number " + accountNo + " of " + accountHolder + " in " + bankName + " bank is valid.");
    }
}
