import java.util.List;

// https://youtu.be/_jDNAf3CzeY?t=440

/* 
cd /Users/chrisperey/Documents/javaVsCode/aug15aaa ; /usr/bin/env /Library/Java/JavaVirtualMachines/jdk-12.0.2.jdk/Contents/Home/bin/java -cp /Users/chrisperey/Documents/javaVsCode/aug15aaa/bin Solid0 

java -cp ./bin/ Solid0


java -cp ./bin/ Solid0 hahaha hehehe
sum = 414.1592653589793
hahaha
hehehe
*/

public class Solid0 {
    public static void main(String[] args) {

        AreaCalculator areaCalculator = new AreaCalculator();
        Circle circle1 = new Circle(10);
        Square square1 = new Square(10);

        List<Object> shapes = List.of(circle1, square1);
        double sum = areaCalculator.Sum(shapes);
        System.out.println("sum = " + sum);

        System.out.println(args[0]);
        System.out.println(args[1]);
    }
}


class Circle {
    private final int radius;
    public Circle(int radius) {this.radius = radius;}
    public int GetRadius() {return radius;}
}
class Square {
    private final int length;
    public Square(int length) {this.length = length;}
    public int GetLength() {return length;}
}

class AreaCalculator {
    
    public double Sum(List<Object> shapesList) {

        double sum = 0;

        for (int i = 0; i < shapesList.size(); i++) {

            Object shape = shapesList.get(i);

            if (shape instanceof Square) {
                sum = sum + Math.pow(((Square) shape).GetLength(), 2);
            }
            if (shape instanceof Circle) {
                sum = sum + Math.PI * Math.pow(((Circle) shape).GetRadius(), 2);
            }
        }

        return sum;
    }
}