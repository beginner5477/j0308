package T11_interface4;

public class Robot implements Toy {
	private int age = 4;
	
	@Override
	public void moving() {
		System.out.println("팔다리를 움직일 수 있습니다.");
	}

	@Override
	public void laser() {
	}

	@Override
	public void missile() {
		System.out.println("미사일 발사 가능합니다.");
	}

	@Override
	public void age() {
		System.out.println(age+"세 이상 사용 가능하십니다.");
	}

	@Override
	public int possibleAge() {
		return age;
	}

}
