/*
 * 
 * lesson 09
 * arrays
 * 
 * array is a variable that holds values
 */

 import java.util.Arrays;
 import java.lang.Thread;


 public class Lesson09 {
    public static void main(String[] args) {
        xxx111();

        xxx222();
    }


    public static void xxx111() {

        int[] randomArray;

        int[] numberArray = new int[10];

        randomArray = new int[20];
        randomArray[1] = 2;

        // String[] strArray = {"hahaha", "hehehe", "hohoho"};


        for (int i = 0; i < numberArray.length; i++) {
            numberArray[i] = i;
        }

        int k = 1;
        while (k <= 41) {
            System.out.print('*');
            k++;
        }
        System.out.println(" ");

        for (int j = 0; j < numberArray.length; j++) {
            System.out.print("| " + j + " ");
        }
        System.out.println("|");

    }



    public static void xxx222() {

        try {
            String[][] multiArr = new String[10][10];

            for (int i = 0; i < multiArr.length; i++) {
                for (int j = 0; j < multiArr[i].length; j++) {
                    multiArr[i][j] = i + " " + j;
                    Thread.sleep(250);
                }
            }

        } catch(Exception e) {
            e.getStackTrace();
        }
    }

 }