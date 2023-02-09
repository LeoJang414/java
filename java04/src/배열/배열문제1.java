package 배열;

public class 배열문제1 {

	public static void main(String[] args) {
		// 1.
		int[] x = new int[5];
		// 2.
		System.out.println(x.length);
		// 3.
		x[0] = 100;
		System.out.println(x[0]);
		// 4.
		x[4] = 500;
		System.out.println(x[4]);
		// 5.
		x[2] = 200;
		System.out.println(x[2]);
		// 6.
		for (int i = 0; i < x.length; i++) {
			System.out.print(x[i] + " ");
		}
		System.out.println();
		// 7.
		for (int i = 0; i < x.length; i++) {
			System.out.print("<index=" + i + ", " + x[i] + "> ");
		}
		// 8.
		
		

	}
}