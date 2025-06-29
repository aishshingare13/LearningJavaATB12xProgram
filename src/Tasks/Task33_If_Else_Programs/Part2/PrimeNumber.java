package Tasks.Task33_If_Else_Programs.Part2;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int num = scanner.nextInt();

        boolean isPrime = true;

        if (num <= 1){
            isPrime = false;
        }else {
            for (int i = 2; i <= num/2 ; i++) {
                if (num % i == 0){
                    isPrime = false;
                    break;
                }
            }
        }
        if (isPrime){
            System.out.println(num + " is a prime number.");
        }else {
            System.out.println(num + " is not a prime number.");
        }
        scanner.close();
    }
}
