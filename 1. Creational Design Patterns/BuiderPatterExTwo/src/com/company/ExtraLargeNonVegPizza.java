package com.company;

public class ExtraLargeNonVegPizza extends NonVegPizza{
    @Override
    public String name() {
        return "Non-veg pizza";
    }

    @Override
    public String size() {
        return "Extra-large size";
    }

    @Override
    public float price() {
        return 250.0f;
    }
}