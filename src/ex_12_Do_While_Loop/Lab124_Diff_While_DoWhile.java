package ex_12_Do_While_Loop;

public class Lab124_Diff_While_DoWhile {
    public static void main(String[] args) {
        int a = 0;
//        while ( a < 0){
//            System.out.println(a);
//            a++;
//        }
        // output is nothing bcz condition false

        do {
            System.out.println(a);
            a++;
        }while (a < 0);

    }
}
