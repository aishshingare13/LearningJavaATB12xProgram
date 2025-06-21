package Coding_Challeange;

public class PrimeNumberPrg {
    public static void main(String[] args) {
        System.out.println("Prime numbers between 1 and 100:");

        for (int n = 1; n <= 100; n++) {
            boolean isPrime = true;
            for (int i = 2; i <= n / 2; i++) {
                if (n % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.println(n + " ");
            }
        }
    }
}
