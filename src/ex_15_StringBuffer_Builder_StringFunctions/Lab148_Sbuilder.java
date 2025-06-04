package ex_15_StringBuffer_Builder_StringFunctions;

public class Lab148_Sbuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" World");  // Append Text
        sb.reverse();
        System.out.println(sb);
    }
}
