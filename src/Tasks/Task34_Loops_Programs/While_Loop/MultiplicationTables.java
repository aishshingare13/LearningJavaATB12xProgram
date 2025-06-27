package Tasks.Task34_Loops_Programs.While_Loop;

import java.util.Scanner;

public class MultiplicationTables {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number to print its multiplication table: ");
        int number =scanner.nextInt();

        System.out.println("Multiplication Table of " + number + ":");

        int i = 1;
        while (i <= 10){
            System.out.println(number + " x " + i + " = " + (number * i));
            i++;
        }
        scanner.close();
    }
}
