package Tasks.Task33_If_Else_Programs.Part2;

import java.util.Scanner;

public class ATMWithdrawal {
    public static void main(String[] args) {
        //step 1: initialize account balance
        int accountBalance = 10000;

        Scanner scanner = new Scanner(System.in);

        //step 2: take user input
        System.out.println("Enter the amount to withdraw : ");
        int withdrawAmount = scanner.nextInt();

        //step 3: check withdrawal conditions using if else
        if (withdrawAmount <= 0){
            System.out.println("Withdrawal amount must be greater than zero.");
        } else if (withdrawAmount % 100 !=0) {
            System.out.println("Amount must be multiple of 100.");
        } else if (withdrawAmount > accountBalance) {
            System.out.println("Insufficient balance.");
        } else {
            //step 4: deduct amount from balance
            accountBalance = accountBalance - withdrawAmount;

            //step 5: Display updated balance
            System.out.println("Withdrawal successful!");
            System.out.println("Remaining Balance: " + accountBalance);
        }
        scanner.close();
    }
}
