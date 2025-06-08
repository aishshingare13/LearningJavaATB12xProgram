package ex_19_OOPs_Part2.superKeyword;

public class Lab181 {
}
class BaseClass {
    private String browser;

    public BaseClass(String browser) {
        this.browser = browser;
    }

    public String getBrowser() {
        return browser;
    }

    public void setBrowser(String browser, boolean isAdmin) {
        if (isAdmin) {
            this.browser = browser;
        } else {
            System.out.println("Not allowed to change the browser, you are not a admin");
        }
    }

    void openBrowser(){ // overloading with different parameter
        System.out.println("Opening Browser!");
    }

    void openBrowser(String browserName){ // overloading with different parameter
        System.out.println("Open Browser -> " + browserName);
    }

    void closeBrowser(){ // overloading with different parameter
        System.out.println("Close Browser!");
    }

    void bhk3(){

    }
}

class TestCase1 extends BaseClass{

    public void tc(){

    }

    public TestCase1(String browser){
        super(browser);  // parent function
        super.openBrowser();
        super.openBrowser("chrome");
        super.openBrowser("chrome");
        super.closeBrowser();
        super.bhk3();

        this.tc(); //child function

    }
}