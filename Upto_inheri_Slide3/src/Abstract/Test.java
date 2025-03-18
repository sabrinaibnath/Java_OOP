package Abstract;
abstract class Animal {
    abstract void makeSound();
    
    void eat() {
        System.out.println("Animal is eating");
    }
}

class Dog extends Animal {
    void makeSound() {
        System.out.println("Bark");
    }
    
    void eat() {
        System.out.println("Dog is eating");
    }
}

class Cat extends Animal {
    void makeSound() {
        System.out.println("Meow");
    }
    
    void eat() {
        System.out.println("Cat is eating");
    }
}

public class Test {
    public static void main(String[] args) {
        Animal animal1 = new Dog();
        Animal animal2 = new Cat();
        
        animal1.makeSound();
        animal2.makeSound();
        
        animal1.eat();
        animal2.eat();
        
        Dog dog = new Dog();
        dog.makeSound();
        dog.eat();
    }
}

