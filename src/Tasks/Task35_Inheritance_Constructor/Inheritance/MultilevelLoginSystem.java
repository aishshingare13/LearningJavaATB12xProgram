package Tasks.Task35_Inheritance_Constructor.Inheritance;
//Multilevel Inheritance + Method Calling
public class MultilevelLoginSystem {
    public static void main(String[] args) {
        SuperAdmin superAdmin = new SuperAdmin();

        //call all inherited methods
        superAdmin.login();  //from user
        superAdmin.accessAdminPanel(); //from admin user
        superAdmin.shutdownSystem();  // from super admin
    }
}
//Base class
class User{
    void login(){
        System.out.println("User Logged in.");
    }
}
//Intermediate class
class AdminUser extends User{
    void accessAdminPanel(){
        System.out.println("Admin panel accessed.");
    }
}
//Most derived class
class SuperAdmin extends AdminUser{
    void shutdownSystem(){
        System.out.println("System is shutting down");
    }
}