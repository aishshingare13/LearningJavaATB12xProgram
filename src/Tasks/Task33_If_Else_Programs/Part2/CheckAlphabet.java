package Tasks.Task33_If_Else_Programs.Part2;

import java.util.Scanner;

public class CheckAlphabet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a character: ");
        char ch = scanner.next().charAt(0);

        if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z' )){
            System.out.println(ch + " is an alphabet.");
        }else {
            System.out.println(ch + " is not an alphabet.");
        }
        scanner.close();
    }
}
