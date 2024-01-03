package Basics;

//the below class has two methods, one method prints only statement and the other prints the data members


//here, we use the main function
//'new' is a keyword, it is used to create objects
//objects are a physical entity which are created inside heap

public class Student_05 {
    int roll;
    String name;
    int mobile;

    public void wholeData()
    {
        System.out.println("This is a thing which displays the data of the student");
    }

    public void display()
    {
        System.out.println(roll + " - " + name);
    }

    //Now, to access the elements inside the objects, we need to use dot operator '.'
    public static void main(String[] args) {
        Student_05 s = new Student_05();
    
        System.out.println(s.roll);
        System.out.println(s.name);
        System.out.println(s.mobile);

        s.wholeData();
        s.display();
    }
}
