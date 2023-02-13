package 배열복습;

import java.util.Arrays;
import java.util.Random;

public class 배열정렬순위 {

	public static void main(String[] args) {
		// 정렬을 할 때는 Arrays
		Random r = new Random(42);
		int[] score = new int[10000];
		for (int i = 0; i < score.length; i++) {
			score[i] = r.nextInt(1000) + 1;
		}
		for (int x : score) {
			System.out.println(x);
		}
		System.out.println("---------------");
		Arrays.sort(score);
		for (int i : score) {
			System.out.println(i);
		}
		System.out.println("최소값: " + score[0]);
		System.out.println("최대값: " + score[score.length - 1]);
		int sum30 = 0;
		for (int i = 7000; i < score.length; i++) {
			sum30 = sum30 + score[i]; // sum += i;
		}
		System.out.println("상위 30% 평균 : " + (sum30 / 3000.0));
		int sum030 = 0;
		for (int i = 0; i < 3000; i++) {
			sum030 += score[i];			
		}
		System.out.println("하위 30% 평균 : " + (sum030 / 3000.0));
		String result = Arrays.toString(score);
		System.out.println(result);
	}
}
