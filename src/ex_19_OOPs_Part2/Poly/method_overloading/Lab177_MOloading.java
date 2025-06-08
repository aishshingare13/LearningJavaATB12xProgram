package ex_19_OOPs_Part2.Poly.method_overloading;

public class Lab177_MOloading {
    public static void main(String[] args) {
        MathOperations m1 = new MathOperations();
        int r = m1.add(3,4);
        System.out.println(r);

        int r1 = m1.add(3,4,5);
        System.out.println(r1);

        double d = m1.add(3.45,45.67);
        System.out.println(d);
    }
}
