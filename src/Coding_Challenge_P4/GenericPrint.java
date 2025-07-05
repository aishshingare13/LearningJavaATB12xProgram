package Coding_Challenge_P4;

public class GenericPrint {
    public static void main(String[] args) {
        //String array Example
        String[] strArray = {"A", "B", "C"};
        System.out.print("String array: ");
        printArray(strArray);  //Output A B C

        //Integer array Example
        Integer[] intArray = {1, 2, 3};
        System.out.print("Integer array: ");
        printArray(intArray);  // Output 1 2 3
    }

    public static <T> void printArray(T[] array){
        for (T element : array){
            System.out.print(element + " ");
        }
        System.out.println();  // new line after printing array
    }
}
