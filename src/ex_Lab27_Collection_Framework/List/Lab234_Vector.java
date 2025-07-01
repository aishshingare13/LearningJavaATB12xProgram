package ex_Lab27_Collection_Framework.List;

import java.util.Vector;

public class Lab234_Vector {
    public static void main(String[] args) {
        Vector v = new Vector<>(); //it is also array

        v.add("Aish");
        v.add("Piyu");
        v.add("Lucky");
        System.out.println(v);
        v.remove("Lucky");
        System.out.println(v);
        System.out.println(v.contains("Piyu"));
    }
}
