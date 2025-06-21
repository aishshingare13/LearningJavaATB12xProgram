package Tasks.Task33_If_Else_Programs.Part2;

import java.util.Scanner;

public class EmployeeSalaryCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Basic pay: ");
        double basicPay = scanner.nextDouble();

        double hra =0;
        double da =0;
        double grossSalary =0;
        double tax =0;
        double netSalary =0;

        if (basicPay <= 0){
            System.out.println("Invalid input.");
        }else
            hra = basicPay * 0.20;
            da = basicPay * 0.15;

            grossSalary = basicPay + hra + da;

            if (grossSalary <= 250000){
                tax = 0;
            } else if (grossSalary <= 500000) {
                tax = grossSalary * 0.05;
            } else if (grossSalary <= 1000000) {
                tax = grossSalary * 0.10;
            }else {
                tax = grossSalary * 0.20;
            }

            netSalary = grossSalary - tax;

        System.out.printf("HRA: %.2f\n",hra);
        System.out.printf("DA: %.2f\n",da);
        System.out.printf("Gross Salary: %.2f\n",grossSalary);
        System.out.printf("Tax Deducted: %.2f\n",tax);
        System.out.printf("Net salary: %.2f\n",netSalary);
    }
}
