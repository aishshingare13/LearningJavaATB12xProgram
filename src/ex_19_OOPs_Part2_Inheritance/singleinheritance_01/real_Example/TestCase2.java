package ex_19_OOPs_Part2_Inheritance.singleinheritance_01.real_Example;

public class TestCase2 extends CommonToAllTest {

    void runningTC2(){
        startBrowser();
        readExcelFile();
        readDataBaseFile();
        System.out.println("Running TC2");
        closeBrowser();
    }

}
