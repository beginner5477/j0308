package T11_interface7;

interface Aa2 {
	static void abc() {
		System.out.println("여기는 Aa2인터페이스의 정적메소드abc()입니다.");
	}
}
public class Test3Run {
	public static void main(String[] args) {
		//정적 메소드 호출하기
		Aa2.abc();
	}
}
