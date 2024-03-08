package T3_override;

public class Aa {
	int item1 = 500;
	int item2 = 600;
	
	public void areaRec(int x, int y) {
		int area = x * y;
		System.out.println("사각형(가로:"+x+", 세로:"+y+")의 면적 = "+area);
	}
	//원넓이 계산
	public void areaCir(int r) {
		double area = r * r * 3.141592;
		System.out.println("반지름 "+r+"인 원넓이 = "+area);
	}
}
