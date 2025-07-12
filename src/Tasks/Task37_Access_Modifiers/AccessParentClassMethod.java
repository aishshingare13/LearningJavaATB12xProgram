package Tasks.Task37_Access_Modifiers;
//Access Parent class method using super()
public class AccessParentClassMethod {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.sound();
    }
}
class Animal{
    void sound(){
        System.out.println("Animal makes a sound");
    }
}
class Dog extends Animal{
    @Override
    void sound() {
        super.sound();  //calling parent method
        System.out.println("Dog Barks");
    }
}