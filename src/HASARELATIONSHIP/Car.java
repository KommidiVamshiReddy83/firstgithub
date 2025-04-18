package HASARELATIONSHIP;

class Car {
    private String model;
    private Engine engine; // Has-A relationship with Engine

    public Car(String model, Engine engine) {
        this.model = model;
        this.engine = engine;
    }

    public void startCar() {
        System.out.println("Starting the car with model: " + model);
        engine.start();
    }

    public void stopCar() {
        System.out.println("Stopping the car with model: " + model);
        engine.stop();
    }
}
