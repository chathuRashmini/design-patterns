package com.company;

public class ChineeseFood extends FoodDecorator{

    public ChineeseFood(Food newFood){
        super(newFood);
    }

    @Override
    public String preparedFood() {
        return super.prepareFood() +" With Fried Rice and Manchurian  ";
    }

    public double foodPrice() {
        return super.foodPrice() + 65.0;
    }
}
