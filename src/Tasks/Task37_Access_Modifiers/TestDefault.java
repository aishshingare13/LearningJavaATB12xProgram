package Tasks.Task37_Access_Modifiers;

//Default (no modifier) Access - Same Package only
public class TestDefault {
    public static void main(String[] args) {
        Student1 s1 = new Student1(); //same package access
        s1.showDetails();
    }
}

class Student1{
    void showDetails(){ // default access
        System.out.println("Student details shown");
    }
}