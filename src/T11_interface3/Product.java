package T11_interface3;

public class Product implements Remote {

	@Override
	public void switchOn(String name) {
		System.out.println(name + "전원을 켭니다.");
	}

	@Override
	public void switchOff(String name) {
		System.out.println(name + "전원을 끕니다.");

	}

	@Override
	public void remoteName(String name) {
		System.out.println("선택하신 제품은 "+name);
		
	}

	@Override
	public void setVolume(int volume) {
		System.out.println("입력한 볼륨: "+volume);
		if(MAX_VOLUME < volume)
		{
			System.out.println("최대볼륨은 10입니다.");
			volume = MAX_VOLUME;
		}
		else if(MIN_VOLUME > volume)
		{
			System.out.println("최소볼륨은 0입니다.");
			volume = MIN_VOLUME;
		}
		else System.out.println("입력이 잘못되었습니다 다시입력해주세요.");
		System.out.println("현재 볼륨은 "+volume);
		System.out.println();
	}
	
}
