package Tasks;

public class Task24_Largest_Element_Array {
    public static void main(String[] args) {
        int[] numbers = {45, 23, 76, 21, 98, 34, 76};
        int max = numbers[0];

        for (int num : numbers){
            if (num > max){
                max = num;
            }
        }
        System.out.println("Largest Element of Array is: " + max);
    }
}
