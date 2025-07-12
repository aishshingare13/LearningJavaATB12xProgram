package Tasks.Task37_Access_Modifiers;

//Access parent Class Variable Using super
public class AccessParentClassVariable {
    public static void main(String[] args) {
        Car c = new Car();
        c.showType();
    }
}
class Vehicle{
    String type = "Four Wheeler";
}
class Car extends Vehicle{
    String type = "Car";

    void showType(){
        System.out.println("Child type: " + type);
        System.out.println("Parent type: " + super.type); //accessing parent variable
    }
}