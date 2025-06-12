package Tasks.Task30_Inheritance_Programs.Single_Inheritance;

//Superclass(parent class)
public class Animal {
    public void sound(){
        System.out.println("Animal makes a sound.");
    }
}

//Dog class(child class inheriting from animal)
class Dog extends Animal{
    //overriding the sound method
    @Override
    public void sound(){
        System.out.println("Dog barks: Woof!");
    }
}
