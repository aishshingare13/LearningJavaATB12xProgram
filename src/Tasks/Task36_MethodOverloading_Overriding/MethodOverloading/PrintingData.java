package Tasks.Task36_MethodOverloading_Overriding.MethodOverloading;

public class PrintingData {
    public static void main(String[] args) {
        Printer p = new Printer();

        p.printData("Hi Aishwarya");  //call printData(String)
        p.printData(1398);  // call printData(int)
        p.printData(3.145f);  //call printData(float)
    }
}
class Printer{
    void printData(String data){
        System.out.println("String: " + data);
    }

    void printData(int data){
        System.out.println("Integer: " + data);
    }

    void printData(float data){
        System.out.println("Float: " + data);
    }
}