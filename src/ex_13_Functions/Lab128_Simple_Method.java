package ex_13_Functions;

public class Lab128_Simple_Method {
    public static void main(String[] args) {

        non_return_type_func();

        int a= return_type_func();
        System.out.println(a);

        String s=return_type_string();
        System.out.println(s);

        boolean b = return_boolean();
        System.out.println(b);

        float f = return_float();
        System.out.println(f);

        byte b1 = return_byte();
        System.out.println(b1);

        long l = return_long();
        System.out.println(l);

    }
    // non-return type or void does not return anything.
    static void non_return_type_func(){
        System.out.println("Hi, Non return type func");
    }

    //Return type function, it will return a particular data type
    static int return_type_func(){
        System.out.println("Hi, return type function is integer");
        return 10;
    }

    static String return_type_string(){
        System.out.println("Hi, return type function is string");
        return "Aishwarya";
    }

    static boolean return_boolean(){
        System.out.println("Hi, return type function is boolean");
        return true;
    }

    static float return_float(){
        System.out.println("Hi, return type function is float");
        return 3.14f;
    }

    static byte return_byte(){
        System.out.println("Hi, return type function is byte");
        return 100;
    }

    static long return_long(){
        System.out.println("Hi, return type function is long");
        return 10l;
    }
}
