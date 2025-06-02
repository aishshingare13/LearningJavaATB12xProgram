package ex_11_While_Loop;

import java.util.Random;
import java.util.Scanner;

public class Lab122_While_Guessing_Game {
    public static void main(String[] args) {
        // Guess a number between 1 and 100
        // n = 50
        // g = 80 <

        //Step 1 : data type for input and output
        //Step 2 : write a rough logic
        //Step 3 : write proper logic
        //Step 4 : Optimization of code
        //Step 5 : Edge cases

        Random random = new Random();
        int numberToGuess = random.nextInt(100)+1;
        //System.out.println(numberToGuess);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");
        int guess;
        int attempts = 0;

        while (true){
            if (!scanner.hasNextInt()){
                System.out.println("Invalid input! Please enetr a number");
                scanner.next(); //Consume invalid token
                continue;
            }

            guess = scanner.nextInt();
            attempts++;

            if (guess < 1 || guess > 100){
                System.out.println("Please enetr a number between 1 to 100");
                continue;
            }

            if (guess < numberToGuess){
                System.out.println("Too low , try again");
            } else if (guess > numberToGuess) {
                System.out.println("Too high, try again");
            }else {
                System.out.println("Correct! You guessed it in " +  attempts  +  " attempts");
                break;
            }
        }

    }
}
