package Tasks;

public class Task27_EvenOdd_Array {
    public static void main(String[] args) {
        int[] numbers = { 23, 12, 5, 3, 8, 31};

        System.out.println("Even Numbers: ");
        for (int num : numbers){
            if (num % 2 == 0){
                System.out.println(num + " ");
            }
        }

        System.out.println("Odd Numbers: ");
        for (int num : numbers){
            if (num % 2 != 0){
                System.out.println(num + " ");
            }
        }
    }
}
