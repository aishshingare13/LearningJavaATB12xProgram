package Tasks;

import java.util.Scanner;

public class Task15_Reverse_String {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Input
        System.out.println("Enter a String : ");
        String input =scanner.nextLine();

        String reversed = "";

        //Reverse the string
        for (int i = input.length()-1; i >=0 ; i--) {
            reversed = reversed + input.charAt(i);
        }
        System.out.println("Reversed String : " + reversed);
    }
}
