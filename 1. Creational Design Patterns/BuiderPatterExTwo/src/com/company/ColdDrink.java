package com.company;

public abstract class ColdDrink implements Item{

    @Override
    public abstract  String name();

    @Override
    public abstract  String size();

    @Override
    public abstract float price();
}
