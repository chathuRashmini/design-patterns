package com.company;

public class ExtraLargeOnionPizza extends VegPizza{
    @Override
    public String name() {
        return "Onion Pizza";
    }

    @Override
    public String size() {
        return "Extra-large Size";
    }

    @Override
    public float price() {
        return 200.0f;
    }
}
