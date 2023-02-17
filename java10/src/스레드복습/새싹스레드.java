package 스레드복습;

public class 새싹스레드 extends Thread {
	@Override
	public void run() {
		for (int i = 0; i < 1000000000; i++) {
			System.out.println("!새싹이 무럭무럭 자라나고 있어요! 지금 새싹의 키는 " + i + "mm");
		
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("cpu 오류");
			}

		}
	}
}
