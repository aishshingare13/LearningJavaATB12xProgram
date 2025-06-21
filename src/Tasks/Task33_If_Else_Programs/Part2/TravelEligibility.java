package Tasks.Task33_If_Else_Programs.Part2;

import java.util.Scanner;

public class TravelEligibility {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your age:");
        int age = scanner.nextInt();

        System.out.print("Is your visa valid? (true/ false): ");
        boolean visaStatus = scanner.nextBoolean();

        if (age < 0){
            System.out.println("Invalid input.");
        } else if (age >= 18 && visaStatus == true) {
            System.out.println("You are eligible to travel.");
        }else {
            System.out.println("You are not eligible to travel");
        }
        scanner.close();
    }
}
