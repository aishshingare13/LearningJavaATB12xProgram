package Tasks.Task37_Access_Modifiers.PublicAccessModifier.P2;

import Tasks.Task37_Access_Modifiers.PublicAccessModifier.P1.Student;

public class TestPublic {
    public static void main(String[] args) {
        Student s = new Student(); //Accessing public class & method
        s.showInfo(); //works from a different package
    }
}
