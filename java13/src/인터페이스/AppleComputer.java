package 인터페이스;

public class AppleComputer implements Computer {

	@Override
	public void 키보드로입력하다() {
		// TODO Auto-generated method stub
		System.out.println("애플키보드로입력하다");
	}

	@Override
	public void 모니터로출력하다() {
		// TODO Auto-generated method stub
		System.out.println("애플모니터로출력하다");
	}

	@Override
	public void 계산하다() {
		// TODO Auto-generated method stub
		System.out.println("애플컴퓨터로계산하다");
	}

}
