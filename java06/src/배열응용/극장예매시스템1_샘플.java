package 배열응용;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.naming.spi.DirStateFactory.Result;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class 극장예매시스템1_샘플 {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setTitle("극장예매시스템");
		f.setSize(400, 300);
		f.getContentPane().setBackground(Color.green);
		// 배치해주는 부품-FlowLayout
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);// 추가한 순서대로 f에 붙는다.

		// 버튼 배열 많이 만들어서 집어 넣을 배열 생성
		JButton[] btn = new JButton[10];
		// 반복해서 배열에 버튼 만들어 넣어주세요.
		// 반복해서 f에 add해주세요.
		Font font = new Font("궁서", Font.BOLD, 50);

		JLabel result = new JLabel("결과 보이는 곳");
		result.setForeground(Color.red);
		result.setFont(font);

		// 예약 여부를 저장하는 배열을 만들어줍시다.!!
		int[] seat = new int[10]; // {1,0,0,0,0,0,0,0,0,0}
		// 각 자리게 저장된 값이 0이면 아직 예약안되었음. 예약되면 1로 바꿈!

		for (int i = 0; i < btn.length; i++) {
			btn[i] = new JButton(i + "");
			btn[i].setFont(font);
			f.add(btn[i]);

			// 버튼에 액션기능 add해보자.
			// 1) 액션 기능 추가
			// 2) 클릭했을 때 어떤 부품이 담당할지 부품 생성
			// 3) 클릭했을 때 어떻게 처리할지 코딩해주면 됨.
			btn[i].addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					// 클릭했을 때 어떻게 처리할지 코딩해주면 됨.
					// e.getActionCommand(); 클릭한 버튼의 글자를 가지고 와줌.
					String text = e.getActionCommand(); // "0"
					System.out.println(text);
					int no = Integer.parseInt(text); // "0" --> 0
					// 이미 해당 좌석번호가 1로 저장되어있는지 확인하고, 1이 아니면 예약가능!!
					if(seat[no] == 1) { //이미 예약되어 1이 들어있음. 예약불가
						result.setText("예약불가");
						result.setForeground(Color.blue);
					}else { //아직 예약이 안되어서 0이 들어있음. 예약가능
						seat[no] = 1; // 예약좌석은 1로 변경!
						result.setText(text + "번 예약완료.");
					}
				}
			});
		}

		f.add(result);

		// 맨 끝에 있어야 함.
		f.setVisible(true);

	}

}