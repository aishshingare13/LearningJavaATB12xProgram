package Tasks.Task33_If_Else_Programs.Part1;

import java.util.Scanner;

public class MaxOfTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.println("Enter the second number: ");
        int num2 = scanner.nextInt();

        if (num1 > num2){
            System.out.println("The maximum number is: " + num1);
        } else if (num2 > num1) {
            System.out.println("The maximum number is: " + num2);
        }else {
            System.out.println("Both numbers are equal");
        }
        scanner.close();
    }
}
