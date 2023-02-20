package 형변환;

import java.util.ArrayList;

public class 컬렉션테스트 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList list= new ArrayList();
		list.add("홍길동");
		list.add(100);
		list.add(11.2);
		list.add(true);
		
		System.out.println(list);
		System.out.println(list.get(0));

		
		list.add(0, "김길동");
		System.out.println(list);
		list.remove(0);
		System.out.println(list);
		list.set(0, "정길동");
		System.out.println(list);
		
		int index = list.indexOf(true);
		System.out.println(index);
		
		boolean result = list.contains(11.2);
		System.out.println(result);
		
		
		
	}

}
