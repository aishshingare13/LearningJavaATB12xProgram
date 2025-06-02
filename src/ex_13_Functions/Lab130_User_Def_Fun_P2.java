package ex_13_Functions;

import java.util.Scanner;

public class Lab130_User_Def_Fun_P2 {
    public static void main(String[] args) {
        // User Defined Functions

        //1.Without Parameters & Without Return Type
        wp_wr_greet();

        //2.Without Parameters & With Return Type
        String msg = greet_with_hello_wp_with_RT();
        System.out.println(msg);

        //3.With Parameters & Without Return Type
        greet_with_details("Aishwarya",28,100);
        greet_with_details("priyanka",27,120);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Name :");
        String name = scanner.next();
        System.out.println("Enter age:");
        int age = scanner.nextInt();
        System.out.println("Enter Salary:");
        double salary = scanner.nextDouble();
        greet_with_details(name,age,salary);


        //4.With Parameters & With Return Type
        int sum = sum_of_two_no(12,34);
        System.out.println(sum);

        int sum2 = sum_of_three_no(8,5,6);
        System.out.println(sum2);

        float f = sum_of_three_no_float(3.14f,22.3f,9.7f);
        System.out.println(f);

    }

    //1.Without Parameters & Without Return Type
    static void wp_wr_greet() {
        System.out.println("Hi,How are you?");
    }

    //2.Without Parameters & With Return Type
    static String greet_with_hello_wp_with_RT(){
        System.out.println("Hi");
        return "How are you";
    }

    //3.With Parameters & Without Return Type
    static void greet_with_details(String name, int age, double salary){
        System.out.println("Your name is :" + name + "\nYour age is :" + age + "\nYour salary is:"+ salary);
    }

    //4.With Parameters & With Return Type
    static int sum_of_two_no(int a, int b){
        return a+b;
    }

    static int sum_of_three_no(int a, int b, int c){
        return a+b+c;
    }

    static float sum_of_three_no_float(float a, float b, float c){
        return a+b+c;
    }
}
