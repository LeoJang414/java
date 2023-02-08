package 순차문;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class 계산기부품만들기 {

	public static void main(String[] args) {
		// 필요한 부품 10개 = > RAM에 부품을 만들어 넣어놓자.
		
		// JFrame, ImageIcon, JLabel 3개
		JFrame f = new JFrame();
		f.setSize(350, 500);
		
		ImageIcon icon = new ImageIcon("011.jpg");
		JLabel label1 = new JLabel();
		label1.setIcon(icon);
		
		JLabel label2 = new JLabel();
		label2.setText("Number 1");
		
		JLabel label3 = new JLabel();
		label3.setText("Number 2");
		
		// JTextField 2개
		JTextField text1 = new JTextField(10); //10은 가로크기
		JTextField text2 = new JTextField(10);
		
		// Font, FlowLayout
		Font font = new Font("굴림", 1, 30);
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);
		
		// JButton
		JButton b1 = new JButton();
		b1.setText("+");
		JButton b2 = new JButton();
		b2.setText("-");
		JButton b3 = new JButton();
		b3.setText("*");
		JButton b4 = new JButton();
		b4.setText("/");
		
		label2.setFont(font);
		label3.setFont(font);
		text1.setFont(font);
		text2.setFont(font);
		b1.setFont(font);
		b2.setFont(font);
		b3.setFont(font);
		b4.setFont(font);
		
		f.add(label1);
		f.add(label2);
		f.add(text1);
		f.add(label3);
		f.add(text2);
		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.add(b4);
		
		label2.setBackground(Color.blue);
		label3.setBackground(Color.blue);
		text1.setBackground(Color.blue);
		text1.setForeground(Color.pink);
		text2.setBackground(Color.blue);
		text2.setForeground(Color.pink);
		b1.setBackground(Color.pink);
		b1.setForeground(Color.blue);
		b2.setBackground(Color.pink);
		b2.setForeground(Color.blue);
		b3.setBackground(Color.pink);
		b3.setForeground(Color.blue);
		b4.setBackground(Color.pink);
		b4.setForeground(Color.blue);
		
		b1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// 클릭했을 때 처리내용
				// text1, text2에 있는 글자를 가지고 온다.
				String s1 =text1.getText(); //"333"
				String s2 =text2.getText(); //"222"
				int n1 = Integer.parseInt(s1);
				int n2 = Integer.parseInt(s2);
				int result = n1 + n2;
				JOptionPane.showMessageDialog(f, result);
			}
		});
		b2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// 클릭했을 때 처리내용
				// text1, text2에 있는 글자를 가지고 온다.
				String s1 =text1.getText(); //"333"
				String s2 =text2.getText(); //"222"
				int n1 = Integer.parseInt(s1);
				int n2 = Integer.parseInt(s2);
				int result = n1 - n2;
				JOptionPane.showMessageDialog(f, result);
			}
		});
		b3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// 클릭했을 때 처리내용
				// text1, text2에 있는 글자를 가지고 온다.
				String s1 =text1.getText(); //"333"
				String s2 =text2.getText(); //"222"
				int n1 = Integer.parseInt(s1);
				int n2 = Integer.parseInt(s2);
				int result = n1 * n2;
				JOptionPane.showMessageDialog(f, result);
			}
		});
		b4.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// 클릭했을 때 처리내용
				// text1, text2에 있는 글자를 가지고 온다.
				String s1 =text1.getText(); //"333"
				String s2 =text2.getText(); //"222"
				int n1 = Integer.parseInt(s1);
				int n2 = Integer.parseInt(s2);
				double result = (double)n1 / n2;
				JOptionPane.showMessageDialog(f, String.format("%.2f", result));
				
			}
		});
		
		//위에 있는 설정그대로 frame을 보여주라!! 맨 아래에 써야함.
		f.setVisible(true);
				
	}

}
