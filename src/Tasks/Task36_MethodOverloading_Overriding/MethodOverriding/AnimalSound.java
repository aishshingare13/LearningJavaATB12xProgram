package Tasks.Task36_MethodOverloading_Overriding.MethodOverriding;

public class AnimalSound {
    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal cat = new Cat();
        Animal cow = new Cow();

        //polymorphism
        System.out.println("Dog: " + dog.sound());
        System.out.println("Cat: " + cat.sound());
        System.out.println("Cow: " + cow.sound());
    }
}

//Base class
class Animal{
    String sound(){
        return "Some generic sound";
    }
}
//Subclass Dog overrides sound()
class Dog extends Animal{
    @Override
    String sound(){
        return "Bark";
    }
}
//subclass Dog overrides sound()
class Cat extends Animal{
    @Override
    String sound(){
        return "Meow";
    }
}
//Subclass Cow overrides sound()
class Cow extends Animal{
    String sound(){
        return "Moo";
    }
}