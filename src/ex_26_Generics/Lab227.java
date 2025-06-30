package ex_26_Generics;

public class Lab227 {
    public static void main(String[] args) {
        temp_sum(23,34);
        temp_sum(3.4,6.5);
        temp_sum("Aishwarya", "Shingare");
    }
    static Integer temp_sum(Integer a, Integer b){
        return a+b;
    }

    static String temp_sum(String a, String b){
        return a+b;
    }

    static Double temp_sum(Double a, Double b){
        return a+b;
    }

}
