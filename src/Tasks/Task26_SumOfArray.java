package Tasks;

public class Task26_SumOfArray {
    public static void main(String[] args) {
        int[] numbers = {2, 5, 1, 8};
        int sum = 0;

        for (int num : numbers){
            sum = sum + num;
        }
        System.out.println("Sum of all Elements: " + sum);
    }
}
