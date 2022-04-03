package com.company;

public class MediumCheesePizza extends VegPizza {
    @Override
    public String name() {
        return "Cheese Pizza";
    }

    @Override
    public String size() {
        return "Medium pizza";
    }

    @Override
    public float price() {
        return 220.0f;
    }
}