


public class User {
    private static int _count;
    private String _name;
    private String _membership;

    void setName(String name) {
        _name = name;
    }
    String getName() {
        return _name;
    }
    void setMembership(String membership) {
        _membership = membership;
    }
    void setMembership(Membership membership ) {
        _membership = membership.name();
    }
    String get_membership() {
        return _membership;
    }


    User() {
        _count = _count + 1;
    }

    public void NameAndMembership() {
        System.out.println("name: " + getName() + 
            " | membershipType: " + get_membership());
    }

    public static void ClassCount() {
        System.out.println("Class count: " + _count);
    }




}
