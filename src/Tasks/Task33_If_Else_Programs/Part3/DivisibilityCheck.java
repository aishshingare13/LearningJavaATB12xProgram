package Tasks.Task33_If_Else_Programs.Part3;

import java.util.Scanner;

public class DivisibilityCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        if (number % 5 == 0 && number % 11 == 0){
            System.out.println(number + " is divisible by both 5 & 11.");
        }else {
            System.out.println(number + " is not divisible by both 5 & 11.");
        }
        scanner.close();
    }
}
