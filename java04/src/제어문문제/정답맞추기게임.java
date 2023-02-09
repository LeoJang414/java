package 제어문문제;

import java.util.Random;
import java.util.Scanner;

public class 정답맞추기게임 {

	public static void main(String[] args) {
		int target = 77;
		Scanner sc = new Scanner(System.in);
		int data = 0;
		
		while (true) {
			System.out.println("당신이 생각한 정답은?");
			data = sc.nextInt();
			if (data == target) {
				System.out.println("정답입니다.");
			} else {
				System.out.println("오답입니다.");
			} 
			sc.close();
		}	
		
	}
       
}
