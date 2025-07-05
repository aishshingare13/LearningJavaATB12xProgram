package Coding_Challenge_P4;
import java.util.Arrays;
public class GenericSwap {
    public static void main(String[] args) {
        //Integer array Example
        Integer[] intArray = {1,2,3};
        swap(intArray,0,2);
        System.out.println("Swapped Integer Array: " + Arrays.toString(intArray));

        // String Array Example
        String[] strArray = {"A", "B", "C"};
        swap(strArray,0,1);
        System.out.println("Swapped String Array: " + Arrays.toString(strArray));
    }
    public static <T> void swap(T[] array, int i, int j){
        T temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
