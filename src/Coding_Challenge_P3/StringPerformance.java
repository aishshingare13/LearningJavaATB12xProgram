package Coding_Challenge_P3;

public class StringPerformance {
    public static void main(String[] args) {
        int iterations = 100000;

        //string concatenation
        long startTime = System.currentTimeMillis();
        String str = "";
        for (int i = 0; i < iterations; i++) {
            str = str + "a";  //Created new string each time
        }
        long endTime = System.currentTimeMillis();
        System.out.println("Time taken by String concatenation: " + (endTime - startTime) + " ms");

        //StringBuilder(fast & effective)
        startTime = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < iterations; i++) {
            sb.append("a");
        }
        endTime = System.currentTimeMillis();
        System.out.println("Time taken by StringBuilder: " + (endTime - startTime) + " ms");

        //StringBuffer(thread safe but slightly slower)
        startTime = System.currentTimeMillis();
        StringBuffer sbf = new StringBuffer();
        for (int i = 0; i < iterations; i++) {
            sbf.append("a");
        }
        endTime = System.currentTimeMillis();
        System.out.println("Time taken by StringBuffer: " + (endTime - startTime) + " ms");
    }
}
