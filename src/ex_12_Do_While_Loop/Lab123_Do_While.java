package ex_12_Do_While_Loop;

public class Lab123_Do_While {
    public static void main(String[] args) {

        int a = 1; // initialization
        do {
            System.out.println("This is body, I will execute 1 time");
            System.out.println(a);
            a++;
        }while (a < 10);
    }
}
