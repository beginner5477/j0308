package T11_interface5;

/*
 	각 배우의 역할 출력하기
 	배역: 경찰관(범인찾기, 물건찾기), 소방관(화재진압, 인명구조), 요리사(피자, 스파게티)
 */
public class ActionRun {
	public static void main(String[] args) {
		System.out.println("각 역할극의 메뉴얼 리스트");
		Actor pol = new PoliceOfficer();
		Actor fir = new FireFighter();
		Actor che = new Chef();
		String[] action = {"경찰관", "소방관", "요리사"};
 		Actor[] actors = {pol, fir, che};
 		
 		for(int i = 0; i < actors.length; i++)
 		{
 			actors[i].action(action[i]);
 			actors[i].catching();
 			actors[i].finding();
 			actors[i].extinguish();
 			actors[i].salvage();
 			actors[i].pizza();
 			actors[i].spagetti();
 			System.out.println();
 		}
		
		
	}
}
