package Tasks.Task37_Access_Modifiers;
//Access parent class constructor using super()
public class AccessParentClassConstructor {
    public static void main(String[] args) {
        Student s = new Student();
    }
}
class Person{
    Person(){
        System.out.println("Person constructor called.");
    }
}
class Student extends Person{
    Student(){
        super(); //calling parent constructor
        System.out.println("Student constructor called.");
    }
}
