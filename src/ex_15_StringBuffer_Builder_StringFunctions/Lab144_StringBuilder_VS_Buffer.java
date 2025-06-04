package ex_15_StringBuffer_Builder_StringFunctions;

public class Lab144_StringBuilder_VS_Buffer {
    public static void main(String[] args) {
        // In automation, we use 90% normal string
        String s0 = "Aishwarya";
        String s1 = new String("Aishwarya");

        // less than < 10% used
        StringBuffer stringBuffer = new StringBuffer("Aishwarya");
        StringBuilder stringBuilder = new StringBuilder("Aishwarya");

        System.out.println(stringBuffer);
        System.out.println(stringBuilder);

        System.out.println(stringBuffer.reverse());
        System.out.println(stringBuilder.reverse());

    }
}
