package Tasks.Task34_Loops_Programs.For_Loop;

public class SumOfNumbers {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <=100 ; i++) {
            sum = sum + i;
        }
        System.out.println("Sum of numbers from 1 to 100: " + sum);
    }
}
