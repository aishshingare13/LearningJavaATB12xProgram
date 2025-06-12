package Tasks.Task30_Inheritance_Programs.Hierarchical_Inheritance;

//Base class
public class Vehicle {
    void start(){
        System.out.println("Vehicle is starting");
    }
}

//Derived class car
class Car extends Vehicle{
    void drive(){
        System.out.println("Car is driving");
    }
}

//second derived class bike
class Bike extends Vehicle{
    void ride(){
        System.out.println("Bike is riding");
    }
}

