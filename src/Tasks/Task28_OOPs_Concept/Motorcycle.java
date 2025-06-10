package Tasks.Task28_OOPs_Concept;

public class Motorcycle extends Vehicle {
    private boolean hasSideCar;

    //Constructor using 'super' keyword
    public Motorcycle(String manufacture, String model, int year,boolean hasSideCar) {
        super(manufacture, model, year);
        this.hasSideCar = hasSideCar;
    }
    //Getter for encapsulated field

    public boolean isHasSideCar() {
        return hasSideCar;
    }

    //Method overriding
    @Override
    public void displayInfo(){
        super.displayInfo(); //using super to call parent method
        System.out.println("Type: Motorcycle, Sidecar: " + (hasSideCar ? "Yes" : "No"));
    }

    //Overloaded method specific to motorcycle
    public void start(boolean withKickStart){
        if (withKickStart){
            System.out.println("Motorcycle started with kick start.");
        }else {
            super.start(); // using super to call parent method
        }
    }

}
