/*
 * lesson 07
 * classes
 * 
 */


// import java.io.*;
// import java.lang.Thread;
// import java.util.InputMismatchException;
// import java.util.Scanner;

public class Lesson07aaa {
    public static void main(String[] args) {
        System.out.println("Lesson 07 - Classes");

        spacer();

        Monster Frank = new Monster();
        Frank.name = "Frank";
        System.out.println(
            Frank.name + " has an attack of " + Frank.getAttack()
        );

    }

    /* *************************************************************** */

    static void spacer() {
        System.out.println(" ");
        System.out.println("###############################################");
        System.out.println("###############################################");
        System.out.println(" ");
    }    


}


class Monster {

    public final String XXX = "xxx monster";

    // private var
    // only the object can access the variable
    private int health = 500;
    private int attack = 20;
    private int movement = 2;
    private int xPosition = 0;
    private int yPosition = 0;
    private boolean isAlive = true;


    public String name = "Big Monster";

    // getters:
    public int getAttack() {
        return attack;
    }
    public int getMovement() {
        return movement;
    }  
    public int getHealth() {
        return health;
    }

    // setters:
    public void setHealth(int decreaseHealth) {
        health = health - decreaseHealth;
        aliveCheck();
    }
    // also method overloading:
    public void setHealth(double decreaseHealth) {
        int intDecreaseHealth = (int)decreaseHealth;
        health = health - intDecreaseHealth;
        aliveCheck();
    }

    // private method:
    private void aliveCheck() {
        if (health < 0) {
            isAlive = false;
        }
    }


    // constructor:
    public Monster(int newHealth, int newAttack, int newMovement) {
        this.health = newHealth;
        this.attack = newAttack;
        this.movement = newMovement;
    }
    // default constructor:
    public Monster() {
        // this constructor is automatically created by java,
        // if the programmer did not create a construcor
    }


}
