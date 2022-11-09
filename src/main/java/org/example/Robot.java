package org.example;

public class Robot implements Attacker{

    //Instance variables (HAS A)
    public String name;
    public Weapon weapon;

    //Constructor
    public Robot(String name, Weapon weapon) {
        this.name = name;
        this.weapon = weapon;
    }

    //Methods (CAN DO)
    public void Attack(){
        System.out.printf("%s attacks with their %s for %d damage!\n", this.name, this.weapon.name, this.weapon.power);
    }
}