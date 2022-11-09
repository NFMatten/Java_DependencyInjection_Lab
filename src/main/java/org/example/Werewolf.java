package org.example;

public class Werewolf implements Attacker{
    //Instance variables
    public String name;
    public int attackPower;

    //Constructor
    public Werewolf(String name, int attackPower){
        this.name = name;
        this.attackPower = attackPower;
    }

    //Methods
    public void Attack(){
        System.out.printf("%s attacks for %d damage!", this.name, this.attackPower);
    }
}
