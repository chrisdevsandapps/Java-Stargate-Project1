/*
 * https://youtu.be/P-v2951jc3s?t=1
 * 
 * various methods of arraylists
 * 
 */
package Video04;

import java.util.ArrayList;

public class ArrayList04 {
    public static void main(String[] args) {
        System.out.println("ArrayList04.main()");

        // spacer();
        // xxx111();
        // spacer();
        // xxx222();
        // spacer();
        // xxx333();
        // spacer();
        xxx444();
    }


    /* ********************************************************** */
    /* ********************************************************** */
    /* ********************************************************** */
    static void xxx111() {
        System.out.println("ArrayList04.xxx111()");
        System.out.println("adding arraylist2 to arraylist1:\n");

        ArrayList<String> studentList = new ArrayList<>();
        studentList.add("Jenifer");
        studentList.add("Janelle");
        studentList.add("Jane");
        studentList.add("Joan");
        studentList.add("Joy");

        ArrayList<String> studentList2 = new ArrayList<>();
        studentList2.add("Brad");
        studentList2.add("Tom");


        // adding arraylist2 to arraylist1:
        studentList.addAll(studentList2);

        studentList.stream().forEach(item -> System.out.println(item));



        ArrayList<String> studentList3 = new ArrayList<>();
        studentList3.add("xxx");
        studentList3.add("yyy");
        studentList3.add("zzz");



        System.out.println(" ");
        System.out.println("adding, but pasting will start at certain index:");
        studentList.addAll(2, studentList3);
        studentList.stream().forEach(item -> System.out.println(item));

    }





    /* ********************************************************** */
    /* ********************************************************** */
    /* ********************************************************** */
    static void xxx222() {
        System.out.println("ArrayList04.xxx222()");
        System.out.println("clear method");

        ArrayList<String> studentList = new ArrayList<>();
        studentList.add("Jenifer");
        studentList.add("Janelle");
        studentList.add("Jane");
        studentList.add("Joan");
        studentList.add("Joy");

        System.out.println("before clear:");
        studentList.stream().forEach(item -> System.out.println(item));

        studentList.clear();

        System.out.println("after clear:");
        studentList.stream().forEach(item -> System.out.println(item));

    }



    /* ********************************************************** */
    /* ********************************************************** */
    /* ********************************************************** */
    static void xxx333() {
        System.out.println("ArrayList04.xxx333()");
        System.out.println("clone");

        ArrayList<String> studentList = new ArrayList<>();
        studentList.add("Jenifer");
        studentList.add("Janelle");
        studentList.add("Jane");
        studentList.add("Joan");
        studentList.add("Joy");

        System.out.println("\nstudentList:");
        studentList.stream().forEach(item -> System.out.println(item));



        ArrayList<String> cloned = new ArrayList<>();
        cloned =  (ArrayList<String>)studentList.clone();

        System.out.println("\nafter clone:");
        cloned.stream().forEach(item -> System.out.println(item));

    }



    /* ********************************************************** */
    /* ********************************************************** */
    /* ********************************************************** */
    static void xxx444() {
        System.out.println("ArrayList04.xxx444()");
        System.out.println("check if it contains..");

        ArrayList<String> studentList = new ArrayList<>();
        studentList.add("Jenifer");
        studentList.add("Janelle");
        studentList.add("Jane");
        studentList.add("Joan");
        studentList.add("Joy");

        System.out.println("\nstudentList:");
        studentList.stream().forEach(item -> System.out.println(item));

        System.out.println(" ");

        // to check if it contains()
        System.out.println(studentList.contains("java"));
        System.out.println(studentList.contains("Joy"));

        System.out.println(" ");

        // indexOf()
        System.out.println(studentList.indexOf("Joy"));
        System.out.println(studentList.indexOf("Joy")>1);
        System.out.println(studentList.indexOf("Joy")>5);

    }

    // pause: https://youtu.be/P-v2951jc3s?t=465
    

    /* ********************************************************** */
    /* ********************************************************** */
    /* ********************************************************** */
    static void spacer() {
        System.out.println(" ");
        System.out.println("*******************************************************");
        System.out.println(" ");
    }
    
}
