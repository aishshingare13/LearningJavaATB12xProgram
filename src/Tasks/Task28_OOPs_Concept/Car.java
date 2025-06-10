package Tasks.Task28_OOPs_Concept;

//child class demonstrating single inheritance
 public class Car extends Vehicle {
    private int numDoors;

    //constructor using super keyword
    public Car(String manufacture, String model, int year,int numDoors) {
        super(manufacture, model, year);
        this.numDoors = numDoors;
    }
    // Getter for Encapsulated filed
    public int getNumDoors() {
        return numDoors;
    }

    //Method overriding
    @Override
    public void displayInfo(){
        super.displayInfo(); // using super to call parent method
        System.out.println("Type: Car, Doors: " + numDoors);
    }

    //unique method for car class
    public void openTrunk(){
        System.out.println("Car trunk Opened.");
    }
}
