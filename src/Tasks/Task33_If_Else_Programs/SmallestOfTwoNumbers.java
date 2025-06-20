package Tasks.Task33_If_Else_Programs;

import java.util.Scanner;

public class SmallestOfTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first number: ");
        int num1 = scanner.nextInt();

        System.out.println("Enter second number: ");
        int num2 = scanner.nextInt();

        if (num1 < num2){
            System.out.println("The smallest number is : " + num1);
        } else if (num2 < num1) {
            System.out.println("The smallest number is : " + num2);
        }else {
            System.out.println("Both numbers are equal");
        }
        scanner.close();
    }
}
