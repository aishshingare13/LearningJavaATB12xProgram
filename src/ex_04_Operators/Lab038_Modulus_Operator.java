package ex_04_Operators;

public class Lab038_Modulus_Operator {
    public static void main(String[] args) {

        int a = 20;
        int b = 10;
        System.out.println(a%b);  // Mod -> remainder
        // 10 | 20 | 2 - quotient
        //     | 20 |
        //     ------
        //        0  - Remainder

        System.out.println(13%7);
        // 7 | 13 | 1 - Quotient
        //   |  7 |
        //  ---------
        //      6    - Remainder


        /* logic of even odd
        * 11%2 -> 1, 13%2 ->1
        * 10%2 -> 0, 12%2 ->0
        * number % 2 -> 1 -> odd
        * number % 2 -> 0 -> even
        *  */

    }
}
