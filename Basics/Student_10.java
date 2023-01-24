package Basics;

public class Student_10 {
    int roll;
    String name;


    //parameterized constructors, we can keep any name of the parameters
    public Student_10(int first, String second)
    {
        roll = first;
        name = second;
    }

    public static void main(String[] args) {
        Student_10 s = new Student_10(29, "Fahaad");

        System.out.println(s.roll);
        System.out.println(s.name);
    }
}
