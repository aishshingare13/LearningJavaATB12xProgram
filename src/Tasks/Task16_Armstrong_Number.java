package Tasks;

import java.util.Scanner;

public class Task16_Armstrong_Number {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Input
        System.out.println("Enter a Number: ");
        int number = scanner.nextInt();

        int originalNumber = number;
        int sum = 0;

        //Count number of digits
        int digits = String.valueOf(number).length();

        //calculate sum of powers of digits
        while (number > 0){
            int digit = number % 10;
            sum += Math.pow(digit,digits);
           // sum = sum + Math.pow(digit, digits);
            number = number / 10;
        }

        // Check if armstrong or not
        if (sum == originalNumber){
            System.out.println(originalNumber + " is an Armstrong Number");
        }else {
            System.out.println(originalNumber + " is not a armstrong Number");
        }
    }
}
