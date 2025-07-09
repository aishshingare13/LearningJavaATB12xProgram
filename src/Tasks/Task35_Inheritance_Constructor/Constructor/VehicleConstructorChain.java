package Tasks.Task35_Inheritance_Constructor.Constructor;
//Constructor Chaining + Inheritance
public class VehicleConstructorChain {
    public static void main(String[] args) {
        Bike myBike = new Bike();
    }
}
//base class
class Vehicle{
     Vehicle(){
        System.out.println("Vehicle is ready");
    }
}
//derived class
class Bike extends Vehicle{
    Bike(){
        System.out.println("Bike is ready");
    }
}