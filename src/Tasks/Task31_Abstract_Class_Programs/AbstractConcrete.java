package Tasks.Task31_Abstract_Class_Programs;

public class AbstractConcrete {
    public static void main(String[] args) {
        Child obj = new Child();
        obj.display(); //class concrete method from abstract class
        obj.show(); //class implemented abstract method
    }
}

//abstract class parent
abstract class Parent{
    //abstract method
    abstract void show();

    //concrete method
    void display(){
        System.out.println("Concrete method in abstract class");
    }
}

//subclass implementing abstract method
class Child extends Parent{
    @Override
    void show() {
        System.out.println("Abstract method implemented");
    }
}
