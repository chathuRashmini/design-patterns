package com.company;

public class ExtraLargeMasalaPizza extends VegPizza{
    @Override
    public String name() {
        return "Masala Pizza";
    }

    @Override
    public String size() {
        return "Extra-large Size";
    }

    @Override
    public float price() {
        return 180.0f;
    }
}