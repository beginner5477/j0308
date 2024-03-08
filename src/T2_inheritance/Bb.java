package T2_inheritance;

public class Bb extends Aa{
	int su = item1;
	public Bb() {
		System.out.println("이곳은 Bb클래스의 기본생성자입니다.");
	}
	public Bb(int su) {
		super(su); // 부모 생성자 지정해줄때 씀, 첫줄에만 와야댐.
		System.out.println("이곳은 Bb클래스의 사용자 생성자입니다,su = " + su);
	}
	public void areaPoly(int x, int y, int z) {
		int area = (x + y) * z / 2;
		System.out.println("사다리꼴의 면적(윗변:"+x+", 아래변:"+y+", 높이:"+z+") = " + area);
	}
}
