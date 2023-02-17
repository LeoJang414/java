package 스레드복습;

public class 새싹시계카운트다운 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		시간스레드 time = new 시간스레드();
		카운트다운스레드 countdown = new 카운트다운스레드();
		새싹스레드 bud = new 새싹스레드();
		
		time.start();
		countdown.start();
		bud.start();
	}

}
