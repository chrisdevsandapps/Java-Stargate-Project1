
import java.util.ArrayList;
import java.util.List;


public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        System.out.println(" ");

        User u1 = new User();
        u1.setName("Bill");
        u1.setMembership(Membership.Silver);
        u1.NameAndMembership();

        System.out.println(" ");

        User u2 = new User();
        u2.setName("Elon");
        u2.setMembership(Membership.Gold);
        u2.NameAndMembership();


        User.ClassCount();

        System.out.println(" ");


        List<User> users = new ArrayList<User>();
        users.add(u1);
        users.add(u2);


        users.get(0).NameAndMembership();
        users.get(1).NameAndMembership();

    }
}


