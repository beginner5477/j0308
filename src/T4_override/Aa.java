package T4_override;

//public final class Aa { // 파이널붙이면 상속은 안되고 생성은 가능
public class Aa {
	int item1 = 500;
	int item2 = 600;
	
	public void areaRec(int x, int y) {
		int area = x * y;
		System.out.println("사각형(가로:"+x+", 세로:"+y+")의 면적 = "+area);
	}
	//원넓이 계산
//	public final void areaCir(int r) { // 파이널쓰면 재정의 불가능
	public void areaCir(int r) {
		double area = r * r * 3.141592;
		System.out.println("반지름 "+r+"인 원넓이 = "+area);
	}
}
