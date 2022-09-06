
import com.packageOne.ChrisTools;
import com.packageTwo.MySampleClassOne;



public class Test {
    public static void main(String[] args) {
        System.out.println("hello world from Test.java");

        ChrisTools add1 = new ChrisTools();
        
        System.out.println("sum: " + add1.Add(888, 999));

        ChrisTools.StaticAdd(888, 999);

        com.packageOne.ChrisTools xxx = new ChrisTools();
        int yyy = xxx.Add(4324234, 897483);
        System.out.println(yyy);


        MySampleClassOne.StaticAdd(333, 555);
    }
}

