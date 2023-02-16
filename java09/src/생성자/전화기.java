package 생성자;

public class 전화기 {
	public int price; //멤버변수는 자동초기화!!
	public String shape; // 기본형이 아닌 경우 모두 null로 초기화
	
	public 전화기() {
		System.out.println("전화기 객체가 만들어 졌음.");
	}
	
	public void 인터넷하다() {
		System.out.println("와이파이연결하다.");
		System.out.println("데이터를 써서 연결하다.");
	} 
	public void 카톡하다() {
		System.out.println("자바 단체톡을 하다.");
		System.out.println("게시물을 올리다.");
	}
	
}

