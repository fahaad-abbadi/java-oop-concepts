package Intermediate;

class Skeleton {
    int noOfWheels;
    int maxSpeed;
    int fuelCapacity;

    boolean isGear;

    public Skeleton()
    {
        super();
    }

    //using a parameterized constructor
    public Skeleton(int noOfWheels, int maxSpeed, boolean isGear)
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
}

//the below concept is known as Inheritance
class Car extends Skeleton
{
    boolean isElectric = true;
    boolean isNitro = false;

    public Car(int noOfWheels, int maxSpeed, boolean isGear, boolean isElectric, boolean isNitro)
    {
        super(noOfWheels, maxSpeed, isGear);
        this.isElectric = isElectric;
        this.isNitro = isNitro;
    }

    //method over-riding
    public void accelarate()
    {
        System.out.println("This vehicle is speeding up even better");
    }
}

//this is known as multi-level inheritance
//for the below, class 'SportsCar' would have been better name, since, the 'main' function is in this class
//We should use 'Vehicle_03' to run this file
public class Vehicle_03 extends Car {
    boolean isConvertible;
    
    public Vehicle_03(int noOfWheels, int maxSpeed, boolean isGear, boolean isElectric, boolean isNitro, boolean isConvertible) {
        super(noOfWheels, maxSpeed, isGear, isElectric, isNitro);
        this.isConvertible = isConvertible;
    }

    // Additional methods specific to SportsCar can go here
    public static void main(String[] args) {
        Vehicle_03 sportsCar = new Vehicle_03(4, 150, true, true, true, true);

        System.out.println("Max Speed: " + sportsCar.maxSpeed);
        System.out.println("Electric: " + sportsCar.isElectric);
        System.out.println("Convertible: " + sportsCar.isConvertible);
    }
}
