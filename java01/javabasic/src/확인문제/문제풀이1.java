package 확인문제;

import javax.swing.JOptionPane;

public class 문제풀이1 {

	public static void main(String[] args) {
		//1.입력
		String day = JOptionPane.showInputDialog("오늘은 무슨 요일 인가요?");
		String thing = JOptionPane.showInputDialog("수업 끝나고 무엇을 하실 예정인가요?");
		
		//2.처리
		String result = "오늘 "+ day + "에 수업후 나는 " + thing + "할 예정";
				
		//3.출력
		System.out.println(result);
		

	}

}
