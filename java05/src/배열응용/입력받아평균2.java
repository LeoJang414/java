package 배열응용;

import java.util.Random;

public class 입력받아평균2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] me = new int[10];
		Random r = new Random(0);
		for (int i = 0; i < me.length; i++) {
			me[i] = r.nextInt(10);
		}
		for (int i : me) {
			System.out.println(i);
		}
		
		int count = 0;
		int sum = 0;
//		for (int i = 0; i < me.length; i++) {
		for (int i : me) {
			count++;
			sum = sum + me[i];	
			System.out.println(i);
		}
		
		System.out.println(sum);
		System.out.println(count);
		
	
	}
}
