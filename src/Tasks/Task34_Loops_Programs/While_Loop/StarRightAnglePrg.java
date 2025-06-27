package Tasks.Task34_Loops_Programs.While_Loop;

import java.util.Scanner;

public class StarRightAnglePrg {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();

        int i = 1;

        while (i <= rows){
            int j =1;

            while (j <= i){
                System.out.print("*");
                j++;
            }
            System.out.println();
            i++;
        }
        scanner.close();
    }
}
