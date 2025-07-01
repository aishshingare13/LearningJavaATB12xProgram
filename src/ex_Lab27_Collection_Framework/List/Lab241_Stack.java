package ex_Lab27_Collection_Framework.List;

import java.util.Stack;

public class Lab241_Stack {
    public static void main(String[] args) {
        // Stack
        //  List In and First Out

//        Stack s = new Stack();
//        s.add("Aish");
//        s.add("Shingare");
//        s.add("Amit");

        Stack s = new Stack();
        s.push("Aishwarya");
        s.push("Shingare");
        s.push("Amit");
        s.push("Amit2");
        System.out.println(s);


        System.out.println(s.size());
        System.out.println(s);
        System.out.println(s.peek());
        System.out.println(s);
        System.out.println(s.pop());
        System.out.println(s);
        System.out.println(s.size());
        System.out.println(s.empty());
        System.out.println(s.add("Snehal"));
        System.out.println(s);
        s.add("Chetan");
        s.add("Chetan");
        s.push("Vijay");
        System.out.println(s);


        System.out.println(s.get(0));
        System.out.println(s.get(1));


    }
}
