package 형변환;

import java.util.ArrayList;

public class 스키대회 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList list = new ArrayList();
		list.add("박스키");
		list.add("송스키");
		list.add("김스키");
		list.add("정스키");
		list.remove("송스키");
		System.out.println(list);
		for (int i = 0; i < list.size(); i++) {
			System.out.println((i + 1) + "등: " + list.get(i));
		}
		System.out.println(list.contains("김연아"));
		System.out.println(list.size());
		
		list.addAll(list);
		System.out.println(list);
	}

}
