package Tasks.Task36_MethodOverloading_Overriding.MethodOverloading;

public class AddTwoNumbers {
    public static void main(String[] args) {
        Calculator c = new Calculator();

        int intSum = c.add(6,9);
        System.out.println("Sum of integers: " + intSum);

        double doubleSum = c.add(7.9,12.34);
        System.out.println("Sum of doubles: " + doubleSum);
    }
}
class Calculator{
    //add () for two integer
    int add(int a, int b){
        return a + b;
    }

    double add(double a, double b){
        return a + b;
    }
}