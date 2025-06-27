package Tasks.Task34_Loops_Programs.For_Loop;

import java.util.Scanner;

public class FactorialPrg {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a Number: ");
        int num = scanner.nextInt();

        long factorial = 1;

        if (num < 0){
            System.out.println("Factorial is not defined for negative number");
        }else {
            for (int i = 1; i <= num ; i++) {
                factorial = factorial * i;
            }
            System.out.println("Factorial of" + num + " is: " + factorial);
        }
        scanner.close();
    }
}
