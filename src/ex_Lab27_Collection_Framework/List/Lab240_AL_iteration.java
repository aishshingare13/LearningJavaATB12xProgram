package ex_Lab27_Collection_Framework.List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Lab240_AL_iteration {
    public static void main(String[] args) {
        List<String> mylist = new ArrayList();
        mylist.add("Aishwarya");
        mylist.add("Sourabh");
        mylist.add("Shingare");


        System.out.println(" - To Print Arraylist - 1 ");

        for (String str : mylist) {
            System.out.println(str);
        }

        System.out.println(" - To Print Arraylist - 2 ");

        // Iterator
        Iterator<String> iterator = mylist.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println(" - To Print Arraylist - 3 ");

        for (int i = 0; i < mylist.size(); i++) {
            System.out.println(mylist.get(i));
        }

    }
}
