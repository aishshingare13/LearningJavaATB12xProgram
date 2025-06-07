package ex_18_OOPs_Constructor;

import java.io.FileInputStream;

public class Lab169_OOPS_Con {
    public static void main(String[] args) {
        A a1 = new A();
        System.out.println(a1);
    }
}

class A{
    A(){
        System.out.println("I want to read a CSV file");
        System.out.println("Open the page before loading the scripts");
        System.out.println("You cam do anything which you want to do, when object is created. ");
       // FileInputStream fileInputStream = new FileInputStream("C://a.txt");
    }
}

