package ex_24_Exceptions;

public class Lab226_Finally_Not_Executed {
    public static void main(String[] args) {
        try {
            int a = 10/10;
            System.out.println(a);
           // System.exit(0); // can only stop the execution of the finally block
        }catch (Exception e){
            System.out.println(e.getMessage());
        }finally {
            System.out.println("Hello last");
        }
    }
}
