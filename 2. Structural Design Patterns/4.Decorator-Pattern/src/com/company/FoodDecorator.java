package com.company;

public abstract class FoodDecorator implements Food {

    private Food newFood;

    public FoodDecorator(Food newFood) {
        this.newFood = newFood;
    }

    public String prepareFood(){
        return newFood.preparedFood();
    }

    public double foodPrice(){
        return newFood.foodPrice();
    }
}
