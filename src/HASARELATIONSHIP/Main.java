package HASARELATIONSHIP;
public class Main {
    public static void main(String[] args)
    {
        // Create an Engine instance.
        Engine carEngine = new Engine("V6");

        // Create a Car instance with the Engine instance.
        Car myCar = new Car("Sedan", carEngine);

        // Call methods to start and stop car.
        myCar.startCar();
        myCar.stopCar();
    }
}

