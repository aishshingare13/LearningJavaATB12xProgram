package Coding_Challenge_P3;

public class StringComparison {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "hello";
        String s3 = "Hello";

        System.out.println("== Operator:" + s1 == s2);
        System.out.println("== Operator:" + s1 == s3);
        System.out.println("equals(): " + s1.equals(s2));
        System.out.println("equalsIgnoreCase: " + s1.equalsIgnoreCase(s2));
        System.out.println("compareTo: " + s1.compareTo(s2));
    }
}
