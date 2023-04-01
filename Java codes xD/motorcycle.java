class Vehicle {
    void describe() {
        System.out.println("I am a vehicle with pedals.");
    }
}

class Motorcycle extends Vehicle {
    @Override
    void describe() {
        super.describe();
        System.out.println("Hello, I am a motorcycle, I am a cycle with an engine.");
    }
}

public class Main {
    public static void main(String[] args) {
        Motorcycle motorcycle = new Motorcycle();
        motorcycle.describe();
    }
}
