package ex_17_OOPS;

public class Baby {
    String name;

    Baby(){  // Default Constructor with no parameter
        System.out.println("Hi Shona");
        name = "Shona";
    }

    Baby(String name){ // Parametrised Constructor
        System.out.println("Hi, shona");
        name = "shona";
    }
}
