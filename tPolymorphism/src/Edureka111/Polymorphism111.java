/*
 * 
 * 
 * 
 */


package Edureka111;

public class Polymorphism111 {
    public static void main(String[] args) {
        System.out.println("Polymorphism111.main()");

        // animal reference and object:
        Animal aaa = new Animal();

        // animal reference but dog-object
        Animal bbb = new Dog();

        // runs the method in animal class:
        aaa.move();

        // runs the method in dog class:
        bbb.move();



        Animal ccc = new Dolphin();
        ccc.move();

    }
    
}


class Animal {
    public void move() {
        System.out.println("animals can move");
    }
}

class Dog extends Animal {
    public void move() {
        System.out.println("dogs can walk and run");
    }
}


class Dolphin extends Animal {
    public void move() {
        System.out.println(" ");
        super.move();
        System.out.println("dolphins can swim and stay above water");
        System.out.println(" ");
    }
}