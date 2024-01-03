package Basics;

public class Student_08 {
    int roll;
    String name;

    //In the previous problem we used method to assign values in data members in the 'main' function
    //We can do the same thing using the below thing, the below thing is called "parameterized constructor"
    public Student_08(int r, String n)
    {
        roll = r;
        name = n;
    }

    public static void main(String[] args) {
        Student_08 s = new Student_08(29, "Fahaad");

        System.out.println(s.roll);
        System.out.println(s.name);
    }
}
