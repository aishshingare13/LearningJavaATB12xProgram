package ex_04_Operators;

public class Lab042_Interview_Concat_Plus {
    public static void main(String[] args) {
        String first_name = "Aishwarya";
        String last_name = "Shingare";

        int a = 10;
        int b = 10;

        System.out.println(first_name + last_name + a + b);
        System.out.println(a + b + first_name + last_name);
        System.out.println(first_name + last_name + (a + b));
    }
}
