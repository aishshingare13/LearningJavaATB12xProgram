package ex_18_OOPs_Constructor;

public class Lab171_Const {
    public static void main(String[] args) {

        Car2 tesla = new Car2();   // default constructor call
        System.out.println(tesla.model);
        System.out.println(tesla.year);

        Car2 nano = new Car2("nano",2011);
        System.out.println(nano.model);
        System.out.println(nano.year);

        Car2 MGHector = new Car2("MGHector",2025);
        System.out.println(MGHector.model);
        System.out.println(MGHector.year);

    }


}
