package Basics;

public class Student_06 {
    int roll;
    String name;
    String school_name;
    int fee;

    //The below thing is called "Constructor", it does not have a return type. It is used to initialize the elements in the objects.
    public Student_06()
    {
        roll = 29;
        name = "Fahaad";
        school_name = "MSU";
        fee = 230452;
    }

    public static void main(String[] args) {
        Student_06 s = new Student_06();

        System.out.println(s.roll);
        System.out.println(s.fee);

        System.out.println(s.name);
        System.out.println(s.school_name);
    }
}

