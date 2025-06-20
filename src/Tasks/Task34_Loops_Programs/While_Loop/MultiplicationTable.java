package Tasks.Task34_Loops_Programs.While_Loop;

public class MultiplicationTable {
    public static void main(String[] args) {
        int i =1;
        int num =7;
        System.out.println("Multiplication Table of 7:");
        while (i<=10){
           int result = num * i;
            System.out.println(num + "x" + i + "=" + result);
            i++;
        }

    }
}
