package ex_16_Arrays;

public class Lab149_Arrays {
    public static void main(String[] args) {
        int a = 10; // integer
        int[] marks = {91,89,94,10,88,92,85}; // Array
        boolean [] is_married_people = {true,true,false};

        System.out.println(marks.length);
        System.out.println(marks[0]);
        System.out.println(marks[4]);

        //ArrayOutOfBoundException Java does not support negative index
        //System.out.println(marks[-1]);

        //System.out.println(marks[10]); //ArrayOutOfBoundException

        char c = 'A';
        String name = "aishwarya";
        String [] name_each_element_char = name.split("");
        // ["a","i","s","h","w","a","r","y","a",
    }
}
