package Coding_Challenge_P4;

public class GenericPair {
    public static void main(String[] args) {
        Pair<String, Integer> pair = new Pair<>("Test",100);
        pair.printPair();
    }
}
class Pair<S, I>{
    private S first;
    private I second;

    public Pair(S first, I second){
        this.first = first;
        this.second = second;
    }

    public S getFirst(){
        return first;
    }

    public I getSecond(){
        return second;
    }
    public void printPair(){
        System.out.println("First: " + first + ", Second: " + second);
    }
}