/*
 * method overriding
 * - is a feature that allows the parent class and the 
 * sub class to have the same method
 * 
 * timeline:
 * https://youtu.be/nixQyPIAnOQ?t=1020
 * 
 */

/*
 * rules of method overriding
 * 1. the argument list of the child class should match the parent class
 * 2. access modifier of the class should be less restrictive than the parent class
 * 3. local parameters cannot be overriden
 * 
 */


package Edureka111;

public class MethodOVERRIDING {
    public static void main(String[] args) {
        System.out.println("MethodOVERRIDING.main()");

        ChildClass xxx = new ChildClass();
        xxx.display();
        System.out.println(" ");
        xxx.myMethod();
    }
    
}


/* *********************************************************** */
/* *********************************************************** */
class ParentClass {
    protected void display() {
        System.out.println("display() from parent class");
    }

    protected void myMethod() {
        System.out.println("myMethod() from parent class");
    }
}


/* *********************************************************** */
/* *********************************************************** */
class ChildClass extends ParentClass {

    public void display() {
        System.out.println("display() from child class");
    }

    public void myMethod() {
        super.myMethod();
        System.out.println("myMethod() from child class");
    }
}




