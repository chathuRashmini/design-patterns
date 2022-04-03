package com.company;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
	    OrdereBuilder builder = new OrdereBuilder();

	    OrderedItems orderedItems = builder.preparePizza();

	    orderedItems.showItems();

        System.out.println("Total Cost : "+ orderedItems.getCost());
    }
}
