package Tasks;

public class Task25_Smallest_Element_Array {
    public static void main(String[] args) {
        int[] numbers = {45, 23, 76, 21, 98, 34, 76};
        int min = numbers[0];

        for (int num : numbers){
            if (num < min){
                min = num;
            }
        }
        System.out.println("Smallest Element of Array is: " + min);
    }
}
