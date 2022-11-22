package org.example;

public enum Size {
    SMALL("small pizza", 230),
    MEDIUM("medium pizza", 300),
    LARGE("large pizza", 800),
    X_Large("extra large pizza", 1000);

    public String getPizzaSize() {
        return pizzaSize;
    }

    private final String pizzaSize;
    private final int pizzaCalories;

    public int getPizzaCalories() {
        return pizzaCalories;
    }
    public int getPizzaJoules(){
        return (int) (getPizzaCalories() * 4.184);
    }
    private Size(String pizzaSize, int pizzaCalories){
        this.pizzaSize = pizzaSize;
        this.pizzaCalories = pizzaCalories;
    }
    
}
