package com.thoughtworks.tw101.exercises.exercise6;

public class Troll implements Monster {
    private String name;
    private int hitPoints;

    public Troll() {
        hitPoints = 40;
        name = "Troll";
    }

    @Override
    public void takeDamage(int amount) {
        hitPoints -= amount/2;
    }

    @Override
    public void reportStatus() {
        System.out.println(name  + " has "  + hitPoints + " hitpoints");

    }
}
