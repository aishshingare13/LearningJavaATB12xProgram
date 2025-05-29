package ex_07_Increment_Decrement_Op;

public class Lab070_In_De_OP {
    public static void main(String[] args) {
        int a = 10;
        int b = ++a;
        System.out.println(a);
        System.out.println(b);

        // ++a -> a=a+1 , increment by 1

        // ERT
        // line No | a | Result b
        //     5   | 10 | NA
        //     6   | 11 | 11
        //     7   | 11 print a | 11
        //     8   | 11 | 11 -print b
    }
}
