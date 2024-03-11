package T11_interface5;

public class FireFighter implements Actor {

	@Override
	public void catching() {}

	@Override
	public void finding() {}

	@Override
	public void extinguish() {
		System.out.println("화재를 진압합니다.");
	}

	@Override
	public void salvage() {
		System.out.println("인명을 구조합니다.");
	}

	@Override
	public void pizza() {}

	@Override
	public void spagetti() {}

//	@Override
//	public void action(String action) {
//		System.out.println(action + "의 역할은");
//	}

}
