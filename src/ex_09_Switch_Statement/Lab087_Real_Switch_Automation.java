package ex_09_Switch_Statement;

import java.util.Scanner;

public class Lab087_Real_Switch_Automation {
    public static void main(String[] args) {
        // Web Automation
        //I will ask the user to give me the input from browser where he wants to use it
        // i will start the automation in that browser.

        // String browser = args[0]; // it is working fine

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the browser");
        String browser = scanner.next();
        browser = browser.toLowerCase(); // lower(Chrome,CHROME,CHrome)== chrome

        switch (browser){
            case "chrome":
                System.out.println("Starting the chrome");
                System.out.println("......");
                System.out.println("TC1");
                System.out.println("TC2");
                break;
            case "firefox":
                System.out.println("Starting the firefox browser");
                //Further code to start the Firefox
                //webdriver driver = new Firefox(); // Selenium Code
                break;
            case "edge":
                System.out.println("Execute the edge code");
                break;
            default:
                System.out.println("I have no idea which browser is this");
                break;
        }
    }
}
