package 배열응용;

import java.util.Scanner;

public class 스캐너연습문제1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] num = new int[5];
		for (int i = 0; i < num.length; i++) {
			System.out.print("숫자를입력하세요>");
			num[i] = sc.nextInt();
		}
		System.out.println(num[0] + num[2]);
		
		sc.close();
	}
}
