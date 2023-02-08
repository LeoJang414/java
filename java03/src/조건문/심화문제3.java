package 조건문;

import java.util.Scanner;

public class 심화문제3 {

	public static void main(String[] args) {
		
		// 3.
		Scanner sc = new Scanner(System.in);
		System.out.print("시작값 입력");
		int num1 = sc.nextInt();
		System.out.print("종료값 입력");
		int num2 = sc.nextInt();
		
		int sum = 0;
		for (int i = num1; i <= num2; i++) {
			sum = sum + i;
		}
		System.out.println(sum);
		
		sc.close();
	}

}
