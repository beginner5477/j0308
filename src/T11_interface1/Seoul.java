package T11_interface1;

public class Seoul implements T1{
	int max;
	
	@Override
	public void data() {
		System.out.println("이곳은 Seoul클래스의 data메소드입니다.");
	}

	@Override
	public void data2() {
		System.out.println("이곳은 Seoul클래스의 data2메소드입니다.");
	}

	@Override
	public void data1(int su) {
		if(su > MAX) max = su;
		else max = MAX;
		System.out.println("최댓값: "+max);
	}
	
}
