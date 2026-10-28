package OOPS.Inheritance;

public class Hybrid {
    public static void main(String[] args) {
        Car2 car = new Car2();
        car.vehicleType(); // inherited from Vehicle
        car.carType();     // specific to Car

        Bus2 bus = new Bus2();
        bus.vehicleType(); // inherited from Vehicle
        bus.busType();     // specific to Bus
        bus.fareInfo();    // from Fare interface
    }
}
// Superclass
class Vehicle2 {
    void vehicleType() {
        System.out.println("This is a Vehicle");
    }
}

// Interface for fare
interface Fare {
    default void fareInfo() {
        System.out.println("Fare information");
    }
}

// Subclass 1: Single inheritance
class Car2 extends Vehicle2 {
    void carType() {
        System.out.println("This is a Car");
    }
}

// Subclass 2: Hybrid inheritance (extends class + implements interface)
class Bus2 extends Vehicle2 implements Fare {
    void busType() {
        System.out.println("This is a Bus");
    }
}