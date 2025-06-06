package Tasks;

import java.util.Scanner;

public class Task13_Leap_Year {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input year
        System.out.println("Enter a year: ");
        int year = scanner.nextInt();

        //Check leap year
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)){
            System.out.println(year + " is a Leap year");
        }else {
            System.out.println(year + " is not a Leap year");
        }
    }
}
