package Tasks.Task32_Wrapper_Classes_Programs;

public class StringToPrimitive {
    public static void main(String[] args) {
        //numeric string
        String numberStr = "123";

        //convert string to primitive int using Integer wrapper
        int number = Integer.parseInt(numberStr);

        System.out.println("String Value: " + numberStr);
        System.out.println("Converted int Value: " + number);
    }
}
