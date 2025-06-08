package ex_19_OOPs_Part2.Poly.method_Overriding;

public class Lab178 {
    public static void main(String[] args) {
        Sourabh s = new Sourabh();
        s.home();
        s.s1();

        Father f1 = new Father();
        f1.home();
        f1.f1();

        Father f2 = new Sourabh();
        f2.home();

    }
}
