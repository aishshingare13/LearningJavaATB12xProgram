package ex_20_OOPs_Super_Abstraction;

public class Lab183 {
    public static void main(String[] args) {
        Car c1 = new Car(100);
        c1.display();
    }

}

class Vehicle{
    public int maxSpeed = 180;

    void noTest(){
        System.out.println("empty");
    }

    Vehicle(){
        System.out.println("Default Constructor");
    }

    Vehicle(int a){
        System.out.println("Parameterized Constructor");
    }

    Vehicle(int a, int b){
        System.out.println("Parameterized Constructor");
    }

    //Method Overloading - Same name function with different arguments.
    void message(){
        System.out.println("No return, No argument");
    }

    void message(int a){
        System.out.println("PC- argument");
    }

    void display(){
        System.out.println("Vehicle Parent");
    }
}

class Car extends Vehicle{
    private int maxSpeed = 281;

    Car(){
        super(100); // parent constructor calling
    }

    void test(){

    }

    Car(int a){
        System.out.println("PC Car");
    }

    @Override
    void display(){
        System.out.println("Override of Car!");
        System.out.println(super.maxSpeed);
        System.out.println(this.maxSpeed);
        super.noTest();
        this.test();
    }
}


