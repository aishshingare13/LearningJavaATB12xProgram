package ex_23_Wrapper_Class;

public class Lab206_Wrapper_Conversion {
    public static void main(String[] args) {
        String num = "10";
        int aa = 10;

        //String -> wrapper conversion
        Integer a = Integer.parseInt(num);  //(parseX())
       // Double.parseDouble(), Float.parseFloat();

        //String to primitive
        int a_p = Integer.parseInt(num);   //(String - Wp class , wp class -> primitive

        Integer aa3 = Integer.valueOf("10");
        System.out.println(aa3);

        Integer aa10 = 10;
        String s = aa10.toString();
        System.out.println(s);
        System.out.println(s instanceof String);
    }
}
