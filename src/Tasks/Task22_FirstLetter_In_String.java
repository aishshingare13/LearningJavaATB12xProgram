package Tasks;

import java.util.Scanner;

public class Task22_FirstLetter_In_String {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a String: ");
        String input = scanner.nextLine();

        String result = " ";

        //Split the string into words
        String[] words = input.split(" ");

        //get 1st letter of each word
        for (String word : words){
            if (!word.isEmpty()){
                result = result+word.charAt(0);
            }
        }
        System.out.println("First Letters: " + result);

        scanner.close();
    }
}
