package 제어문문제;

import java.util.Random;

public class 로또번호생성기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r = new Random();
		for (int i = 0; i < 6; i++) {
			System.out.println("로또 번호 " + (i + 1) + " :" + r.nextInt(45));
		}
		
	}

}
