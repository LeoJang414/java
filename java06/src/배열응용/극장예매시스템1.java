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

public class 극장예매시스템1 {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(400, 500);
		f.setTitle("극장예매시스템");
		f.getContentPane().setBackground(Color.yellow);

		Font font = new Font("D2Coding", 1, 50);
		
		JLabel l1 = new JLabel("극장예매시스템");
		l1.setFont(font);
		f.add(l1);
		
		JLabel l2 = new JLabel("결과 보이는 곳");
		l2.setForeground(Color.red);
		l2.setFont(font);
	
		
		JButton[] btn = new JButton[10];
		
		int[] seat = new int[10];
		for (int i = 0; i < btn.length; i++) {
			btn[i] = new JButton(i + "");
			btn[i].setFont(font);
			f.add(btn[i]);
			
			btn[i].addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					String text = e.getActionCommand();
					System.out.println(text);
					int no = Integer.parseInt(text);
					
					if (seat[no] == 1) {
						l2.setText("예약불가");
						l2.setForeground(Color.blue);
					} else {
						seat[no] = 1;
						l2.setText(text + "번 예약완료.");	
					}
					
				}
			});
			
		}
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);
		
		f.add(l2);
		
		
		JButton total = new JButton("전체 예약 내역");
		total.setBackground(Color.blue);
		total.setForeground(Color.yellow);
		total.setFont(font);
		
		f.add(total);
		
		total.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stubㄴ
				int count = 0;
				for (int i = 0; i < seat.length; i++) {
					if (seat[i] == 1) {
						count++;
					}
				}
				JOptionPane.showMessageDialog(f, "결제금액은 " + (count*10000) + "원 입니다.");
			}
		});
		
		f.setVisible(true);
		
	}

}
