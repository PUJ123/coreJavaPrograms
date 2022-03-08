package defaultMethodsInInterface;

public interface Dog {
	default void behavior() {
		System.out.println("Dog can Eat , sleep,Bark");
	}
	default void animalName() {
		System.out.println("Animal name Given By Dog");
	}
	
	default void dogBehavior() {
		System.out.println("Dog can Eat , sleep,Bark");
	}
	void petNameForDog();
	
	static void myAnimal(String name) {
		System.out.println("My favoriate Dog is:"+name);
	}
	void myAnimal();

}
