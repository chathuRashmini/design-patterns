package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws NumberFormatException, IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Number 01: ");
        float value1 = Float.parseFloat(br.readLine());

        System.out.println("Number 02: ");
        float value2 = Float.parseFloat(br.readLine());

        Context context = new Context(new Addition());
        System.out.println(value1 + " + " + value2 + " = " + context.executeStrategy(value1, value2));

        context = new Context(new Subtraction());
        System.out.println(value1 + " - " + value2 + " = " + context.executeStrategy(value1, value2));

        context = new Context(new Multiplication());
        System.out.println(value1 + " * " + value2 + " = " + context.executeStrategy(value1, value2));
    }
}
