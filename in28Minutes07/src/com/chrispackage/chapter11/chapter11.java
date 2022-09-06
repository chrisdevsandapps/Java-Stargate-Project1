package com.chrispackage.chapter11;

public class chapter11 {
    public static void main(String[] args) {
        Animal dog = new Animal(12);
        Animal cat = new Animal(15);

        System.out.println("cat: " + cat.id);
        System.out.println("dog: " + dog.id);
        Animal dogReference1 = dog;
        System.out.println("dogRef1: " + dogReference1.id);
        Animal dogReference2 = dog;
        System.out.println("dogRef2: " + dogReference2.id);

        System.out.println(" ");
        dogReference2.id = 888;
        System.out.println("dogRef2: " + dogReference2.id);
        System.out.println("dog: " + dog.id);
        System.out.println("dogRef1: " + dogReference1.id);
        System.out.println(" ");
        System.out.println("cat address: \t\t" + cat.hashCode());
        System.out.println("dog address: \t\t" + dog.hashCode());
        System.out.println("dogRef1 address: \t" + dogReference1.hashCode());
        System.out.println("dogRef2 address: \t" + dogReference2.hashCode());
    }
}


