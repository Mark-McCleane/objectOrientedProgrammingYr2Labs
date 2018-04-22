package practiceTest;

public abstract class Animal
{
		public static int identificationNumber = 200;
		public String name;
		public Animal(String name)
		{
			setName(name);
			identificationNumber++;
		}
		
		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}
		public abstract String feed();
		
		
		public String toString() {
			return "name: " + name + " ID: "+ identificationNumber + ", " + feed();
		}

	}