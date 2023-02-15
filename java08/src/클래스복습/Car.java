package 클래스복습;

public class Car {
	// 성질: 변수로 구현, 멤버변수
	String color; // 변수는 선언된 위치가 생존의 위치!
				  // 해당 변수를 포함하는 {}안에서 생존 가능!
	// 클래스 바로 아래 
	
	// 동작: 기능, 멤버메소드, 함수(메소드, 방법)
	public void run() {
		System.out.println("앞으로 달려나가다");
	}
	
	public void up() {
		System.out.println("속도를 증가시키다");
		
	}
}
