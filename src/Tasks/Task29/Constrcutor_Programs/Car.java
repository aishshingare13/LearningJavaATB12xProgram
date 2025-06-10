package Tasks.Task29.Constrcutor_Programs;

public class Car {
    private String brand;
    private String model;
    private double price;

    //Constructor

    public Car(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    //Method to display car details
    public void displayDetails(){
        System.out.println("Car Details:");
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: " + price);
    }

    public static void main(String[] args) {
        //create a car object
        Car c1 = new Car("Hyundai", "Creta",1100000);
        Car c2 = new Car("Volkswagen","Golf GTI",5300000);

        //display cars details
        c1.displayDetails();
        c2.displayDetails();
    }
}
