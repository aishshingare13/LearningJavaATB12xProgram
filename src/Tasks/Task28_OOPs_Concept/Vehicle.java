package Tasks.Task28_OOPs_Concept;
//Base class demonstrating encapsulation
public class Vehicle {
    private String manufacture;
    private String model;
    private int year;

    //Constructor demonstrating this keyword

    public Vehicle(String manufacture, String model, int year) {
        this.manufacture = manufacture;
        this.model = model;
        this.year = year;
    }

    //Getter methods for encapsulated fileds

    public String getManufacture() {
        return manufacture;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    //method to be overridden
    public void displayInfo(){
        System.out.println("Vehicle: " +manufacture + " " + model + " " + year);
    }

    //method overloading
    public void start(){
        System.out.println("Vehicle engine started.");
    }

    public void start(String keyType){
        System.out.println("Vehicle engine started with " + keyType + "key.");
    }
}
