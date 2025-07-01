package ex_Lab27_Collection_Framework.List;

import java.util.ArrayList;
import java.util.List;

public class Lab231_List {
    public static void main(String[] args) {
        List fruits = List.of("orange","apple","Mango","watermelon");
        System.out.println(fruits);

        List arrayList = new ArrayList<>();
        arrayList.add("Aish");
        arrayList.add(null);
        arrayList.add("shingare");
        arrayList.add("shingare"); //duplicate is allowed
        arrayList.add(123); //different data ype is allowed
        System.out.println(arrayList);
        System.out.println(arrayList.size());
    }

}
