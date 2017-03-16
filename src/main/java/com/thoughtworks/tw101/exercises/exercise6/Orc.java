package com.thoughtworks.tw101.exercises.exercise6;

public class Orc implements Monster {
    private static final String name = "Orc";
    private int hitPoints;

    public Orc() {
        hitPoints = 20;
    }

    @Override
    public void takeDamage(int amount) {
        hitPoints -= amount;
    }

    @Override
    public void reportStatus() {
        System.out.println(name  + " has "  + hitPoints + " hitpoints");

    }
}
