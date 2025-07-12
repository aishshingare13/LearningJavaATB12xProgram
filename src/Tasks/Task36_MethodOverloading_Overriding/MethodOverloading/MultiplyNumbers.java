package Tasks.Task36_MethodOverloading_Overriding.MethodOverloading;

public class MultiplyNumbers {
    public static void main(String[] args) {
        MathOperation math = new MathOperation();

        int product2 = math.multiply(4,9);
        System.out.println("Product: " + product2);

        int product3 = math.multiply(2,4,6);
        System.out.println("Product: " + product3);
    }
}
class MathOperation{
    int multiply(int a, int b){
        return a * b;
    }

    int multiply(int a, int b, int c){
        return a * b * c;
    }
}