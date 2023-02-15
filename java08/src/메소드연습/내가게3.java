package 메소드연습;

public class 내가게3 {

	public static void main(String[] args) {
		계산기3 cal3 = new 계산기3();
		int price = 7000;
		int count1 = 5; // 오전손님
		int count2 = 4; // 오후손님
		
		//계산기3이용
		System.out.println("오늘 온 손님의 총 합은 " + cal3.add(count1, count2));
		
		System.out.println("손님 수 차이는 " + cal3.minus(count1, count2) + "명 입니다.");
		
		System.out.println("오전 결제 금액은 " + cal3.mul(count1, price) + "원 입니다.");

		System.out.println("오후 결제 금액은 " + cal3.mul(count2, price) + "원 입니다.");

		System.out.println("오늘 하루 총 결제 금액은 " + (cal3.mul(count1, price) + cal3.mul(count2, price)) + "원 입니다.");
		int a = (cal3.mul(count1, price) + cal3.mul(count2, price));
		int b = cal3.add(count1, count2);
		
		System.out.println("1인당 결제금액은 " + cal3.div(a, b) + "원 입니다.");
		
	}

}
