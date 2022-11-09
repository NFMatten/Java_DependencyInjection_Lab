package org.example;

public class Main {
    public static void main(String[] args) {
//        //Weapons
//        Sword sword = new Sword();
//        Lightsaber lightsaber = new Lightsaber();
//        Crossbow crossbow = new Crossbow();
//        //Robot
//        Robot robot_one = new Robot("R2d2", sword);
//        Robot robot_two = new Robot("C3PO", lightsaber);
//        Robot robot_three = new Robot("Bender", crossbow);
//        //Attack
//        robot_one.Attack();
//        robot_two.Attack();
//        robot_three.Attack();
        Weapon lightsaber = new Lightsaber();
        Attacker robotOne = new Robot("Bender", lightsaber);

        robotOne.Attack();

        Attacker wolfOne = new Werewolf("Oz", 82);

        wolfOne.Attack();
    }
}