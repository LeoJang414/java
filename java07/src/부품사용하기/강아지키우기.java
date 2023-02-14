package 부품사용하기;

import 부품만들기.강아지;

public class 강아지키우기 {

	public static void main(String[] args) {
		강아지 d1 = new 강아지();
		d1.age = 3;
		d1.color = "brown";
		d1.재롱을부리다();
		System.out.println(d1.age);
		System.out.println(d1.color);
		
		System.out.println("-------------------");
		
		강아지 d2 = new 강아지();
		d2.age = 9;
		d2.color = "white";
		d2.밥을먹다();
		System.out.println(d2.age);
		System.out.println(d2.color);
	}

}
