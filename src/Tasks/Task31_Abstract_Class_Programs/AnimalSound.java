package Tasks.Task31_Abstract_Class_Programs;

public class AnimalSound {
    public static void main(String[] args) {
        //create dog object
        Animal dog = new Dog();
        dog.makeSound();

        //create cat object
        Animal cat = new Cat();
        cat.makeSound();
    }
}
//abstract class
abstract class Animal{
    //abstract method(no body)
    abstract void makeSound();
}
//Dog class extends animal
class Dog extends Animal{
    //provide implementation for makeSound
    void makeSound(){
        System.out.println("Dog Barks");
    }
}
class Cat  extends Animal{
    //provide implementaton for makeSound
    void makeSound(){
        System.out.println("Cat meows");
    }
}