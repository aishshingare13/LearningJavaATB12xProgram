package Tasks.Task37_Access_Modifiers;

public class ProtectedAccessModifier {
    public static void main(String[] args) {
        Dogs d = new Dogs();
        d.doEat(); //call the method which uses protected member
    }
}
class Animal1{
    //protected method
    protected void eat(){
        System.out.println("Animal is eating");
    }
}
class Dogs extends Animal1{
    //Method calling inherited protected method
    void  doEat(){
        eat();   //accessing protected method of paren class
    }
}