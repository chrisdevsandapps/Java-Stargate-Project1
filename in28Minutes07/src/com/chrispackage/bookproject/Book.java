package com.chrispackage.bookproject;

public class Book {
    private String name;
    private int nCopies;

    public Book(String name) {
        this.name = name;
    }

    void print() {
        System.out.println("bookName: " + this.name + ", copies: " + this.nCopies);
    }

    void setNumOfCopies(int nCopies) {
        if (nCopies > 0) {
            this.nCopies = nCopies;
        }
    }

    int getCopies() {
        return this.nCopies;
    }

    void increaseNoOfCopies(int howMuch) {
        setNumOfCopies(this.nCopies + howMuch);
    }
    void decreaseNoOfCopies(int howMuch) {
        setNumOfCopies(this.nCopies - howMuch);
    }
}
