package 배열응용;

import java.util.Scanner;

public class 스캐너연습문제2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] str = new String[3];
		for (int i = 0; i < str.length; i++) {
			System.out.print("단어를입력하세요.>>");
			str[i] = sc.next();
		}
		System.out.println(str[0] + "보다는 " + str[1]);
		
		sc.close();
	}
}
