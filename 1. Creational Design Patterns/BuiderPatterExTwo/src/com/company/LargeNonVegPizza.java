package com.company;

public class LargeNonVegPizza extends NonVegPizza{
    @Override
    public String name() {
        return "Non-veg pizza";
    }

    @Override
    public String size() {
        return "Large size";
    }

    @Override
    public float price() {
        return 220.0f;
    }
}
