package 생성자;

public class 딸 {
	String name;
	char gender;
	static int count;
	static int money = 10000;
	
	public 딸(String name, char gender) {
		super();
		count++;
		money = money - 1000;
		this.name = name;
		this.gender = gender;
	}
	
	public void tv보다() {
		System.out.println("tv를 재밌게 보다");
	}
	@Override
	public String toString() {
		return "딸 [name=" + name + ", gender=" + gender + "]";
	}
	
	
}
