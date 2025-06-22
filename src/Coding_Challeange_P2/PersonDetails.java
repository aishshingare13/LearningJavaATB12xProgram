package Coding_Challeange_P2;

public class PersonDetails {
    public static void main(String[] args) {
        Person p1 = new Person("John", 25);
        Person p2 = new Person("Alice", 30);

        p1.display();
        p2.display();
    }
}
class Person{
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    void display(){
        System.out.println("Name: " + name + ", Age: " + age);

    }
}