package Tasks;

public class Task5_Triangle_Classifier {
    public static void main(String[] args) {
        int side1 = 5; //replace with the lengths of your triangle's sides
        int side2 = 4;
        int side3 = 4;


        if (side1 + side2 > side3 && side1 + side3 > side2 && side2+ side3 > side1) {
            if (side1 == side2 && side2 == side3) {
                System.out.println("Equilateral Triangle");
            } else if (side1 == side2 || side1 == side3 || side2 == side3) {
                System.out.println("Isosceles Triangle");
            } else {
                System.out.println("Scalene");
            }
        }
        else {
            System.out.println("Not a valid triangle");
        }
    }
}
