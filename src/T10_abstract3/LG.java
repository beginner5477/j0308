package T10_abstract3;

public class LG extends Phone {

	public LG(String name) {
		super(name + "엘지");
	}

	@Override
	public void function() {
		System.out.println(getName()+"폰은 화질이 우수합니다.");
	}

	@Override
	public void sound() {
		System.out.println(getName()+"폰의 벨소리는 부르릉부르릉입니다.");
	}
	public void functionLG() {
		System.out.println(getName()+"이번에 새로추가된 기능은 롤러블입니다.");
	}
}
