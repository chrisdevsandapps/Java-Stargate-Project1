/*
 * 
 * 
 * https://www.youtube.com/watch?v=K1iu1kXkVoA
 * 
 */

package CodingWithJohn;

import java.util.ArrayList;
// import java.util.Arrays;


public class Xxx111 {
    public static void main(String[] args) {
        System.out.println("Xxx111.main()");

        IntegerPrinter p1 = new IntegerPrinter(888);
        p1.printInteger();

        DoublePrinter p2 = new DoublePrinter(888.999);
        p2.printDouble();

        System.out.println(" ");
        System.out.println(" ");

        // using generics
        // GPrinter<Integer> gen1 = new GPrinter<>(888999);
        // gen1.PrintGeneric();

        // GPrinter<Double> gen2 = new GPrinter<>(888999.999888);
        // gen2.PrintGeneric();

        // GPrinter<String> gen3 = new GPrinter<>("hello");
        // gen3.PrintGeneric();

        
        // yung mga generics sa standard library ng java
        // arraylist
        ArrayList<Dog> x1 = new ArrayList<>();
        x1.add(new Dog("weuyrue"));
        x1.add(new Dog("poirt"));
        x1.add(new Dog("iurtri"));
        // System.out.println(Arrays.toString(x1));

    }
    
}


/* ************************************************************ */
/* ************************************************************ */
/* ************************************************************ */
/* ************************************************************ */
/* ************************************************************ */
/* ************************************************************ */
// without generics:
class IntegerPrinter {
    Integer thingToPrint;

    public IntegerPrinter(Integer inputInteger) {
        this.thingToPrint = inputInteger;
    }

    public void printInteger() {
        System.out.println(thingToPrint);
    }

}
class DoublePrinter {
    Double thingToPrint;

    public DoublePrinter(Double inputDouble) {
        this.thingToPrint = inputDouble;
    }

    public void printDouble() {
        System.out.println(thingToPrint);
    }

}




/* ************************************************************ */
/* ************************************************************ */
/* ************************************************************ */
/* ************************************************************ */
/* ************************************************************ */
/* ************************************************************ */
// using generics
class GenericPrinter <TTT> {
    TTT thingToPrint;

    public GenericPrinter(TTT inputGenericType) {
        this.thingToPrint = inputGenericType;
    }

    public void PrintGeneric() {
        System.out.println(thingToPrint);
    }

}


class Dog {
    private String dogname;

    public void setDogname(String inputString) {
        this.dogname = inputString;
    }
    public String getDogname() {
        return dogname;
    }
    public Dog(String inputDogname) {
        setDogname(inputDogname);
    }
    public void bark() {
        System.out.println("awr awr!");
    }
}