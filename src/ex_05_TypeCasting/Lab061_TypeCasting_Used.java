package ex_05_TypeCasting;

public class Lab061_TypeCasting_Used {
    public static void main(String[] args) {

        int course = 100;
        float GST = 18.45f;
        // int total = course+GST;  // Narrowing - Implicit
        int total = course+(int) GST; //Narrowing - Explicit
        System.out.println(total);  // data loss

        float total1 = course+GST; // widening - auto - implicit
        // float total2 = (float)course+GST; // widening - Explicit
        System.out.println(total1);
    }
}
