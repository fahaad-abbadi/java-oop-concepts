package Intermediate;

public class Vehicle_02 {
    int no_of_wheels;
    int max_speed;
    int fuel_capacity;

    boolean isGear;

    public Vehicle_02()
    {
        super();
    }

    //using a parameterized constructor
    public Vehicle_02(int no_of_wheels, int max_speed, boolean isGear)
    {
        this.no_of_wheels = no_of_wheels;
        this.max_speed = max_speed;
        this.isGear = isGear;
    }

    //the below ones are methods
    public void accelarate()
    {
        System.out.println("The vehicle is speeding up...");
    }

    public void stop()
    {
        System.out.println("Stopping...");
    }

    public static void main(String[] args) {
        Vehicle_01 v = new Vehicle_01(3, 70, true);
    
        System.out.println(v.max_speed);
    }
}


class Car extends Vehicle_02
{
    boolean isElectric;

}
