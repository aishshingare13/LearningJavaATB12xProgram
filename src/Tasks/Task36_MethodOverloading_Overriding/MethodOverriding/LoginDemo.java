package Tasks.Task36_MethodOverloading_Overriding.MethodOverriding;

public class LoginDemo {
    public static void main(String[] args) {
        User admin = new AdminUser();
        User regular = new RegularUser();

        admin.login();
        regular.login();
    }
}
//Base class
class User{
    void login(){
        System.out.println("User login");
    }
}
//AdminUser subclass
class AdminUser extends User{
    @Override
    void login() {
        System.out.println("Admin login: verifying admin credentials, loading admin dashboard ");
    }
}
//regularUser subclass
class RegularUser extends User{
    @Override
    void login() {
        System.out.println("Regular user login: checking user credentials, loading home page");
    }
}