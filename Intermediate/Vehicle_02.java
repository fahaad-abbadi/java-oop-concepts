package Intermediate;

public class Vehicle_02 {
    int noOfWheels;
    int maxSpeed;
    int fuelCapacity;

    boolean isGear;

    public Vehicle_02()
    {
        super();
    }

    //using a parameterized constructor
    public Vehicle_02(int noOfWheels, int maxSpeed, boolean isGear)
    {
        this.noOfWheels = noOfWheels;
        this.maxSpeed = maxSpeed;
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
        Vehicle_02 v = new Vehicle_02(3, 70, true);
    
        System.out.println(v.maxSpeed);
    }
}


class Car extends Vehicle_02
{
    boolean isElectric;

}
