package Basics;

public class Student_09 {
    int roll;
    String name;


    //parameterized constructors
    public Student_09(int r, String n)
    {
        roll = r;
        name = n;
    }

    public static void main(String[] args) {
        Student_09 s = new Student_09(29, "Fahaad");

        System.out.println(s.roll);
        System.out.println(s.name);
    }
}
