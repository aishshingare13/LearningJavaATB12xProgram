package Tasks.Task34_Loops_Programs.While_Loop;

import java.util.Scanner;

public class PyramidPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int n = scanner.nextInt();

        int i = 1;

        while (i <= n){
            int space = 1;
            //print space
            while (space <= n-i){
                System.out.print(" ");
                space++;
            }
            int start = 1;
            while (start <= (2 * i - 1)){
                System.out.print("*");
                start++;
            }
            //move to next line
            System.out.println();
            i++;
        }
        scanner.close();
    }
}
