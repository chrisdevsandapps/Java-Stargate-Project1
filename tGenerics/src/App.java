// public class App {
//     public static void main(String[] args) throws Exception {
//         System.out.println("Hello, World!");
//     }
// }



public class App {
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