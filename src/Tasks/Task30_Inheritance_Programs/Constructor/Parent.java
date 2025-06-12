package Tasks.Task30_Inheritance_Programs.Constructor;

public class Parent {
    Parent(String message){
        System.out.println("Parent: " + message);
    }
}
class Child extends Parent{
   Child(String message){
       super("Message for Parent"); //Explicit super call
       System.out.println("Child: " + message);
   }
}

