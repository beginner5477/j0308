package T11_interface5;

public class Chef implements Actor {

	@Override
	public void catching() {}

	@Override
	public void finding() {}

	@Override
	public void extinguish() {}

	@Override
	public void salvage() {}

	@Override
	public void pizza() {
		System.out.println("피자를 제조합니다.");
	}

	@Override
	public void spagetti() {
		System.out.println("스파게티를 제조합니다.");
	}

//	@Override
//	public void action(String action) {
//		System.out.println(action + "의 역할은");
//	}

}
