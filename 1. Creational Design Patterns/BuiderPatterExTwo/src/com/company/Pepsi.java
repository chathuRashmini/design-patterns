package com.company;

public class Pepsi extends ColdDrink{
    @Override
    public String name() {
        return "300 ml Pepsi";
    }

    @Override
    public String size() {
        return "Small Size";
    }

    @Override
    public float price() {
        return 25.0f;
    }
}
