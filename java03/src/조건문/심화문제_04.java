package 조건문;

import java.util.Scanner;

public class 심화문제_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("시작값 입력");
		int num1 = sc.nextInt();
		System.out.println("종료값 입력");
		int num2 = sc.nextInt();
		System.out.println("점프값 입력");
		int num3 = sc.nextInt();

		int sum = 0;
		for (int i = num1; i <= num2; i+=num3) {
			sum = sum + i;
			}
		System.out.println(sum);
				
		sc.close();
	}

}
