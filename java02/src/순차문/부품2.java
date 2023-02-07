package 순차문;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class 부품2 {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(900, 900);
		
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);
		
		JButton b1 = new JButton();
		b1.setText("나는 버튼이야");
		
		JButton b2 = new JButton();
		b2.setText("나는 버튼이야2");
		
		JLabel text1 = new JLabel();
		text1.setText("아이디");
		
		JLabel text2 = new JLabel();
		text2.setText("패스워드");
		
		JTextField input1 = new JTextField(10);
		JTextField input2 = new JTextField(10);
		
		Font font = new Font("궁서", 1, 20);
		
		text1.setFont(font);
		input1.setFont(font);
		b1.setFont(font);
		text2.setFont(font);
		input2.setFont(font);
		b2.setFont(font);
		
		b1.setBackground(Color.red);
		b1.setForeground(Color.white);
		b2.setBackground(Color.red);
		b2.setForeground(Color.white);
		
		input1.setBackground(Color.red);
		input1.setForeground(Color.white);
		input2.setBackground(Color.red);
		input2.setForeground(Color.white);
		
		ImageIcon icon1 = new ImageIcon("007.png");
		ImageIcon icon2 = new ImageIcon("008.png");
		
		b1.setIcon(icon1);
		b2.setIcon(icon2);
		
		f.add(text1);
		f.add(input1);
		f.add(b1);
		f.add(text2);
		f.add(input2);
		f.add(b2);
		
		f.setVisible(true);
		
	}

}
