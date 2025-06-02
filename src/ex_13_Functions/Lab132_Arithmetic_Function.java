package ex_13_Functions;

import java.util.Scanner;

public class Lab132_Arithmetic_Function {
    public static void main(String[] args) {
        // Create a function of sub, sum , mul  div
        // with parameter a , b (take the parameter from the User)

        //Logic Building
        //Step 1 -> Input & Output
        // a, b - int -> Scanner
        // int variable result

        //Step 2 - Rough logic -> Create functions
        //function -> type 4th - with return & with parameters

        //step 3 - Write the code & find and fix

        // step 4 - edge cases

        Scanner scanner = new Scanner(System.in);
        int a = readInt(scanner,"Enter the num1: ");
        int b = readInt(scanner,"Enter the num2: ");

        int result_sum = sum(a,b);
        int result_sub = sub(a,b);
        int result_mul = mul(a,b);
        int result_div = div(a,b);
        int result_mod = mod(a,b);

        System.out.println(result_sum);
        System.out.println(result_sub);
        System.out.println(result_mul);
        System.out.println(result_div);
        System.out.println(result_mod);


//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter the num1");
//        int a = 0;
//        if (scanner.hasNextInt()){
//            a = scanner.nextInt();
//        }else {
//            System.out.println("Enter the int only");
//            System.exit(0);
//        }

    }
     static int readInt(Scanner scanner,String prompt){
        System.out.println(prompt);
        if (scanner.hasNextInt()){
            return scanner.nextInt();
        }else {
            System.out.println("Enter integer only.");
            System.exit(0);
            return -1; // unreachable, but required for compilation
        }
    }

     static int sum(int a, int b){
        return a+b;
     }

    static int sub(int a, int b){
        return a-b;
    }

    static int div(int a, int b) throws ArithmeticException{
        if (b == 0){
            throw new ArithmeticException("Division by zero is not allowed.");
        }
        return a/b;
    }

    static int mul(int a, int b){
        return a*b;
    }

    static int mod(int a, int b){
        return a%b;
    }


}
