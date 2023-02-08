package 조건문;

import java.util.Scanner;

public class 심화문제4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("시작값 입력");
		int num1 = sc.nextInt();
		System.out.print("종료값 입력");
		int num2 = sc.nextInt();
		System.out.print("점프값 입력");
		int num3 = sc.nextInt();

		int sum = 0;
		for (int i = num1; i <= num2; i+=num3) {
			sum = sum + i;
			if (sum > 100) {
				break;
			}
		}
	
		System.out.println(sum);
		
		sc.close();
	}

}
