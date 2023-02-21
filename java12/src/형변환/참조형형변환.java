package 형변환;

import java.util.ArrayList;

import javax.swing.JButton;

public class 참조형형변환 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 클래스형변환 == 참조형형변환
		// 상속!! 관게일때만 형변환이 가능!!
		ArrayList list = new ArrayList();
		list.add("홍길동");
		list.add(100);
		list.add(11.22);
		list.add(new JButton("나는 버튼"));
		
		String name = (String)list.get(0);
		//String이 가지는 메서드(기능)을 쓰려면 반드시 String으로 강제형변환해주어야한다.
		System.out.println(name.charAt(0));
		System.out.println(name.length());
		
		int age = (Integer)list.get(1);
		System.out.println(age + 1);
		
		double score = (Double)list.get(2);
		System.out.println(score + 10);
		
		JButton b = (JButton)list.get(3);
		b.setText("나는 진짜 버튼");
	}

}
