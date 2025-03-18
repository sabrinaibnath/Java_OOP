package chapter2;
class Dog{
	int size;
	String breed;
	String name;
	void burk() {
		System.out.println("Ruff!Ruff");
	}
}

public class Object_Dog {

	public static void main(String[] args) {
		Dog object1=new Dog();
		object1.size=30;
		object1.breed="mix";
		object1.name="moncha";
		object1.burk();
		System.out.println(object1.name);
		System.out.println(object1.size);
		System.out.println(object1.breed);

	}

}
