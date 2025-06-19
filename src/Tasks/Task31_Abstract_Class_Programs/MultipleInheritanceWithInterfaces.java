package Tasks.Task31_Abstract_Class_Programs;

public class MultipleInheritanceWithInterfaces {
    public static void main(String[] args) {
        Documents d = new Documents();
        d.print();
        d.show();
    }
}
//1st interface
interface Printable{
    void print();
}

//2nd interface
interface Showable{
    void show();
}

//class implementing both interfaces
class Documents implements Printable,Showable{
    //Implementing Printable's print() method
    @Override
    public void print() {
        System.out.println("Printing Document");
    }

    //Implementing Showables's show() method
    @Override
    public void show() {
        System.out.println("Showing Document");
    }
}