class Vehicle {
    public void start() {
        System.out.println("The vehicle is starting.");
    }
}

class Car extends Vehicle {
    public void start() {
        System.out.println("The car is starting");
    }
}
class Bike extends Vehicle {
    public void start() {
        System.out.println("The bike is starting");
    }
}public class polymorphism {
    public static void main(String[] args) {
        Vehicle v1 = new Car();
        Vehicle v2 = new Bike();
      v1.start();
        v2.start();
    }}
