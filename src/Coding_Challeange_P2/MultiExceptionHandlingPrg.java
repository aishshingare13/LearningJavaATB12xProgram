package Coding_Challeange_P2;

public class MultiExceptionHandlingPrg {
    public static void main(String[] args) {
        try {
            int a = 10;
            int b = 0;
            int result = a / b; // Division by zero
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException: Cannot divide by zero");
        }

        try {
            String str = "abc";
            int num = Integer.parseInt(str); // Invalid number format
            System.out.println("Number: " + num);
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException: Invalid number format");
        }

        try {
            int[] arr = {1, 2, 3};
            System.out.println("Element: " + arr[5]); // Invalid index
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException: Array index out of bounds");
        }
    }
}
