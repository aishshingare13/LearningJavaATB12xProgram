package Coding_Challenge_P3;

import java.util.Scanner;

public class StringBasicPrg {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String s = scanner.nextLine();

        int length = s.length();

        char firstChar = s.charAt(0);

        String substring = " ";
        if (s.contains(" ")){
            substring = s.substring(s.lastIndexOf(" ")+1);
        }else{
            substring = s;
        }

        System.out.println("Length: " + length);
        System.out.println("First char: " + firstChar);
        System.out.println("Substring: " + substring);

        scanner.close();
    }
}
