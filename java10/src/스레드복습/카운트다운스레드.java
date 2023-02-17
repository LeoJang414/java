package 스레드복습;

public class 카운트다운스레드 extends Thread {
	@Override
	public void run() {
		for (int i = 1000; i > 0; i--) {
			System.out.println("카운트다운 >>" + i);
		
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("cpu 오류");
		}
		// TODO Auto-generated method stub
		super.run();
		}
	}
}
