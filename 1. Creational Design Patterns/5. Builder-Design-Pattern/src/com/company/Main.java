package com.company;

public class Main {

    public static void main(String[] args) {
	    CDBuilder cdBuilder = new CDBuilder();

	    CDType cdType_1 = cdBuilder.buildSonyCD();
	    cdType_1.showItems();

        CDType cdType_2 = cdBuilder.buildSamsungCD();
        cdType_2.showItems();
    }
}
