// In Java, hierarchical inheritance is a type of inheritance where a class extends multiple subclasses, creating a hierarchy or tree-like structure. It allows a class to inherit properties and methods from a single superclass while acting as a superclass for multiple subclasses.

// Here's an example to illustrate hierarchical inheritance in Java:
#java Code
class Animal {
    public void eat() {
        System.out.println("The animal is eating.");
    }
}

class Dog extends Animal {
    public void bark() {
        System.out.println("The dog is barking.");
    }
}

class Cat extends Animal {
    public void meow() {
        System.out.println("The cat is meowing.");
    }
}

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat();  // inherited from Animal class
        dog.bark(); // specific to Dog class

        Cat cat = new Cat();
        cat.eat();  // inherited from Animal class
        cat.meow(); // specific to Cat class
    }
}
In this example, the Animal class is the superclass, while Dog and Cat are subclasses that inherit from it. Both Dog and Cat classes have access to the eat() method inherited from the Animal class. Additionally, each subclass has its own unique methods (bark() in Dog and meow() in Cat) that are not present in the superclass.
