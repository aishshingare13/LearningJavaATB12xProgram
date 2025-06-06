package Tasks;

import java.util.Scanner;

public class Task12_Prime_Number {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input
        System.out.println("Enter a Number: ");
        int number = scanner.nextInt();

        boolean isPrime =  true;

        // Checking if number is less than or equal to 1
        if (number <= 1){
            isPrime = false;
        }else {
            //checking factors from 2 to number/2
            for (int i = 2; i <= number/2 ; i++) {
                if (number % i == 0){
                    isPrime = false; // If number is divisible by any number other than 1 and itself, it's not prime
                    break;
                }
            }
        }
        // output
        if (isPrime){
            System.out.println(number + " is a prime number");
        }else {
            System.out.println(number + " is not a prime number");
        }
    }
}
