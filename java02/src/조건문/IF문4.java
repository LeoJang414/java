package 조건문;

import java.util.Date;

public class IF문4 {

	public static void main(String[] args) {
		// Date - 년월일시분초, java.util.Date

		Date date = new Date();

		System.out.println(date.getHours());
		System.out.println(date.getMinutes());
		System.out.println(date.getSeconds());

		System.out.println(date.getYear() + 1900);
		System.out.println(date.getMonth() + 1);
		System.out.println(date.getDay()); // 요일! 0부터 시작, 일요일!

		int x = date.getHours();

		// int x = 15;

		if (x < 11) {
			System.out.println("굿모닝");
		} else if (x < 14) {
			System.out.println("굿애프터눈");
		} else if (x < 20) {
			System.out.println("굿 이브닝");
		} else {
			System.out.println("굿나잇");
		}

		int y = date.getMonth() + 1;
		System.out.println(y);
		// int y = 2;

		switch (y) {
		case 3: case 4: case 5:
			System.out.println("봄");
			break;
		case 6:
		case 7:
		case 8:
			System.out.println("여름");
			break;
		case 9:
		case 10:
		case 11:
			System.out.println("겨울");
			break;
		default:
			System.out.println("겨울");
			break;
		}

	}

}
