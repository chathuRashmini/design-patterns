package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OrdereBuilder {

    public OrderedItems preparePizza() throws IOException {
        OrderedItems itemsOrder = new OrderedItems();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("        1. Veg-Pizza       ");
        System.out.println("        2. Non-Veg Pizza   ");
        System.out.println("        3. Exit            ");

        int pizzaAndColdDrinkChoice = Integer.parseInt(bufferedReader.readLine());

        switch (pizzaAndColdDrinkChoice) {
            case 1: {
                System.out.println("You ordered Veg Pizza");
                System.out.println(" Enter the types of Veg-Pizza ");
                System.out.println("------------------------------");
                System.out.println("        1.Cheese Pizza        ");
                System.out.println("        2.Onion Pizza        ");
                System.out.println("        3.Masala Pizza        ");
                System.out.println("        4.Exit            ");
                System.out.println("------------------------------");

                int vegPizzaChoice = Integer.parseInt(bufferedReader.readLine());

                switch (vegPizzaChoice) {
                    case 1: {
                        System.out.println("You ordered Cheese Pizza");

                        System.out.println("Enter the cheese pizza size");
                        System.out.println("    1. Small Cheese Pizza ");
                        System.out.println("    2. Medium Cheese Pizza ");
                        System.out.println("    3. Large Cheese Pizza ");
                        System.out.println("    4. Extra-Large Cheese Pizza ");

                        int cheesePizzaSize = Integer.parseInt(bufferedReader.readLine());
                        switch (cheesePizzaSize) {
                            case 1:
                                itemsOrder.addItems(new SmallCheesePizza());
                                break;

                            case 2:
                                itemsOrder.addItems(new MediumCheesePizza());
                                break;

                            case 3:
                                itemsOrder.addItems(new LargeCheesePizza());
                                break;

                            case 4:
                                itemsOrder.addItems(new ExtraLargeCheesePizza());
                                break;
                        }
                        break;
                    }

                    case 2: {
                        System.out.println("You ordered Onion Pizza");
                        System.out.println("Enter the Onion pizza size");
                        System.out.println("----------------------------------");
                        System.out.println("    1. Small Onion Pizza ");
                        System.out.println("    2. Medium Onion Pizza ");
                        System.out.println("    3. Large Onion Pizza ");
                        System.out.println("    4. Extra-Large Onion Pizza ");

                        int onionPizzaSize = Integer.parseInt(bufferedReader.readLine());

                        switch (onionPizzaSize) {
                            case 1:
                                itemsOrder.addItems(new SmallOnionPizza());
                                break;

                            case 2:
                                itemsOrder.addItems(new MediumOnionPizza());
                                break;

                            case 3:
                                itemsOrder.addItems(new LargeOnionPizza());
                                break;

                            case 4:
                                itemsOrder.addItems(new ExtraLargeOnionPizza());
                                break;
                        }
                        break;
                    }

                    case 3: {
                        System.out.println("Enter the Masala pizza size");
                        System.out.println("------------------------------------");
                        System.out.println("    1. Small Masala Pizza ");
                        System.out.println("    2. Medium Masala Pizza ");
                        System.out.println("    3. Large Masala Pizza ");
                        System.out.println("    4. Extra-Large Masala Pizza ");

                        int masalaPizzaSize = Integer.parseInt(bufferedReader.readLine());

                        switch (masalaPizzaSize) {
                            case 1:
                                itemsOrder.addItems(new SmallMasalaPizza());
                                break;

                            case 2:
                                itemsOrder.addItems(new MediumMasalaPizza());
                                break;

                            case 3:
                                itemsOrder.addItems(new LargeMasalaPizza());
                                break;

                            case 4:
                                itemsOrder.addItems(new ExtraLargeMasalaPizza());
                                break;
                        }
                        break;
                    }
                }
            }

            case 2: {
                System.out.println("Enter the Non-Veg pizza size");
                System.out.println("    1. Small Non-Veg  Pizza ");
                System.out.println("    2. Medium Non-Veg  Pizza ");
                System.out.println("    3. Large Non-Veg  Pizza ");
                System.out.println("    4. Extra-Large Non-Veg  Pizza ");

                int nonVedPizzaSize = Integer.parseInt(bufferedReader.readLine());

                switch (nonVedPizzaSize) {
                    case 1:
                        itemsOrder.addItems(new SmallNonVegPizza());
                        break;

                    case 2:
                        itemsOrder.addItems(new MediumNonVegPizza());
                        break;

                    case 3:
                        itemsOrder.addItems(new LargeNonVegPizza());
                        break;

                    case 4:
                        itemsOrder.addItems(new ExtraLargeNonVegPizza());
                        break;
                }
                break;
            }

            default: {
                break;
            }
        }

        System.out.println("        1. Pepsi            ");
        System.out.println("        2. Coke             ");
        System.out.println("        3. Exit             ");

        int coldDrink=Integer.parseInt(bufferedReader.readLine());

        switch (coldDrink)
        {
            case 1:
            {
                System.out.println("You ordered Pepsi ");
                System.out.println("Enter the  Pepsi Size ");
                System.out.println("    1. Small Pepsi ");
                System.out.println("    2. Medium Pepsi ");
                System.out.println("    3. Large Pepsi ");

                int pepsiSize = Integer.parseInt(bufferedReader.readLine());

                switch(pepsiSize)
                {
                    case 1:
                        itemsOrder.addItems(new SmallPepsi());
                        break;

                    case 2:
                        itemsOrder.addItems(new MediumPepsi());
                        break;

                    case 3:
                        itemsOrder.addItems(new LargePepsi());
                        break;

                }
            }
            break;

            case 2:
            {
                System.out.println("You ordered Coke");
                System.out.println("Enter the Coke Size");
                System.out.println("    1. Small Coke ");
                System.out.println("    2. Medium Coke  ");
                System.out.println("    3. Large Coke  ");
                System.out.println("    4. Extra-Large Coke ");

                int cokeSize = Integer.parseInt(bufferedReader.readLine());

                switch(cokeSize)
                {
                    case 1:
                        itemsOrder.addItems(new SmallCoke());
                        break;

                    case 2:
                        itemsOrder.addItems(new MediumCoke());
                        break;

                    case 3:
                        itemsOrder.addItems(new LargeCoke());
                        break;
                }
            }
            break;
            default:
            {
                break;
            }
        }
        return itemsOrder;
    }
}
