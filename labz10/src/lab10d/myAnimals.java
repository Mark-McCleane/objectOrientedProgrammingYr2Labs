package lab10d;

public class myAnimals {

	public static void main(String[] args) {
		//Random rand = new Random();
		
		Animal[] myAnimals = new Animal[10];
		
		myAnimals[0] = new Cow("Daisy","milk",10,'m');
		myAnimals[1] = new Cow("Daisy","milk",10,'m');
		myAnimals[2] = new Cow("Daisy","milk",10,'m');
		myAnimals[3] = new Dog("DOggy", "pug",2,'f');
		myAnimals[4]= new Dog("DOggy", "pug",2,'f');
		myAnimals[5]= new Dog("DOggy", "pug",2,'f');
		myAnimals[6] = new Dog("Doggy", "Pug",4,'m');
		myAnimals[7] = new Cat("Fluffy","black",10,'m');
		myAnimals[8] = new Cat("Fluffy","black",10,'m');
		myAnimals[9] = new Cat("Fluffy","black",10,'m');
		
		for(int i =0; i < 10;i++){
			System.out.println(myAnimals[i].makeSound() ) ;
		}
		
		Vet myVet = new Vet("Mark");
		
		for(int i = 0; i < 10; i++){
			myVet.vaccinate(myAnimals[i]);
		}
	}

}
