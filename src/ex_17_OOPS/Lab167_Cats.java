package ex_17_OOPS;

public class Lab167_Cats {
    public static void main(String[] args) {
       Cat c1 = new Cat();
       Cat c2 = null;
       new Cat(); // Object without reference

        c1.running();
        c2.running();  // NullPointerException
    }
}
class Cat{
    String name;

    void running(){
        System.out.println("Running");
    }
}