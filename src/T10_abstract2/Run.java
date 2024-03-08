package T10_abstract2;

public class Run {
	public static void main(String[] args) {
//		new Animal(); // 추상클래스는 객체생성불가
		Animal aniDog = new Dog();
		aniDog.cry();
		Animal aniCat = new Cat();
		aniCat.cry();
	}
}
