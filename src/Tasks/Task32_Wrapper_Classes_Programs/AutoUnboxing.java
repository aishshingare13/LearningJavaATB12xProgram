package Tasks.Task32_Wrapper_Classes_Programs;

public class AutoUnboxing {
    public static void main(String[] args) {
        //Autoboxing : converting int to Integer
        int num = 100;
        Integer boxedNum = num; //Automatically boxed
        System.out.println("Autoboxing Integer: " + boxedNum);

        //Unboxing: converting Integer to int
        Integer anotherBoxed = 200;
        int unboxedNum = anotherBoxed; // Automatically unboxed
        System.out.println("Unboxing int: " + unboxedNum);
    }
}
