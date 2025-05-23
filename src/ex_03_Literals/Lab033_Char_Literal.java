package ex_03_Literals;

public class Lab033_Char_Literal {
    public static void main(String[] args) {
        char c1 ='A'; //A to Z,a-z,!@#$%^&*()_+
        //char c "A"; //this is a String, String is a bunch of character

        char c2 = 'B';
        char c3 = '@';
        char c4 = '_';
        char c5 = '9';
        char c6 = '1';
        char c7 = '(';
        char c8 = ' ';  //blank space

        //Escape Char
        char new_line = '\n';
        char tab_line = '\t';
        char back_space= '\b';
        char carriage_return = '\r';


        System.out.println("AishwaryaShingare");
        System.out.println("Aishwarya"+new_line+"Shingare");
        System.out.println("Aishwarya"+tab_line+"Shingare");
        System.out.println("Aishwarya"+back_space+"Shingare");
        System.out.println(" ----- ");
        System.out.println("Aishwarya is"+carriage_return+"shinagre");


        System.out.println("Aishwarya\nShingare");
        System.out.println("Aishwarya\tShingare");
        System.out.println("Aishwarya\bShingare");
        System.out.println(" ----- ");

        System.out.println("Aishwarya is\rshinagre");
    }
}
