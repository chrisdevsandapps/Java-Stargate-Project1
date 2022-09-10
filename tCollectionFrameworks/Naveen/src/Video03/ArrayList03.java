/*
 * 
 * iteration
 * https://youtu.be/Kvz_gplV7AU?t=1393
 * 
 */

package Video03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class ArrayList03 {
    public static void main(String[] args) {
        System.out.println("ArrayList03.main()");
        spacer();
        xxx111();
        spacer();
        xxx222();
    }

    static void xxx111() {
        System.out.println("printing arrayList:\n");

        ArrayList<String> studentList = new ArrayList<>();
        studentList.add("Jenifer");
        studentList.add("Janelle");
        studentList.add("Jane");
        studentList.add("Joan");
        studentList.add("Joy");



        System.out.println("using for-loop:");
        // using for-loop
        for (int i = 0; i < studentList.size(); i++) {
            System.out.println(studentList.get(i));
        }
        spacer();



        System.out.println("using for-each loop:");
        // using for-each loop
        for (String item : studentList) {
            System.out.println(item);
        }
        spacer();

        

        System.out.println("using lambda function:");
        // using lambda function
        studentList.stream().forEach(item -> System.out.println(item));
        spacer();


        
        System.out.println("using iterator:");
        // using iterator
        Iterator<String> ite = studentList.iterator();
        while (ite.hasNext()) {
            System.out.println(ite.next());
        }
        spacer();
    }
    

    static void xxx222() {
        System.out.println("creating arraylist from Arrays.asList():\n");

        ArrayList<String> newList1 = new ArrayList<String>(Arrays.asList("aaa", "bbb", "ccc", "ddd", "eee"));
        newList1.stream().forEach(item -> System.out.println(item));

        spacer();

        ArrayList<Integer> newList2 = new ArrayList<Integer>(Arrays.asList(111, 222, 333, 444, 555));
        newList2.stream().forEach(item -> System.out.println(item));
        
        spacer();

        System.out.println(newList1.get(2));
        System.out.println(newList2.get(2));

    }

    static void spacer() {
        System.out.println(" ");
    }
    
}
