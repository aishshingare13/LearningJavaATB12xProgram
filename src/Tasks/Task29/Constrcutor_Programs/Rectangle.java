package Tasks.Task29.Constrcutor_Programs;

public class Rectangle {
    private double length;
    private double breadth;

    //constructor to initialize length & breadth

    public Rectangle(double breadth, double length) {
        this.breadth = breadth;
        this.length = length;
    }

    //Method to calculate area
    public double calculateArea(){
        return length * breadth;
    }

    //Method to print area
    public void printArea(){
        System.out.println("Rectangle Area: " + calculateArea());
    }

    public static void main(String[] args) {
        //create rectangle objects
        Rectangle r1 = new Rectangle(4.0,3.0);
        Rectangle r2 = new Rectangle(7.5,4.2);

        //print area
        r1.printArea();
        r2.printArea();
    }
}
