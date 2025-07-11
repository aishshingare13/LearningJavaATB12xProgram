package Tasks.Task33_If_Else_Programs.Part1;

import java.util.Scanner;

public class VowelOrConsonant {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a character: ");
        char ch = scanner.next().charAt(0);

        //convert to lower case
        ch = Character.toLowerCase(ch);

        if ((ch >= 'a' && ch <= 'z')){
            //check for vowels
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                System.out.println(ch + " is a vowel");
            }else {
                System.out.println(ch + " is a consonant.");
            }
        }else {
            System.out.println("Invalid Input. Please enter an alphabet");
        }
            scanner.close();
    }
}
