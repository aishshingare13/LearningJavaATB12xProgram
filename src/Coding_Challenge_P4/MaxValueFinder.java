package Coding_Challenge_P4;

public class MaxValueFinder {
    public static void main(String[] args) {
        //Input
        Integer[] numbers = {10, 20, 5, 30, 15};

        //Initialize max with the first element
        int max = numbers[0];

        //Loop to find the maximum value
        for (Integer num : numbers){
            if (num > max){
                max = num;
            }
        }
        System.out.println("Max: " + max);
    }
}
