package Basics;

//here, we use this main function
//'new' is a keyword, it is used to create objects
//objects are a physical entity which are created inside heap

public class Student_06 {
    int roll;
    String name;
    String school_name;
    int fees;

    public static void main(String[] args) {
        Student_06 s = new Student_06();

        System.out.println(s.roll);
        System.out.println(s.fees);

        System.out.println(s.name);
        System.out.println(s.school_name);
    }
}

