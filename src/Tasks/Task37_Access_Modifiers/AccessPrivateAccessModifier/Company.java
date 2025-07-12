package Tasks.Task37_Access_Modifiers.AccessPrivateAccessModifier;

//Access private access modifier using getter and setter
public class Company {
    public static void main(String[] args) {
        Employee emp = new Employee();

        //set value using setter
        emp.setName("Aishwarya");

        //get value using getter
        System.out.println("Employee Name: " + emp.getName());
    }
}
class Employee{
    //private data member
    private String name;

    //setter method to set value
    public void setName(String name){
        this.name = name;
    }

    //Getter method to access value
    public String getName(){
        return name;
    }
}