package T11_interface6;

public class Actor implements PolicerOfficer, FireFighter, Chef {

	@Override
	public void pizza() {
		System.out.println("피자를 만듭니다.");
	}

	@Override
	public void spagetti() {
		System.out.println("스파게티를 만듭니다.");
	}

	@Override
	public void extinguish() {
		System.out.println("화재 진압합니다.");
	}

	@Override
	public void salvage() {
		System.out.println("인명구조를 합니다.");
	}

	@Override
	public void catching() {
		System.out.println("범인을 잡습니다.");
	}

	@Override
	public void finding() {
		System.out.println("물건을 찾아줍니다.");
	}

}
