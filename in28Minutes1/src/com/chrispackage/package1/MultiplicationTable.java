package com.chrispackage.package1;

public class MultiplicationTable {

    void print() {
        print(8, 1, 10);
    }

    void print(int num, int maxNum) {
        print(num, 1, maxNum);
    }

    void print(int num, int from, int to) {
        for(int i = from; i <= to; i++) {
            System.out.printf("%d * %d = %d", num, i, num * i).println();
        }
    }
}
