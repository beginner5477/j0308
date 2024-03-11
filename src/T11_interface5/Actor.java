package T11_interface5;

public interface Actor {
	//경찰관 역할(범인잡기, 물건찾기)
	void catching();
	void finding();
	//소방관(불끄기, 구조하기)
	void extinguish();
	void salvage();
	//요리사(피자, 스파게티 만들기)
	void pizza();
	void spagetti();
	//역할명 디폴트 메소드
	default void action(String action) {
		System.out.println(action + "의 역할은");
	}
}
