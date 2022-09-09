package CodingWithJohn;

public class Xxx222 {
   public static void main(String[] args) {
        System.out.println("Xxx222.main()");

        // GenericPrinter<Dog> dog1 = new GenericPrinter<Dog>(new Dog("mocha"));
        // dog1.PrintGeneric();

        // error


   } 
}


// class GPrinter <TTT extends Animals> {
//     TTT thingToPrint;

//     public GPrinter(TTT inputGenericType) {
//         this.thingToPrint = inputGenericType;
//     }

//     public void PrintGeneric() {
//         thingToPrint.walk();
//         System.out.println(thingToPrint);
//     }

// }


// class Animals {
//     protected String name;

//     public void walk() {
//         System.out.println("animal walking");
//     }
// }

// class Dog extends Animals {
//     private String dogFoodPreference;

//     public String getFoodPreference() {
//         return dogFoodPreference;
//     }
//     public void setFoodPreference(String input) {
//         this.dogFoodPreference = input;
//     }
    
//     public Dog(String name) {
//         this.name = name;
//     }
//     public Dog() {

//     }
//     public void bark() {
//         System.out.println("awr awr!");
//     }
// }