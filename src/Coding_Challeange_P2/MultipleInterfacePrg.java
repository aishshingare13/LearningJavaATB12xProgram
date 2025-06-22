package Coding_Challeange_P2;

public class MultipleInterfacePrg {
    public static void main(String[] args) {
        Duck duck = new Duck();

        duck.fly();
        duck.swim();
    }
}
interface Flyable {
    void fly();
}
interface Swimmable {
    void swim();
}
class Duck implements Flyable, Swimmable {
    @Override
    public void fly() {
        System.out.println("Duck is flying in the sky!");
    }

    @Override
    public void swim() {
        System.out.println("Duck is swimming in the water!");
    }
}
