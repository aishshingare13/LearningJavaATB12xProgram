package ex_20_OOPs_Super_Abstraction;

public class Lab187_AC {
    public static void main(String[] args) {
        WagonR car = new WagonR();
        car.drive();

    }
}

class WagonR extends Engine implements Tyre, Gear {

    void drive(){
        rubberTyre();
        blackColorDoToTyre();
        startEngine();
        changeGear();
        stopEngine();
    }

    @Override
    void startEngine() {
        System.out.println("Starting the Wagnor");
    }

    @Override
    public void rubberTyre() {
        System.out.println("Check rubber tyre");
    }

    @Override
    public void blackColorDoToTyre() {
        System.out.println("Black color tyre");
    }

    @Override
    public void burnTheTyre() {
        Tyre.super.burnTheTyre();
    }

    @Override
    public void changeGear() {
        System.out.println("change gear");
    }
}
abstract class Engine{
    abstract void startEngine();

    void stopEngine(){
        System.out.println("Stop");
    }
}

interface Tyre{
    void rubberTyre();
    void blackColorDoToTyre();

    //complete function by using default keyword
    default void burnTheTyre(){

    }

    static void m1(){

    }
}
interface Gear{
    void changeGear();
}



