package ex_04_Operators;

public class Lab046_OR_AND_GATE {
    public static void main(String[] args) {
        // || OR GATE

        System.out.println(true || true);   // true
        System.out.println(true || false);  // true
        System.out.println(false || true);  // true
        System.out.println(false || false);  // false

        // && AND GATE

        System.out.println(true && true);   // true
        System.out.println(true && false);  // false
        System.out.println(false && true);  // false
        System.out.println(false && false);  // false

    }
}
