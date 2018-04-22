package lab9;

public class Book 
{
	String bookName;
	String author;
	static int nextBookNum = 1;
	int ISBN;
	char status;
	

	public Book()
	{
		setISBN(nextBookNum++);
		setAuthor("");
		setBookName("");
		setStatus('A');			//A = avaliable or B = Borrowed
	
	}

	private void setISBN(int ISBN) 
	{
		this.ISBN = ISBN;		
	}

	public String getBookName() 
	{
		return bookName;
	}

	public void setBookName(String bookName)
	{
		this.bookName = bookName;
	}

	public String getAuthor() 
	{
		return author;
	}

	public void setAuthor(String author) 
	{
		this.author = author;
	}

	public char getStatus() 
	{
		return status;
	}

	public void setStatus(char status) 
	{
		this.status = status;
	}
	public int getISBN()
	{
		return ISBN;
	}
	public void Borrow()
	{
		setStatus('B');
	}
	public String toString()
	{
		String temp;
		if (getStatus() == 'a'){
			temp = "Avaliable";
		}
		else
			temp = "Borrrowed";
		return "Book Name: " + getBookName() + "Author Name:" + getAuthor() + "Status: " + getStatus();
	}
}
