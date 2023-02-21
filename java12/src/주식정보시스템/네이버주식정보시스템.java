
package 주식정보시스템;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class 네이버주식정보시스템 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame f = new JFrame();
		f.setSize(300, 450);
		f.getContentPane().setBackground(Color.lightGray);
		f.setLayout(new FlowLayout());
		Font font = new Font("D2Coding", Font.BOLD, 40);
		JButton b1 = new JButton("삼성전자");
		JButton b2 = new JButton("대한항공");
		JButton b3 = new JButton("  네이버  ");
		JButton b4 = new JButton("크롤링시작");
		b1.setFont(font);
		b2.setFont(font);
		b3.setFont(font);
		b4.setFont(font);
		
		b1.setBackground(Color.blue);
		b1.setForeground(Color.white);
		b2.setBackground(Color.cyan);
		b2.setForeground(Color.white);
		b3.setBackground(Color.green);
		b3.setForeground(Color.white);
		b4.setBackground(Color.orange);
		b4.setForeground(Color.black);
		
		b1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				네이버증권크롤링3 c = new 네이버증권크롤링3();
				c.naver("005930");
				
				
			}
		});
		
		b2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				네이버증권크롤링3 c = new 네이버증권크롤링3();
				c.naver("003490");
			}
		});
		
		b3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				네이버증권크롤링3 c = new 네이버증권크롤링3();
				c.naver("035420");
			}
		});
		
		
		
		JLabel label = new JLabel("CODE");
		label.setFont(font);
		
		JTextField text = new JTextField(7);
		text.setFont(font);
		text.setHorizontalAlignment(JTextField.CENTER);
		
		b4.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				네이버증권크롤링3 c = new 네이버증권크롤링3();
				String data = text.getText();
				c.naver(data);
				try {
					FileWriter file = new FileWriter(data + ".txt");
					file.write(data);
					file.close();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
		});
		
		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.add(label);
		f.add(text);
		f.add(b4);
		
		
		
		f.setVisible(true);
	}

}
