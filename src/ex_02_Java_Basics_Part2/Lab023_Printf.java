package ex_02_Java_Basics_Part2;

public class Lab023_Printf {
    public static void main(String[] args) {
        int a = 10;
        System.out.println(a);
        System.out.printf("Your variable is %d",a);
        // %d -> int,byte,long,short,data type
        // %s -> String
        // %f -> float,double
        // %b -> boolean
        System.out.println();
       int b = 20;
        System.out.printf("%d + %d",a, b);
        System.out.println();
        System.out.printf("a value is %d , b value is %d",a, b);
        System.out.println();
        System.out.printf("a = %d , b = %d",a, b);
        System.out.println();
        System.out.println("a = " + a + ", b = " + b);
    }
}
