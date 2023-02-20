package 형변환;

import java.util.LinkedList;

public class Queue확인문제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList sub = new LinkedList();
		sub.add("국어");
		sub.add("수학");
		sub.add("영어");
		sub.add("컴퓨터");
		System.out.println(sub.size());
		System.out.println(sub);
		
		for (int i = 0; i < sub.size() + 1; i++) {
			sub.remove();
			System.out.println((i + 1) + "일차 시험본 후 남은 과목: " + sub);
		}
		
	}

}
