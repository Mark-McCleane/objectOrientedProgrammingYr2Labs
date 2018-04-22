package lab7b;
//Author 	: Mark McCleane
//Date 	: Novemer-2016
//Purpose 	: Tests our Dog class.

public class CatTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cat myCat = new Cat("CatMcCatFace","black", 9,"fish" , 10,"alot" );
		
		System.out.println("My cat's name is " + myCat.name);
		System.out.println("My cat's color is " + myCat.colour);
		System.out.println("My cat's number of lives remaining is " + myCat.numLives);
		
		System.out.println("My dog eats " + myCat.eat);
		System.out.println("My dog sleeps " + myCat.sleep + " hours");
		System.out.println("My dog barks " + myCat.prr);
	}

}
