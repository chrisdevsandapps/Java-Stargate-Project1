
/*
 * lesson 2
 * https://www.youtube.com/watch?v=yYN8u90MKCg
 * about user input
 * 
 */
import java.util.Scanner;

public class Lesson02 {
    // ^ notice that class name is the same as java file "Lesson02.java"

    /* create a new scanne object: */
    static Scanner userInput = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("LESSON 02");

        System.out.println("Enter your Favorite Number: \t");

        if (userInput.hasNextInt()) {
            /* if the next thing typed into the keyboard is an integer, perform all the code here */
            /*
             * different version of the .has*
             * .hasNextDouble(), .hasNextFloat()
             * Boolean, Byte, Long, Short
             */

            int numberEntered = userInput.nextInt();

            /*
             * other .next..
             * nextDouble(), nextFloat(), nextLine()
             */

             System.out.println("You entered " + numberEntered + "!!!");

             // just some practice manipulation
             int numEnteredTimesTwo = numberEntered * 2;
             System.out.println("number entered times 2: " + numEnteredTimesTwo);
             // https://youtu.be/yYN8u90MKCg?t=643

        } else {
            System.out.println("Please enter and integer only.");

        }


        spacer();

        //random number
        int randomNum123 = (int)(Math.random() * 11); // outputs: 0 ~ 10
        System.out.println("random number: " + randomNum123);
        
        randomNumMax10();
        randomNumMax10();
        randomNumMax10();
        randomNumMax10();
        randomNumMax10();
        randomNumMax10();
        randomNumMax10();
        randomNumMax10();
        randomNumMax10();
        randomNumMax10();
    }


    static void spacer() {
        System.out.println(" ");
        System.out.println("###############################################");
        System.out.println("###############################################");
        System.out.println(" ");
    }

    static void randomNumMax10() {
        int xxx = (int)(Math.random() * 11);
        System.out.println("random number: " + xxx);
    }
}


/*
 * abosulte value ----- Math.abs(integerVariableHere)
 * whichIsBigger ----- Math.max(inputA, inputB)
 * whichIsSmaller ----- Math.min(inputA, inputB)
 * squarRoot ----- Math.sqrt(5.23)   // datatype should be double
 * ceiling ----- (int)Math.ceil(5.23) .  // 6
 * floor ----- (int)Math.floor(5.23)   // 5
 * round ----- (int)Math.round(5.23)  // 5
 * round ----- (int)Math.round(5.63)  // 6 
 * randomNum ----- (int)Math.random() // random output between .0 ~ 0.99999
 */