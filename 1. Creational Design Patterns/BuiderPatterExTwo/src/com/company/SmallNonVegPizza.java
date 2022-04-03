package com.company;

public class SmallNonVegPizza extends NonVegPizza{
    @Override
    public String name() {
        return "Non-veg pizza";
    }

    @Override
    public String size() {
        return "Small size";
    }

    @Override
    public float price() {
        return 180.0f;
    }
}
