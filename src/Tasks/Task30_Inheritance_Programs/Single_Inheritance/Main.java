package Tasks.Task30_Inheritance_Programs.Single_Inheritance;
public class Main {
    public static void main(String[] args) {
        //create an animal object
        Animal genericAnimal = new Animal();
        genericAnimal.sound(); //output: Animal makes a sound

        //create a dog object
        Dog dog = new Dog();
        dog.sound(); //Output:Dog barks

        //polymorphism
        Animal animalDog = new Dog();
        animalDog.sound(); //calls Dog's sound method due to runtime polymorphism
    }
}
