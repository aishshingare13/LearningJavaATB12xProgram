package Tasks.Task34_Loops_Programs.While_Loop;

public class NaturalNumbersSum {
    public static void main(String[] args) {
        int i = 1;
        int sum = 0;
        while (i<=10){
            sum = sum +i;
            i++;
        }
        System.out.println("Sum of first 10 natural number:" + sum);
    }
}
