
// import java.io.*;
import java.lang.Thread;


public class Lesson04aaa {
    public static void main(String[] args) {
        System.out.println("LESSON 04 - LOOPS");

        xxx111();
        spacer();
        xxx222();
        spacer();
        xxx333();
        spacer();
        xxx444();
    }


    static void spacer() {
        System.out.println(" ");
        System.out.println("###############################################");
        System.out.println("###############################################");
        System.out.println(" ");
    }




    static void xxx111() {
        try {
            System.out.println("while loop 1:");
            int i = 1;
            while (i <= 20) {
                System.out.println(i);
                i++;
                Thread.sleep(250);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }




    static void xxx222() {
        // while loop using "if" and "continue"
        try {
            System.out.println("while loop 2:");
            int i = 1;
            while (i <= 30) {
                if (i == 3) {
                    i = i + 10;
                    continue;
                }
                System.out.println(i);
                i++;
                Thread.sleep(250);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }



    static void xxx333() {
        // prints only odd numbers
        try {
            System.out.println("while loop 3:");
            int i = 1;
            while (i <= 30) {
                if ((i % 2) == 0) {
                    // ^prints only odd numbers
                    i++;
                }
                System.out.println(i);
                i++;
                Thread.sleep(250);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    static void xxx444() {
        // using break statement
        try {
            System.out.println("while loop 4:");
            int i = 1;
            while (i <= 30) {
                if ((i % 2) == 0) {
                    // ^prints only odd numbers
                    i++;
                }
                System.out.println(i);
                i++;
                Thread.sleep(250);

                if (i > 20) {
                    System.out.println("break!");
                    break;
                }
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

// pause muna dito: https://youtu.be/efvZmFd1prA?t=245
    
}


