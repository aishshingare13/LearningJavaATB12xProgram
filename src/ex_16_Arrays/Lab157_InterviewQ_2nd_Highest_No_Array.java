package ex_16_Arrays;

import java.util.Arrays;

public class Lab157_InterviewQ_2nd_Highest_No_Array {
    public static void main(String[] args) {
        //2nd highest number using function
//        int[] numbers = {12,34,55,23,1,100,3,4};
//        Arrays.sort(numbers);
//        System.out.println(numbers[numbers.length-2]);


        //2nd highest number without using function
        int[] numbers = {12,34,55,23,1,100,3,4};

        // if negative numbers in array the below check is needed
        //int highest = Integer.MIN_VALUE;
        //int secondHighest = Integer.MIN_VALUE;

        int highest = 0;
        int secondHighest = 0;

        for (int num : numbers){
            if (num > highest){
                secondHighest = highest;
                highest = num;
            } else if (num > secondHighest && num != highest) {
                secondHighest =num;
            }
        }
        System.out.println(secondHighest);
    }
}
