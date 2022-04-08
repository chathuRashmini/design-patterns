package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    private static int choice;

    public static void main(String[] args) throws NullPointerException, IOException {
        do {
            System.out.print("            1. IPHONE.              \n");
            System.out.print("            2. SAMSUNG.              \n");
            System.out.print("            3. BLACKBERRY.            \n");
            System.out.print("            4. Exit.                     \n");

            System.out.println("Your choice: ");

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            choice = Integer.parseInt(br.readLine());
            ShopKeeper shopKeeper = new ShopKeeper();

            switch (choice) {
                case 1: {
                    shopKeeper.iphoneSale();
                    break;
                }
                case 2: {
                    shopKeeper.samsungSale();
                    break;
                }
                case 3: {
                    shopKeeper.blackberrySale();
                    break;
                }
                default: {
                    System.out.println("You have not purchased anything");
                    return;
                }
            }
        } while (choice != 4);
    }
}
