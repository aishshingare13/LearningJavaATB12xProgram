package Tasks;

public class Task4_Age_Category {
    public static void main(String[] args) {
        // Program to find person is Minor, Adult or Senior
        int age = 17;
        String result = (age > 18) ? (age > 65 ? "Senior" : "Adult") : "Minor";
        System.out.println(result);
    }
}
