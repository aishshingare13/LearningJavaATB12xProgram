package Tasks.Task29.Constrcutor_Programs;

public class Student {
    private String name;
    private int age;

    //Constructor to initialize name & age

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //Method to display student details
    public void display(){
        System.out.println("Name:" + name);
        System.out.println("Age:" + age);
    }

    public static void main(String[] args) {
        //Create a student object
        Student s1 = new Student("Aishwarya", 28);
        Student s2 = new Student("Priyanka",27);
        //display student details
        s1.display();
        s2.display();
    }
}
