package ex_24_Exceptions;

public class Lab208 {
    public static void main(String[] args) {
        int a = 0;
        int b = 10;
        int c = b/a;
        System.out.println(c);

        //Unchecked -> ArithmeticException, NullPointerException

        String name = null;
        name.trim();
        // java.lang.nullPointerException : cannot invoke "String.trim();




    }
}
