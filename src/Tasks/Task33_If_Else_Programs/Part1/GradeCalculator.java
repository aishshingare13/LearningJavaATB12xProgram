package Tasks.Task33_If_Else_Programs.Part1;

import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //step 1: take user input
        System.out.println("Enter your marks: ");
        int marks = scanner.nextInt();

        //step 2: check validity
        if (marks < 0 || marks > 100){
            System.out.println("Invalid marks. Please enter a value between 0 to 100");
        }else {
            //step 3 : use if else to determine grade
            String grade;
            if (marks >=90){
                grade = "A+";
            } else if (marks >= 80) {
                grade = "A";
            } else if (marks >= 70) {
                grade = "B";
            }else if (marks >= 60){
                grade = "C";
            } else if (marks >= 50) {
                grade = "D";
            } else if (marks >= 40 ) {
                grade = "E";
            }else {
                grade = "Fail";
            }
            //step 4: display result
            System.out.println("Your grade is: " + grade);
        }
        scanner.close();

    }
}
