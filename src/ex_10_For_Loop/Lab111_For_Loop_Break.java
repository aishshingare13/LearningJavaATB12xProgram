package ex_10_For_Loop;

public class Lab111_For_Loop_Break {
    public static void main(String[] args) {
        for (int i = 0; i < 50; i++) {// run from 0 to 49 and run for 50 times
           // System.out.println(i); it will give output from 0 to 5
            if (i==5){
                // System.out.println(i);  it will give output is only 5
                 break;
             }
            System.out.println(i); // it will give output from 0 to 4
        }
    }
}
