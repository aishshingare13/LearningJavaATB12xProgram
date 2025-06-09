package Tasks;

import java.util.Scanner;

public class Task20_Reverse_String_Recursive_Fun {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //String input = "Helloworld";

        System.out.println("Enter a string to reverse");
        String input = scanner.nextLine();

        //call recursive method
        String reversed = reverse(input);

        System.out.println("Original String: " + input);
        System.out.println("Reversed String: " + reversed);

    }
    // Recursive method to reverse a string
    public static String reverse(String str){
        //check string is empty or has one character
        if (str == null || str.length() <= 1){
            return str;
        }
        return reverse(str.substring(1)) + str.charAt(0);
    }
}
