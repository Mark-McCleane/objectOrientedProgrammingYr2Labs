package lab10b;

import java.util.Arrays;

public class Student extends Person
{
	int numCourses;
	String course;
	int[] grades;
	String[][] CourseGrade;
	
	public Student(String name, String address)
	{
		super(name,address);
		setNumCourses(0);
		addCourseGrade(course, grades);
	}

	public void setCourseGrade(String course, int[] grades) 
	{
		this.course= course;
		this.grades = grades;
	}
	public String addCourseGrade(String course , int[] grades)
	{
		return course + ", " + grades;
	}
	
	public void setNumCourses(int numCourses) 
	{
		this.numCourses = numCourses;
	}
	
	public int getNumCourses() 
	{
		return numCourses;
	}
	public void setCourses()
	{
		this.course = course;
	}
	public String getCourses() 
	{
		return course;
	}

	public int[] printGrades() 
	{
		return grades;
	}
	
	public double averageGrade()
	{
		double average = 0;
		for(int i = 0;i < grades.length;i++)
		{
			average = average + printGrades()[i]; 
		}
		return average; 
	}

	//@Override
	/*public String toString() {
		return "Student\n Total Number of Courses: " + getNumCourses() + ",Courses are:" + Arrays.toString(getCourses())
				+ ", Grades: " + Arrays.toString(printGrades() ) + ", averageGrade()=" + averageGrade() + "]";*/
	}
	
	

	
	
	
//}
