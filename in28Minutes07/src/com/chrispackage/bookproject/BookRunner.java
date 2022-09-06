package com.chrispackage.bookproject;

public class BookRunner {
    public static void main(String[] args) {
        Book b1 = new Book("ArtOfComputerProgramming");
        Book b2 = new Book("EffectiveJava");
        Book b3 = new Book("CleanCode");
        b1.print();
        b2.print();
        b3.print();

        b1.setNumOfCopies(100);
        b2.setNumOfCopies(200);
        b3.setNumOfCopies(300);

        b1.print();
        b2.print();
        b3.print();

        b1.increaseNoOfCopies(100);
        b2.increaseNoOfCopies(200);
        b3.increaseNoOfCopies(300);

        b1.print();
        b2.print();
        b3.print();
    }
}
