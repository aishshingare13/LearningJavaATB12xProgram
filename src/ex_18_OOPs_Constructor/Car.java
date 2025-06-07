package ex_18_OOPs_Constructor;

public class Car {
    String name;
    int year;
    String model;

    // Default Constructor

    Car(){
        name = "Unknown Car";
        model = "XXX";
        year = 0;
        System.out.println("DC");
    }
}
