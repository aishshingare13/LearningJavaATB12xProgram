package ex_20_OOPs_Super_Abstraction;

public class Lab186_Abstract {
    public static void main(String[] args) {
        Son s = new Son();
        s.loan50k();

      //  Father f = new Father() {} //abstract class cannot be instantiated
    }
}

class Normal{
    //concrete class (complete class)
}

abstract class Father{
    abstract void loan50k();
}

class Son extends Father{

    @Override
    void loan50k() {
        System.out.println("Loan given");
    }
}