package T9_instanceof;

public class Run {
	public static void main(String[] args) {
		Aa ba = new Bb();
		Aa aa = new Aa();
		if(ba instanceof Bb) 
		{
			Bb bab = (Bb) ba;
			System.out.println("다운 캐스팅 성공");
		}
		else System.out.println("down casting is impossible");
	}
}
