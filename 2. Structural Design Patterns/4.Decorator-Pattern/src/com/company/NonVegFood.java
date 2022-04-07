package com.company;

public class NonVegFood extends FoodDecorator{

    public NonVegFood(Food newFood) {
        super(newFood);
    }

    @Override
    public String preparedFood() {
        return super.prepareFood() + " with roasted chicken and chicken curry";
    }

    public double foodPrice(){
        return super.foodPrice() + 150.0;
    }
}
