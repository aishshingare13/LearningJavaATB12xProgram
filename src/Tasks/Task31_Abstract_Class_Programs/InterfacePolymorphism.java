package Tasks.Task31_Abstract_Class_Programs;

public class InterfacePolymorphism {
    public static void main(String[] args) {
        //Interface reference
       Playable instrument;

       //Assigning Guitar object
        instrument = new Guitar();
        instrument.play();

        instrument = new Piano();
        instrument.play();
    }
}
interface Playable{
    void play();
}
class Guitar implements Playable{

    @Override
    public void play() {
        System.out.println("Playing Guitar");
    }
}
class Piano implements Playable{

    @Override
    public void play() {
        System.out.println("Playing Piano");
    }
}