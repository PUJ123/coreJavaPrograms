package defaultMethodsInInterface;

public interface Animal {
	
	default void behavior()
	{
		System.out.println("Animal can Eat,Sleep,Bark");
	}
	void animalName();
	
	static  void myAnimal(String name) {
		System.out.println("My Favoriate Dog is:"+name);
	} 
	void animal();
}
