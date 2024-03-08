package T4_override;

public class Bb extends Aa{
	int su = item1;

	public void areaPoly(int x, int y, int z) {
		int area = (x + y) * z / 2;
		System.out.println("사다리꼴의 면적(윗변:"+x+", 아래변:"+y+", 높이:"+z+") = " + area);
	}
}
