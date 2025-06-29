package Tasks.Task34_Loops_Programs.For_Loop;

import java.util.Scanner;

public class PrimeNo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        boolean isPrime = true;

        if (num < 2){
            isPrime = false;
        }else {
            for (int i = 2; i <= num / 2 ; i++) {
                if (num % i == 0){
                    isPrime = false;
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
