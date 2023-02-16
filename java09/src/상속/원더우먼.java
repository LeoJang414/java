package 상속;

public class 원더우먼 extends 우먼{
	boolean jump;
	
	public void fight () {
		System.out.println("적과 싸워 승리하다");
	}
	
	public void sleep () {
		System.out.println("많이 자다");
	}

	@Override
	public String toString() {
		return "원더우먼 [jump=" + jump + ", beaty=" + beaty + ", name=" + name + ", age=" + age + "]";
	}
}
