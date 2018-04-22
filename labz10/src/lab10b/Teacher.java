package lab10b;
import java.util.ArrayList;
public class Teacher extends Person
{
	int numCourse;
	int i =0;
	String[] courses;
	
	public Teacher(String name,String address)
	{
		super(name,address);
		setNumCourse(0);
		setCourses({});
	}

	public int getNumCourse() {
		return numCourse;
	}

	public void setNumCourse(int numCourse) {
		this.numCourse = numCourse;
	}

	public String getCourses() {
		return courses[];
	}

	public void setCourses(String[] newCourse) {
		courses.set(i,newCourse);
		i++;
	}
	public void addCourse(String[] newCourse)
	{
		courses.add(newCourse);
	}
	public void removeCourse(String courseToRemove)
	{
		courses.remove(courseToRemove);
	}
	
}
