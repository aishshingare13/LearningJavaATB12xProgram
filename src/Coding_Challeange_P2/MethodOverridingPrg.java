package Coding_Challeange_P2;

public class MethodOverridingPrg {
    public static void main(String[] args) {
        Parent parent = new Parent();
        parent.display();

        Child child = new Child();
        child.display();
    }
}
class Parent {
    void display() {
        System.out.println("Parent class display method");
    }
}

class Child extends Parent {
    @Override
    void display() {
        System.out.println("Child class display method");
    }
}