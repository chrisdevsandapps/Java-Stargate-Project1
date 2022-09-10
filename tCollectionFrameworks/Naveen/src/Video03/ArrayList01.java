/*
 * it is a default class available in java
 * can behave as dynamic array
 * 
 * 
 */


package Video03;

import java.util.Arrays;
import java.util.ArrayList;

public class ArrayList01 {
    public static void main(String[] args) {
        System.out.println("ArrayList01.main()");

        myStaticArray();
        System.out.println(" ");
        myArrayList111();
        System.out.println(" ");
        arrayListCapacityDemo();
    }


    /* ********************************************************** */
    /* ********************************************************** */
    /* ********************************************************** */
    static void myStaticArray() {
        /*
         * sa static array, need maglaan ng lenght
         */
        int xxx[] = new int[5];
        xxx[0] = 111;
        
        for (int i = 0; i < xxx.length; i++) {
            xxx[i] = i + 100;
        }

        System.out.println(Arrays.toString(xxx));

    }
    /* ********************************************************** */
    /* ********************************************************** */
    /* ********************************************************** */
    static void myArrayList111() {
        ArrayList<Object> xxx = new ArrayList<>();
        xxx.add(100);
        xxx.add(200);
        xxx.add(300);
        xxx.add("hello");
        xxx.add(888.999);
        xxx.add(true);
        
        System.out.println(xxx);


        System.out.println("\nprinting the value on specific index:");
        System.out.println("at index 2: " + xxx.get(2));
        System.out.println("at index 5: " + xxx.get(5));
        /* 
         * kapag sumobra ang get(index na sobra)
         * mag error: indexOutOfBoundsException
         * example:
         * xxx.get(6) --- error, 5 lang ang max value nung current arraylist
         * xxx.get(-1) --- error
         */

        System.out.println("\ngetting the size:");
        System.out.println("size: " + xxx.size());


        // to get the highest index:
        System.out.println("highest index: " + (xxx.size() - 1));


        // kapag nag add ng value, size will increase automatically
        System.out.println("\nadding two items:");
        xxx.add("hahaha");
        xxx.add(333);
        System.out.println("size: " + xxx.size());
        System.out.println("highest index: " + (xxx.size() - 1));

    }

    /* ********************************************************** */
    /* ********************************************************** */
    /* ********************************************************** */
    static void arrayListCapacityDemo() {
        System.out.println("\ncapacity demo:");
        ArrayList<Object> hehe = new ArrayList<>();

        System.out.println(hehe.size()); // <-- physical capacity = 0

        hehe.add(100);

        System.out.println(hehe.size()); // <-- physical capacity = 1

        // virtual capacity can be seen using debug
        // see timeline: https://youtu.be/Kvz_gplV7AU?t=1008
        //
        // to add virtual capacity, other than the default of 10:
        // for example, add 20:
        // ArrayList<Object> hehe = new ArrayList<>(20);
    }
    
}

/*
 * SOME NOTES:
 * virtual capacity of arraylist:
 * 
 * the moment we declare an arraylist as below,
 * "ArrayList<Object> xxx = new ArrayList<>();"
 * 
 * java will create an arraylist inside the memory.
 * by default, it will be divided into 10 equal parts
 * 
 * kaya ang initial virtual capacity ng arraylist is "10" by default
 * index 0 - 9
 * 
 * kapag nag add ng mga items, mababawas ang virtual capacity, 
 * while the physical capacity will increase
 * 
 */