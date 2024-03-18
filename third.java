class Animal {
    public void makeSound() {
        System.out.println("Some generic sound");
    }
}

class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Bark");
    }

    // Method Overloading
    public void makeSound(String message) {
        System.out.println("Bark: " + message);
    }
}

public class Main {
    public static void main(String[] args) {
        Animal genericAnimal = new Animal();
        Dog myDog = new Dog();

        // Method Overriding
        genericAnimal.makeSound(); // Output: Some generic sound
        myDog.makeSound(); // Output: Bark

        // Method Overloading
        myDog.makeSound("I want to play"); // Output: Bark: I want to play
    }
}
