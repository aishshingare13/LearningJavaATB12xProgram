package Coding_Challeange;

public class TypeCastingPrg {
    public static void main(String[] args) {
        int a = 10;
        double b = 3.5;

        int result = a+(int)(b*3)+3;

        double  implicitCasting = a + b;

        int explicitCasting = (int)(a + b);

        System.out.println("Expression result: " + result);
        System.out.println("Implicit casting: " + implicitCasting);
        System.out.println(" Explicit casting: " + explicitCasting);
    }
}
