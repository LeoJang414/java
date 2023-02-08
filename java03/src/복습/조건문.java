package 복습;

import javax.swing.JOptionPane;

public class 조건문 {

	public static void main(String[] args) {
		int target = 77; //숫자맞추기를 해봅시다.
		int me = 77; //내가 시도한 값!
		
		// 조건은 비교하는 코드가 들어감.
		if (target == me) {
			System.out.println("정답입니다.!");
		} else { 
			System.out.println("오답입니다.!");
		}
		
		 String target2 = "로또";
		String you = "신나";
		switch (you) {
		case "로또":
			System.out.println("정답이다!!!");
			break;
		case "신나": case "놀자": case "나가자":
			System.out.println("오답이다!!!");
			break;
		default:
			System.out.println("그만해.!!");
			break;
		}
	
	}

}
