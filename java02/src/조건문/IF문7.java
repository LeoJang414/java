package 조건문;

import java.util.Date;

import javax.swing.JOptionPane;

public class IF문7 {

	public static void main(String[] args) {
		// 1.
		String pw = JOptionPane.showInputDialog("암호를 대시오.");
		
		if (pw.equals("pass")) {
			System.out.println("들어오세요.");
		} else {
			System.out.println("나가세요.");
		}
		
		// 2.
		String food = JOptionPane.showInputDialog("당신이 먹고 싶은 저녁 메뉴는? (자장면, 라면, 회 에서 선택)");
		if (food.equals("자장면")) {
			System.out.println("중국집으로 가요.");
		} else if (food.equals("라면")) {
			System.out.println("분식직으로 가요.");
		} else if (food.equals("회")) {
			System.out.println("횟집으로 가요.");
		} else {
			System.out.println("그냥 안먹어요.");
		}

		// 3.
		String data1 = JOptionPane.showInputDialog("정수1을 입력하시오.");
		String data2 = JOptionPane.showInputDialog("정수2을 입력하시오.");
		int data11 = Integer.parseInt(data1);
		int data22 = Integer.parseInt(data2);
		if (data11 > data22) {
			System.out.println("입력하신 두 정수 중 더 큰 정수는 " + data11 + "입니다.");
		} else if (data11 < data22) {
			System.out.println("입력하신 두 정수 중 더 큰 정수는 " + data22 + "입니다.");
		} else {
			System.out.println("입력하신 두 정수는 같습니다.");
		}
		
		// 4.
		String no = "A100EX";
		char x = no.charAt(0);
		if (x == 'A') {
			System.out.println("기획부");
		} else if (x == 'B') {
			System.out.println("총무부");
		} else if (x == 'C') {
			System.out.println("개발부");
		} else {
			System.out.println("해당부서없음");
		}
		
		
		
		
	}

}
