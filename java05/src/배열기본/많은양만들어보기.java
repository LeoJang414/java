package 배열기본;

import java.util.Random;

public class 많은양만들어보기 {

	public static void main(String[] args) {
		int[] score = new int[9];
//		for (int x : score) {
//			System.out.println(x);
//		}
//		
//		System.out.println("==============");
//		
		Random r = new Random();
		//int data = r.nextInt(4) + 1;
		//System.out.println(data);
		for (int i = 0; i < score.length; i++) {
			score[i] = r.nextInt(4) + 1;
		}
		
		for (int x : score) {
			System.out.println(x);
		}
	}

}
