package CT_23;
class Animal{
	void makeSound() {
		System.out.println("Animal");
	}
}
class Dog extends Animal{
	void makeSound() {
		System.out.println("Dog");
	}
}
class Cat extends Dog{
	void makeSound() {
		super.makeSound();
	}
}

public class MainTest {

	public static void main(String[] args) {
       Animal a=new Animal();
       Animal b=new Dog();
       Dog c=new Cat();
      // Cat d=(Cat) new Dog();
       a.makeSound();
       b.makeSound();
       c.makeSound();
       //d.makeSound();

	}

}
