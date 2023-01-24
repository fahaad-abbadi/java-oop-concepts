package Basics;

public class Student_13 {
    int roll;
    String name;
    int mobile;

    //parameterized constructors
    public Student_13(int r, String n)
    {
        roll = r;
        name = n;
    }

    // we can use the same constructor with multiple parameters
    public Student_13(int r, String n, int m)
    {
        roll = r;
        name = n;
        mobile = m;
    }

    //method overloading
    public void practice(int sessions)
    {
        System.out.println("practising this subject requires these many " + sessions);
    }

    //we can use the same method name and add extra parameters
    public void practice(int sessions, int hours)
    {
        System.out.println("practising this requires these many " + sessions + " ,which are these many " + hours);
    }

    public void practice(int sessions, int hours, String subject)
    {
        System.out.println("practising this requires these many " + sessions + " ,which are these many " + hours + " another chapter is difficult in the subject called " + subject);
    }

    
    public static void main(String[] args) {
        Student_13 s1 = new Student_13(29, "Fahaad");
        Student_13 s2 = new Student_13(29, "Fahaad", 923901498);

        s1.practice(3);
        s2.practice(3, 2);
        s2.practice(5, 10, "Trigonometry");


        System.out.println(s1.roll);
        System.out.println(s2.name);
        System.out.println(s2.mobile);
    }
}
