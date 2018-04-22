package lab9;
import lab9.Book;

public class Library extends Book
{	
	Book newBook = new Book();
	Book newBook1 = new Book();
	Book newBook2 = new Book();
	Book newBook3 = new Book();
	Book newBook4 = new Book();
	Book newBook5 = new Book();
	Book newBook6 = new Book();
	Book newBook7 = new Book();
	Book newBook8 = new Book();
	Book newBook9 = new Book();
	
	String[] myBooks = { super.getBookName(), super.getBookName(), super.getBookName(),newBook3.getBookName(),
			super.getBookName(),super.getBookName(),super.getBookName(),super.getBookName(),newBook8.getBookName(),
			super.getBookName() };
	//String bookName;
	public Library()
	{
		
		//super(bookName);
	}
	public void setMyLibrary(String[] myArrayBooks)
	{
		for(int i =0;i <=9; i++){
			myBooks = myArrayBooks;
		}
	}
	public String[] getMyLibrary()
	{
		return myBooks;
	}
}