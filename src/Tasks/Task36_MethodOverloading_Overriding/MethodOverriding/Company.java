package Tasks.Task36_MethodOverloading_Overriding.MethodOverriding;

public class Company {
    public static void main(String[] args) {
        Employee mgr = new Manager();
        Employee clerk = new Clerk();
        Employee tester = new Tester();

        //runtime polymorphism
        mgr.role();
        clerk.role();
        tester.role();
    }
}
//Base class
class Employee{
    void role(){
        System.out.println("General Employee");
    }
}
//Manager subclass
class Manager extends Employee{
    @Override
    void role() {
        System.out.println("Manager: oversees team & projects");
    }
}
//clerk subclass
class Clerk extends Employee{
    @Override
    void role() {
        System.out.println("Clerk: Handles administrative tasks");
    }
}

//Tester subclass
class Tester extends Employee{
    @Override
    void role() {
        System.out.println("Tester: Ensures software quality");
    }
}