package ex_09_Switch_Statement;

public class Lab094_JDK13 {
    public static void main(String[] args) {
        // Jdk 13
        // Another thing add is multiple statement using (,)

        int itemCode = 006;
        switch (itemCode){
            case 001,002,005:
                System.out.println("All of them are Electronic Gadget");
                break;
            case 004,006,007:
                System.out.println("This is Mech");
                break;
            default:
                System.out.println("None");
        }
    }
}
