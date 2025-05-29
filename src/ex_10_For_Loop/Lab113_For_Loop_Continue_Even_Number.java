package ex_10_For_Loop;

public class Lab113_For_Loop_Continue_Even_Number {
    public static void main(String[] args) {

        for (int i = 0; i <=50; i++) {

            if (i%2==0){
                continue; // it will skip all the even numbers
            }
            System.out.println("Odd ->" +i);
//
        }
    }
}

//              if (i%2==0){
//                System.out.println(i);
//                continue;
//            }
//            else {
//                System.out.println("Odd No->" + i);
//            }
