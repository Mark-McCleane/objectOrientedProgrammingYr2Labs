package lab9;
import lab9.Book;
import lab9.Library;

public class LibraryTest
{
	public static void main(String[] args) 
	{
		
		Book myLibrary1 = new Book();
		Library test = new Library();
		myLibrary1.setBookName("To Catch a Mockingbird");
		myLibrary1.Borrow();
		
		Book myLibrary2 = new Book();
		myLibrary2.setBookName("Harry Plopper");
		Book myLibrary3 = new Book();
		myLibrary3.setBookName("Harry Potter");
		
		System.out.println(test.getMyLibrary() );
		
	}

}
