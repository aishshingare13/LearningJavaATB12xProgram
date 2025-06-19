package Tasks.Task32_Wrapper_Classes_Programs;

public class ArithmeticExceptionExample {
    public static void main(String[] args) {
        int numerator = 20;
        int denominator = 0;

        try {
            int result = numerator/denominator;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException caught : cannot divide by zero");
        }
        System.out.println("Program continues after exception handling");
    }
}
