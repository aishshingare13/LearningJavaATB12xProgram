package ex_15_StringBuffer_Builder_StringFunctions;

public class Lab145_SB {
    public static void main(String[] args) {
        //only 1 string is created this is an advantage
        StringBuffer stringBuffer = new StringBuffer("Aishwarya");
        stringBuffer.append("Shingare");
        System.out.println(stringBuffer);


        // here 2 strings are created
        String s1 = "Aishwarya";
        s1 = s1+"shingare";
        System.out.println(s1);
    }
}
