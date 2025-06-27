package Tasks.Task34_Loops_Programs.While_Loop;

public class SumOfNumbers {
    public static void main(String[] args) {
        int sum = 0;
        int i = 1;

        while (i <= 100){
            sum = sum + i;
            i++;
        }
        System.out.println("Sum of numbers from 1 to 100 is: " + sum);
    }
}
