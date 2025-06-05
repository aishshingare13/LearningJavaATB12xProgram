package ex_16_Arrays;

public class Lab150_Arrays {
    public static void main(String[] args) {
        int[] marks = {1,2,3,4,5,6};
        System.out.println(marks[0]);

        // 2md way to create the array
        int[] mark2 = new int[5];
        int mark3[] = new int[5]; //fixed size // default value is 0
        System.out.println(mark2[0]);
        System.out.println(mark3[0]);

        String[] names = new String[3]; // default value is null
        names[0] = "Aishwarya";
        names[1] = "Priyanka";
        names[2] = "Soumya";
        System.out.println(names[0]);
    }
}
