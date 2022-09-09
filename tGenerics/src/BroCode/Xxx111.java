/*
 * 
 * https://www.youtube.com/watch?v=jUcAyZ5OUm0
 * 
 */


 /*
  * generics enable types (classess and interfaces) to be parameters when defining
  * classes interfaces and methods
  * 
  * a benefit is to eliminate the need to create multiple versions of methods or
  * classes for various data types.
  *
  * use one version for all reference data types
  *  
  */

package BroCode;

public class Xxx111 {
    public static void main(String[] args) {
        System.out.println("Xxx111.main()");

        System.out.println("hello world");

        Integer[] intxxx = {111, 222, 333, 444, 555, 666};
        displayArray(intxxx);

        Double[] dblxxx = {1.11, 2.22, 3.33, 4.44, 5.55, 6.66};
        displayArray(dblxxx);

        Character[] charxxx = {'h', 'e', 'l', 'l', 'o'};
        displayArray(charxxx);

        String[] strxxx = {"aaa", "bbb", "ccc", "ddd", "eee"};
        displayArray(strxxx);


        System.out.println(getFirst(intxxx));
        System.out.println(getFirst(dblxxx));
        System.out.println(getFirst(charxxx));
        System.out.println(getFirst(strxxx));

    }

    public static <TTT> void displayArray(TTT[] inputArray) {
        for (TTT item : inputArray) {
            System.out.println(item + " ");
        }
        System.out.println("#####");
    }

    public static <TTT> TTT getFirst(TTT[] inputArray) {
        System.out.println(" ");
        return inputArray[0];
    }

    
}


