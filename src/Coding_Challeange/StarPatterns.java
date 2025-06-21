package Coding_Challeange;

import java.util.Scanner;

public class StarPatterns {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();

        System.out.println("Right Triangle:");
        for (int i = 1; i <= rows; i++) {
            // Print i stars in each row
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("Pyramid:");
        for (int i = 1; i <= rows; i++) {
            // Print leading spaces
            for (int space = 1; space <= rows - i; space++) {
                System.out.print(" ");
            }
            for (int star = 1; star <= 2 * i - 1; star++) {
                System.out.print("*");
            }
            System.out.println();
        }
        scanner.close();


    }
}
