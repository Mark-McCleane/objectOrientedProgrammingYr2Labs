package lab10d;

public class Vet
{
	String vetName;

	public Vet(String vetName)
	{
		
		setVetName(vetName);
	
	}

	public String getVetName() {
		return vetName;
	}

	public void setVetName(String vetName) {
		this.vetName = vetName;
	}

	

	public void vaccinate(Animal animalToBeVaccinated)
	{
		System.out.println(getVetName() + " is vaccinating." );
		
		if(animalToBeVaccinated instanceof Dog)
		{
			System.out.println("\"" + getVetName() + "\" the dog." );
			System.out.println(animalToBeVaccinated.makeSound() );
			Dog d = (Dog) animalToBeVaccinated;
			d.wagTail();
		}
		else if( animalToBeVaccinated instanceof Cat){
			System.out.println("\"" + getVetName() + "\" the cat." );
			System.out.println(animalToBeVaccinated.makeSound() );
			Cat c = (Cat) animalToBeVaccinated;
			c.scratch();
		}
		else if(animalToBeVaccinated instanceof Cow){
			System.out.println("\"" + getVetName() + "\" the cow." );
			System.out.println(animalToBeVaccinated.makeSound() );
			Cow cow = (Cow) animalToBeVaccinated;
			cow.cast();
		}
	}
	@Override
	public String toString() {
		return "Vet: vetName= " + vetName;
	}
	
}
