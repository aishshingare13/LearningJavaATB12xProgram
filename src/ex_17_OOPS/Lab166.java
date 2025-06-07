package ex_17_OOPS;

public class Lab166 {
    public static void main(String[] args) {
        Student s1 = new Student();
        //1. Student - class loading
        //2. s1 - object ref
        //3. new Student() -> Object creation
    }
}
class Student{
    String name;
    int roll;

    void sleep(){}
}
// when we create class in class it will not much usable
// But if we create class outside then it will be reusable