package Tasks.Task34_Loops_Programs.While_Loop;

import java.util.Scanner;

public class PrimeNoPrg {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        boolean isPrime = true;

        if (num < 2){
            isPrime = false;
        }else {
            int i = 2;

            while (i <= num / 2){
                if (num % i == 0){
                    isPrime = false;
                    break;
                }
                i++;
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
