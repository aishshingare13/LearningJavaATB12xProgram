package Tasks.Task32_Wrapper_Classes_Programs;

public class MultipleCatchExample {
    public static void main(String[] args) {
        int[] number = {12,23,54};
        int divisor = 0;

        try {
            int value = number[5]; //this will throw ArrayOutOfBoundException

            int result = number[1] / divisor; //this will throw ArithmeticException
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayOutOfBoundsException caught: Invalid array index.");
        }catch (ArithmeticException e){
            System.out.println("ArithmeticException caught: Division by zero is not allowed");
        }
        System.out.println("Program continues after handling exceptions.");
    }
}
