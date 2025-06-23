package Tasks.Task33_If_Else_Programs.Part3;

import java.util.Scanner;

public class AgeCategoryChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        if (age < 0){
            System.out.println("Invalid age.");
        } else if (age >= 0 && age <= 12) {
            System.out.println("You are a child.");
        } else if (age >= 12 && age <= 19) {
            System.out.println("You are a Teenager.");
        } else if (age >= 20 && age <= 64) {
            System.out.println("You are an Adult.");
        } else if (age >= 65) {
            System.out.println("You are a Senior Citizen.");
        }
        scanner.close();
    }
}
