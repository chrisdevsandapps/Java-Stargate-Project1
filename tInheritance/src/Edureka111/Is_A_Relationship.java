package Edureka111;

public class Is_A_Relationship {
    public static void main(String[] args) {
        System.out.println("Is_A_Relationship.main()");
        System.out.println("deals with inheritance and interface");
        System.out.println("any child class which inherits or implements");
        System.out.println("a parent class is said to be Is-A Relationship");

        System.out.println("example:");

        System.out.println("bmw car is inheriting props and methods from vehicle class");

        System.out.println("example of HAS-A");

        System.out.println("the bmw car HAS-An engine");
        System.out.println("the engine the bww car referencing to an object of engine class");



        System.out.println("\nsample execution:");

        BMW bmw111 = new BMW();
        bmw111.setColor("red");
        bmw111.setMaxSpeed(180);
        bmw111.carInfo();
        bmw111.BMWstart();
        bmw111.BMWstop();


    }
    
}

class Car {
    private int maxSpeed;
    private String color;

    public void setColor(String inputColor) {
        this.color = inputColor;
    }

    public void setMaxSpeed(int inputMaxSpeed) {
        this.maxSpeed = inputMaxSpeed;
    }

    public void carInfo() {
        System.out.println("Color: " + color);
        System.out.println("MaxSpeed: " + maxSpeed);
    }
}

class Engine {
    public void start() {
        System.out.println("engine started");
    }
    public void stop() {
        System.out.println("engine stopped");
    }
}

class BMW extends Car {
    public void BMWstart() {
        // demonstration of HAS-A relationsip:
        Engine bmwEngine = new Engine();
        bmwEngine.start();
    }
    public void BMWstop() {
        // demonstration of HAS-A relationsip:
        Engine bmwEngine = new Engine();
            bmwEngine.stop();
        
    }
}