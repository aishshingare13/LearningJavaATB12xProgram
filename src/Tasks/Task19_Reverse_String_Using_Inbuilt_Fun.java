package Tasks;

import java.util.Scanner;

public class Task19_Reverse_String_Using_Inbuilt_Fun {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string to reverse:");
        String input = scanner.nextLine();

        StringBuffer sb = new StringBuffer(input);
        String reversed = sb.reverse().toString();

        System.out.println("Reversed String: " + reversed);

        scanner.close();

    }
}
