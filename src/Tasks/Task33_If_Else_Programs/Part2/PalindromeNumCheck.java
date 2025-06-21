package Tasks.Task33_If_Else_Programs.Part2;

import java.util.Scanner;

public class PalindromeNumCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int num = scanner.nextInt();

        int originalNumber = num;
        int reverseNumber = 0;

        while (num > 0){
            int digit = num % 10;
            reverseNumber = reverseNumber * 10 + digit;
            num = num / 10;
        }
        if (originalNumber == reverseNumber){
            System.out.println(originalNumber + " is a palindrome.");
        }else {
            System.out.println(originalNumber + " is not a palindrome");
        }
        scanner.close();
    }
}
