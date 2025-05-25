package ex_04_Operators;

public class Lab039_Relational_Operators {
    public static void main(String[] args) {
        // <  ->less than
        // <= -> less than or equal to
        // >  -> greater than
        // >= -> greater than or equal to
        // == -> equal to (but checking)
        // != -> not equal to

        // All of them will give result is boolean output

        int a = 10;
        int b = 30;
        boolean c = a > b; //10>30
        System.out.println(c);

        int age_mamta = 33 ;
        int age_pramod = 34;

        boolean result = age_pramod >= age_mamta;
        System.out.println(result);

        //age_pramod > age_mamta or age_pramod = age_mamta
    }
}
