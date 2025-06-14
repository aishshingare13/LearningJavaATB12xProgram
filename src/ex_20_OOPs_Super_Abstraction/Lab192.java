package ex_20_OOPs_Super_Abstraction;

public class Lab192 {
    public static void main(String[] args) {
        //Pramod's instance but dutta's object
        Pramod d = new Dutta(); //Dynamic Dispatch will interface
        Dutta d1 = new Dutta(); //Dynamic Dispatch will interface
        d.display();
        System.out.println(d.a);
    }
}
class Dutta implements Pramod{

    @Override
    public void display() {
        System.out.println(a);
    }
}
interface Pramod{
    int a =10;
    void display(); //abstract
}