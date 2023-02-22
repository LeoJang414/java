package 인터페이스;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class 문자판독기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame f = new JFrame("문자판독기");
		f.setSize(350, 550);
		
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);
		Font font = new Font("D2Coding", Font.BOLD, 30);
		
		JLabel label = new JLabel("문장을 넣으세요.");
		
		JTextArea area = new JTextArea(7, 10);
		JButton b1 = new JButton("글자수카운트");
		
		b1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String data = area.getText();
				int a = data.length();
				System.out.println(a);
				JOptionPane.showMessageDialog(f, "글자수는 " + a + "자 입니다.");
				area.setText("");
			}
		});
		
		JButton b2 = new JButton("배경색바꾸기");
		
		b2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				area.setBackground(Color.yellow);
			}
		});
		
		JButton b3 = new JButton("글자색바꾸기");
		
		b3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				area.setForeground(Color.pink);
			}
		});
		
		
		label.setFont(font);
		area.setFont(font);
		b1.setFont(font);
		b2.setFont(font);
		b3.setFont(font);
		
		f.add(label);
		f.add(area);
		f.add(b1);
		f.add(b2);
		f.add(b3);
		
		f.setVisible(true);
		
		
		
	}

}
