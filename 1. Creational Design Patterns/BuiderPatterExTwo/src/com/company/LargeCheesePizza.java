package com.company;

public class LargeCheesePizza extends VegPizza {
    @Override
    public String name() {
        return "Cheese Pizza";
    }

    @Override
    public String size() {
        return "Large pizza";
    }

    @Override
    public float price() {
        return 260.0f;
    }
}
