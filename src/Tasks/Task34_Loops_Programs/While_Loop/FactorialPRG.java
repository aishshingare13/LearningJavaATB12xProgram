package Tasks.Task34_Loops_Programs.While_Loop;

import java.util.Scanner;

public class FactorialPRG {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        long factorial = 1;
        int i = 1;

        if (num < 0){
            System.out.println("Factorial is not defined for negative numbers.");
        } else {
            while (i <= num){
                factorial = factorial * i;
                i++;
            }
            System.out.println("Factorial of " + num + " is: " + factorial);
        }
        scanner.close();
    }
}
