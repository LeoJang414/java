package 스태틱;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class Counter {

	static int count;

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(500, 500);
		f.getContentPane().setBackground(Color.pink);
		f.setTitle("나의 카운터 프로그램");
		
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);
		
		Font fnt1 = new Font("D2Coding", 1, 20);
		Font fnt2 = new Font("D2Coding", 1, 300);
		
		JButton b1 = new JButton("1더하기");
		b1.setFont(fnt1);
		b1.setForeground(Color.white);		
		b1.setBackground(Color.red);
		
		JButton b2 = new JButton("0으로 초기화");
		b2.setFont(fnt1);
		b2.setForeground(Color.pink);
		b2.setBackground(Color.BLUE);
				
		JButton b3 = new JButton("1빼기");
		b3.setFont(fnt1);
		b3.setForeground(Color.white);
		b3.setBackground(Color.red);
		
		JLabel num = new JLabel();
		num.setText("0");
		num.setFont(fnt2);
		num.setForeground(Color.blue);
		
		b1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				count++;
				num.setText(count+"");
			}
		});
		
		b2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				count = 0;
				num.setText(count+"");
			}
		});

		b3.addActionListener(new ActionListener() {
		
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				count--;
				num.setText(count+"");
			}
		});
		
		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.add(num);
		
		f.setVisible(true);
	}

}
