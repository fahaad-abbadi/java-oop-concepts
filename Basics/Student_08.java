package Basics;

//we use constructors to initialize object
//They don't have a return type
//The class name and the constructor name is same


public class Student_08 {
    int roll;
    String name;

    public Student_08()
    {
        roll = 29;
        name = "Fahaad";
    }

    public static void main(String[] args) {
        Student_08 s1 = new Student_08();
        Student_08 s2 = new Student_08();
        Student_08 s3 = new Student_08();

        System.out.println(s1.roll);
        System.out.println(s1.name);
        
        System.out.println(s2.roll);
        System.out.println(s3.name);
    }
}
