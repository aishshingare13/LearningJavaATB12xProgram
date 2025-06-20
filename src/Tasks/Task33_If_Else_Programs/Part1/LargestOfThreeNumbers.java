package Tasks.Task33_If_Else_Programs.Part1;

import java.util.Scanner;

public class LargestOfThreeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first number: ");
        int num1 = scanner.nextInt();

        System.out.println("Enter second number: ");
        int num2 = scanner.nextInt();

        System.out.println("Enter third number: ");
        int num3 = scanner.nextInt();

        if (num1 >= num2 && num1 >= num3){
            System.out.println("The largest number is : " + num1);
        } else if (num2 >= num1 && num2 >=num3) {
            System.out.println("The largest number is : " + num2);
        }else {
            System.out.println("The largest number is : " + num3);
        }
        scanner.close();
    }
}
