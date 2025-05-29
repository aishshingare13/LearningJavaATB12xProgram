package ex_09_Switch_Statement;

import java.util.Scanner;

public class Lab084_Switch {
    public static void main(String[] args) {
        // You need to take a user input and ask for the integer from 0 to 7
        //And if user enters 1 to 7
        //you will tell which day it is

        //Logic building formula
        //step 1 - Use scanner class to take input from user
        // Step 2 - Figuring out the expression and the day
        // Step 3 - rough logic
        // Step 4 - Fix the logic and optimize the code
        // Step 5 - figuring out the edge cases.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the day to 1 to 7:");
        //int day = 1;
        if (scanner.hasNextInt()){
            int day = scanner.nextInt();

            switch (day){
                case 1:
                    System.out.println("Mon");
                    break;
                case 2:
                    System.out.println("Tue");
                    break;
                case 3:
                    System.out.println("Wed");
                    break;
                case 4:
                    System.out.println("Thur");
                    break;
                case 5:
                    System.out.println("Fri");
                    break;
                case 6:
                    System.out.println("Sat");
                    break;
                case 7:
                    System.out.println("Sun");
                    break;
                default:
                    System.out.println("Enter int number 1 to 7 only");
            }
        }
        else{
            System.out.println("Please enter integer values only");
        }


        System.out.println("End of the program");

    }
}
