package Coding_Challeange_P2;

public class InterfacePrg {
    public static void main(String[] args) {
        Drawable circle = new Circle1();
        Drawable rectangle = new Rectangle1();

        circle.draw();
        rectangle.draw();
    }
}
interface Drawable {
    void draw();
}
class Circle1 implements Drawable {
    @Override
    public void draw() {
        System.out.println("Drawing a Circle");
    }
}
class Rectangle1 implements Drawable {
    @Override
    public void draw() {
        System.out.println("Drawing a Rectangle");
    }
}