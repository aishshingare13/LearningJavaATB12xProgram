package Tasks.Task31_Abstract_Class_Programs;

public class AbstractWithConstructor {
    public static void main(String[] args) {
        //create instance of concrete class
        Concrete obj = new Concrete();
        obj.showMessage();
    }
}

//abstract class
abstract class Abstract{
    //constructor in abstract class
    Abstract(){
        System.out.println("Abstract class constructor called");
    }

    //Abstract method
    abstract void showMessage();
}
//subclass extending abstract class
class Concrete extends Abstract{
    //implement abstract method
    @Override
    void showMessage() {
        System.out.println("Method from abstract class");
    }
}