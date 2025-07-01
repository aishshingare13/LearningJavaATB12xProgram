package ex_Lab27_Collection_Framework.List;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Lab238_ArrayList_input {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List list = new ArrayList();
        // Webdriver chrome = new ChromeDriver();
//        ArrayList list1 = new ArrayList();

        List<String> names = new ArrayList<>();

        String continueInput = "Y";
        while(continueInput.equalsIgnoreCase("Y")) {
            System.out.print("Enter the name:");
            String name = scanner.next();
            names.add(name);
            scanner.nextLine();

            System.out.println("Do you want to enter another name Y/N");
            continueInput = scanner.nextLine();

        }

        for(String name: names){
            System.out.println(name);
        }

        scanner.close();

    }
}
