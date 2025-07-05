package Coding_Challenge_P4;

public class ExceptionPropagation {
    public static void main(String[] args) {
        try {
            method1(); //exception propagates to main
        }catch (ArithmeticException e){
            System.out.println("Exception caught in main method");
        }
    }

    //method 3 throws the exception
    static  void method3(){
        int result = 10 /0; // Arithmetic exception occurs
    }

    //Method2 calls method3
    static void method2(){
        method3();
    }

    //method1 calls method2
    static void method1(){
        method2();
    }
}
