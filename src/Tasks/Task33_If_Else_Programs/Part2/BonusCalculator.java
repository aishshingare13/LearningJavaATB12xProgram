package Tasks.Task33_If_Else_Programs.Part2;

import java.util.Scanner;

public class BonusCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your salary: ");
        double salary = scanner.nextDouble();

        System.out.print("Enter your years of experience: ");
        double years = scanner.nextDouble();

        double bonus = 0;

        if (salary <= 0 || years < 0){
            System.out.println("Invalid input. Salary must be positive number");
        } else if (years < 1) {
            bonus = 0;
            System.out.println("No bonus for experience less than 1 year.");
        } else if (years <= 3) {
            bonus = salary * 0.05;
        } else if (years <= 6) {
            bonus = salary * 0.10;
        }else {
            bonus = salary * 0.15;
        }

        if (salary > 0 && years >= 0){
            System.out.printf("Bonus Amount: %.2f\n",bonus);
            System.out.printf("Total Salary with Bouns: %.2f\n",salary+bonus);
        }
        scanner.close();
    }
}
