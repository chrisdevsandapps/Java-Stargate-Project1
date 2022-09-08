/*
 * 
 * multi level inheritance
 * 
 */


package Edureka111;

public class MultiLevelInheritance {
    public static void main(String[] args) {
        Area xxx = new Area();
        System.out.println(xxx.sum(10, 20));
        System.out.println(xxx.dif(100, 20));
        System.out.println(xxx.mul(15, 25));
        System.out.println(xxx.div(100, 20));
        System.out.println(xxx.sqr(100));
        System.out.println(xxx.squareroot(16));
        System.out.println(xxx.mod(100, 20));
        System.out.println(xxx.square(16));
        System.out.println(xxx.rectangle(30, 20));
        System.out.println(xxx.circle(20));
    }
}


class Calculator {
    public float mul(float a, float b) {
        return a * b;
    }
    public float dif(float a, float b) {
        return a - b;
    }
    public float sum(float a, float b) {
        return a + b;
    }
    public float div(float a, float b) {
        return a / b;
    }
}

class Advanced extends Calculator {
    public float mod(float a, float b) {
        return a % b;
    }
    public float sqr(float a) {
        return a * a;
    }
    public float squareroot(float a) {
        return (float)(Math.sqrt(a));
    }
}


class Area extends Advanced {
    public float square(float a) {
        return a * a;
    }
    public float rectangle(float a, float b) {
        return a * b;
    }
    public float circle(float r) {
        return (float) (3.1416 * r * r);
    }
}

