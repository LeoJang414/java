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

public class 오늘의미션제출 {
	static int count;
	static int count1;
	static int count2;
	static int count3;
	static int count4;
	
	static int price1 = 20000;
	static int price2 = 22000;
	static int price3 = 24000;
	static int price4 = 22000;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame f = new JFrame();
		f.setSize(800, 600);
		f.getContentPane().setBackground(Color.white);
		f.setTitle("50년 전통 원조할매족발");
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);
		Font fnt = new Font("D2Coding", 1, 20);
		
		JButton b1 = new JButton("원조족발");
		b1.setFont(fnt);
		b1.setBackground(Color.pink);
		JButton b2 = new JButton("불족발");
		b2.setFont(fnt);
		b2.setBackground(Color.pink);
		JButton b3 = new JButton("마늘족발");
		b3.setFont(fnt);
		b3.setBackground(Color.pink);
		JButton b4 = new JButton("바베큐족발");
		b4.setFont(fnt);
		b4.setBackground(Color.pink);

		JLabel l1 = new JLabel("총 주문 개수:");
		l1.setFont(fnt);
		
		JLabel l2 = new JLabel(" ");
		l2.setFont(fnt);
		l2.setBackground(Color.blue);
		
		ImageIcon img0 = new ImageIcon("00.png");
		ImageIcon img1 = new ImageIcon("11.png");
		ImageIcon img2 = new ImageIcon("22.png");
		ImageIcon img3 = new ImageIcon("33.png");
		ImageIcon img4 = new ImageIcon("44.png");

		JLabel imgLabel = new JLabel(" ");
		imgLabel.setIcon(img0);
		
		JLabel l3 = new JLabel(" ");
		l3.setFont(fnt);
		
		JButton ttl = new JButton(" ");
		ttl.setFont(fnt);
		ttl.setBackground(Color.orange);
		
		
		
		b1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				count++;
				count1++;
				imgLabel.setIcon(img1);
				l2.setText(count + "개");
				l3.setText("원조족발: " + count1 + "개, 불족발: " + count2 + 
						"개, 마늘족발: " + count3 + "개, 바베큐족발: " + count4 + "개");
				ttl.setText("총 결제 금액은 " + ((count1*price1) + (count2*price2) +
						(count3*price3) + (count4*price4)) + "원 입니다.");
			}
		});
		
		b2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				count++;
				count2++;
				imgLabel.setIcon(img2);
				l2.setText(count + "개");
				l3.setText("원조족발: " + count1 + "개, 불족발: " + count2 + 
						"개, 마늘족발: " + count3 + "개, 바베큐족발: " + count4 + "개");
				ttl.setText("총 결제 금액은 " + ((count1*price1) + (count2*price2) +
						(count3*price3) + (count4*price4)) + "원 입니다.");
			}
		});

		b3.addActionListener(new ActionListener() {
	
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				count++;
				count3++;
				imgLabel.setIcon(img3);
				l2.setText(count + "개");
				l3.setText("원조족발: " + count1 + "개, 불족발: " + count2 + 
						"개, 마늘족발: " + count3 + "개, 바베큐족발: " + count4 + "개");
				ttl.setText("총 결제 금액은 " + ((count1*price1) + (count2*price2) +
						(count3*price3) + (count4*price4)) + "원 입니다.");
			}
		});

		b4.addActionListener(new ActionListener() {
	
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				count++;
				count4++;
				imgLabel.setIcon(img4);
					l2.setText(count + "개");
					l3.setText("원조족발: " + count1 + "개, 불족발: " + count2 + 
							"개, 마늘족발: " + count3 + "개, 바베큐족발: " + count4 + "개");
					ttl.setText("총 결제 금액은 " + ((count1*price1) + (count2*price2) +
							(count3*price3) + (count4*price4)) + "원 입니다.");
			}
		});
		
		f.add(b1); f.add(b2); f.add(b3); f.add(b4);
		f.add(l1); f.add(l2); f.add(imgLabel); f.add(l3);
		f.add(ttl);
		
		f.setVisible(true);
		
		
	}

}
