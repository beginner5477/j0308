package T10_abstract;

public class Dog extends Animal{
	public String talk = "멍멍";
	
	public void sound() {
		System.out.println("강아지 울음소리: " + talk);
	}
}
