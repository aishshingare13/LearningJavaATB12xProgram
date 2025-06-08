package ex_19_OOPs_Part2.Poly.method_Overriding;

public class Sourabh extends Father{
    void s1(){
        System.out.println("sourabh - s1");
    }

    @Override
    void home(){
        System.out.println("sourabh - 3BHK");
    }
}
