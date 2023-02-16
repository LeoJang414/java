package 생성자;

public class 나의일지 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Day day1 = new Day("자바공부", 8, "서초동");
		System.out.println(Day.count);
		System.out.println(Day.hour);
		Day day2 = new Day("산책", 1, "서리풀공원");
		System.out.println(Day.count);
		System.out.println(Day.hour);
		Day day3 = new Day("시험정리", 2, "사이버강의장");
		System.out.println(Day.count);
		System.out.println(Day.hour);

		
		System.out.println(day1);
		System.out.println(day2);
		System.out.println(day3);
	}

}
