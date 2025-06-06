package Tasks;

import java.util.Scanner;

public class Task8_Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Number:");
        int number = scanner.nextInt();
        int fact = 1;
        if (number == 0){
            System.out.println("Factorial is" + fact);
        }
        else {
            for (int i= number ; i >0 ; i--){
                fact = fact*i;

            }
            System.out.println("Factorial =" +fact);
        }
    }
}
