package com.chrispackage.chapter7;

import java.lang.Math;

public class Motorbike {

    private int speed;
    private String name;

    public Motorbike() {
        this("genericMotorbike");
    }

    public Motorbike(String name) {
        this.name = name;
        System.out.println(this.getClass() + " class created");
    }

    void start() {
        System.out.println("Bike Started.");
    }
    void setSpeed(int speed) {
        // validation:
        if(speed > 0 && speed <= 300) {
            this.speed = speed;
        } else if (speed >= 301) {
            this.speed = 300;
        } else if (speed < 0 && speed >= -300) {
            this.speed =  Math.abs(speed);
        } else {
            this.speed = 1;
        }
    }
    int getSpeed() {
        return this.speed;
    }

    void printSpeed() {
        System.out.println(this.name + " speed: " + this.speed);
    }

    void increaseSpeed(int howMuch) {
        // this.speed = this.speed + howMuch;
        // validation:
        setSpeed(this.speed + howMuch);
    }
    void decreaseSpeed(int howMuch) {
        // this.speed = this.speed - howMuch;
        // validation:
        setSpeed(this.speed - howMuch);
    }


}
