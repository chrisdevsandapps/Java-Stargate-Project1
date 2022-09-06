

public class App222 {
    public static void main(String[] args) {
        System.out.println(" ");
        FreshJuice juice1 = new FreshJuice();
        juice1.size = FreshJuice.FreshJuiceSize.MEDIUM;
        System.out.println("size: " + juice1.size);
        System.out.println(" ");

    }
}

class FreshJuice {
    enum FreshJuiceSize {
        SMALL, MEDIUM, LARGE
    }
    FreshJuiceSize size;


}



