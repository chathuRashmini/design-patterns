package com.company;

public class LargeMasalaPizza extends VegPizza{
    @Override
    public String name() {
        return "Masala Pizza";
    }

    @Override
    public String size() {
        return "Large Size";
    }

    @Override
    public float price() {
        return 150.0f;
    }
}