package Tasks.Task33_If_Else_Programs.Part1;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number");
        int number = scanner.nextInt();

        if (number%2 == 0){
            System.out.println("Number is Even");
        }else {
            System.out.println("Number is Odd");
        }
    }
}
