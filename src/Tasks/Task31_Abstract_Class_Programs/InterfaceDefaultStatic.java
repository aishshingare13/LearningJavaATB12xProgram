package Tasks.Task31_Abstract_Class_Programs;

public class InterfaceDefaultStatic {
    public static void main(String[] args) {
      Car c = new Car();
      c.start(); //calls Default method from interface
        Vehicle.fuelType();//calls static method from interface Directly
    }
}
interface Vehicle{
    default void start() {
        System.out.println("Vehicle Started");
    }

    static void fuelType() {
        System.out.println("Fuel type is Petrol");
    }
}
class Car implements Vehicle{

}