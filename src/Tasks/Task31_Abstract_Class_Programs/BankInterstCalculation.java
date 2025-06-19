package Tasks.Task31_Abstract_Class_Programs;

public class BankInterstCalculation {
    public static void main(String[] args) {
        //create instance of SBI & HDFC banks
        Bank sbi = new SBI();
        Bank hdfc = new HDFC();

        //Display interest rates
        System.out.println("SBI Interest Rate: " + sbi.getInterest() + "%");
        System.out.println("HDFC Interest Rate: " + hdfc.getInterest() + "%");
    }
}

//abstract class
abstract class Bank{
    //abstract method
    abstract double getInterest();
}

//SBI class extends bank class
class SBI extends Bank{
    @Override
    double getInterest() {
        return 6.5;
    }
}

//HDFC class extends bank class
class HDFC extends Bank{
    @Override
    double getInterest() {
        return 7;
    }
}