package ex_07_Increment_Decrement_Op;

public class Lab071_Post_Inc_Dec {
    public static void main(String[] args) {
        //post increment = print first and then increase

        int a = 10;
        int b = a++;
        System.out.println(a);
        System.out.println(b);

        // ERT ( Expression and Result Table)
        // LineNo | a | b
        //     7  | 10 | NA
        //     8  | 11 |10
        //     9  | 11 |NA
        //     10 | NA |10
    }
}
