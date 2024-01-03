package Basics;

//we use constructors to initialize object
//They don't have a return type
//The class name and the constructor name is same

//we can see that the various objects have the same values
public class Student_09 {
    int roll;
    String name;

    public Student_09()
    {
        roll = 29;
        name = "Fahaad";
    }

    public static void main(String[] args) {
        Student_09 s1 = new Student_09();
        Student_09 s2 = new Student_09();
        Student_09 s3 = new Student_09();

        System.out.println(s1.roll);
        System.out.println(s1.name);
        
        System.out.println(s2.roll);
        System.out.println(s3.name);
    }
}

