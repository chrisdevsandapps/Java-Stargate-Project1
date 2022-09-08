/*
 * lesson 05
 * methods and fields
 * 
 */


// import java.io.*;
// import java.lang.Thread;
// import java.util.Scanner;

public class Lesson05 {
    public static void main(String[] args) {
        System.out.println("Lesson 05 - Methods and Fields");
        spacer();
        testMethod1(888, 999);
        spacer();
        xxx111();
    }

    // static variable
    public static double myGlobalVar = 3.141659; // class variable

    // static method
    public static void testMethod1(int a, int b) {

        System.out.println("result: " + (a + b));
        double localVar = 58475.0;
        System.out.println("local var: " + localVar);
        System.out.println("global var: " + myGlobalVar);


        // changing the global variable:
        myGlobalVar = myGlobalVar + 100;
        System.out.println("global var: " + myGlobalVar);



        // try to override global variable:
        double myGlobalVar = 888;
        System.out.println("global var: " + myGlobalVar);
    }


    // pass by value:
    public static void xxx111() {
        System.out.println("pass by value:");

        int ddd = 5;

        System.out.println("ddd: " + ddd);
        tryToChange(ddd);
        System.out.println("ddd: " + ddd);
    }

    public static void tryToChange(int ddd) {
        ddd = ddd + 100;
        System.out.println("tryToChange() ddd: " + ddd);
    }



    static void spacer() {
        System.out.println(" ");
        System.out.println("###############################################");
        System.out.println("###############################################");
        System.out.println(" ");
    }    


}


//  pause muna: https://youtu.be/1HTsLK_m2ao?t=560