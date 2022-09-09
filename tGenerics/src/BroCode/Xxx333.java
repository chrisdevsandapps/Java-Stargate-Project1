/*
 * 
 * generic class
 * timeline: https://youtu.be/jUcAyZ5OUm0?t=443
 * 
 */

package BroCode;

public class Xxx333 {
    public static void main(String[] args) {
        System.out.println("Xxx333.main()");

        MyIntegerClass myInt = new MyIntegerClass(1);
        MyDoubleClass myDbl = new MyDoubleClass(3.14);
        MyCharacterClass myChar = new MyCharacterClass('a');
        MyStringClass myStr = new MyStringClass("hello");

        System.out.println(myInt.getValue());
        System.out.println(myDbl.getValue());
        System.out.println(myChar.getValue());
        System.out.println(myStr.getValue());


        System.out.println("\nusing generics class:");
        MyGenClass<Integer> myIntG = new MyGenClass<>(1);
        MyGenClass<Double> myDblG = new MyGenClass<>(3.14);
        MyGenClass<Character> myCharG = new MyGenClass<>('a');
        MyGenClass<String> myStrG = new MyGenClass<>("hello");

        System.out.println(myIntG.getValue());
        System.out.println(myDblG.getValue());
        System.out.println(myCharG.getValue());
        System.out.println(myStrG.getValue());
    }
    
}


class MyIntegerClass {
    Integer xxx;
    MyIntegerClass(Integer input) {
        this.xxx = input;
    }
    public Integer getValue() {
        return xxx;
    }
}
class MyDoubleClass {
    Double xxx;
    MyDoubleClass(Double input) {
        this.xxx = input;
    }
    public Double getValue() {
        return xxx;
    }
}
class MyCharacterClass {
    Character xxx;
    MyCharacterClass(Character input) {
        this.xxx = input;
    }
    public Character getValue() {
        return xxx;
    }
}
class MyStringClass {
    String xxx;
    MyStringClass(String input) {
        this.xxx = input;
    }
    public String getValue() {
        return xxx;
    }
}


// using generics
class MyGenClass <TTT> {
    TTT xxx;
    MyGenClass(TTT input) {
        this.xxx = input;
    }
    public TTT getValue() {
        return xxx;
    }
}


/*
 * PAUSE MUNA: TIMELINE: 
 */