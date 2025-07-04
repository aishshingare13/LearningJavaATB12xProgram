package Tasks.Task33_If_Else_Programs.Part2;

import java.util.Scanner;

public class TriangleValidity {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter side 1: ");
        int side1 = scanner.nextInt();

        System.out.print("Enter side 2: ");
        int side2 = scanner.nextInt();

        System.out.print("Enter side 3: ");
        int side3 = scanner.nextInt();

        if (side1 > 0 && side2 > 0 && side3 > 0){
            if ((side1 + side2 > side3) &&
                    (side2 + side3 > side1) &&
                    (side1 + side3 > side2)){
                System.out.println("The triangle is valid.");
            }else {
                System.out.println("The triangle is not valid.");
            }
        }
        else {
            System.out.println("Side lengths must be positive.");
        }
        scanner.close();
    }
}
