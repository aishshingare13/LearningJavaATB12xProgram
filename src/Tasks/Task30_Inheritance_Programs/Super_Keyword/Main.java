package Tasks.Task30_Inheritance_Programs.Super_Keyword;

public class Main {
    public static void main(String[] args) {
        AndroidPhone myPhone = new AndroidPhone();

        System.out.println("Calling overridden method:");
        myPhone.displayFeatures();

        System.out.println("\nUsing showAllFeatures method:");
        myPhone.showAllFeatures();
    }
}
