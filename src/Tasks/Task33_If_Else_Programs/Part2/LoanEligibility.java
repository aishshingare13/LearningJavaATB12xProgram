package Tasks.Task33_If_Else_Programs.Part2;

import java.util.Scanner;

public class LoanEligibility {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter age: ");
        int age = scanner.nextInt();

        System.out.print("Enter monthly salary: ");
        double salary = scanner.nextDouble();

        System.out.print("Enter credit score: ");
        int creditScore = scanner.nextInt();

        boolean isEligible = true;

        if (age <= 0){
            System.out.println("Invalid age. Age must be a positive number.");
            isEligible = false;
        } else if (age < 18 || age > 80) {
            System.out.println("Age must be between 18 and 80.");
            isEligible = false;
        }
        
        if (salary <= 0){
            System.out.println("Invalid salary. Salary must be positive number.");
            isEligible = false;
        } else if (salary < 30000) {
            System.out.println("Salary must be at least 30000");
            isEligible = false;
        }
        if (creditScore <= 0){
            System.out.println("Invalid credit score. It must be a positive number");
            isEligible = false;
        } else if (creditScore < 650 || creditScore > 850) {
            System.out.println("Credit score must be between 650 & 850.");
            isEligible = false;
        }

        if (isEligible){
            System.out.println("Congratulations! you are eligible for a loan.");
        }else {
            System.out.println("Sorry. You are not eligible for a loan based on the given details.");
        }
    }
}
