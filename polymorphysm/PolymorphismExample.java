// Compile-Time Polymorphism: Method Overloading
class MathOperations {

    // Method to add two integers
    int add(int a, int b) {
        return a + b;
    }

    // Method to add three integers
    int add(int a, int b, int c) {
        return a + b + c;
    }

    // Method to add two double values
    double add(double a, double b) {
        return a + b;
    }
}

// Parent class for Runtime Polymorphism
class Animal {

    // Method to be overridden
    void makeSound() {
        System.out.println("Animal makes a sound...");
    }
}

// Child class 1: Dog
class Dog extends Animal {

    // Overriding the makeSound() method
    @Override
    void makeSound() {
        System.out.println("Dog barks...");
    }
}

// Child class 2: Cat
class Cat extends Animal {

    // Overriding the makeSound() method
    @Override
    void makeSound() {
        System.out.println("Cat meows...");
    }
}

// Main class
public class PolymorphismExample {

    public static void main(String[] args) {

        // ======= Compile-Time Polymorphism (Method Overloading) =======
        MathOperations math = new MathOperations();
        
        System.out.println("Addition of 2 integers: " + math.add(5, 10));
        System.out.println("Addition of 3 integers: " + math.add(5, 10, 15));
        System.out.println("Addition of 2 doubles: " + math.add(5.5, 10.5));

        // ======= Runtime Polymorphism (Method Overriding) =======
        Animal animal;

        // Creating Dog object and referring to Animal
        animal = new Dog();//this is also called upcasting lower hirercy obj ko upper wale reference main dal rahe ho
        animal.makeSound();  // Output: Dog barks...


        // Creating Cat object and referring to Animal
        animal = new Cat();
        animal.makeSound();  // Output: Cat meows...

        // Dog dog =(Dog) dog;//downcasting
    }
}
