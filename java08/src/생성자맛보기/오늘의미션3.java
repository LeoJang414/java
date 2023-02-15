package 생성자맛보기;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class 오늘의미션3 {

	static int count1;
	static int count2;
	static int count3;
	static int count;
	final static int PRICE1 = 20000;
	final static int PRICE2 = 22000;
	final static int PRICE3 = 24000;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame f = new JFrame();
		f.setSize(773, 677);
		f.getContentPane().setBackground(Color.WHITE);

		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);

		Font fnt = new Font("D2Coding", 1, 30);

		JButton btn1 = new JButton("원조족발");
		btn1.setFont(fnt);
		btn1.setBackground(Color.pink);

		JButton btn2 = new JButton("불족발");
		btn2.setFont(fnt);
		btn2.setBackground(Color.orange);

		JButton btn3 = new JButton("마늘족발");
		btn3.setFont(fnt);
		btn3.setBackground(Color.cyan);

		JLabel l1 = new JLabel("총 주문 개수:");
		l1.setFont(fnt);

		JButton btn4 = new JButton("갯수 결과창");
		btn4.setFont(fnt);
		btn4.setBackground(Color.yellow);

		ImageIcon img0 = new ImageIcon("00000.png");
		ImageIcon img1 = new ImageIcon("03.png");
		ImageIcon img2 = new ImageIcon("02.png");
		ImageIcon img3 = new ImageIcon("01.png");

		JButton btn5 = new JButton(" ");
		btn5.setIcon(img0);

		JLabel l2 = new JLabel("결제금액 결과 표시창");
		l2.setFont(fnt);

		btn1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				count1++;
				count++;
				btn4.setText(count + "개");
				btn5.setIcon(img1);
				l2.setText("총 결제 금액은 " + ((count1 * PRICE1) + (count2 * PRICE2) + (count3 * PRICE3)) + "원");
				f.setTitle("원조족발: " + count1 + "개, 불족발: " + count2 + "개, 마늘족발: " + count3 + "개");
			}
		});

		btn2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				count2++;
				count++;
				btn4.setText(count + "개");
				btn5.setIcon(img2);
				l2.setText("총 결제 금액은 " + ((count1 * PRICE1) + (count2 * PRICE2) + (count3 * PRICE3)) + "원");
				f.setTitle("짬뽕: " + count1 + "개, 우동: " + count2 + "개, 짜장: " + count3 + "개");

			}
		});

		btn3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				count3++;
				count++;
				btn4.setText(count + "개");
				btn5.setIcon(img3);
				l2.setText("총 결제 금액은 " + ((count1 * PRICE1) + (count2 * PRICE2) + (count3 * PRICE3)) + "원");
				f.setTitle("짬뽕: " + count1 + "개, 우동: " + count2 + "개, 짜장: " + count3 + "개");
			}
		});

		f.add(btn1);
		f.add(btn2);
		f.add(btn3);
		f.add(l1);
		f.add(btn4);
		f.add(btn5);
		f.add(l2);

		f.setVisible(true);

	}

}
