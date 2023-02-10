package 배열응용;

import javax.swing.JOptionPane;

public class 입력받아평균 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] score = new int[5];
		
		int sum = 0;
		for (int i = 0; i < score.length; i++) {
			String data = JOptionPane.showInputDialog("숫자 입력");
			score[i] = Integer.parseInt(data);
			sum = sum + score[i];
			
		}
		
		for (int x : score) {
			System.out.print(x + " ");
		}
		System.out.println();
		System.out.println(sum);
		System.out.println((double)sum/score.length);
		
		int sum2 = 0;
		for (int i = 0; i < score.length; i++) {
			if (score[i] >= 300) {
				sum2 = sum2 + score[i];
			}
		}
			System.out.println(sum2);
		//합계구해서 평균
		
		for (int i = 0; i < score.length; i++) {
			if (score[i] >= 300) {
				System.out.print(i);
			}
		}
	}

}
