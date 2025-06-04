package ex_14_Strings;

public class Lab141_Strings_Example {
    public static void main(String[] args) {

        String s = "Java";
        char c =s.charAt(2); // Index start from 0
        System.out.println(c); // o/p v

        System.out.println(s.codePointAt(0)); // it will give u Unicode value of given index

        //CompareTOIgnore(String str)
        int result = "abc".compareToIgnoreCase("ABC");
        System.out.println(result);

        int result1 = "abc".compareTo("ABC");
        System.out.println(result1); // It will give ASCII difference

        int idx = "Java".indexOf("a"); //1
        System.out.println(idx);

        int idx2 = "Java".lastIndexOf("a");
        System.out.println(idx2);

        boolean b = "".isEmpty();// true
        System.out.println(b);

        String s11 = String.join("-","Java","Python");
        System.out.println(s11);

        String s12 = "Java".replace('a','o');// Jovo
        System.out.println(s12);

        boolean b1 = "Java".startsWith("Ja"); //true
        System.out.println(b1);
    }

}
