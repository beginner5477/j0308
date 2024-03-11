package T11_interface7;

public class Test2Run {
	public static void main(String[] args) {
		// 직접 인터페이스 객체를 생성하려면 원래는 안되는데 예외적으로 익명구현객체로 생성가능함. 
		// 익명구현객체는 중괄호안에 인터페이스에서 임플리먼트 받은 추상메소드를 오버라이드 해줘야댐. 
		Test2 t22 = new Test2() {
			int atom = 200;
			@Override
			public void abc() {
				System.out.println("이곳은 Test2Run 클래스의 t22익명구현객체안의 abc()메소드입니다.");
			}
		};
		Test2 t23 = new Test2() {
			@Override
			public void abc() {
				System.out.println("이곳은 Test2Run 클래스의 t23익명구현객체안의 abc()메소드입니다.");
			}
		};
		//익명객체 안의 메소드 호출하기
		t22.abc();
//		System.out.println(t22.atom); 인터페이스 변수로는 그 익명객체안의 필드와 일반변수로 접근불가이다.
		t23.abc();
		if(t22 == t23) System.out.println("같은 객체를 가르킵니다.");
		else System.out.println("서로다른 객체를 가르킵니다.");
	}
}
