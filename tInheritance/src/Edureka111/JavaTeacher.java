package Edureka111;

public class JavaTeacher extends Teacher {
    String mainSubject = "Java";    

    public static void main(String args[]) {

        JavaTeacher xxx1 = new JavaTeacher();
        System.out.println(xxx1.collegeName);
        System.out.println(xxx1.designation);
        System.out.println(xxx1.mainSubject);
        xxx1.does();
    }
}
