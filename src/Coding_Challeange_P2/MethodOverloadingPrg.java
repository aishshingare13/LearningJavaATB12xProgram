package Coding_Challeange_P2;

public class MethodOverloadingPrg {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        int sum1 = calc.add(5, 3);
        double sum2 = calc.add(2.5, 3.7);
        int sum3 = calc.add(1, 2, 3);

        System.out.println("Integer addition: " + sum1);
        System.out.println("Double addition: " + sum2);
        System.out.println("Three integers addition: " + sum3);
    }
}

class Calculator{
    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }
}