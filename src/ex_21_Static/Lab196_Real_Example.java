package ex_21_Static;

public class Lab196_Real_Example {
    public static void main(String[] args) {

    }
}

class ATB1{
    {
        System.out.println("IIB - this is called when object is created");
        //What is the purpose?
        // here you can write code related to
        //start a website or anything before starting the
        //web automation or api automation
    }

    static {
        System.out.println("Load the class?, i will execute");
    }

    private String name;
    private String phone;
    static String courseName = "ATB12x";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    void readDocuments(){
        System.out.println("Non static Method");
        System.out.println(courseName);
    }

    static void doAssignment(){
       // System.out.println(phone);  // static method can't access the non-static variables
        System.out.println("Do Assignment");
    }
}