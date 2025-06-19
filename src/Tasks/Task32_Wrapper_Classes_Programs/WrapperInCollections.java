package Tasks.Task32_Wrapper_Classes_Programs;

import java.util.ArrayList;

public class WrapperInCollections {
    public static void main(String[] args) {
        //Create an ArrayList of Integer (wrapper for int)
        ArrayList<Integer> list = new ArrayList<>();

        //Add primitive int values - Autoboxing converts int to Integer
        list.add(5);  // int 5 is autoboxed converts int to Integer
        list.add(10);
        list.add(15);

        //Retrieve & print values - unboxing converts Integer to int
        for (Integer value : list){
            System.out.println("Value " + value);
        }
    }
}
