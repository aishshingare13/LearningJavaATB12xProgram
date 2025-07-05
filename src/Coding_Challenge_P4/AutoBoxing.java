package Coding_Challenge_P4;

public class AutoBoxing {
    public static void main(String[] args) {
        // Input
        int value = 10;

        //Autoboxing : converting int to Integer object
        Integer boxed = value;

        //Unboxing: converting Integer object
        int unboxed = boxed;

        //output
        System.out.println("Autoboxed: " + boxed + ", Unboxed: " + unboxed);
    }
}
