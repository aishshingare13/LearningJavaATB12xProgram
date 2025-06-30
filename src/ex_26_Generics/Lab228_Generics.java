package ex_26_Generics;

public class Lab228_Generics {
    public static void main(String[] args) {
        temp(3,5);
        temp(2.24,5.89);
        temp("Aishwarya", "Shingare");
    }
    static <T> T temp(T a, T b){
        System.out.println(a + " " + b);
        return null;
    }
    static <Aish> Aish temp1(Aish a, Aish b){
        System.out.println(a + " " + b);
        return null;
    }
}
