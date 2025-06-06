package Tasks;

import java.util.Scanner;

public class Task14_Fibonacci_Series {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Input
        System.out.println("Enter a Number: ");
        int n = scanner.nextInt();
        int first = 0, second =1;

        System.out.println("Fibonacci Series : ");

        for (int i = 1; i <=n ; i++) {
            System.out.print(first + " ");

            int next = first + second;
            first = second;
            second = next;
        }
    }
}
