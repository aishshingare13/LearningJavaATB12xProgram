package Tasks.Task30_Inheritance_Programs.Method_Overriding;

public class Main{
    public static void main(String[] args) {
        //Create objects
        Animal genericAnimal = new Animal();
        Animal myDog = new Dog();
        Animal myCat = new Cat();

        //call methods
        System.out.println("Animal sound:");
        genericAnimal.makeSound();

        System.out.println("\nDog sound:");
        myDog.makeSound();

        System.out.println("\nCat sound:");
        myCat.makeSound();
    }
}
