package 제어문문제;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class 인기조사10명2 {

	public static void main(String[] args) {
		// 인기투표 해봅시다!
		// 1)아이유 2)방탄 3)뉴진스 4) 종료 >> 1
		// 1)아이유 2)방탄 3)뉴진스 4) 종료 >> 2
		// 1)아이유 2)방탄 3)뉴진스 4) 종료 >> 4
		Scanner sc = new Scanner(System.in);
		
		int a = 0;
		int b = 0;
		int c = 0;
		int count = 0;
		while (true) {
			System.out.print("인기 투표 해봅시다! 1)아이유 2)방탄 3)뉴진스 4) 종료 >> ");
			count = count + 1;
			int x = sc.nextInt();
			
			if (x == 4) { 
				System.out.println("시스템을 종료합니다.");
				System.out.println("-----------------");
				System.out.println("전체 투표 횟수는 " + count + "표");
				System.out.println("아이유 " + a + "표");
				System.out.println("방탄 " + b + "표");
				System.out.println("뉴진스 " + c + "표");
				System.out.println("-----------------");
				break;
			} else if (x == 1) {
				a = a + 1;
			} else if (x == 2) {
				b++;
			} else if (x == 3) {
				c++;
			} else {
				System.out.println("없는 번호입니다.");
				System.out.println("다시 선택해 주세요.");
			}
		}
		sc.close();
	}

}
