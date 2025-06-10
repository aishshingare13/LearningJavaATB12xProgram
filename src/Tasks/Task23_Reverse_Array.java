package Tasks;

public class Task23_Reverse_Array {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6};

        System.out.println("Original Array: ");
        for (int num : array){
            System.out.print(num + " ");
        }

        System.out.println("\nArray in Reverse Order: ");
        for (int i = array.length-1; i>=0; i--){
            System.out.print(array[i] + " ");
        }
    }
}
