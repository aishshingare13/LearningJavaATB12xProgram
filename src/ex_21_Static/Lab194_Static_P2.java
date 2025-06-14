package ex_21_Static;

public class Lab194_Static_P2 {
    public static void main(String[] args) {
        ATB aishwarya = new ATB(80872051,"Aishwarya");
        ATB priyanka = new ATB(93426718,"Priyanka");

        System.out.println(aishwarya.phone_no);
        System.out.println(priyanka.name);
        System.out.println(ATB.course_name);
        System.out.println(ATB.course_name);
        ATB.markAttendance();
    }
}

class ATB{
    int phone_no;
    String name;
    static String course_name = "ATB";

    public ATB(int phone_no, String name) {
        this.phone_no = phone_no;
        this.name = name;
    }

    void display(){
        System.out.println(this.phone_no + this.name + course_name);
    }

    static void markAttendance(){
        System.out.println("Mark Attendance");
    }
}