/*
 * lesson 06
 * exception handling
 * 
 * mga exception handling:
 * arithmetic exception
 * illegal argument execption
 * indes out of bound exception
 * input mismatch exception
 * io exception
 * 
 */


// import java.io.*;
// import java.lang.Thread;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Lesson06 {
    public static void main(String[] args) {
        System.out.println("Lesson 06 - Exception Handling");

        divideByZero(2);

        spacer();

        xxx111();

    }

    /* *************************************************************** */
    /* *************************************************************** */
    /* *************************************************************** */
    /* *************************************************************** */
    /* *************************************************************** */
    /* *************************************************************** */
    public static void divideByZero(int a) {
        try {
            System.out.println(a/0);
        } catch (ArithmeticException e) {
            System.out.println("you can't do that");
            System.out.println(e);
            System.out.println("message: " + e.getMessage());
            System.out.println("printing error: " + e.toString());
            e.printStackTrace();
        }
    }


    /* *************************************************************** */
    /* *************************************************************** */
    /* *************************************************************** */
    /* *************************************************************** */
    /* *************************************************************** */
    static Scanner userInput = new Scanner(System.in);

    // scanner specific exception handling
    public static void xxx111() {
        System.out.println("how old are you" );
        int age = checkValidAge();

        if (age != 0) {
            System.out.println("you are age " + age + "years old");
        }

    }


    public static int checkValidAge() {
        try {
            return userInput.nextInt();

        } catch (InputMismatchException e) {
            userInput.next();
            System.out.println("that is not a whole number");
            return 0;

        }
    }



    /* *************************************************************** */
    /* *************************************************************** */
    /* *************************************************************** */
    /* *************************************************************** */
    /* *************************************************************** */
    // public static void getAFile(String filename) {
    //     try {
            // https://youtu.be/EWj60p8esD0?t=613
    //     } catch() {

    //     }

    // }


    static void spacer() {
        System.out.println(" ");
        System.out.println("###############################################");
        System.out.println("###############################################");
        System.out.println(" ");
    }    


}

