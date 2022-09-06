
// https://www.tutorialspoint.com/java/java_object_classes.htm

public class App333 {
    public static void main(String[] args) {
        Puppy puppy111 = new Puppy("mocha");
        puppy111.SetAge(2);
        puppy111.GetAge();
        System.out.println("class: " + puppy111.getClass());
        puppy111.Greet();
    }    
}


class Puppy {
    int _puppyAge;
    String _name;

    public Puppy(String name) {
        System.out.println("the chosen name is " + name);
        _name = name;
    }

    public void SetAge(int age) {
        _puppyAge = age;
    }
    public int GetAge() {
        System.out.println("the puppy age is " + _puppyAge);
        return _puppyAge;
    }
    public void Greet() {
        System.out.println("hello there " + _name +
            ". your age is " + _puppyAge);
    }
}