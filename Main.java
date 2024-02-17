// Uses-a relationship in Java
class Car {
    private String model;

    public Car(String model) {
        this.model = model;
    }
    public void start() {
        System.out.println(model + " is starting...");
    }

    
    public String getModel() {
        return model;
    }
}

// Driver class representing a driver
class Driver {
    private String name;

    // Constructor
    public Driver(String name) {
        this.name = name;
    }

    // Method for the driver to drive a car
    public void drive(Car car) {
        System.out.println(name + " is driving the " + car.getModel());
        car.start(); // Utilizing the services of the Car class
    }
}

// Main class to demonstrate the relationship
public class Main {
    public static void main(String[] args) {
        // Creating instances of Car and Driver
        Car myCar = new Car("Toyota");
        Driver driver = new Driver("John");

        // Driver driving the car
        driver.drive(myCar);
    }
}
