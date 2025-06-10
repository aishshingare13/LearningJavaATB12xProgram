package Tasks28.OOPs_Concept;

public class VehicleManagementSystem {
    public static void main(String[] args) {
        //Creating objects of different types
        Vehicle genericVehicle = new Vehicle("Generic", "Model", 2020);
        Car myCar = new Car("Toyota","Camry",2022,4);
        Motorcycle myBike = new Motorcycle("Harley-Davidson", "Sportster",2021,false);

        //Demonstrating Polymorphism
        Vehicle[] vehicles = {genericVehicle,myCar,myBike};
        for (Vehicle vehicle : vehicles){
            vehicle.displayInfo(); // polymorphic method call
            System.out.println("-----------");
        }

        //Demonstrating method overloading
        genericVehicle.start();
        genericVehicle.start("electronic");

        myBike.start(); //Inherited from Vehicle
        myBike.start(true);// Motorcycle-specific overloaded method

        //Demonstrating encapsulation
        System.out.println("\nCar Details: ");
        System.out.println("Manufacturing Company: " + myCar.getManufacture());
        System.out.println("Model : " + myCar.getModel());
        System.out.println("Year : " + myCar.getYear());
        System.out.println("Doors: " + myCar.getNumDoors());
    }
}
