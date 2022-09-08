
/*
 * 
 * Single Inheritance Sample
 * 
 */

package Edureka111;


public class SingleInheritanceSample {
    public static void main(String[] args) {
        
        Employee eee1 = new Employee();
        eee1.setName("Jennifer Lawrence");
        eee1.setAge(23);
        eee1.setEmpID("emp111001");
    
        System.out.println("Name: \t" + eee1.getName());
        System.out.println("Age: \t" + eee1.getAge());
        System.out.println("EmpID: \t" + eee1.getEmployeeID());
    }
    
}



class Person {
    private int age;
    private String name;
    
    public void setAge(int inputAge) {
        this.age = inputAge;
    }
    public int getAge() {
        return age;
    }
    public void setName(String inputName) {
        this.name = inputName;
    }
    public String getName() {
        return name;
    }
}


class Employee extends Person {

    private String employeeID;
    
    public void setEmpID(String input) {
        this.employeeID = input;
    }
    public String getEmployeeID() {
        return employeeID;
    }


}




