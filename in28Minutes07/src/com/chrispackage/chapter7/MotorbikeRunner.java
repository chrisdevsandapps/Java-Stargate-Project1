package com.chrispackage.chapter7;

public class MotorbikeRunner {
    public static void main(String[] args) {

        Motorbike ducati = new Motorbike("ducati");
        Motorbike honda = new Motorbike("honda");

        ducati.start();
        honda.start();

        System.out.println("get the speed of ducati: " + ducati.getSpeed());
        System.out.println("get the speed of honda: " + honda.getSpeed());

        ducati.setSpeed(-101);
        honda.setSpeed(103);

        ducati.printSpeed();
        honda.printSpeed();

        System.out.println("get the speed of ducati: " + ducati.getSpeed());
        System.out.println("get the speed of honda: " + honda.getSpeed());

        int ds = ducati.getSpeed();
        ds = ds + 100;
        ducati.setSpeed(ds);
        int hs = honda.getSpeed();
        hs = hs + 100;
        ducati.setSpeed(hs);

        ducati.printSpeed();
        honda.printSpeed();

        ducati.increaseSpeed(10);
        honda.increaseSpeed(12);

        ducati.printSpeed();
        honda.printSpeed();

        ducati.decreaseSpeed(30);
        honda.decreaseSpeed(33);
        
        ducati.printSpeed();
        honda.printSpeed();
        

        Motorbike xxx = new Motorbike();
        xxx.printSpeed();
        
    }
}
