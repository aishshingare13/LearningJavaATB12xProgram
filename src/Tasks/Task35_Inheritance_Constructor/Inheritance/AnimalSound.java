package Tasks.Task35_Inheritance_Constructor.Inheritance;
//Single inheritance + method calling
public class AnimalSound {
    public static void main(String[] args) {
        //Cat object
        Cat myCat = new Cat();

        //call base class method
        myCat.makeSound();

        //Call derived class method
        myCat.meow();
    }
}
//base class
class Animal{
    void makeSound(){
        System.out.println("The animal makes a sound.");
    }
}

//Derived class
class Cat extends Animal{
    void meow(){
        System.out.println("The cat says:Meow!");
    }
}