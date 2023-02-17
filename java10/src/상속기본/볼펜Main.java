package 상속기본;

public class 볼펜Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		볼펜 b = new 볼펜();
		
		b.가격 = 1000;
		b.회사 = "모나미";
		b.두께 = 2;
		System.out.println(b);
		b.사다();
		b.글을쓰다();
	}
}
