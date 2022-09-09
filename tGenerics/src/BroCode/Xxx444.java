/*
 * 
 * timeline: https://youtu.be/jUcAyZ5OUm0?t=919
 * 
 * generic classes with multiple parameters
 * 
 * note: ayaw mag run, may error, pero nageexecute naman sa jdoodle.com/online-java-compiler/
 * 
 * 
 */


package BroCode;

public class Xxx444 {
    public static void main(String[] args) {
        System.out.println("Xxx444.main()");

        MyGenClass<Integer,Integer> myIntG = new MyGenClass<>(111, 888);
        MyGenClass<Double,Double> myDblG = new MyGenClass<>(3.14, 88.99);
        MyGenClass<Character,Integer> myCharG = new MyGenClass<>('a', 888);
        MyGenClass<String,Character> myStrG = new MyGenClass<>("hello", 'x');


        myIntG.getTTTandVVV();
        myDblG.getTTTandVVV();
        myCharG.getTTTandVVV();
        myStrG.getTTTandVVV();


    }
    
}


class MyGenClass <TTT, VVV> {
    TTT xxx;
    VVV yyy;

    MyGenClass(TTT inputTTT, VVV inputVVV) {
        this.xxx = inputTTT;
        this.yyy = inputVVV;
    }
    public TTT getValueTTT() {
        return xxx;
    }
    public VVV getValueVVV() {
        return yyy;
    }
    public void getTTTandVVV() {
        System.out.println(xxx);
        System.out.println(yyy);
    }
}

