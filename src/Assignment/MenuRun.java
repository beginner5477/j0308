package Assignment;

import java.util.Scanner;

public class MenuRun {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("-가격표-");
		System.out.println("1.두부조림:2000원");
		System.out.println("2.미역국:1000원");
		System.out.println("3.요플레:800원");
		System.out.println("4.바나나:500원");
		System.out.println("5.우유:500원");
		System.out.println("6.아몬드:700원");
		System.out.println("쌀밥, 불고기는 기본포함(가격:2500원)");
		System.out.print("추가 원하는 메뉴를 입력하세요:");
		
		
		sc.close();
	}
}
