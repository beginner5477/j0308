package T4_override;

import java.util.Scanner;

public class Run {
	public static void main(String[] args) {
//		Aa aa = new Aa(); // 파이널 걸렸어도 생성은 가능
		Cc cc = new Cc();
//		cc.areaCir(50);
		Scanner sc = new Scanner(System.in);
		System.out.print("1.신라 2.백제?");
		int ans =sc.nextInt();
		
		if(ans == 1) cc.areaCir(30);
		else if(ans == 2) cc.areaCir2(30);
		else System.out.println("입력이 잘못되었습니다.");
		
		sc.close();
	}
}
