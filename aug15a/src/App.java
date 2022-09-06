

import java.util.ArrayList;
import java.util.List;
//MAIN CLASS
public class App {
    static void spacer() {System.out.println(" ");}
    public static void main(String[] args) throws Exception {
        spacer();
        User.ClassCount();

        User u1 = new User();
        u1.SetName("Bill");
        u1.SetMembership(MembershipEnum.Silver);
        u1.NameAndMembership();
        User.ClassCount();

        User u2 = new User("Elon", "Special");
        User.ClassCount();

        List<User> users = new ArrayList<User>();
        users.add(u1);
        users.add(u2);
        users.add(new User());
        User.ClassCount();
        users.add(new User());
        User.ClassCount();
        users.add(new User("Joe", MembershipEnum.Silver));
        User.ClassCount();
        users.add(new User()); // <-- wala talagang input ito, para ma-trigger yung isang constructor na defaultUser ang laman
        User.ClassCount();
        users.add(new User()); // <-- wala talagang input ito, para ma-trigger yung isang constructor na defaultUser ang laman
        User.ClassCount();

        users.get(0).NameAndMembership();
        users.get(1).NameAndMembership();
        users.get(2).SetName("Lex");
        users.get(2).SetMembership(MembershipEnum.Bronze);
        users.get(2).NameAndMembership();
        users.get(3).SetName("Jen");
        users.get(3).SetMembership(MembershipEnum.Bronze);
        users.get(3).NameAndMembership();
        users.get(4).NameAndMembership();
        users.get(5).NameAndMembership();

        spacer();
        //traditional for-loops
        System.out.println("using traditional for-loops:");
        for (int i = 0; i < users.size(); i++) {
            System.out.println(users.get(i).GetName());
        }
        spacer();
        //range based for-loops
        System.out.println("using range based for-loops");
        for (User i : users) {
            System.out.println(i.GetName());
        }

        // override method demonstration
        spacer();
        System.out.println("method override demo:");
        System.out.println(users.get(0));
        System.out.println(users.get(1));
        System.out.println(users.get(2));
        System.out.println(users.get(3));
        System.out.println(users.get(4));
        System.out.println(users.get(5));

        // comparing
        spacer();
        System.out.println("comparing:");
        System.out.println(users.get(0) ==  users.get(1));
        System.out.println(users.get(0).equals(users.get(1)));
        System.out.println(users.get(5).equals(users.get(6)));



        // static member
        // admins
        spacer(); spacer();
        System.out.println("static data members");
        System.out.println("admins:");
        User.admins = new ArrayList<User>();
        User.admins.add(new User("Tom", MembershipEnum.Gold));
        User.admins.add(new User("Brad", MembershipEnum.Silver));
        User.admins.add(new User("Jennifer", MembershipEnum.Bronze));

        for (int i = 0; i < User.admins.size(); i++) {
            System.out.println(User.admins.get(i).GetName());
        }
        spacer();
        for (User i : User.admins) {
            System.out.println(i.GetName());
        }


        // static methods
        spacer(); spacer();
        System.out.println("static methods:");
        User.PrintAdmins();


        // inheritance
        spacer(); spacer();
        System.out.println("inheritance:");
        Student s1 = new Student();
        System.out.println(s1.GetIsVerified());
        Student.ClassCount();
        s1.NameAndMembership();
        s1.SetName("June");
        s1.SetMembership(MembershipEnum.Silver);
        s1.NameAndMembership();
        s1.verify();

        Teacher t1 = new Teacher();
        t1.SetName("MsAure");
        t1.SetMembership(MembershipEnum.Gold);
        t1.NameAndMembership();
        t1.verify();

        User.admins.add(s1);
        User.admins.add(t1);
        User.PrintAdmins();

        spacer(); spacer();
        for (User i : User.admins) {
            i.verify();
        }



    }

}
// ##################################################
// ##################################################
// ##################################################
// ##################################################
// ##################################################
// CLASS User:
class User {
    //PrivateFields:
    protected static int _count;
    protected boolean _isVerified = false;
    private String _username;
    private String _membershipType;
    // ##################################################
    //PublicFiels:
    public static List<User> admins;
    // ##################################################
    //Getters:
    String GetName() {
        return _username;
    }
    String GetMembership() {
        return _membershipType;
    }
    public boolean GetIsVerified() {
        return _isVerified;
    }
    // ##################################################
    //Setters:
    void SetName(String name) {
        _username = name;
    }
    void SetMembership(String membership) {
        _membershipType = membership;
    }
    void SetMembership(MembershipEnum membershipEnum ) {
        _membershipType = membershipEnum.name();
    }
    public void SetIsVerified(boolean isVerified) {
        _isVerified = isVerified;
    }
    // ##################################################
    //Constructors:
    User() {
        _count = _count + 1;
        SetName("defltUsr");
        SetMembership("noMembership");
    }
    User(String name, String membership) {
        SetName(name);
        SetMembership(membership);
        _count = _count + 1;
    }
    User(String name, MembershipEnum membershipInEnum) {
        SetName(name);
        SetMembership(membershipInEnum);
        _count = _count + 1;
    }
    // ##################################################
    //Methods-Public:
    public void NameAndMembership() {
        System.out.println("name: " + GetName() + " \t|\t membershipType: " + GetMembership());
    }
    public String toString() {
        return GetName() + " " + GetMembership();
    }
    public boolean equals(User comparedUser) {
        if(GetName() == comparedUser.GetName() && GetMembership() == comparedUser.GetMembership()) {
            return true;
        }
        else {
            return false;
        }
    }
    // ##################################################
    //Methods-protected:
    protected void verify() {
        System.out.println("veryfying...");
        SetIsVerified(true);
    }
    // ##################################################
    //Methods-Public-Static:
    public static void ClassCount() {
        System.out.println("Class count: " + _count);
    }
    public static void PrintAdmins() {
        System.out.println("admins list:");
        for (User i : admins) {
            System.out.println(i.GetName());
        }
    }

}
// ##################################################
// ##################################################
// ##################################################
// ##################################################
// ##################################################
// ENUM Membership:
enum MembershipEnum {
    Bronze,
    Silver,
    Gold;
}



// ##################################################
// ##################################################
// ##################################################
// ##################################################
// ##################################################
// INHERITANCE:
class Student extends User {

    public void verify() {
        System.out.println("veryfying student..");
        SetIsVerified(true);
    }
}


// ##################################################
// ##################################################
// ##################################################
// ##################################################
// ##################################################
// INHERITANCE:
class Teacher extends User {
    public void verify() {
        System.out.println("veryfying teacher..");
        SetIsVerified(true);
    }
}
