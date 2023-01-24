package Basics;

// constructor overloading
public class Student_12 {
    int roll;
    String name;
    int mobile;

    //parameterized constructors
    public Student_12(int r, String n)
    {
        roll = r;
        name = n;
    }

    // we can use the same constructor with multiple parameters
    public Student_12(int r, String n, int m)
    {
        roll = r;
        name = n;
        mobile = m;
    }

    public static void main(String[] args) {
        Student_12 s1 = new Student_12(29, "Fahaad");
        Student_12 s2 = new Student_12(29, "Fahaad", 923901498);

        System.out.println(s1.roll);
        System.out.println(s2.name);
        System.out.println(s2.mobile);
    }
}
