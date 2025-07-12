package Tasks.Task36_MethodOverloading_Overriding.MethodOverloading;

public class MaximumNumberFinding {
    public static void main(String[] args) {
        Utility util = new Utility();

        //compare two integers
        System.out.println("Max = " + util.max(40,90));

        //compare three integers
        System.out.println("Max = " + util.max(5,67,20));

        //compare two doubles
        System.out.println("Max = " + util.max(6.7,8.6));
    }
}
class Utility{
    int max(int a, int b){
        return (a > b) ? a : b;
    }

    int max(int a, int b, int c){
        return (a > b && a > c) ? a : (b > c ? b : c);
    }

    double max(double a, double b){
        return (a > b) ? a : b;
    }
}