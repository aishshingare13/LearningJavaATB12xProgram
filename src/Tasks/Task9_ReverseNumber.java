package Tasks;

import java.util.Scanner;

public class Task9_ReverseNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input 
        System.out.println("Enter a number: ");
        int number = scanner.nextInt();
        int reversed = 0;
        
        //Reverse the number using a for loop
        for (; number !=0 ; number /=10) {
            int digit = number % 10;
            reversed = reversed * 10 + digit;
        }

        //Output
        System.out.println("Reversed number: " + reversed);
        
    }
}
