package ex_06_Ternary_Operator;

public class Lab067_TO_Three_Max {
    public static void main(String[] args) {
        // Given 3 numbers
        int n1 = 2;
        int n2 = 9;
        int n3 = -11;

        // Logic Building Formula
        // Step 1 -> Find the input & output data type
        //I/O -> n1,n2,n3 -> int
        // O/P -> int - max number or string message with max number

        //Step 2 - Rough Logic
        // n1 > n2 && n1 > n3 -> n1
        // n2 > n3 && n2 > n1 -> n2
        // n3

        //Step 3 - Dry run program
         int max = (n1 > n2) ? (n1 > n3) ? n1 : n3 : ((n2>n3) ? n2 : n3);
        System.out.println(max);
    }
}
