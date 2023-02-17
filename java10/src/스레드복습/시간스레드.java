package 스레드복습;

import java.util.Date;

public class 시간스레드 extends Thread {
	@Override
	public void run() {
		for (int i = 0; i < 1000000000; i++) {
			Date date = new Date();
			System.out.println("현재시간은 " + date);
		
		try {
			Thread.sleep(5000);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("cpu 오류");
		}
		}
	}
}
