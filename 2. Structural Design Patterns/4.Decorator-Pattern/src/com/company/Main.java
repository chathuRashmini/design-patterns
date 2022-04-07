package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    private static int choice;

    public static void main(String[] args) throws IOException {
	    do {
            System.out.print("            1. Vegetarian Food.   \n");
            System.out.print("            2. Non-Vegetarian Food.\n");
            System.out.print("            3. Chineese Food.         \n");
            System.out.print("            4. Exit                        \n");

            System.out.println("Your choice: ");
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            choice = Integer.parseInt(br.readLine());

            switch (choice) {
                case 1: {
                    VegFood vf = new VegFood();
                    System.out.println(vf.preparedFood());
                    System.out.println(vf.foodPrice());
                }
                break;

                case 2: {
                    Food food_1 = new NonVegFood((Food) new VegFood());
                    System.out.println(food_1.preparedFood());
                    System.out.println(food_1.foodPrice());
                }
                break;

                case 3: {
                    Food food_2 = new ChineeseFood((Food) new VegFood());
                    System.out.println(food_2.preparedFood());
                    System.out.println(food_2.foodPrice());
                }
                break;

                default: {
                    System.out.println("Other than these no food available");
                }

                return;
            }
        }
	    while (choice != 4);
    }
}
