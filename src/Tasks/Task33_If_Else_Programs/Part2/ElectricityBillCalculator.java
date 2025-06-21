package Tasks.Task33_If_Else_Programs.Part2;

import java.util.Scanner;

public class ElectricityBillCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of units consumed:");
        int units = scanner.nextInt();

        double bill = 0;

        if (units <= 0){
            System.out.println("Invalid input. Units must be a positive number.");
        } else if (units <= 100) {
            bill = units * 0.50;
        } else if (units <= 200) {
            bill = (100 * 0.50) + (units - 100) * 0.75;
        } else if (units <= 300) {
            bill = (100 * 0.50) + (100 * 0.75) + (units - 200) * 1.20;
        }else {
            bill = (100 * 0.50) + (100 * 0.75) + (100 * 1.20) + (units - 300) * 1.50;
        }

        if (units > 0){
            System.out.printf("Total Electricity bill for %d units: %.2f\n",units,bill);
        }
        scanner.close();
    }
}
