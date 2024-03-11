package T11_interface4;

public class Bear implements Toy {
	private int age = 0;
	
	@Override
	public void moving() {
		System.out.println("팔다리를 움직일 수 있습니다.");
	}

	@Override
	public void laser() {
	}

	@Override
	public void missile() {

	}

	@Override
	public void age() {
		System.out.println("모든 연령대가 사용 가능하십니다.");
	}

	@Override
	public int possibleAge() {
		return age;
	}

}
