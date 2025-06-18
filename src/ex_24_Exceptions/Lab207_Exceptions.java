package ex_24_Exceptions;

public class Lab207_Exceptions {
    public static void main(String[] args) {
        System.out.println("start the program");
        String ip = args[0]; //java.lang.ArrayIndexOutOfBoundException
        int a = Integer.parseInt(ip);
        int b = 100/a;

        System.out.println(b);
        System.out.println("End the program");

    }
}
