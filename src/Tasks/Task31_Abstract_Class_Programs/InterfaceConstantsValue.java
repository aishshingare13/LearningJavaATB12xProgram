package Tasks.Task31_Abstract_Class_Programs;

public class InterfaceConstantsValue {
    public static void main(String[] args) {
        Car1 c1= new Car1();
        c1.showMaxSpeed();
    }
}
//interface with constant
interface SpeedLimit{
    int MAX_SPEED = 120;
}
class Car1 implements SpeedLimit{
    void showMaxSpeed(){
        System.out.println("Max Speed is: " + MAX_SPEED);
    }
}