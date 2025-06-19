package Tasks.Task33_If_Else_Programs;

import java.util.Scanner;

public class PositiveNegativeNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Ask user to input a number
        System.out.println("Enter a number:");
        int number = scanner.nextInt();

        if (number > 0){
            System.out.println("The number is Positive");
        } else if (number < 0) {
            System.out.println("The number is Negative");
        }else {
            System.out.println("The number is Zero");
        }
        scanner.close();
    }
}
