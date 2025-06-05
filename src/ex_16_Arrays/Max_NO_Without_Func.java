package ex_16_Arrays;

public class Max_NO_Without_Func {
    public static void main(String[] args) {
        int[] array = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
        int max = array[0];

        for (int i = 0; i < array.length; i++) {
            if (array[i] > max){
                max = array[i];
            }
        }
        System.out.println("Max is: "+ max);
    }
}
