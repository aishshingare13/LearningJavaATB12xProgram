package Tasks.Task30_Inheritance_Programs.Multilevel_Inheritance;

//main class
public class Main{
    public static void main(String[] args) {
        //Create a child object
        Child myChild = new Child();

        //child can access methods from all three class
        myChild.grandparentMethod(); //inherited from grandparent
        myChild.parentMethod();  //inherited from parent
        myChild.childMethod();  //defined in child
    }
}
