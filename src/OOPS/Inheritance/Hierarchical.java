package OOPS.Inheritance;
//In hierarchical inheritance, more than one subclass is inherited from a single base class.
public class Hierarchical {
    public static void main(String[] args){
        Car c=new Car();
        Bus b=new Bus();
    }
}
class Vehicle{
    Vehicle(){
        System.out.println("This is a Vehicle");
    }
}
class Car extends Vehicle{
    Car(){
        System.out.println("This vehicle is a Car");
    }
}
class Bus extends Vehicle{
    Bus(){
        System.out.println("This is vehicle a Bus");
    }
}