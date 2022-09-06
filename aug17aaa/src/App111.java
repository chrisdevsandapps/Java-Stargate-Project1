
public class App111 {
    public static void main(String[] args) {
        System.out.println(" ");
        OuterClass outer1 = new OuterClass();
        outer1.displayInner();
        System.out.println(" ");

    }
}


class OuterClass {
    private int num = 10;

    private class InnerClass {
        private void print() {
            System.out.println("this is an inner class");
        }
        private void processOuterVar() {
            System.out.println(num * 10);
        }
    }

    public void displayInner() {
        InnerClass inner1 = new InnerClass();
        inner1.print();
        inner1.processOuterVar();
    }
}