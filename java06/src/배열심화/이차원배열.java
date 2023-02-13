package 배열심화;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class 이차원배열 {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(500, 500);
		String[] header = {"컴퓨터", "영어", "수학", "체육", "음악", "비행"};
		Integer[][] contents = {
				{100, 88, 99, 77, 34, 23},
				{100, 88, 99, 77, 34, 23},
				{100, 88, 99, 77, 34, 23},
				{100, 88, 99, 77, 34, 23},
				{100, 88, 99, 77, 34, 23},
				{100, 88, 99, 77, 34, 23},
				
				
		};
		JTable table = new JTable(contents, header);
		JScrollPane scroll = new JScrollPane(table);
		
		f.add(scroll);
		f.setVisible(true);
	}
}
