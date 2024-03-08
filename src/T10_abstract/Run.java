package T10_abstract;

public class Run {
	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.sound();
		System.out.println();
		
		Cat cat = new Cat();
		cat.sori();
		System.out.println();
		
		Animal animalDog = new Dog();
		Animal animalCat = new Cat();
		animalCat.sori();
		animalDog.sound();
	}
}
