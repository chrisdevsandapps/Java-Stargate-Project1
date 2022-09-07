/*
 * 
 * https://www.youtube.com/watch?v=ltZZugUuiZg
 * 
 * 
 */

package codeDecodeYtChannel;

public class Xxx01 {
   public static void main(String[] args) {
        Dog tommy = new Dog();
        System.out.println("dog has " + tommy.eyes + " eyes");


        Labrador labrador1 = new Labrador();
        System.out.println("labrador has " + labrador1.eyes + " eyes");
        
   } 
}

/* *********************************************** */
/* *********************************************** */
class Animal {
    int eyes = 2;
    int legs = 4;


}


/* *********************************************** */
/* *********************************************** */
class Dog extends Animal {
    String color;
    String name;
    String breed;

    public void wagTail() {
        System.out.println("dog wag their tails");
    }
    public void barking() {
        System.out.println("dog barks");
    }
    public void eating() {
        System.out.println("dog eats");
    }
}
/* *********************************************** */
/* *********************************************** */
class Labrador extends Dog {
    String specialCapability = "athletic";
}


class Fish extends Animal {
    public void canSwim() {
        System.out.println("fishes can swim");
    }
}


class TerrestrialAnimal {
    public void specialProperty() {
        System.out.println("lives only in land");
    }
}

class AquaticAnimal {
    public void specialProperty() {
        System.out.println("lives only in water");
    }
}

class Frog extends TerrestrialAnimal {
    public void specialProperty() {
        System.out.println("frog is an amphibian animal");
        System.out.println("frog lives in both land and water");
    }
}