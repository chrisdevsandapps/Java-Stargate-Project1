package com.chrispackage.package1;


public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        System.out.println(" ");

        MultiplicationTable t1 = new MultiplicationTable();
        t1.print();
        System.out.println(" ");
        MultiplicationTable t2 = new MultiplicationTable();
        t2.print(10, 10);
        System.out.println(" ");
        MultiplicationTable t3 = new MultiplicationTable();
        t3.print(9, 10, 20);

    }


}
