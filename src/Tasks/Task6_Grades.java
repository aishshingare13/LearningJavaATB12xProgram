package Tasks;

import java.util.Scanner;

public class Task6_Grades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your grade(A, B, C, D, F)");
        char grade = scanner.next().charAt(0);

        String result;
        switch (grade){
            case 'A':
                result = "Excellent";
                break;

            case 'B':
                result = "Very Good";
                break;

            case 'C':
                result = "Good";
                break;

            case 'D':
                result = "Needs Improvement";
                break;

            case 'F':
                result = "Fail";
                break;

            default:
                result = "Invalid grade";

        }

        System.out.println("Result:" + result);
        scanner.close();
    }
}
