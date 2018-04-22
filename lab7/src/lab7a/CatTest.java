package lab7a;
//Author 	: Mark McCleane
//Date 	: Novemer-2016
//Purpose 	: Tests our Dog class.

public class CatTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cat myCat = new Cat("CatMcCatFace","black", 9 );
		System.out.println("My cat's name is " + myCat.name);
		System.out.println("My cat's color is " + myCat.colour);
		System.out.println("My cat's number of lives remaining is " + myCat.numLives);
		
	}

}
