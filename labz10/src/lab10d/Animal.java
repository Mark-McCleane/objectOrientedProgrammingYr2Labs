package lab10d;

public class Animal 
{
	
	public String type;
	public int age;
	public char  gender;
	public String name;
		
		public Animal(String type, int age,char gender)
		{
			setType(type);
			setAge(age);
			setGender(gender);
		}
		public String getType() {
			return type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public int getAge() {
			return age;
		}

		public void setAge(int age) {
			this.age = age;
		}

		public char getGender() {
			return gender;
		}

		public void setGender(char gender) {
			this.gender = gender;
		}
		
		public String eat()
		{
			return "Animal is eating";
		}
		
		public String sleep()
		{
			return "Animal is sleeping";
		}
		
		public String makeSound()
		{
			return "A generic animal sound";
		}
		
		@Override
		public String toString()
		{
			return "animal type= " + type + ", age= " + age + ", gender= " + gender + "!\n"
			+ eat() + "\n" + sleep() + "\n" + makeSound();
		}
		
		
	}
