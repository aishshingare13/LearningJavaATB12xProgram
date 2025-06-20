package Tasks.Task34_Loops_Programs.While_Loop;

public class Print_EvenNumbers {
    public static void main(String[] args) {
        int i =1;
        System.out.println("Even Numbers from 1 to 20:");
        while (i<=20){
            if (i%2==0){
                System.out.println(i);
            }
            i++;
        }
    }
}
