package 상속응용;

public class 동시프로그램실행2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		달러스레드 s = new 달러스레드();
		골뱅이스레드 g = new 골뱅이스레드();
		앤드스레드 a = new 앤드스레드();
		
		s.start();
		g.start();
		a.start();
	}

}
