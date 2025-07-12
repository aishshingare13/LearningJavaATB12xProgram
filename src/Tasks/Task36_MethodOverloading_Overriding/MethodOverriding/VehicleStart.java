package Tasks.Task36_MethodOverloading_Overriding.MethodOverriding;

public class VehicleStart {
    public static void main(String[] args) {
        Vehicle bike = new Bike();
        Vehicle car = new Car();

        bike.start();
        car.start();
    }
}
//base class
class Vehicle{
    void start(){
        System.out.println("Starting the vehicle....");
    }
}
//subclass Bike overrides start()
class Bike extends Vehicle{
    @Override
    void start() {
        System.out.println("Kick start the bike");
    }
}
//subclass car overrides start()
class Car extends Vehicle{
    @Override
    void start() {
        System.out.println("Turn the key to start the car");
    }
}