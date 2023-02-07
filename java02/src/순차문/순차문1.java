package 순차문;

import javax.swing.JOptionPane;

public class 순차문1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//기본 순차문 ==> 입력-> 처리 -> 출력
		String data1 = JOptionPane.showInputDialog("당신의 취미는?");
		String data2 = JOptionPane.showInputDialog("언제 하시나요?");
		
		String result = "저는 취미인 " + data1 + "(을)를 " + data2 + "에 합니다.";
				System.out.println(result);
	}

}
