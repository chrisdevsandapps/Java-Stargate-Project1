/*
 * using abstract method
 * 
 * abstract class has to make sure that every single subclass must implement its method 
 * 
 * anong kaibahan nito sa Interface:
 * - hindi mo malalagyan ng codes and logic yung loob ng method (method body)
 * - hindi katulad nung sa abstract class, pwede yung both logic/codes, pwede din yung declaration lang
 */

abstract class Dog {
    String breed;
    public void bark() {
        System.out.println("bark!!!");
    }
    public abstract void eat();
}

class Husky extends Dog {
    // dapat ma-implement nito yung eat() method nung abstract class Dog:
    public void eat() {
        System.out.println("husky eating");
    }
}

public class App222 {
    public static void main(String[] args) throws Exception {
        System.out.println("abstract method test");

        Husky h1 = new Husky();
        h1.bark();
        h1.eat();
    }
}
