package 배열응용;

import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;

public class 랜덤버튼배열 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame f = new JFrame();
		f.setSize(1200, 650);
		JButton[] buttons = new JButton[200];
		for (int i = 0; i < buttons.length; i++) {
			buttons[i] = new JButton("버튼 " + (i + 1));
		}
		
		f.setLayout(null);
		
		Random r = new Random();
		for (int i = 0; i < buttons.length; i++) {
			int x = r.nextInt(1050);
			int y = r.nextInt(550);
			buttons[i].setBounds(x, y, 100, 50);
			f.add(buttons[i]);			
		}		
		
		f.setVisible(true);
	}

}
