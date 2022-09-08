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

        spacer();

        // xxx222();

        // spacer();

        xxx333();

        spacer();

        xxx444();

        spacer();

        xxx555();

        spacer();

        xxx666();
    }


    /* ************************************************** */
    /* ************************************************** */
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


    /* ************************************************** */
    /* ************************************************** */
    public static void xxx222() {
        try {
            String[][] multiArr = new String[10][10];
            // put in in the array:
            for (int i = 0; i < multiArr.length; i++) {
                for (int j = 0; j < multiArr[i].length; j++) {
                    multiArr[i][j] = i + " " + j;
                }
            }

            print61Lines();
            // display the array:
            for(int i = 0; i < multiArr.length; i++) {
                Thread.sleep(1000);
                for(int j = 0; j < multiArr[i].length; j++) {
                    System.out.print("| " + multiArr[i][j] + " ");
                    Thread.sleep(250);
                }
                System.out.println("=)");
            }
                     
            print61Lines();
            
        } catch(Exception e) {
            e.getStackTrace();
        }
    }

    /* ************************************************** */
    /* ************************************************** */
    static void xxx333() {
        int[] numberArray = new int[10];

        for (int i = 0; i < numberArray.length; i++) {
            numberArray[i] = i;
        }

        for (int row : numberArray) {
            System.out.println(row);
        }
        System.out.println("\n");
    }


    /* ************************************************** */
    /* ************************************************** */
    static void xxx444() {
        // using enhanced for-loop

        String[][] multiArr = new String[10][10];

        for (int i = 0; i < multiArr.length; i++) {
            for (int j = 0; j < multiArr[i].length; j++) {
                multiArr[i][j] = i + " " + j;
            }
        }

        print61Lines();
        for (String[] rows : multiArr) {
            for (String column : rows) {
                System.out.print("| " + column + " ");
            }
            System.out.println("|");
        }
        print61Lines();

    }

    /* ************************************************** */
    /* ************************************************** */
    static void xxx555() {
        // copy an array

        int[] numberArray = new int[10];
        for (int i = 0; i < numberArray.length; i++) {
            numberArray[i] = i;
        }
        for (int item : numberArray) {
            System.out.println(item);
        }
        System.out.println("\n");


        int[] numCopy = Arrays.copyOf(numberArray, 6);

        for (int item : numCopy) {
            System.out.println(item);
        }
        System.out.println("\n");

    }


    /* ************************************************** */
    /* ************************************************** */
    static void xxx666() {
        // copy a part of an array

        int[] numberArray = new int[10];
        for (int i = 0; i < numberArray.length; i++) {
            numberArray[i] = i;
        }
        for (int item : numberArray) {
            System.out.println(item);
        }
        System.out.println("\n");


        int[] numCopy = Arrays.copyOfRange(numberArray, 3, 6);

        for (int item : numCopy) {
            System.out.println(item);
        }
        System.out.println("\n");


        //method to print array:
        System.out.println("numCopy: "+ Arrays.toString(numberArray));
        System.out.println("numCopy: "+ Arrays.toString(numCopy));



        // fill array with values
        int[] xxx = new int[30];
        Arrays.fill(xxx, 8);
        System.out.println("numCopy: "+ Arrays.toString(xxx));


        char[][] boardGame = new char[10][10];
        for (char[] row : boardGame) {
            Arrays.fill(row, '*');
        }



        int[] numToSort = new int[10];

        for(int i =0; i < 10; i++) {
            numToSort[i] = (int)(Math.random() * 100);
        }
        System.out.println("numCopy: "+ Arrays.toString(numToSort));

        Arrays.sort(numToSort);
        System.out.println("numCopy: "+ Arrays.toString(numToSort));



        // binary search
        int whereIs50 = Arrays.binarySearch(numToSort, 50);
        System.out.println(whereIs50);

    }


    /* ************************************************** */
    /* ************************************************** */
    static void spacer() {
        System.out.println(" ");
        System.out.println("###############################################");
        System.out.println("###############################################");
        System.out.println(" ");
    }

    /* ************************************************** */
    /* ************************************************** */
    static void print61Lines() {
        int k = 1;
        while (k <= 61) { 
            System.out.print('-'); 
            k++; 
        }
        System.out.println(); 
    }



 }