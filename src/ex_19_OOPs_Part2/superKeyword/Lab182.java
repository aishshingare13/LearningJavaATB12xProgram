package ex_19_OOPs_Part2.superKeyword;

public class Lab182 {
    public static void main(String[] args) {
     Son s1 = new Son();
     s1.bike();
     s1.newHome();
     s1.home();

     Father f1 = new Father();
     f1.home();
    }
}

class Father {
    Father(){
        System.out.println("DC Father");
    }
    int gold = 10;

    void home(){
        System.out.println("Father Home");
    }
}

class Son extends Father{

    Son(){
        super();
    }

    void bike(){

    }
    void newHome(){
        super.home();
        System.out.println(super.gold);

        this.bike();
    }
}