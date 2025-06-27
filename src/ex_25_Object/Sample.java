package ex_25_Object;

public class Sample extends Object{

    @Override
    public String toString() {
        System.out.println("This is coming from object class");
        return null;
    }

    @Override
    public int hashCode() {
        System.out.println("Coming from the object.");
        return 0;
    }

    @Override
    public boolean equals(Object obj) {
        System.out.println("This is also coming from object class.");
        return true;
    }
}
