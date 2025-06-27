package Tasks.Task34_Loops_Programs.For_Loop;

import java.util.Scanner;

public class InvertedPyramidPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int n = scanner.nextInt();

        //number of rows
        for (int i = n; i >=1 ; i--) {
            //print spaces
            for (int j = 1; j <= n-i ; j++) {
                System.out.print(" ");
            }
            //print start
            for (int k = 1; k <=(2 * i - 1) ; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        scanner.close();
    }
}
