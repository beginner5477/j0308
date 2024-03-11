package T11_interface1;

public interface T1 {
	int MAX = 1000000; // 상수이므로 대문자로 작성해라
	public static final int MIN = 0;
	
	void data();
	void data1(int su);
	public abstract void data2();
	
	//디폴트 메소드는 실행블록있어야제 인터페이스는 원래 추상메소드만 있는건데 예외로 그전에 쓰던것 떄문에 허용해준거라서 그럼
	default void data3() {
		System.out.println("이곳은 디폴트 data3메소드");
	}
	static void data4() {
		System.out.println("이곳은 스테틱 data4메소드");
	}
}
