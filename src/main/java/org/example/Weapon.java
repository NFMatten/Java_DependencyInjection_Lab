package org.example;

public abstract class Weapon{
    //Instance Variables (HAS A)
    public String name;
    public int power;

    //Constructor
    public Weapon(String name, int power) {
        this.name = name;
        this.power = power;
    }
}
