package ex_19_OOPs_Part2.Inheritance.multilevelinheritance;

public class Lab175_Multilevel {
    public static void main(String[] args) {
        Son sourabh =  new Son();
        Father f = new Father();
        GrandFather gf = new GrandFather();

        Son s1 = new Son();
        //Son s2 = new Father(); // it is not possible
        Father f1 = new Son(); // Dynamic Dispatch
        GrandFather gf1 = new Son();
        GrandFather gf2 = new Father();
        //Son s2 = new GrandFather();
    }
}
