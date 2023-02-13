package 배열응용;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class 극장예매시스템2_복습 {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(1000, 600);
		f.setTitle("극장예매시스템");
		f.getContentPane().setBackground(Color.white);
		
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);
		
		Font font = new Font("D2Coding", 1, 30);
		
		JLabel l1 = new JLabel("극장예매시스템");
		l1.setForeground(Color.blue);		
		l1.setFont(font);
		
//		JButton btn1 = new JButton("예약");
////		btn1.setText("예약");
//		btn1.setFont(font);
//		btn1.setBackground(Color.blue);
//		btn1.setForeground(Color.pink);
		
		f.add(l1);
//		f.add(btn1);
		
		JLabel l2 = new JLabel("결과 보이는 곳.");
		l2.setForeground(Color.pink);		
		l2.setFont(font);
		
		JButton[] btn2 = new JButton[100]; 	
		int[] seat = new int[100];
		for (int i = 0; i < btn2.length; i++) {
			btn2[i] = new JButton(i + 1 + "");
			btn2[i].setFont(font);
			btn2[i].setForeground(Color.pink);
			btn2[i].setBackground(Color.blue);
			f.add(btn2[i]);
			btn2[i].addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					String tx = e.getActionCommand();
					System.out.println(tx);
					int nb = Integer.parseInt(tx);
					
					if (seat[nb-1] == 2) {
						l2.setText("예약불가");
					} else {
						seat[nb-1] = 2;
						l2.setText(tx + "번 좌석 예매완료.");
						btn2[nb-1].setBackground(Color.pink);
					}
					
				}
			});
		}
		
		JButton ttl = new JButton("전체 예약 내역");
		ttl.setFont(font);
		ttl.setBackground(Color.pink);
		ttl.setForeground(Color.blue);
	
		ttl.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				int count = 0;
				for (int i = 0; i < seat.length; i++) {
					if (seat[i] == 2) {
						count++;
					}
				}
				JOptionPane.showMessageDialog(f, "전체 예약 좌석 수는 " + count + "석, 전체 예약 금액은 " + (count*10000) + "원 입니다."); 
			}
		});
		
		f.add(l2);
		f.add(ttl);
		
		f.setVisible(true);
	}

}
