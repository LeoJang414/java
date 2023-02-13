package 배열응용;

import java.awt.Color;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;

public class 랜덤버튼배열2 {

	public static void main(String[] args) {
		// 1. 프레임
		JFrame f = new JFrame();
		// 2. 프레임 설정
		f.setLayout(null);
		f.setSize(1100, 600);
		// 3. 버튼을 넣을 배열을 만들기 500개
		JButton[] buttons = new JButton[500];
		// 4. 버튼을 500개 만들어서 배열어 넣기.
		for (int i = 0; i < buttons.length; i++) {
			buttons[i] = new JButton("버튼 " + i);		
		}
		// 5. 배열에 있는 버튼을 꺼내서 위치를 지정후 f에 붙여주기
		Random r = new Random();
		Color[] cls = {Color.green, Color.white, Color.black, Color.CYAN, Color.blue, Color.red, Color.yellow, Color.magenta, Color.gray, Color.orange, Color.pink};
		
		for (int i = 0; i <buttons.length; i++) {
			int x = r.nextInt(950);
			int y = r.nextInt(450);
			
			buttons[i].setBounds(x, y, 100, 50);
			f.add(buttons[i]);
			buttons[i].setBackground(cls[r.nextInt(8)]);
		}

		f.setVisible(true);
	}
}
