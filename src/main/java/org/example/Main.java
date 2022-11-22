package org.example;

public class Main {
    public static void main(String[] args)
    {
        DaysIndex daysIndex;
        daysIndex = DaysIndex.SUNDAY;

        Size size = Size.SMALL;
        System.out.println("Size: " + size.getPizzaSize());
        System.out.println("Calories: " + size.getPizzaCalories());
        System.out.println("Joules: " + size.getPizzaJoules());
        System.out.println("Energy of Medium: " + Size.valueOf("MEDIUM").getPizzaJoules());

    }
}