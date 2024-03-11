package T11_interface2;

public class Audio implements Remote {

	@Override
	public void switchOn() {
		System.out.println("Audio의 전원을 켭니다.");
	}

	@Override
	public void switchOff() {
		System.out.println("Audio의 전원을 끕니다.");
	}

	@Override
	public void remoteName(String name) {
		System.out.println(name + "리모콘");
	}

}
