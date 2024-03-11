package T11_interface5;

public class PoliceOfficer implements Actor {

	@Override
	public void catching() {
		System.out.println("범인을 잡습니다.");
	}

	@Override
	public void finding() {
		System.out.println("물건을 찾습니다.");
	}

	@Override
	public void extinguish() {}

	@Override
	public void salvage() {}

	@Override
	public void pizza() {}

	@Override
	public void spagetti() {}

//	@Override
//	public void action(String action) {
//		System.out.println(action + "의 역할은");
//	}

}
