package com.company;

public class Sony extends Company{
    @Override
    public String pack() {
        return "Sony CD";
    }

    @Override
    public int price() {
        return 20;
    }
}
