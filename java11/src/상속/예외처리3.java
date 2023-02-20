package 상속;

public class 예외처리3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num = new int[3];
		try {
			num[3] = 2;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("에러발생");
			e.printStackTrace();
		}
		System.out.println(num.length);
	}

}
