package 조건문;

import java.util.Scanner;

public class 기본문제1_2 {

	public static void main(String[] args) {
		
		// 1.
		Scanner sc = new Scanner(System.in);
		System.out.print("아이디:");
		String data1 = sc.next();
		System.out.print("패스워드:");
		String data2 = sc.next();
		
		if (data1.equals("root") && data2.equals("1234")) {
			System.out.println("로그인 성공!");
		} else {
			System.out.println("로그인 실패!");
		}
		// 2.
		System.out.print("사과 구매 갯수 입력");
		int count1 = sc.nextInt();
		System.out.print("사과 한 개당 가격 입력");
		int price1 = sc.nextInt();
 		System.out.print("딸기 구매 갯수 입력");
		int count2 = sc.nextInt();
		System.out.print("딸기 한개당 가격 입력");
		int price2 = sc.nextInt();
		
		System.out.println("사과 구매 가격은 " + price1 + "원 입니다.");
		System.out.println("딸기 구매 가격은 " + price2 + "원 입니다.");
		System.out.println("전체 구매 가격은 " + ((count1 * price1) + (count2 * price2))  + "원 입니다.");

		
		// 3.
		
		
		sc.close();
		
	}

}
