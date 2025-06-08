package ex_19_OOPs_Part2.Inheritance.singleinheritance_01;

public class Lab172_SI {
    public static void main(String[] args) {

        Son pramod = new Son();
        System.out.println(pramod.gold_f);
        pramod.bhk2();
        pramod.bhk3();

        Cousin c = new Cousin();
        c.bhk3();
      //  System.out.println(c.gold_f); // it was extended from father
    }
}
