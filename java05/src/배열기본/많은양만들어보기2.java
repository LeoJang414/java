package 배열기본;

import java.util.Random;

public class 많은양만들어보기2 {
	public static void main(String[] args) {
		int[] score2 = new int[1000];
		Random r = new Random(42);
		for (int i = 0; i < score2.length; i++) {
			score2[i] = r.nextInt(19) + 2;
		}
		//전체 프린트
		for (int x : score2) {
			System.out.println(x);
		}
		//3이상인 숫자 몇개인지 프린트
		//배열은 전체를 가지고 와서, 3이상 체크
		// 갯수를 세주세요.
		int count = 0;
		int sum = 0;
		for (int i : score2) {
			if (i >= 15) {
				count++;
				sum = sum + i;
			}
		} // for
		System.out.println("15이상 갯수: " + count);
		System.out.println("15이상 수를 모두 합한 값: " + sum);
		
	}
}
