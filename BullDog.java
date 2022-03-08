package defaultMethodsInInterface;

public class BullDog implements Dog,Animal{
	public static void main(String[] args) {
		
		
		 BullDog bd= new BullDog();
		 bd.behavior(); bd.dogBehavior(); 
		 bd.animalName();
		 bd.animal(); Dog.myAnimal("Dog name is Julli");
		Animal.myAnimal("Animal Name is :Animal");
		bd.petNameForDog();
		bd.myAnimal();
		

		
		
		/*
		 * Dog d= new BullDog(); Dog.myAnimal("Jai"); d.animalName(); d.behavior();
		 * d.dogBehavior(); d.petNameForDog();
		 * 
		 */
		
		/*
		 * Animal an= new BullDog(); an.animal(); an.animalName(); an.behavior();
		 * an.animalName(); Animal.myAnimal("Animal give the Name:pet");
		 */
}

	
	@Override
	public void behavior() {
		System.out.println("Override By animal Interface");
		Animal.super.behavior();
	}


	


	@Override
	public void animal() {
	System.out.println("Animal Unimplemented Method");
		
	}


	@Override
	public void petNameForDog() {
		System.out.println("PetName for Dog is Pet");		
	}


	@Override
	public void animalName() {
		System.out.println("Animal Give the Name");
		
	}


	@Override
	public void myAnimal() {
		System.out.println("In dog interface myAnimal is the abstract method");
		
	}


	/*
	 * @Override public void animalName() {
	 * System.out.println("Dog name Is Given By Animal");
	 * 
	 * }
	 */


	

	} 


