//Method overriding in Java is the process of defining a method in a subclass that is already defined in its superclass. The overridden method in the subclass has the same name, return type, and parameters as the method in the superclass. By overriding a method, the subclass provides its own implementation, which is executed instead of the superclass implementation when the method is called on an instance of the subclass.

//Here's an example of method overriding in Java:

class Animal {
    public void makeSound() {
        System.out.println("The animal makes a sound.");
    }
}

class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("The dog barks.");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.makeSound();  // Output: The animal makes a sound.

        Dog dog = new Dog();
        dog.makeSound();  // Output: The dog barks.

        Animal animalDog = new Dog();  // Polymorphism
        animalDog.makeSound();  // Output: The dog barks.
    }
}


//In this example, we have an Animal class with a makeSound method that prints a generic sound. The Dog class extends the Animal class and overrides the makeSound method to provide its own implementation that specifically represents a dog's sound.

In the Main class, we create instances of both Animal and Dog classes. When we call the makeSound method on an Animal instance, the original implementation of the Animal class is invoked. However, when we call the makeSound method on a Dog instance, the overridden implementation in the Dog class is executed.

Furthermore, we demonstrate polymorphism by creating an Animal reference variable pointing to a Dog object. When we call the makeSound method on this reference, it dynamically resolves to the overridden method in the Dog class, even though the reference type is Animal.
output
The animal makes a sound.
The dog barks.
The dog barks.
//Method overriding allows subclasses to provide their own specific implementation of a method defined in the superclass, promoting code reusability and flexibility in object-oriented programming.
