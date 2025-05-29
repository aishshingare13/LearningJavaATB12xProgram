package ex_07_Increment_Decrement_Op;

public class Lab069_In_De_Op {
    public static void main(String[] args) {

        // take input
        String age_string = args[0];
        String a1 = args[1];
        String a2 = args[2];
        String a3 = args[3];

        float f1 = Float.parseFloat(a1);
        System.out.println(f1);
        System.out.println(age_string);
        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);

        // If the arguments are less ->java.lang.ArrayIndexOutOfBoundsException
        // If you want to perform mathematical operation you need to convert string to integer
    }
}
