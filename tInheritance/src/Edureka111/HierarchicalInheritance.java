package Edureka111;

public class HierarchicalInheritance {
    public static void main(String[] args) {
        System.out.println("hierachical inheritance");
        System.out.println("HierarchicalInheritance.main()");
        System.out.println(" ");

        ChineseResto chinese111 = new ChineseResto();
        chinese111.displayParent();
        chinese111.displayChinese();
    }
    
}


class ParentResto {
    void displayParent() {
        System.out.println("request to pass bread from parent resto");
        System.out.println("request to pass vege stew from parent resto");
        System.out.println("request to pass cheese from parent resto");
    }
}

class ChineseResto extends ParentResto {
    void displayChinese() {
        System.out.println("noodles available");
        System.out.println("momos available");
    }
}

class MexicanResto extends ParentResto {
    void displayMexican() {
        System.out.println("nachos available");
        System.out.println("sweet potato available");
    }
}

class ItalianResto extends ParentResto {
    void displayItalian() {
        System.out.println("pasta available");
        System.out.println("sausage available");
    }
}