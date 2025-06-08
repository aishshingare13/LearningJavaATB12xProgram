package ex_19_OOPs_Part2.Encapsulation;

public class Lab179 {
    public static void main(String[] args) {
        VWLogin vwLogin = new VWLogin("admin","pass123");
        System.out.println(vwLogin.password);
        vwLogin.password = "345";
        System.out.println(vwLogin.password);

        GoodVWLogin goodVWLogin = new GoodVWLogin("admin","pwd123");
        //System.out.println(goodVWLogin.password); // it's not allowed bcz it's a private
        System.out.println(goodVWLogin.getUsername());
        System.out.println(goodVWLogin.getPassword());

        goodVWLogin.setUsername("aishwarya");
        System.out.println(goodVWLogin.getUsername());

        goodVWLogin.setPassword("aish1234",true);
        System.out.println(goodVWLogin.getPassword());
    }
}
class VWLogin{
 String username;
 String password;

    public VWLogin(String username, String password) {
        this.username = username;
        this.password = password;
    }
}

class GoodVWLogin {
    private String username;
    private String password;

    public GoodVWLogin(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password, boolean isAdmin) {
        if (isAdmin) {
            this.password = password;
        } else {
            System.out.println("Not allowed to set the password, You are not a Admin");
        }
    }
}
