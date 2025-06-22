package Coding_Challeange_P2;

public class OuterInnerClassPrg {
    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.show();
    }
}
class Outer {
    int x = 10;

    class Inner {
        void display() {
            System.out.println("Inner class accessing outer variable: " + x);
        }
    }

    void show() {
        System.out.println("Outer class variable x: " + x);
        Inner inner = new Inner();
        inner.display();
    }
}