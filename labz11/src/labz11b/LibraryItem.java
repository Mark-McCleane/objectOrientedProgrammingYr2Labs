package labz11b;

public class LibraryItem 
{
	private String type;
	private String id;
	boolean onLoan;
	
	public LibraryItem()
	{
		setType(type);
		setId(id);
		setOnLoan(onLoan);
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public boolean isOnLoan() {
		return onLoan;
	}

	public void setOnLoan(boolean onLoan) {
		this.onLoan = onLoan;
	}

	@Override
	public String toString() {
		return "Library Item type=" + getType() + ", id=" + getId() + ", onLoan=" + isOnLoan() + "!";
	}
	
}
