package Basics;

public class Student_11 {
    int roll;
    String name;

    //parameterized constructors
    //if we are using the parameters as same as the class variables, we have to use 'this' keyword
    public Student_11(int roll, String name)
    {
        this.roll = roll;
        this.name = name;
    }

    public static void main(String[] args) {
        Student_11 s = new Student_11(29, "Fahaad");

        System.out.println(s.roll);
        System.out.println(s.name);
    }
}
