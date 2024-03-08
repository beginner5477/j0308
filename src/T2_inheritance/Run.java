package T2_inheritance;

public class Run {
	public static void main(String[] args) {
		System.out.println("1.이곳은 Run클래스 입니다.");
		
		Bb bb1 = new Bb();
		bb1.areaRec(10, 30);
		bb1.areaPoly(1, 2, 3);
		Bb bb2 = new Bb(15);
		bb2.areaPoly(2, 3, 4);
		System.out.println();
		System.out.println("2.이곳은 Run클래스 입니다.");

	}
}
