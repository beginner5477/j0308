package T11_interface4;

public class Tank implements Toy {
	private int age = 13;
	
	@Override
	public void moving() {
		System.out.println("머리 부분이 돌아갑니다.");
	}

	@Override
	public void laser() {
		System.out.println("레이저 발사 가능합니다.");
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
