package 조건문;

import javax.swing.JOptionPane;

public class IF문8 {

	public static void main(String[] args) {
//		1. 두 수와 사칙연산자를 입력받아 두 수를 사칙연산자에 따라 처리후 출력
//		2. 두 수를 입력받아 정수로 변환하여 정수변수에  저장, 나누기 연산 수행후 소숫점 2째자리까지 출력!

		// 1.
		String a = JOptionPane.showInputDialog("숫자1을 입력하세요.");
		String b = JOptionPane.showInputDialog("숫자2을 입력하세요.");
		String c = JOptionPane.showInputDialog("사칙연산자를 입력하세요.");
	
		double a1 = Double.parseDouble(a);
		double b1 = Double.parseDouble(b);
		
		if (c.equals("+")) {
			System.out.println(a1 + b1);
		} else if (c.equals("-")) {
			System.out.println(a1 - b1);
		} else if (c.equals("*")) {
			System.out.println(a1 * b1);
		} else if (c.equals("/")) {
			System.out.println(a1 / b1);
		}	
		
		
//		// 2.
//		String x = JOptionPane.showInputDialog("숫자1을 입력하세요.");
//		String y = JOptionPane.showInputDialog("숫자2을 입력하세요.");
//	
//		int x1 = Integer.parseInt(x);
//		int y1 = Integer.parseInt(y);
//		
//		double result2 = (double)x1 / (double)y1;
//		
//		System.out.printf("%.2f", result2);
				
	
	}

}
