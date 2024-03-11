package T11_interface4;

import java.util.Scanner;

/*
 	기능 		곰돌이		로봇		비행기	탱크 
 	움직임	O			O		X		O
 	레이저	X			X		O		O
 	미사일	X			O		O		O
 	연령대	전연령		4~		8~		13~
 	
 	장난감 목록을 표시해주고 해당 장난감의 기능을 보여줍니다.
 	(예) 어떤 장난감 구매를 희망하십니까?
 	1.곰돌이 2.로봇 3.비행기 4.탱크 0.종료 
 	1번입력시
 	그 장난감의 기능을 출력해준다.
 	모든연령대가 사용가능합니다.
 	구매를 희망하십니까?(Y/N) 
 	Y-곰돌이 구매가 확정되었습니다.
 	N-감사합니다.
 */
public class ToyRun2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Toy bear = new Bear();
		Toy robot = new Robot();
		Toy airplane = new AirPlane();
		Toy tank = new Tank();
		Toy[] data = {bear, robot, airplane, tank};
		String[] title = {"곰돌이", "로봇", "비행기", "탱크"};
		
		while(true)
		{
			System.out.println("==============================================");
			for(int i = 0; i < data.length; i++)
			{
				System.out.print((i+1)+".장난감: "+title[i]+"\n");
				data[i].moving();
				data[i].laser();
				data[i].missile();
				System.out.println("사용가능한 연령대는 "+data[i].possibleAge()+"세 이상입니다.");
				System.out.println();
			}
			System.out.println("==============================================");
			
			System.out.print("어떤 장난감 구매를 희망하십니까?(1.곰돌이 2.로봇 3.비행기 4.탱크 0.종료)");
			int ans1 = sc.nextInt();
			if(ans1 == 0) break;
			else if(ans1 > 4 || ans1 < 1) 
			{	
				System.out.println("입력이 잘못되었습니다 확인후 다시입력하세요.");
				continue;
			}
			else 
			{
				System.out.println("------"+title[ans1 - 1]+"------------------------------------");
				data[ans1 - 1].moving();
				data[ans1 - 1].laser();
				data[ans1 - 1].missile();
				System.out.println("사용가능한 연령대는 "+data[ans1 - 1].possibleAge()+"세 이상입니다.");
				System.out.println("----------------------------------------------");
			}
			
			System.out.print("구매하시겠습니까?");
			String ans2 = sc.next();
			if(ans2.toUpperCase().equals("Y")) System.out.println(title[ans1 - 1] + "구매가 확정되었습니다.");
			else if(ans2.toUpperCase().equals("N")) System.out.println("감사합니다.");
			else System.out.println("입력이 잘못되었습니다. 확인후 다시입력해주세요.");
			
			System.out.print("종료하시겠습니까?");
			String ans3 = sc.next();
			if(ans3.toUpperCase().equals("Y")) break;
			else if(ans3.toUpperCase().equals("N")) continue;
			else System.out.println("입력이 잘못되었습니다. 확인후 다시입력해주세요.");
		}
		System.out.println("종료되었습니다.");
		
		sc.close();
	}
}
