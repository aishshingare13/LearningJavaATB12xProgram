package ex_Lab27_Collection_Framework.List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Lab232_ArrayList {
    public static void main(String[] args) {
        List list = new ArrayList<>();
        list.add("1"); //0
        list.add("2"); //1
        list.add("3"); //2
        list.add("3"); //3
        list.add("4"); //4
        list.add(true); //5

        System.out.println(list.size());
        System.out.println(list.isEmpty());
        System.out.println(list.contains("1"));
        System.out.println(list.contains(1));
        System.out.println(list.indexOf("3")); //find the first occurrence of the element in list
        System.out.println(list.lastIndexOf("3"));

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        for (Object o:list){
            System.out.println(o);
        }

        Iterator iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
