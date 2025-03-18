package Inheritance_Java;
class Animal{
	void makesound() {
		System.out.println("this animal make a sound");
	}
}
class Cat extends Animal{
	void makesound() {
		System.out.println("this cat make brak");
	}
}
public class Inher_pro1 {

	public static void main(String[] args) {
		Animal obj2=new Animal();
		Cat obj=new Cat();
		obj.makesound();
		obj2.makesound();
	}

}
