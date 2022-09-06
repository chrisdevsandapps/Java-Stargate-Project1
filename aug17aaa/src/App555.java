// https://www.tutorialspoint.com/java/java_inheritance.htm



public class App555 {
    public static void main(String[] args) {
        
        SuperClass super111 = new SuperClass(55);
        super111.GetAge();

        SubClass sub111 = new SubClass(33);
        sub111.GetAge();
    }    
}






class SuperClass  {
    String text1 = "this is the value of variable age in this xxxClass: ";
    int age;
    SuperClass(int age) {
        this.age = age;
    }
    public void GetAge() {
        System.out.println(text1 + age);
    }

}

class SubClass extends SuperClass {
    SubClass(int age) {
        super(age);
    }
}














































// public class App555 {
//     public static void main(String[] args) {
//         SubClass xxx111 = new SubClass();
//         xxx111.MyMethod();
//     }    
// }

// class SuperClass  {
//     int num = 888;
//     public void display() {
//         System.out.println("this is the display() method of SuperClass");
//     }
// }

// class SubClass extends SuperClass {
//     int num = 999;
//     public void display() {
//         System.out.println("this is the display() method of SubClass");
//     }
//     public void MyMethod() {
//         this.display();
//         super.display();
//         System.out.println("value of variable num in this class: " + this.num);
//         System.out.println("value of variable num in superclass: " + super.num);
//     }
// }



