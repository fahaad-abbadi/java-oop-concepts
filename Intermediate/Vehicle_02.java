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
}

//the below concept is known as Inheritance
class Car extends Vehicle_02
{
    boolean isElectric;
    boolean isNitro;

    public Car(boolean isElectric, boolean isNitro)
    {
        this.isElectric = isElectric;
        this.isNitro = isNitro;
    }

    //method over-riding
    public void accelarate()
    {
        System.out.println("This vehicle is speeding up even better");
    }

    public static void main(String[] args) {
        Car c = new Car(true, false);

        if(c.isElectric)
        {
            System.out.println("This is electric car");
        }

        if(c.isNitro)
        {
            System.out.println("This car even has Nitro");
        }
        else
        {
            System.out.println("No, it's a normal car");
        }

        c.accelarate();
    }
}


