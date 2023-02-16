package 생성자;

public class 우리집 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		딸 d1 = new 딸("홍길순", '여');
		딸 d2 = new 딸("홍길진", '여');
		
		// a.
		System.out.println(d1);
		System.out.println(d2);
		
		// b.
		System.out.println("우리집 딸 명 수는 " + 딸.count + "명");
		
		// c.
		System.out.println("현재 아빠 지갑에 남은 돈은 " + 딸.money + "원");
	}

}
