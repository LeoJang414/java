package 배열응용;

import java.util.Random;

public class 우리반성적변동2 {

	public static void main(String[] args) {
		Random r = new Random(42);
		
		int[] n1 = new int[10000];
		int[] n2 = new int[10000];
		
		for (int i = 0; i < n2.length; i++) {
			n1[i] = r.nextInt(101);
			n2[i] = r.nextInt(101);
		}

		int count = 0;
		int count2 = 0;
		int count3 = 0;
		int count4 = 0;
		for (int i = 0; i < n2.length; i++) {
			 if (n1[i] == n2[i]) {
				count3++;
			 } else if (n1[i] != n2[i]) {
				count4++;
				if (n1[i] < n2[i]) {
					count++;
				} else if (n1[i] > n2[i]) {
					count2++;
				}
			 }
		}	 
		System.out.println("1학기와 2학기 성적이 동일한 학생은 " + count3);
		System.out.println("1학기와 2학기 성적이 다른 학생은 " + count4);
		System.out.println("2학기에 성적이 더 오른 학생은 " + count);
		System.out.println("1학기에 성적이 더 좋았던 학생은 " + count2);
		
	}
}
