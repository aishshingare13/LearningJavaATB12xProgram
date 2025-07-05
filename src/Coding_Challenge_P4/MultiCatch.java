package Coding_Challenge_P4;

public class MultiCatch {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30};
        int index = 5;   //Invalid index
        int divisor = 0; // will cause division by zero

        try {
            int result = numbers[index] / divisor;
            System.out.println("Result: " + result);
        }catch (ArithmeticException | ArrayIndexOutOfBoundsException e){
            System.out.println("Exception caught: " + e.getClass().getSimpleName());
        }
    }
}
