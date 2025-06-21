package Coding_Challeange;

import java.util.Scanner;

public class LargestBtwThreeNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter three numbers: ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();

        if (num1 == num2 && num2 == num3) {
            System.out.println("All numbers are equal: " + num1);
        }
        else if (num1 >= num2 && num1 >= num3) {
            if (num1 == num2 || num1 == num3) {
                System.out.println("Two numbers are equal and largest: " + num1);
            } else {
                System.out.println("Largest number is: " + num1);
            }
        }
        else if (num2 >= num1 && num2 >= num3) {
            if (num2 == num3) {
                System.out.println("Two numbers are equal and largest: " + num2);
            } else {
                System.out.println("Largest number is: " + num2);
            }
        }
        else {
            System.out.println("Largest number is: " + num3);
        }
        scanner.close();
    }
}
