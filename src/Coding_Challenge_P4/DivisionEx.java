package Coding_Challenge_P4;

import java.util.Scanner;

public class DivisionEx {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter numerator: ");
        int numerator = scanner.nextInt();

        System.out.print("Enter Denominator: ");
        int denominator = scanner.nextInt();

        try {
            int result = numerator / denominator;
            System.out.println("Result: " + result);
        }catch (ArithmeticException e){
            System.out.println("Error: Cannot divide by zero");
        }finally {
            System.out.println("Finally block executed");
        }
        scanner.close();
    }
}
