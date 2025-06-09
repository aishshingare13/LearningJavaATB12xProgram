package Tasks;

public class Task17_FizzBuzz_Test {
    public static void main(String[] args) {
        for (int i = 1; i <=100 ; i++) {
            //check number is divisible 3 & 5
            if (i % 3 == 0 && i % 5 == 0){
                System.out.println("FizzBuzz");
            }
            //check number is divisible by 3
            else if (i % 3 == 0) {
                System.out.println("Fizz");
            }
            //check number is divisible by 5
            else if (i % 5 == 0) {
                System.out.println("Buzz");
            }
            //if not divisible 3 or 5
            else {
                System.out.println(i);
            }
        }
    }
}
