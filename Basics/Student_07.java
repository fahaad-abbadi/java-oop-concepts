package Basics;

//classes in java usually start with capital letter and functions with small letter
// in other words, we use CamelCase
public class Student_07 {
    int roll;
    String name;

    //we are using methods. We can assign the values in the 'main' function
    public void keepData(int r, String n)
    {
        roll = r;
        name = n;
    }

    public static void main(String[] args) {
        Student_07 s = new Student_07();

        s.keepData(29, "Fahaad");

        System.out.println(s.roll);
        System.out.println(s.name);
    }
}
