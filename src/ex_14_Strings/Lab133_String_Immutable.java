package ex_14_Strings;

public class Lab133_String_Immutable {
    public static void main(String[] args) {

        String name = "Aishwarya";   // Stored in SCP(String Constant Pool)
        name.toUpperCase();
        System.out.println(name); // output is Aishwarya bcz strings are immutable
    }
}
