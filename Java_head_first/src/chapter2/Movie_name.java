package chapter2;
class Movie{
	String name;
	String genre;
	int rating;
	void playIt() {
		System.out.println("Playing the movie");
	}
}
public class Movie_name {

	public static void main(String[] args) {
		Movie one=new Movie();
		one.name="Gone with the stoke";
		one.genre="Tragic";
		one.rating=-2;
		System.out.println(one.name);
		System.out.println(one.genre);
		System.out.println(one.rating);
		
		Movie two=new Movie();
		two.name="crash landing on you";
		two.genre="dramatic";
		two.rating=10;
		System.out.println(two.name);
		System.out.println(two.genre);
		System.out.println(two.rating);

	}

}
