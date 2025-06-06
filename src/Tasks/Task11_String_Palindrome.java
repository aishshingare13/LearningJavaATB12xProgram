package Tasks;

import java.util.Scanner;

public class Task11_String_Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Input
        System.out.println("Enter a String: ");
        String input = scanner.nextLine();

        boolean isPalindrome = true;

        // Checking character from both ends using charAt()
        for (int i = 0; i < input.length() / 2; i++) {
            if(input.charAt(i) != input.charAt(input.length() - 1 - i)){
                isPalindrome = false;
                break;
            }
        }

        // output
        if (isPalindrome){
            System.out.println("The string is a palindrome.");
        }else {
            System.out.println("The string is not a palindrome.");
        }
    }
}
