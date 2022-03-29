package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
	    GetPlanFactory planFactory = new GetPlanFactory();

        System.out.println("Enter name of the plan: ");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String planName = bufferedReader.readLine();

        System.out.println("Enter number of units: ");
        int units = Integer.parseInt(bufferedReader.readLine());

        Plan plan = planFactory.getPlan(planName);

        System.out.println("Amount for " + planName + " for " + units + " units is: ");
        plan.getRate();
        plan.calculateBill(units);
    }
}
