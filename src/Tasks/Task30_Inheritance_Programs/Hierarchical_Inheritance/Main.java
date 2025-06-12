package Tasks.Task30_Inheritance_Programs.Hierarchical_Inheritance;

public class Main{
    public static void main(String[] args) {
        //Create car object
        Car myCar = new Car();
        myCar.start();  // Inherited from Vehicle
        myCar.drive(); // Car's own method

        //Create bike object
        Bike myBike = new Bike();
        myBike.start(); //Inherited from Vehicle
        myBike.ride(); //Bike's own method
    }
}
