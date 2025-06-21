package Tasks.Task33_If_Else_Programs.Part2;

import java.util.Scanner;

public class ArmstrongCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int num = scanner.nextInt();

        int originalNumber = num;
        int digits = 0;
        int sum = 0;

        //step1: count number of digits
        int temp = num;
        while (temp > 0){
            digits++;
            temp = temp / 10;
        }

        temp =num;
        while (temp > 0){
            int digit = temp % 10;
            sum += Math.pow(digit,digits);
            temp = temp /10;
        }
        if (sum == originalNumber){
            System.out.println(originalNumber + " is an Armstrong number.");
        }else {
            System.out.println(originalNumber + " is not an armstrong number.");
        }
        scanner.close();
    }
}
