package T11_interface6;

import java.util.Scanner;

public class ActorRun {
	public static void main(String[] args) {
		Actor actor = new Actor();
		Scanner sc = new Scanner(System.in);
		actor.catching();
		actor.finding();
		actor.extinguish();
		actor.salvage();
		actor.pizza();
		actor.spagetti();
		System.out.println();
		
		String[] title = {"경찰관", "소방관", "요리사"};
		exit:while(true)
		{
			System.out.print("맡은 배역을 입력하세요(1.경찰관 2.소방관 3.요리사 0.종료):");
			int todo = sc.nextInt();
			System.out.println();
			switch(todo)
			{
				case 1:
					System.out.println(title[todo - 1]+"의 역할:");
					actor.catching();
					actor.finding();
					break;
				case 2:
					System.out.println(title[todo - 1]+"의 역할:");
					actor.extinguish();
					actor.salvage();
					break;
				case 3:
					System.out.println(title[todo - 1]+"의 역할:");
					actor.pizza();
					actor.spagetti();
					break;
				case 0:
					break exit;
				default:
					System.out.println("입력이 잘못되었습니다 확인후 입력하쇼");
			}
			System.out.println();
			
		}
		System.out.println("종료되었습니다.");
		sc.close();
	}
}
