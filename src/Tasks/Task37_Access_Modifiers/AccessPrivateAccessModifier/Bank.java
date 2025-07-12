package Tasks.Task37_Access_Modifiers.AccessPrivateAccessModifier;

//Private members accessing by the public method
public class Bank {
    public static void main(String[] args) {
        Account acc = new Account();
        System.out.println("Account balance: " + acc.getBalance());
    }
}
class Account{
    private int balance = 1000;

    //public method to access private data
    public int getBalance(){
        return balance;
    }
}