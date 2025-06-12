package Tasks.Task30_Inheritance_Programs.Multilevel_Inheritance;

//Grandparent class
public class Grandparent {
    public void grandparentMethod(){
        System.out.println("This is a method from grandparent class");
    }
}

//Parent class inherits from Grandparent
class Parent extends Grandparent{
    public void parentMethod(){
        System.out.println("This is from the Parent class");
    }
}

class Child extends Parent{
    public void childMethod(){
        System.out.println("This is a method from the child class");
    }
}
