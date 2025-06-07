package ex_18_OOPs_Constructor;

public class Lab168_OOPs {
    public static void main(String[] args) {
        Baby b1 = new Baby();
        new Baby();
        new Baby();
        Baby b2;
    }

}
class Baby{
    String name;

      Baby() {
          // This is called automatically when object is created.
          System.out.println("I am called, object is created");
    }
}