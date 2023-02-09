package 제어문문제;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class 인기조사10명3 {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(530, 550);
		f.getContentPane().setBackground(Color.pink);
		
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);
		
		JLabel l1 = new JLabel();
		l1.setText("K-POP Popularity VOTING");
		JLabel l2 = new JLabel();
		l2.setText("    IU - LILAC           ");
		JLabel l3 = new JLabel();
		l3.setText("표");
		JLabel l4 = new JLabel();
		l4.setText("   BTS - DYNAMITE");
		JLabel l5 = new JLabel();
		l5.setText("표");
		JLabel l6 = new JLabel();
		l6.setText("  NewJeans - Ditto");
		JLabel l7 = new JLabel();
		l7.setText("표");
		
		JButton b1 = new JButton();
		JButton b2 = new JButton();
		JButton b3 = new JButton();
		
		Font font = new Font("D2Coding", 1, 30);
	
		l1.setFont(font);
		l2.setFont(font);
		l3.setFont(font);
		l4.setFont(font);
		l5.setFont(font);
		l6.setFont(font);
		l7.setFont(font);

		l1.setForeground(Color.white);
		l2.setForeground(Color.white);
		l3.setForeground(Color.black);
		l4.setForeground(Color.white);
		l5.setForeground(Color.black);
		l6.setForeground(Color.white);
		l7.setForeground(Color.black);
		
		ImageIcon img1 = new ImageIcon("iu2.png");
		b1.setIcon(img1);
		ImageIcon img2= new ImageIcon("bts2.png");
		b2.setIcon(img2);
		ImageIcon img3= new ImageIcon("njs2.png");
		b3.setIcon(img3);
		
		f.add(l1);
		f.add(b1);
		f.add(l2);
		f.add(l3);
		f.add(b2);
		f.add(l4);
		f.add(l5);
		f.add(b3);
		f.add(l6);
		f.add(l7);
		
		b1.addActionListener(new ActionListener() {
			int i1 = 0;
			@Override
			public void actionPerformed(ActionEvent e) {
				// 클릭했을 때 처리할 내용을 코딩해주면 됨.!
				i1++;
				l3.setText(" " + i1 + "표");
			}
		}); //b1
		b2.addActionListener(new ActionListener() {
			int i2 = 0;
			@Override
			public void actionPerformed(ActionEvent e) {
				// 클릭했을 때 처리할 내용을 코딩해주면 됨.!
				i2++;
				l5.setText("  " + i2 + "표");
			}
		}); //b2
		b3.addActionListener(new ActionListener() {
			int i3 = 0;
			@Override
			public void actionPerformed(ActionEvent e) {
				// 클릭했을 때 처리할 내용을 코딩해주면 됨.!
				i3++;
				l7.setText(" " + i3 + "표");
			}
		}); //b3
		
		f.setVisible(true);
		
		
		
	}

}
