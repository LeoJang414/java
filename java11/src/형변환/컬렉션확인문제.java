package 형변환;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;

public class 컬렉션확인문제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1.
		HashSet tour = new HashSet();
		tour.add("일본");
		tour.add("한국");
		tour.add("중국");
		tour.add("싱가포르");
		tour.add("미국");
		System.out.println(tour);
		
		LinkedList plc = new LinkedList();
		plc.add("미국");
		plc.add("영국");
		plc.add("프랑스");
		plc.add("독일");
		plc.add("베트남");
		for (int i = 0; i < 5; i++) {
			System.out.println(plc);
			plc.remove();	
		}
		
		// 2.
		HashMap map = new HashMap();
		map.put("안방", "TV");
		map.put("거실", "쇼파");
		map.put("부엌", "냉장고");
		map.put("현관", "신발");
		System.out.println(map);
		System.out.println(map.get("현관"));
		map.replace("거실", "책상");
		System.out.println(map);
		
		// 3.
		ArrayList list = new ArrayList();
		list.add("공부");
		list.add("요리");
		list.add("운동");
		list.add("식사");
		list.add("독서");
		System.out.println(list);
		System.out.println(list.get(0));
		System.out.println(list.get(4));
		list.set(1, "청소");
		System.out.println(list);
	}
}
