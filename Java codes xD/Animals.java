abstract class Animals {
    abstract void speak();
}

class Cat extends Animals {
    void speak() {
        System.out.println("Cat meows");
    }
}

class Dog extends Animals {
    void speak() {
        System.out.println("Dogs bark");
    }
}

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.speak();

        Dog dog = new Dog();
        dog.speak();
    }
}
