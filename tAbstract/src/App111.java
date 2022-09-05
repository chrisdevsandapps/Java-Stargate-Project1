
abstract class Dog {
    String breed;
    public void bark() {
        System.out.println("bark!!!");
    }
}

class Husky extends Dog {

}

public class App111 {
    public static void main(String[] args) throws Exception {
        System.out.println("abstract test");

        Husky h1 = new Husky();
        h1.bark();
    }
}


/*
abstract class cannot be instatiated
kaya hindi pwede ito:

public class App {
    public static void main(String[] args) throws Exception {
        Dog d1 = new Dog();
        d1.bark();
    }
}


*/