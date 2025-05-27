package Tasks;

public class Task3_MaxNo_TO {
    public static void main(String[] args) {
        // Finding Max number program using ternary operator
        int n1 = 7;
        int n2 = 4;
        int n3 = -9;

        int max = (n1 > n2) ? (n1 > n3) ? n1 : n3 :((n2 > n3)? n2 : n3);
        System.out.println(max);
    }
}
