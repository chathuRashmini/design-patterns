package com.company;

public class MediumNonVegPizza extends NonVegPizza{
    @Override
    public String name() {
        return "Non-veg pizza";
    }

    @Override
    public String size() {
        return "Medium size";
    }

    @Override
    public float price() {
        return 200.0f;
    }
}
