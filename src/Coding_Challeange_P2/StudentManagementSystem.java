package Coding_Challeange_P2;

public class StudentManagementSystem {
    public static void main(String[] args) {
        Student s1 =  new Student("Bob", 101, "A");
        s1.printDetails();
    }
}
class Student{
    String name;
    int rollNo;
    String section;

    public Student(String name, int rollNo, String section) {
        this.name = name;
        this.rollNo = rollNo;
        this.section = section;
    }
    void printDetails() {
        System.out.println("Student: " + name + ", Roll No: " + rollNo + ", Section: " + section);
    }
}