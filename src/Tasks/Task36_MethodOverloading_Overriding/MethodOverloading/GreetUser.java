package Tasks.Task36_MethodOverloading_Overriding.MethodOverloading;

public class GreetUser {
    public static void main(String[] args) {
        Greeter g = new Greeter();

        g.greet();
        g.greet("Aishwarya");
    }
}
class Greeter{
    //No- parameter
    void greet(){
        System.out.println("Hello!");
    }

    //one parameter
    void greet(String name){
        System.out.println("Hello " + name + "!");
    }
}