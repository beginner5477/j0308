package T3_override;

//상속받은 자녀의 메소드가 부모 메소드와 선언부 (이름,매개변수,반환타입)
//같은것이 존재할때 가져와서 재정의 or 그대로 사용되는것.
public class Cc extends Aa{
	
//	public void areaCir(int r) {
//		double area = r * r * Math.PI;
//		System.out.println("반지름 "+r+"인 원넓이 = "+area);
//	}
//	public void areaCir(int r) {
//		double area = r * r * 3.141592;
//		System.out.println("반지름 "+r+"인 원넓이 = "+area);
//	}
	public void areaCir2(int r) {
		double area = r * r * 3.141592;
		System.out.println("반지름 "+r+"인 원넓이 = "+area);
	}
}
