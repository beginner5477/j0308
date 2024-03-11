package T11_interface4;

import java.util.Scanner;

/*
 	기능 		곰돌이		로봇		비행기	탱크 
 	움직임	O			O		X		O
 	레이저	X			X		O		O
 	미사일	X			O		O		O
 	연령대	전연령		4~		8~		13~
 	
 	구매 어린이의 나이를 입력하여 구매가능한 장난감을 표시해 주세요.
 */
public class ToyRun {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Toy bear = new Bear();
		Toy robot = new Robot();
		Toy airplane = new AirPlane();
		Toy tank = new Tank();
		Toy[] data = {bear, robot, airplane, tank};
		String[] title = {"곰돌이", "로보트", "비행기", "탱크"};
		
		for(int i = 0; i < data.length; i++)
		{
			System.out.print("장난감: "+title[i]+"\n");
			data[i].moving();
			data[i].laser();
			data[i].missile();
			data[i].possibleAge();
		}
		System.out.println("==============================================");
		int age;
		System.out.print("아이의 나이를 입력하세요:");
		age = sc.nextInt();
		System.out.println("구매 가능한 장난감:");
		for(int i = 0; i < title.length; i++)
		{
			if(age >= data[i].possibleAge())
				System.out.print(title[i]+"/");
		}
		
		sc.close();
	}
}
