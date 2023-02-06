package 변수;

public class 변수선언확인문제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//스트링, 실, 문자열!
		//String ==>기본데이터X, but 너무 많이 쓰기 때문에 기본형데이터처럼 사용가능!!
		String name = "홍길동";
		int age = 100;
		double eye = 2.0;
		char gender = '남';
		boolean lunch = true;
		
		System.out.println("나의 이름은 " + name + "입니다.");
		System.out.println("나의 나이는 " + age + "세 입니다.");
		System.out.println("나의 시력은 " + eye + "입니다.");
		System.out.println("나의 성별은 " + gender + "자 입니다.");
		System.out.println("나는 점심을 먹었습니다." + lunch);
	}

}
