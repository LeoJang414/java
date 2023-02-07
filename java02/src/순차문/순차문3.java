package 순차문;

import javax.swing.JOptionPane;

public class 순차문3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//기본 순차문 ==> 입력-> 처리 -> 출력
		String a = JOptionPane.showInputDialog("당신의 키를 meter단위로 입력해주세요");
		String b = JOptionPane.showInputDialog("당신의 몸무게를 kg단위로 입력해주세요");
		
		double aa = Double.parseDouble(a);
		double bb = Double.parseDouble(b);
		
		double result = bb / (aa * aa);
		
		System.out.println("당신의 BMI는 " + result + "입니다.");
				
		JOptionPane.showMessageDialog(null, result);
		
	}

}
