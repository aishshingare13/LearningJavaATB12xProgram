package Tasks.Task34_Loops_Programs.For_Loop;

public class EvenNumber {
    public static void main(String[] args) {
        System.out.println("Even Numbers from 1 to 20:");
        for (int i = 1; i <=20 ; i++) {
            if (i%2==0){
                System.out.println(i);
            }
        }
    }
}
