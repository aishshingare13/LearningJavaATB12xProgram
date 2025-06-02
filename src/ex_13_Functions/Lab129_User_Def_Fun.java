package ex_13_Functions;

public class Lab129_User_Def_Fun {
    public static void main(String[] args) {

        int r1 = sum_of_two_no(4,5);
        System.out.println(r1);

        int r2 = sum_of_two_no(34,66);
        System.out.println(r2);
    }

    static int sum_of_two_no(int first , int second){
        return first+second;
    }
}
