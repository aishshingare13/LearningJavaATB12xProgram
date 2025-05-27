package ex_05_TypeCasting;

public class Lab060_TypeCasting_Example {
    public static void main(String[] args) {
        long phone_no = 9880345610l;
        //short s = phone_no; // Narrowing - Implicit
        short s = (short) phone_no; // Narrowing - Explicit
        System.out.println(s); // o/p -> 7178  
    }
}
