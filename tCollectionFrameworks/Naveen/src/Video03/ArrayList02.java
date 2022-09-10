/*
 * topic:
 * we can store specific type of data in a particular arraylist
 * 
 * using generics arraylist
 * 
 * timeline: https://youtu.be/Kvz_gplV7AU?t=1163
 * 
 */

package Video03;

import java.util.ArrayList;

public class ArrayList02 {
    public static void main(String[] args) {
        System.out.println("ArrayList02.main()");

        xxx111();

    }

    static void xxx111() {

        ArrayList<Integer> xxx = new ArrayList<>();
        xxx.add(100);
        xxx.add(100);
        xxx.add(100);

    }
    
}
