package ex_11_While_Loop;

import java.util.Scanner;

public class Lab121_While_IQ {
    public static void main(String[] args) {
        // Factorial program

        //Step 1 : data type for input and output
        //Step 2 : write a rough logic
        //Step 3 : write proper logic
        //Step 4 : Optimization of code
        //Step 5 : Edge cases

          Scanner scanner = new Scanner(System.in);
          System.out.println("Welcome to Factorial Program");
          System.out.println("Enter the number, whose factorial you want");

          if (!scanner.hasNextInt()){
              System.out.println("Enter the int , and rerun the program");
          }

          int number = scanner.nextInt();
          int factorial = 1;


          if (number <= 0){
              System.out.println("factorial is ->"+factorial);
          }

          if (number > Integer.MAX_VALUE){
              System.out.println("Can't get the factorial as out of bound (int)");
          }

          int i = 1;
          while (i<=number){
              factorial = factorial*i;
              i++;
          }
        System.out.println("factorial is ->"+factorial);
    }

}
