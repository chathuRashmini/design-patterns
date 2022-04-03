package com.company;

public class ExtraLargeCheesePizza extends VegPizza {
    @Override
    public String name() {
        return "Cheese Pizza";
    }

    @Override
    public String size() {
        return "Extra-large pizza";
    }

    @Override
    public float price() {
        return 300.0f;
    }
}
