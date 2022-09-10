/*
 * 
 * timeline: https://youtu.be/jUcAyZ5OUm0?t=919
 * 
 * generic classes with multiple parameters
 * 
 * 
 */


package BroCode;

public class Xxx444 {
    public static void main(String[] args) {
        System.out.println("Xxx444.main()");

        MyGenClassX<Integer,Integer> myIntG = new MyGenClassX<>(111, 888);
        MyGenClassX<Double,Double> myDblG = new MyGenClassX<>(3.14, 88.99);
        MyGenClassX<Character,Integer> myCharG = new MyGenClassX<>('a', 888);
        MyGenClassX<String,Character> myStrG = new MyGenClassX<>("hello", 'x');


        myIntG.getTTTandVVV();
        myDblG.getTTTandVVV();
        myCharG.getTTTandVVV();
        myStrG.getTTTandVVV();


    }
    
}


class MyGenClassX <TTT, VVV> {
    TTT xxx;
    VVV yyy;

    MyGenClassX(TTT inputTTT, VVV inputVVV) {
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
        System.out.println(" ");
        System.out.println(xxx);
        System.out.println(yyy);
        System.out.println(" ");
    }
}

