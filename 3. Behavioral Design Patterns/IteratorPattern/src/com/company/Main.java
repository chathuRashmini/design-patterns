package com.company;

public class Main {

    public static void main(String[] args) {
	    CollectionOfNames namesCollection = new CollectionOfNames();

	    for (
	            Iterator i = namesCollection.getIterator();
	            i.hasNext();
        ) {
	        String name = (String) i.next();
            System.out.println("Name: " + name);
        }
    }
}
