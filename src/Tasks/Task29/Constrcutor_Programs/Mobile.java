package Tasks.Task29.Constrcutor_Programs;

public class Mobile {
    private String brand;
    private double price;

    //1st constructor

    public Mobile(String brand) {
        this.brand = brand;
    }

    //2nd constructor

    public Mobile(String brand, double price) {
        this.brand = brand;
        this.price = price;
    }

    //Method to display mobile details
    public void displayDetails(){
        System.out.println("Mobile details:");
        System.out.println("Brand : " + brand);
        System.out.println("price : " + price);
    }

    public static void main(String[] args) {
        //create mobile object using different constructor
        Mobile m1 = new Mobile("Apple");
        Mobile m2 = new Mobile("OnePlus",30000.50);
        Mobile m3 = new Mobile("Samsung",25000);

        //Display details
        m1.displayDetails();
        System.out.println(" ");
        m2.displayDetails();
        System.out.println(" ");
        m3.displayDetails();
    }
}
