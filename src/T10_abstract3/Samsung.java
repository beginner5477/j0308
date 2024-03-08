package T10_abstract3;

public class Samsung extends Phone {

	public Samsung(String name) {
		super(name + "삼성");
	}

	@Override
	public void function() {
		System.out.println(getName()+"폰은 삼성페이기능이 우수합니다.");
	}

	@Override
	public void sound() {
		System.out.println(getName()+"폰의 벨소리는 따르릉따르릉입니다.");
	}
	public void functionSam() {
		System.out.println("이번에 새로 추가된 기능은 자체탑재 AI입니다.");
	}

}
