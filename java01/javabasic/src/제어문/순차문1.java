package 제어문;

import javax.swing.JOptionPane;

public class 순차문1 {

	public static void main(String[] args) {
		String exercise = JOptionPane.showInputDialog("당신이 좋아하는 운동은?");
		String day = JOptionPane.showInputDialog("당신이 운동하기 좋아하는 요일은?");
		
		String result = day + "에 저는 " + exercise + "를 합니다.";
		System.out.println(result);
				
		
	}

}
