package Coding_Challenge_P4;

public class GenericBoundedSum {
    public static void main(String[] args) {
        //Integer Array example
        Integer[] intArray = {1,2,3};
        System.out.println("Sum: " + sumArray(intArray));

        //Double Array
        Double[] doubleArray = {1.5, 2.5, 3.5};
        System.out.println("Sum: " + sumArray(doubleArray));
    }
    //Generic method with bounded type to sum numbers
    public  static <T extends Number> double sumArray(T[] array){
        double sum = 0.0;
        for (T num : array){
            sum = sum + num.doubleValue(); //convert each number to double
        }
        return sum;
    }
}
