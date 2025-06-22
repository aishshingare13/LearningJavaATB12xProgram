package Coding_Challeange_P2;

import static java.lang.Math.PI;

public class AbstractClassPrg {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle(5, 3);
        Shape circle = new Circle(4);

        System.out.println("Rectangle Area: " + rectangle.getArea());
        System.out.println("Circle Area: " + circle.getArea());
    }
}
abstract class Shape {
    abstract double getArea();
}
class Rectangle extends Shape {
    double length, width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
    @Override
    double getArea() {
        double result = length * width;
        return result;
    }
}
class Circle extends Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double getArea() {
        double result = PI * radius * radius;
        return result;
        //return Math.PI * radius * radius;
    }
}