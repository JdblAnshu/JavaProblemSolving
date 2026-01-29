package InterviewQuestion;

// Interface with a default method
interface Vehicle {
    default void speed() {
        System.out.println("Vehicle Interface: Default speed implementation");
    }
}

// Parent class with a concrete method
class AbstractVehicle {
    void speed() { // Concrete implementation (not abstract)
        System.out.println("AbstractVehicle: Parent class speed implementation");
    }
}

// Child class extending parent class and implementing interface
class Car extends AbstractVehicle implements Vehicle {
    @Override
    public void speed() {
        System.out.println("Car: Child class speed implementation");

        // Calling parent class's speed() method
        super.speed();

        // Calling interface's default speed() method
        Vehicle.super.speed();
    }
}

// Main class to test
public class DefaultInterface {
    public static void main(String[] args) {
        Car car = new Car();
        car.speed(); // Invoke the child class's speed() method
    }
}