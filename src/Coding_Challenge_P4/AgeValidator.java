package Coding_Challenge_P4;

import java.util.Scanner;

public class AgeValidator {
    public static void validateAge(int age) throws InvalidAgeException{
        if (age < 18){
            throw new InvalidAgeException("Age must be 18 or elder");
        }else {
            System.out.println("Valid age: " + age);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter age: ");
        int age = scanner.nextInt();

        try {
            validateAge(age);
        }catch (InvalidAgeException e){
            System.out.println("InvalidAgeException: " + e.getMessage());
        }
        scanner.close();
    }
}
// Custom Exception Class
class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}
