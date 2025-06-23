package Tasks.Task33_If_Else_Programs.Part3;

import java.util.Scanner;

public class DaysConvertor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter total number of days: ");
        int totalDays = scanner.nextInt();

        int years = 0;
        int months = 0;
        int days = 0;

        if (totalDays >= 365){
            years = totalDays / 365;
            totalDays = totalDays % 365;
        }
        if (totalDays >= 30){
            months = totalDays / 30;
            totalDays = totalDays % 30;
        }
        if (totalDays > 0){
            days = totalDays;
        }
        System.out.println(years + " years, " + months + " months, and "  + days + " days.");
        scanner.close();
    }
}
