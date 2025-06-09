package Tasks;

import java.util.Scanner;

public class Task21_Count_Words_In_String {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a String : ");
        String input = scanner.nextLine();

        int wordCount = countWords(input);

        System.out.println("Number of words in the string " + wordCount);

        scanner.close();
    }

    public static int countWords(String str){
        if (str == null || str.isEmpty()){
            return 0;
        }
        // remove leading & trailing whitespace
        String trimmedStr = str.trim();

        //Replace multiple whitespaces between words with single space
        //then split into words
        String[] words = trimmedStr.replaceAll("\\s", " ").split(" ");

        return words.length;
    }
}
