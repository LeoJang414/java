package 배열응용;

import java.util.Random;

public class 입력받아평균3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] score = new int[10000];
		Random r = new Random(42);
		for (int i = 0; i < score.length; i++) {
			score[i] = r.nextInt(451);
		}
		int count = 0;
		int count2 = 0;
		int count3 = 0;
		int sum = 0;
		
		for (int i = 0; i < score.length; i++) {
			if (score[i] == 450) {
				count++;
				System.out.println(i);
			} else if (score[i] == 0) {
				count2++;
			} else if (score[i] >= (((double)sum/score.length) - 50) && score[i] <= (((double)sum/score.length) + 50)) {
				count3++;
			}
			System.out.println((double)sum/score.length);
			sum = sum + score[i];
		}
		System.out.println("만점자 수: " + count);
		System.out.println("0점자 수: " + count2);
		System.out.println("평균보다 +-50점자 수: " + count3);
		System.out.println("수험생 평균 점수: " + ((double)sum/score.length));
	}
}
